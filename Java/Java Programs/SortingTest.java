class SortingTest
{
    public static void main(String[] arg)
    {
        int k=2000000; //Array size
        
        /*StdOut.println("Sorting for Integer");
        Integer[] iarr=new Integer[k];
        for(int i=k-1;i>=0;i--)
            iarr[i]=i+65;
        StdRandom.shuffle(iarr);*/
        
        String[] sarr=new String[k];
        for(int i=k-1,j=0;i>=0;i--,j++)
            sarr[i]=String.valueOf(j);
        StdOut.println("Sorting for Strings");
        StdRandom.shuffle(sarr);
        StdOut.println("Array before Sorting");
        //for(int i=0;i<k;i++)
          //  StdOut.println(sarr[i]);
        heapSort.sort(sarr);
        StdRandom.shuffle(sarr);
        Merge.sort(sarr);//<<<<<<<<<<<<<<<<<<<<<<<<<<<
        StdRandom.shuffle(sarr);
        Quick.sort(sarr);
        StdRandom.shuffle(sarr);
        Shell.sort(sarr);
        //StdRandom.shuffle(sarr);
        //Insertion.sort(sarr);
        //StdRandom.shuffle(sarr);
        //Selection.sort(sarr);
        //StdOut.println("Array After Sorting");
        //for(int i=0;i<k;i++)
        //    StdOut.println(sarr[i]);
    }
}
class Exch
{
    
    public static void exch(Comparable[] a, int i, int j)
    {
        Comparable temp= a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
class heapSort
{
 public static void sort(Comparable[] arr)
 {
     Stopwatch time=new Stopwatch();
     int N=arr.length;
     for(int k=N/2;k>=1;k--)
         sink(arr,k,N);
     while(N>1)
     {
         exch(arr,1,N--);
         sink(arr,1,N);
     }
     System.out.println("Total time taken to sort data by Heap sort is " + time.elapsedTime());
    
 }
 private static void sink(Comparable[] a,int k, int N)
    {
        while(2*k<=N)
        {
            int j=2*k;
            if(j<N && less(a,j,j+1))
                   j++;
            if(!less(a,k,j))
                   break;
            exch(a,k,j);
            k=j;
        }
    }
 private static void exch(Comparable[] a, int i, int j)
    {
    Comparable temp=a[i-1];
    a[i-1]=a[j-1];
    a[j-1]=temp;
 }
 private static boolean less(Comparable[] a,int i, int j)
    {
        return a[i-1].compareTo(a[j-1])<0;
    }
}
class Merge
{
    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
    {
        for(int k=lo;k<=hi;k++)
            aux[k]=a[k];
        int i=lo,j=mid+1;
        for(int k=lo;k<=hi;k++)
        {
            if(i>mid)
                a[k]=aux[j++];
            else if (j>hi)
                a[k]=aux[i++];
            else if (aux[j].compareTo(aux[i])<0)
                a[k]=aux[j++];
            else
                a[k]=aux[i++];
        }
    }
    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
    {
         if (hi<=lo)
             return;
         int mid=lo+(hi-lo)/2;
         sort(a,aux,lo,mid);
         sort(a,aux,mid+1,hi);
         merge(a,aux,lo,mid,hi);
    }
    public static void sort(Comparable[] arr)
    {
        Stopwatch time=new Stopwatch();
        Comparable[] aux= new Comparable[arr.length];
        sort(arr,aux,0,arr.length-1);
        System.out.println("Total time taken to sort data by Merge sort is " + time.elapsedTime());
    }
}

class Quick
{
    private static int partition(Comparable[] a, int lo, int hi)
    {
        int i=lo,j=hi+1;
        while(true)
        {
            while (a[++i].compareTo(a[lo])<0)
                if (i==hi) break;
            while (a[lo].compareTo(a[--j])<0)
                if (j==lo) break;
            if (i>=j) break;
            Exch.exch(a,i,j);
        }
        Exch.exch(a,lo,j);
        return j;
    }
    public static void sort(Comparable[] a)
    {
        Stopwatch time=new Stopwatch();
        sort(a,0,a.length-1);
        System.out.println("Total time taken to sort data by Quick sort is "+time.elapsedTime());
    }
    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi<=lo) return;
        int j=partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }
    
}
class Selection
{
    public static void sort(Comparable[] a)
    {
        Stopwatch time=new Stopwatch();
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            if(a[j].compareTo(a[min])<0)
               min=j;
        Exch.exch(a,i,min);
        }
        System.out.println("Total time taken to sort data by Selection sort is "+time.elapsedTime());
    }
}
class Insertion
{
    public static void sort(Comparable[] a)
    {
        Stopwatch time=new Stopwatch();
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>0;j--)
               if(a[j].compareTo(a[j-1])<0)
                  Exch.exch(a,j,j-1);
               else break;
        }
        System.out.println("Total time taken to sort data by Insertion sort is "+time.elapsedTime());
    }
        
}
class Shell
{
    public static void sort(Comparable[] a)
    {
        Stopwatch time= new Stopwatch();
        int n=a.length;
        int h=1;
        while(h<n/3) h=3*h+1;
        while(h>=1)
        {
            for(int i=h;i<n;i++)
            {
                for(int j=i;j>=h && (a[j].compareTo(a[j-h])<0);j-=h)
                    Exch.exch(a,j,j-h);
            }
            h=h/3;
        }
        System.out.println("Total time taken to sort data by Shell sort is "+time.elapsedTime());
    }
}