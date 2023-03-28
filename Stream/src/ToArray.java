import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ToArray
{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();//Conversion of Arraylist to Integer Array how???
        al.add(10);
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(17);
        al.add(55);
        al.add(66);
        Integer[] i=al.stream().toArray(Integer[]::new);
        Stream.of(i).forEach(System.out::println);
        System.out.println(i);
    }
}
