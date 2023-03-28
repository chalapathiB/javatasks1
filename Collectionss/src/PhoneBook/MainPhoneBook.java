package PhoneBook;

import java.util.HashMap;
import java.util.Scanner;

public class MainPhoneBook
{
    public static void main(String[] args)
    {
        HashMap<String,Long> hm=new HashMap<>();
        hm.put("Chalapathi",9398658543L);
        hm.put("Rahul",9848073891L);
        hm.put("Ravi",7865837373L);
        hm.put("sasi",1234567890L);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name to give number:");
        String str=sc.nextLine();
        Long phon=hm.get(str);
        System.out.println(phon);
    }
}
