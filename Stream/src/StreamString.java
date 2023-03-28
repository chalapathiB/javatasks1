import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamString
{
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<>();
        al.add("Anushka");
        al.add("chalapathi");
        al.add("Kajal");
        al.add("Prabhas");
        al.add("Bhumika");
        al.add("A");
        al.add("AAAA");
        al.add("AAA");
        al.add("AA");
        al.add("AAAAA");
        List<String> l=al.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
        List<String> l1=al.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
        Comparator<String> c= (s1,s2)->{
            int l11 = s1.length();
            int l22 = s2.length();
            if (l11<l22) return -1;
            else if(l11>l22) return 1;
            else return s1.compareTo(s2);
        };
        List<String> l2=al.stream().sorted(c).collect(Collectors.toList());
        System.out.println(l);
        System.out.println(l1);
        System.out.println(l2);
    }
}
