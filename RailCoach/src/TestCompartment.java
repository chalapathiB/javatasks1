import java.util.Random;
public class TestCompartment
{
    public static void main(String[] args)
    {
        Compartment[] compart=new Compartment[4];
        compart[0]=new FirstClass();
        compart[1]=new Ladies();
        compart[2]=new Luggage();
        compart[3]=new General();
        Random rd=new Random();
        int red= rd.nextInt(4);
        compart[red].functionNotice();
    }
}