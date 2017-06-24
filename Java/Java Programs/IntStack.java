/*	Assignment 6

*/
package stack;
public class IntStack 
{
int top=-1;
int a[]=new int[10];
public void push(int b)
{
top++;
if(top<10)
a[top]=b;
else 
System.out.println("Stack is over flow");
}
public int pop()
{
top--;
return(a[top+1]);
}
public void display()
{
System.out.println(a[top]);
}
}
