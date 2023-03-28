import java.util.Hashtable;
public class Product
{
     String productid;
    String productname;

    public static void main(String[] args)
    {
        Hashtable<String,String> hs=new Hashtable<>();
        hs.put("P001","Maruthi800");
        hs.put("P002","MaruthiZen");
        hs.put("P003","MaruthiEsteem");
        System.out.println(hs.remove("P003"));
        hs.put("P003","Hero");
        System.out.println(hs);
    }
}
