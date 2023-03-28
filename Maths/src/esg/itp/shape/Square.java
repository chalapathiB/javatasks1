package esg.itp.shape;

public class Square implements Polygon
{

        float side;
    public Square( float side)
        {
            this.side = side;
        }
        @Override
        public void calcArea ()
        {
            float Area = (this.side * this.side);
        }

        public void calcPeri()
        {
            float perimeter = (4 * this.side);
        }
        public void display ()
        {
            System.out.println("Area of the Square is:" + Area);
            System.out.println("Perimeter of the Rectangle is:" + perimeter);
        }
    }
