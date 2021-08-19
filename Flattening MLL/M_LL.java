import java.util.Scanner;
public class M_LL
{
	static Scanner in=new Scanner(System.in);
	Node head;
	
	//CREATING A MLL FROM THE INSERTED ELEMENTS
	public Node createList(int arr[])
	{
	    Node Node = null;
		for (int key: arr) 
	    {
	        Node = Insert(Node, key);
	    }
	    return Node;//first elements of a list
	 }
	
	 //TO INSERT NODES INTO THE LIST
	 Node Insert(Node head,int value)
	 {
		 Node newNode = new Node();
		 newNode.data=value;
		 newNode.next=null;
		 newNode.next=head;
		 head=newNode;
		 return head;
	 }
	 
	 //FLATTENS THE MULTILEVEL LINKED LIST
	 public Node flatten(Node node) 
	 {
		  if (node == null)
		  {
		      return null;
		  }
	
		  Node front,tail;
		  front=node;
		  tail=node;
	
		  while (tail.next != null) //ITERATES UNTIL IT REACHES THE END OF THE LIST
		  {
		      tail = tail.next;
		  }
	
		    //ITERATES UNTIL FRONT BECOMES NULL
		  while (front != null)
		  {
		      if (front.child != null) //IF THE NODE HAS A CHILD
		      {
			        tail.next= front.child; //THE TAIL END AND THE CHILD NODE IS CONNECTED
			        tail = tail.next; 
		
			        while (tail.next != null) 
			        {
			        	tail = tail.next;//ITERATES UNTIL IT REACHES THE END OF THE LIST
			        }
		      }
		      front = front.next; //INCREMENT THE FRONT NODE
		  }
		 // System.out.println("flatten "+node);
		  return node;
	  }
	  
	public void traversal(Node node)
	{
		  if(node == null) 
		  {
		      return;
		  }
		    
		  while(node != null)
		  {
		      System.out.print(node.data + "-->");
		      node = node.next;
		  }
	 }
	  
	 void inputArray(int arr[],int size)
	 {
		  int ele;
		  for(int i=size-1;i>=0;i--)
		  {
			  ele=in.nextInt();
			  arr[i]=ele;
		  }
		  System.out.println(" ");
	 }
	  
	 public static void main(String[] args)
	 {
		M_LL M= new M_LL();
		Node head1, head2, head3, head4, head5,head6,head7,head8;
		int arr1[]=new int[5];// {10,5,12,7,11}
		int arr2[]=new int[3];// {4,20,13}
		int arr3[]=new int[2];// {17,6}
		int arr4[]=new int[2];// {9,8};
		int arr5[]=new int[2];// {19,15};
		int arr6[]=new int[1];// {2};
		int arr7[]=new int[1];// {16};
		int arr8[]=new int[1];// {3};
		
		//INPUTS ARE ALL THE HORIZONTAL CONNECTIONS
		M.inputArray(arr1, 5);
		M.inputArray(arr2, 3);
		M.inputArray(arr3, 2);
		M.inputArray(arr4, 2);
		M.inputArray(arr5, 2);
		M.inputArray(arr6, 1);
		M.inputArray(arr7, 1);
		M.inputArray(arr8, 1);
		
		head1=M.createList(arr1);
		head2=M.createList(arr2);
		head3=M.createList(arr3);
		head4=M.createList(arr4);
		head5=M.createList(arr5);
		head6=M.createList(arr6);
		head7=M.createList(arr7);
		head8=M.createList(arr8);
		
		head1.child=head2;
		head1.next.next.next.child=head3;
		head2.next.child=head6;
		head2.next.next.child=head7;
		head3.child=head4;
		head7.child=head8;
		head4.child=head5;
		
		head1=M.flatten(head1);
		M.traversal(head1);
	}
}
