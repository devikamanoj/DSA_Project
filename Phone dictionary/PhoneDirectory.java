public class PhoneDirectory 
{
    static PhoneNode root; 
    static String temp=" ";  
    public PhoneDirectory()
    {
        root = null;
    }
    public void Insert(String Name)
    {
        if(root==null)
        {
            root=new PhoneNode(Name);
        }
        else
        {
            root.Insert(Name,root); // calls the insert method in class PhoneNode
        }
    }
    public void HandleDuplicate()
    {
        if(root==null)
        {
            System.out.println("   NO ELEMENTS ARE DUPLICATED");
        }
        else
        {
            root.HandleDuplicate(); // calls the HandleDuplicate method in class PhoneNode
        }
    }
    void Display()
    {
        if(root==null)
        {
            return;
        }
        else
        {
            root.Display();// calls the Display method in class PhoneNode
        }
    }
    void search(String Name)
    {
        if(root==null)
        {
            System.out.println("\n ********************** THE CONTACT DETAILS IN NOT FOUND **********************");
        }
        else
        {
            root.search(Name); // calls the Search method in class PhoneNode
        }
    }
    String display_first(PhoneNode root)
    {
        if(root==null)
        {
            return temp;
        }
        else
        {
            if(root.left==null)
            {
                temp= root.data;
                return temp;
            }
            else
            {
                temp=display_first(root.left);
                return temp;
            }
        }
    }
    String display_last(PhoneNode root)
    {
        if(root==null)
        {
            return temp;
        }
        else
        {
            if(root.right==null)
            {
                temp=root.data;
                return temp;
            }
            else
            {
                temp=display_last(root.right);
                return temp;  
            }
        }
    }
}
