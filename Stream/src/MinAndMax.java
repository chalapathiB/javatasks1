import java.util.ArrayList;

public class MinAndMax
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al =new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        Integer min= al.stream().min((i1,i2)->i1.compareTo(i2)).get();
        Integer max= al.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("The minimum value in the ArrayList in NSD:"+min);
        System.out.println("The maximum value in the Arraylist in NSD:"+max);
        Integer min1= al.stream().min((i1,i2)->-i1.compareTo(i2)).get();
        Integer max2= al.stream().max((i1,i2)->-i1.compareTo(i2)).get();
        System.out.println("The minimum value in the ArrayList in RNSD:"+min1);
        System.out.println("The maximum value in the Arraylist in RNSD:"+max2);
    }
}
