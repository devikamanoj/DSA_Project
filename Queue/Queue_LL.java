public class Queue_LL 
{
    Node rear,front;
	boolean isEmpty()
	{
		if(rear==null&&front==null)
        {
            return true;
        }
		else
		{
            return false;
        }
	}
	void Enque(int item)
	{
		Node newnode=new Node(item);
		newnode.data=item;
		newnode.next=null;

		if(isEmpty())
		{
			rear=front=newnode;
		}
		else
		{
			rear.next=newnode;
			rear=newnode;
		}
	}
	void Dequeue()
	{
        if(isEmpty())
		{
			System.out.println(" EMPTY");
		}
		else
		{
			if(front==rear)
			{
				front=rear=null;
			}
			else
			{
				System.out.print(front.data);
				front=front.next;
			}
		}
	}
	void Deque()
	{
		if(isEmpty())
		{
			System.out.println("EMPTY");
		}
		else
		if(front==rear)
		{
			front=rear=null;
		}
		else
		{
			front=front.next;
		}
	}
    int peek()
	{
		if(isEmpty())
		{
			return-1;
		}
		else
		{
			return front.data;
		}
	}
	void show()
	{
		if(isEmpty())
		{
			System.out.println(" EMPTY");
		}
		else
		{
			while(!isEmpty())
			{
				System.out.print(front.data+" ");
				Deque();
			}
		}
	}
}
class Node
{
	int head;
    int data;
	Node next;
	public Node (int d)
	{
		data=d;
		next=null;
	}
}
