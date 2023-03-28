import java.util.Scanner;
public class Linkedlisty
{
    class Node
    {
        private Node previous;
        private int data;
        private Node nextnode;
    }
    private Node first;
    Scanner sc=new Scanner(System.in);
    public void addfirst()
    {
        System.out.println("Enter the value to add first:");
        int n=sc.nextInt();
        if (first==null)
        {
            Node nd=new Node();
            nd.data=n;
            first=nd;
        }
        else
        {
            Node nd = new Node();
            nd.data = n;
            nd.nextnode=first;
            first.previous=nd;
            first=nd;
        }
    }
    public void addrear()
    {
        System.out.println("Enter the value to add rear");
        int n=sc.nextInt();
        if(first==null)
        {
            Node nd=new Node();
            nd.data=n;
            first=nd;
        }
        else
        {
            Node temp=first;
            while(temp.nextnode!=null)
            {
                temp=temp.nextnode;
            }
            Node nd=new Node();
            nd.data=n;
            temp.nextnode=nd;
            nd.previous=temp;
        }
    }
    public void displayrear()
    {
        if (first==null)
        {
            System.out.println("Nothing to display");
        }
        else
        {
            Node temp=first;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.nextnode;
            }
        }
        System.out.println();
    }
    public void display()
    {
        if (first==null)
        {
            System.out.print("Nothing to display");
        }
        else
        {
            Node temp=first;
            while(temp.nextnode!=null)
            {
                temp=temp.nextnode;
            }
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.previous;
            }

        }

        System.out.println();
    }
    public void deletefront() {
        first = first.nextnode;
        first.previous.nextnode = null;
        first.previous = null;
    }
    public void addAtIndex(int index,int data)
    {

        Node temp=first;
        if (first==null)
        {
            System.out.println("There is nothing to add");
        }
        else
        {
            for(int i=0;i<index-1;i++)
            {
                temp=temp.nextnode;
            }
            Node nd=new Node();
            nd.data=data;
            nd.previous=temp;
            nd.nextnode=temp.nextnode;
            temp.nextnode=nd;
            temp.nextnode.previous=nd;
        }
    }
    public void removeatIndex(int index)
    {
        Node temp=first;
        if (first==null)
        {
            System.out.println("There is nothing to remove");
        }
        else
        {
            for(int i=0;i<index-1;i++)
            {
                temp=temp.nextnode;
            }
            temp.nextnode=temp.nextnode.nextnode;
            temp.nextnode.nextnode.previous=temp;
        }
    }
}