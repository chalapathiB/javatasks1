import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntegers
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(23);
        al.add(32);
        al.add(45);
        al.add(56);
        al.add(62);
        al.add(70);
        al.add(89);
        al.add(93);
        al.add(18);
        System.out.println("This is Array list:"+al);
        List<Integer> l=al.stream().filter(i->i%2==0).collect(Collectors.toList());
        List<Integer> l1=al.stream().map(j -> j+5).collect(Collectors.toList());
        Long NoOfFailed=al.stream().filter(i->i<35).count();
        List<Integer> sl=al.stream().sorted().collect(Collectors.toList());
        List<Integer> sl1=al.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());//Comparator Interface we are overriding the compare method with Lambda Expression
        List<Integer> sl2=al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());//Comparable Interface
        System.out.println("The count of Failed Students is:"+NoOfFailed);
        System.out.println("The filtered marks are:"+l);
        System.out.println("The Grace marks is:"+l1);
        System.out.println("The Sorted list is Ascending Order:"+sl);
        System.out.println("The Sorted list in Descending Order using 'Comparator Interface':"+sl1);
        System.out.println("The Sorted List in Descending Order using 'Comparable Interface':"+sl2);
    }
}