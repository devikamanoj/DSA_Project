public class PhoneNode 
{
    String data;
    PhoneNode left;
    PhoneNode right;
    int countnode=1;
    public PhoneNode(String s)
    {
        data = s;
        left = null;
        right = null;
    }
    public PhoneNode Insert(String name, PhoneNode root)
    {
        if(root.data.equals(name))
        {
            root.countnode++;
            return root;
        }
        else if(root.data.compareTo(name)>0)
        {
            if(root.right==null)
            {
                root.right=new PhoneNode(name);
            }
            else
            {
                root.right=Insert(name, root.right);
            }
        }
        else if(root.data.compareTo(name)<0)
        {
            if(root.left==null)
            {
                root.left=new PhoneNode(name);
            }
            else
            {
                root.left=Insert(name, root.left);
            }
        }
        return root;
    }
    public void Display()
    {
        if(left!=null)
        {
            left.Display();
        }
        String [] contact = data.split(",");
        {
            System.out.println(" Name        : "+contact[0]);
            System.out.println(" Phone NUmber: "+contact[1]);
            System.out.println(" Email ID    : "+contact[2]);
            System.out.println();
        }
        if(right!= null)
        {
            right.Display();
        }
    }
    public boolean search(String Name)
    {
        String [] contact = data.split(",");
        if(contact[0].equals(Name))
        {
            
            System.out.println(" Name        : "+contact[0]);
            System.out.println(" Phone NUmber: "+contact[1]);
            System.out.println(" Email ID    : "+contact[2]);
            System.out.println();
            return true;
        }
        else if (data.compareTo(Name)<0 && left !=null)
        {
            return left.search(Name);
        }
        else if(data.compareTo(Name)>0 && right!=null)
        {
            return right.search(Name);
        }
        else
        {
            System.out.println("\n ********************** THE CONTACT DETAILS IS NOT FOUND **********************");
            return false;
        }
    }
    public void HandleDuplicate()
    {
        if(right!=null)
        {
            right.HandleDuplicate();
        }
        if (countnode>1)
        {
            String [] contact = data.split(",");
            System.out.println(" Name        : "+contact[0]);
            System.out.println(" Phone NUmber: "+contact[1]);
            System.out.println(" Email ID    : "+contact[2]);
            System.out.println(" Repeated    : "+countnode);
            System.out.println();
        }
        if(left!=null)
        {
            left.HandleDuplicate();
        }
    }
}