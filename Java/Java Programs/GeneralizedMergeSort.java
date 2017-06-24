class GeneralizedMergeSort
{
    public static void main(String[] arg)
    {
        int k=10; //Array size
        QuickSort mrg=new QuickSort();
        String[] sarr=new String[k];
        for(int i=k-1;i>=0;i--)
            sarr[i]=String.valueOf(i+65);
        StdOut.println("Sorting for Strings");
        StdRandom.shuffle(sarr);
        StdOut.println("Array before Sorting");
        for(int i=0;i<k;i++)
            StdOut.println(sarr[i]);
        mrg.sort(sarr);
        StdOut.println("Array After Sorting");
        for(int i=0;i<k;i++)
            StdOut.println(sarr[i]);
        /*StdOut.println("Sorting for Integer");
        Integer[] iarr=new Integer[k];
        for(int i=k-1;i>=0;i--)
            iarr[i]=i+65;
        StdRandom.shuffle(iarr);
        StdOut.println("Array before Sorting");
        for(int i=0;i<k;i++)
            StdOut.println(iarr[i]);
        mrg.sort(iarr);
        StdOut.println("Array After Sorting");
        for(int i=0;i<k;i++)
            StdOut.println(iarr[i]);*/
    }
}
class MergeSort
{
    public void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
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
    public void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
    {
         if (hi<=lo)
             return;
         int mid=lo+(hi-lo)/2;
         sort(a,aux,lo,mid);
         sort(a,aux,mid+1,hi);
         merge(a,aux,lo,mid,hi);
    }
    public void sort(Comparable[] arr)
    {
        Comparable[] aux= new Comparable[arr.length];
        sort(arr,aux,0,arr.length-1);
    }
}

class QuickSort
{
    private void exch(Comparable[] a, int i, int j)
    {
        Comparable[] temp=new Comparable[1];
        temp[0]=a[i];
        a[i]=a[j];
        a[j]=temp[0];
    }
    public int partition(Comparable[] a, int lo, int hi)
    {
        int i=lo,j=hi+1;
        while(true)
        {
            while (a[++i].compareTo(a[lo])<0)
                if (i==hi) break;
            while (a[lo].compareTo(a[--j])<0)
                if (j==lo) break;
            if (i>j) break;
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
    }
    public void sort(Comparable[] a)
    {
        sort(a,0,a.length-1);
    }
    public void sort(Comparable[] a, int lo, int hi)
    {
        if (hi<=lo) return;
        int j=partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }
    
}