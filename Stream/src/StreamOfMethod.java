import java.util.stream.*;
public class StreamOfMethod
{
    public static void main(String[] args)
    {
        Stream<Integer> st=Stream.of(9,99,9999,999,999999);
        st.forEach(System.out::println);
        System.out.println(st);
        Integer[] i={10,20,30,40,50};
        Stream.of(i).forEach(System.out::println);
    }
}
