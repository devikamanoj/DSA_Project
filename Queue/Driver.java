import java.util.*;
public class Driver 
{
    static Scanner in = new Scanner(System.in);
    static Queue ob  = new Queue(100);
    static int choice;
    static int num;
    static Queue_LL obj = new Queue_LL();
    public static void main(String[] args)
    {
        System.out.println("            QUEUE IMPLEMENTATION");
        System.out.println("            ====================");
        check();
        Restart();
        while(choice==1)
        {
            check();
            Restart();
        }
        while (choice==2)
		{
            System.out.println("                ======================");
            System.out.println("                    THANKYOU !!!");
            System.out.println("                ======================");
		    break;
		}
        while(choice>2 || choice<1)
        {
            System.out.println("\n OOPS!!!!!! \n INVALID CHOICE");
            break;
        }
    }
    static void check() // Choose the method either using array or Linked List
    {
        System.out.println("\n Methods Present: ");
        System.out.println(" 1. Queue Using an Array \n 2. Queue Using A Linked List");
        System.out.print("\n Enter your choice: ");
        int meth = in.nextInt();
        switch(meth)
        {
            case 1:
            {
                UsingQueueArray(); 
                break;
            }
            case 2 :
            {
               UsingQueueLL();
                break;
            }
            default:
            {
                System.out.println("\n OOPS!!!!!! \n INVALID CHOICE");
                break;
            }
        }
    }
    static void UsingQueueArray()
    {
        System.out.println();
        System.out.println("    QUEUE USING ARRAY ");
        System.out.println("    =================");
        System.out.println();
        System.out.println("       OPERATIONS IN A QUEUE");
        System.out.println("       ---------------------");
        System.out.println();
        System.out.println(" 0. Stop \n 1. Insert the element \n 2. Print the element in the front \n 3. Get the element in the front \n 4. Show all the element \n");
        while(true){
            num=in.nextInt();
            switch(num)
            {
                case 0:
                {
                    System.out.println("                ======================");
                    System.out.println("                    THANKYOU !!!");
                    System.out.println("                ======================");
                    return;
                }
                case 1:
                {
                    int item = in.nextInt();
                    ob.enqueue(item);
                    break;
                }
                case 2:
                {
                    System.out.print(num+" "+ob.dequeue());
                    break;
                }
                case 3:{
                    System.out.print(num+" "+ob.peek());
                    break;
                }
                case 4:
                {
                    System.out.print(num+" ");
                    ob.show();
                    break;
                }
                default:
                {
                    System.out.println("\n OOPS!!!!!! \n INVALID CHOICE");
                    break;
                }
            }
        }
    }
    static void Restart()
    {
        System.out.println("\n \n Do you want to continue: \n 1. YES \n 2. NO");
        System.out.print(" Enter your choice: ");
        choice = in.nextInt();
    }
   static void UsingQueueLL()
    {
        System.out.println();
        System.out.println("    QUEUE USING LINKED LIST ");
        System.out.println("    =======================");
        System.out.println();
        System.out.println(" 0. Stop \n 1. Insert the element \n 2. Print the element in the front \n 3. Get the element in the front \n 4. Show all the element\n ");
        while(true)
        {
            num=in.nextInt();
            switch(num)
            {
                case 0:
                {
                    System.out.println();
                    System.out.println("                ======================");
                    System.out.println("                    THANKYOU !!!");
                    System.out.println("                ======================");
                    return;
                }
                case 1:
                {
                    int item = in.nextInt();
                    obj.Enque(item);
                    break;
                }
                case 2:
                {
                    System.out.print(num+" ");
                    obj.Dequeue();
                    break;
                }
                case 3:
                {
                    System.out.print(num+" "+obj.peek());
                    break;
                }
                case 4:
                {
                    System.out.print(num+" ");
                    obj.show();
                    break;
                }
                default:
                {
                    System.out.println("\n OOPS!!!!!! \n INVALID CHOICE");
                    break;
                }
            }
        }
    }
}
