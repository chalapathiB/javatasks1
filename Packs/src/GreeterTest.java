import com.highpeak.assignments.t2023.chalapathi.Advisor;
import com.highpeak.assignments.t2023.chalapathi.Greeter;

public class GreeterTest
{

    public static void main(String[] args)
    {
        String[] msg = {"be happy", "stay cool", "drink water", "eat healthy food", "go to gym"};
        Advisor ad = new Advisor() ;
        ad.advisor(msg);

        for (int i=0;i< args.length;i++)
        {
            System.out.println(new Greeter(args[i]).sayHello());
        }
        System.out.println(ad.getAdvice());
        for (int i= args.length-1;i>=0;i--)
        {
            System.out.println( new Greeter(args[i]).sayGoodye());
        }
    }
}
