public class SportCar extends Car
{
    int intialspeed=45;
    int gearstatus=3;
    @Override
    public void display()
    {
        System.out.println(this.noOfGear);
        System.out.println(this.speed);
    }
    public void Airbaloon(int intialspeed,int gearstatus)
    {
        System.out.println(this.intialspeed);
        System.out.println(this.gearstatus);

    }

}