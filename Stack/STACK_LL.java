import java.util.Scanner;

class Node
{
	int data;
	Node next;

}

public class STACK_LL  
{
	Node top,temptop;
	boolean isEmpty()
	{
		if(top==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	void push(int item)
	{
		Node newnode=new Node();
		newnode.data=item;
		newnode.next=null;
		newnode.next=top;
		top=newnode;
		temptop=newnode;
	}
	
	void pop()
	{
		if(isEmpty())
		{
			System.out.print("EMPTY");
		}
		else
		{
			top=top.next;
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
			System.out.print(top.data);
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
			while(top!=null)
			{
				
				System.out.print(top.data+"\t");
				pop();
			}
		}
		top=temptop;
	}
	
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		STACK_LL S=new STACK_LL();
		int choice,ele;
		System.out.print("\n\n");
		
		do 
		{
			choice=in.nextInt();
			switch(choice)
			{ 
				case 1:
					ele=in.nextInt();
					S.push(ele);
					break;
					
				case 2:
					System.out.print("2		");
					if(!S.isEmpty())
						S.peek();
					S.pop();
					break;
					
				case 3:
					System.out.print("3		");
					S.peek();
					break;
					
				case 4:
					System.out.print("4		");
					S.show();
					break;
			
			}
			
		}while(choice!=0);
		in.close();
	}
}
