import jdk.nashorn.internal.runtime.Undefined;

public class Number
{
    int firstNumber;
    int secondNumber;
    double result;
    public Number(int firstNumber,int secondNumber)
    {
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
    }
    public void sum()
    {
    result= firstNumber+secondNumber;
        System.out.println(result);
    }
    public void difference()
    {
        result= firstNumber-secondNumber;
        System.out.println(result);

    }
    public void product()
    {
        result= firstNumber*secondNumber;
        System.out.println(result);

    }
    public void division()
    {
        if (secondNumber==0)
        {
            throw new DivideByZeroException();
        }
        result = firstNumber / secondNumber;
        System.out.println(result);

    }


}
