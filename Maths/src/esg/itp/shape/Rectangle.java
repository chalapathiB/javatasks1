package esg.itp.shape;

public class Rectangle implements Polygon
{
    float length;
    float breadth;
    public Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;

    }
    @Override
    public void calcArea()
    {
        float Area=this.length*this.breadth;
    }
    public void calcPeri()
    {
        float perimeter=2*(this.length+this.breadth);
    }
    public void display()
    {
        System.out.println("Area of the rectangle is:"+Area);
        System.out.println("Perimeter of the rectangle is:"+perimeter);
    }
}
