import java.util.ArrayList;
import java.util.stream.*;
import java.util.function.*;

public class PrintingDiffer
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(13);
        al.add(3);
        al.add(4);
        al.add(20);
        al.add(15);
        System.out.println(al);
        Consumer<Integer> c=(i)->
                {
                        System.out.println("The square of the integers are" +i*i);
                };
        al.stream().forEach(c);
        al.stream().forEach(i ->{
            System.out.println("Hello Boss"+i*i*i);
        } );
    }
}
