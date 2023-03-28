import com.highpeak.assignments.T2023.chalapathi.Advisor;
import com.highpeak.assignments.T2023.chalapathi.Greeter;

import java.sql.SQLOutput;

public class GreeterTest
{
    public static void main(String[] args)
    {
        for(int i=0;i<args.length;i++)
        {
            Greeter gtr = new Greeter(args[i]);
            System.out.println(gtr.sayHello());
        }
        String[] msg = {"be happy", "stay cool", "drink water", "eat healthy food", "go to gym"};
        Advisor ad=new Advisor(msg);
        System.out.println(ad.getAdvice());
        for (int i=args.length-1;i>=0;i--)
        {
            Greeter gtr = new Greeter(args[i]);
            System.out.println(gtr.goodBye());
        }
    }
}