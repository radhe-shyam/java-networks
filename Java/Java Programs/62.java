
// program to implement 'this' keyword.
  
class A
{
 int a;
 A(int a)
 {
   this.a=a;
   System.out.println("value of A is ="+a);
 }
}

 class B extends A
 {
  int c;
   B(int k ,int g)
   {
    super(k);
    c=g;
    System.out.println("value of c is ="+c);
   }
 }
    class c1
    {
     public static void main(String arg[])
     {
     B obj=new B(2,5);
   }
 }

