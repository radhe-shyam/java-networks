package stack;

public class CharStack 
{
int top=-1;
char a[]=new char[10];
void push(char b)
{
top++;
if(top<10)
a[top]=b;
else 
System.out.println("Stack is over flow");
}
char pop()
{
top--;
return(a[top+1]);
}
void display()
{
System.out.println(a[top]);
}
}
