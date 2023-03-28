public class Specialext
{
    public static void main(String[] args)
    {
        Special sp=(a,b)->
        {
            System.out.println("The sum of numbers are: "+(a+b));
        };
        sp.add(10,20);
        sp.m1();
        Special.m2();
    }
}
