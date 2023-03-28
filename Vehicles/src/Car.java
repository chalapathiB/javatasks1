public class Car
{
    int speed=100;
    int noOfGear=2;
    int startingspeed;
    public void methodDrive(int startingspeed,int noOfGear)
    {
        System.out.println(this.startingspeed);
        System.out.println(this.noOfGear);
    }
    public void display()
    {
        System.out.println(this.speed);
        System.out.println(this.noOfGear);
    }
}