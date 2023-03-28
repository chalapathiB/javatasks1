import  java.lang.IllegalArgumentException;
public class CalculateAverage
{
    int n;
    public double AvgFirstN(int N)
    {
        int Average=0;
        Average=1+N/2;
        if(Average<1)
        {
          IllegalArgumentException iae =   new IllegalArgumentException();
            throw iae;
        }
        return Average;
    }
    public static void main(String[] args)
    {
        CalculateAverage CA=new CalculateAverage();
        double avg=CA.AvgFirstN(100);
        System.out.println(avg);
    }
}
