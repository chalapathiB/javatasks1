import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class Main
{
    public static void main(String[] args)
    {
        switch(args[2])
        {
            case "+":
                System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
                break;
            case "-":
                System.out.println(Integer.parseInt(args[0])-Integer.parseInt(args[1]));
                break;
            case "*":
                System.out.println(Integer.parseInt(args[0])*Integer.parseInt(args[1]));
                break;
            case "/":
                System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
                break;
            default:
                System.out.println("Invalid Inputs");
        }



    }
}