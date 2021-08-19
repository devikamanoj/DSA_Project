import java.util.Scanner;

public class STACK_ARRAY
{
	int stack_arr[];
	int top=-1,choice,temp=0;
	
	STACK_ARRAY(int size)
	{
		stack_arr=new int[size];
	}
	
	boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	void push(int ele)
	{
		
		try 
		{
			top=top+1;
			stack_arr[top]=ele;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			choice=0;
			System.out.println("OVERFLOW");
		}
		temp=top;
	}
	
	void pop()
	{
		if(isEmpty())
		{
			System.out.print("EMPTY");
		}
		else
		{
			top=top-1;
		}
	}
	
	void peek()
	{
		if(isEmpty())
		{
			System.out.print("EMPTY");
		}
		else
		{
			System.out.print(stack_arr[top]);
		}
	}
	
	void show()
	{
		if(isEmpty())
		{
			System.out.print("EMPTY");
		}
		else
		{
			while(!isEmpty())
			{
				System.out.print(stack_arr[top]+"  ");
				pop();
			}
		}
		top=temp;
	}
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		int size=15;
		STACK_ARRAY S=new STACK_ARRAY(size-1);
		int ele;
		System.out.print("\n");
		
		do 
		{
			S.choice=in.nextInt();
			switch(S.choice)
			{
				case 1:
					ele=in.nextInt();
					S.push(ele);
					break;
					
				case 2:
					System.out.print("2\t");
					if(!S.isEmpty())
					S.peek();
					S.pop();
					break;
					
				case 3:
					System.out.print("3\t");
					S.peek();
					break;
					
				case 4:
					System.out.print("4\t");
					S.show();
					break;
			
			}
		}while(S.choice!=0);
		in.close();
	}
}
