public class Queue 
{
    int arr[];
	int front;
	int rear;
    public Queue(int sz)
	{
		arr=new int[sz];
		front=-1;
		rear=-1;
	}
    boolean IsEmpty() // checks if the queue is empty or not
	{
		if(rear==-1 &&front==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void enqueue(int item) // enters the element into the queue
	{
		if(rear==arr.length-1)
        {
			System.out.println("EMPTY");
        }
		else if(IsEmpty())
		{
			front=0;
			rear=0;
			arr[rear]=item;
		}
		else 
		{
			rear++;
			arr[rear]=item;
		} 
	}
	int peek() // returns the top most element without removing it from queue
	{
		if(IsEmpty())
		{
			return-1;
		}
		else
		{
			return arr[front];
		}
	}
	int dequeue() // returns the top most element by removing it from queue
	{
		if(IsEmpty())
		{
			System.out.print("EMPTY");
			return -1;
		}
		else if(front==rear)
		{
			int ans=front;
			front=-1;
			rear=-1;
			return arr[ans];
		}
		else
		{
			return arr[front++];
		}
	}
	void show() // printing the elements in the queue
	{
		if(IsEmpty())
		{
			System.out.println("EMPTY");
		}
		else
		{
			while(!IsEmpty())
			{
				System.out.print(" "+peek());
				dequeue();
			}
		}
	} 
}

