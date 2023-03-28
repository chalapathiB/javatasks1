import java.util.Random;
public class TestMedicine
{
    public static void main(String[] args)
    {
        Medicine[] med=new Medicine[4];
        med[0]=new Tablet();
        med[1]=new Syrup();
        med[2]=new Ointment();
        Random rd=new Random();
        int red=rd.nextInt(3);
        med[red].functionDisplayLabel();
    }
}