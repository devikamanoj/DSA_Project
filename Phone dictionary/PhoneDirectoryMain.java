import java.util.*;
import java.io.*;
public class PhoneDirectoryMain 
{
    static Scanner in = new Scanner(System.in);
    static int count=0;
    public static void main(String[] args)
    {
        PhoneDirectory ob = new PhoneDirectory();
        try
        {
            FileInputStream fis=new FileInputStream("D:\\S2\\DSA\\Projects\\Project\\src\\PhoneBook.txt");       
            Scanner sc=new Scanner(fis);    //file to be scanned  
            while(sc.hasNextLine())
            {
               ob.Insert(sc.nextLine());
            }
            sc.close(); 
        }
        catch(FileNotFoundException e)
        {
            System.out.println(" NO FILE FOUND");
        }
        System.out.println("                                              PHONE DIRECTORY");   
        System.out.println("                                              ===============");   
        while(true)
        {
            System.out.print("\n Functions in this phone directory: ");  
            System.out.println("\n \n 0. Stop \n 1. Display the Contacts \n 2. Search a Contact \n 3. Display the First Contact \n 4. Display the Last Contact \n 5. Duplicate Contact");                                        
            System.out.print(" \n Enter your choice: ");
            int choice = in.nextInt();
            switch(choice)
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
                    System.out.println();
                    System.out.println("            CONTACT DETAILS");
                    System.out.println("            ---------------");
                    ob.Display();
                    break;
                }
                case 2:
                {
                    System.out.println();
                    System.out.println("            SEARCHING THE CONTACT ");
                    System.out.println("            ---------------------");
                    System.out.println();
                    in.nextLine();
                    System.out.print(" Enter the name of the contact to be searched: ");
                    String name = in.nextLine();
                    ob.search(name);
                    break;
                }
                case 3:
                {
                    System.out.println("\n       FIRST CONTACT IN THE PHONE BOOK");
                    System.out.println("       -------------------------------");
                    String contact = ob.display_first(PhoneDirectory.root);
                    String arr [] = contact.split(",");
                    System.out.println(" Name        : "+arr[0]);
                    System.out.println(" Phone NUmber: "+arr[1]);
                    System.out.println(" Email ID    : "+arr[2]);

                    break;
                }
                case 4:
                {
                    System.out.println("\n       LAST CONTACT IN THE PHONE BOOK");
                    System.out.println("       ------------------------------");
                    String contact =ob.display_last(PhoneDirectory.root);
                    String arr [] = contact.split(",");
                    System.out.println(" Name        : "+arr[0]);
                    System.out.println(" Phone NUmber: "+arr[1]);
                    System.out.println(" Email ID    : "+arr[2]);
                    break;
                }
                case 5:
                {
                    System.out.println("\n        DUPLICATED CONTACTS");
                    System.out.println("        ------------------");
                    ob.HandleDuplicate();
                    break;
                }
                default:
                {
                    System.out.println(" OOPS !!!!!!!! \n INVALID CHOICE");
                    break;
                }
            }
        }
    }
}
