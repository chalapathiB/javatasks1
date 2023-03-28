
import esg.itp.shape.Rectangle;
import esg.itp.shape.Square;
public class Test
{
    public static void main(String[] args)
    {
        Square s=new Square(5);
        s.calcArea();
        s.calcPeri();
        s.display();
        Rectangle r=new Rectangle(5,6);
        r.calcArea();
        r.calcPeri();
        r.display();
    }
}
