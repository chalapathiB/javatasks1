import java.util.Scanner;

public class MenuNum
{
    public static void main(String[] args)
    {
        System.out.println("Enter the value of A:");
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.println("Enter the value of B:");
        int B=sc.nextInt();
        Number n=new Number(A,B);
        System.out.println("Select the Operaton");
        System.out.println("Select 1 for  Addition");
        System.out.println("Select 2 for  Substraction");
        System.out.println("Select 3 for  Multiplication");
        System.out.println("Select 4 for  Division");
        int option=sc.nextInt();
        if(option==1)
        {
             n.sum();
        }
        else if(option==2)
        {
            n.difference();
        }
        else if (option==3)
        {
            n.product();
        }
        else if (option==4)
        {
            n.division();
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
