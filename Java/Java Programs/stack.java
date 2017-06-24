/*	Assignment 6

*/
class stack 
{
int top=-1;
int a[]=new int[10];
void push(int b)
{
top++;
if(top<10)
a[top]=b;
else 
System.out.println("Stack is over flow");
}
int pop()
{
top--;
return(a[top+1]);
}
void display()
{
System.out.println(a[top]);
}
}
