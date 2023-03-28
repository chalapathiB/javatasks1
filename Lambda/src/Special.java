public interface Special
{
    public abstract void add(int a,int b);
    default void m1()
    {
        System.out.println("This is default method");
    }
    static void m2()
    {
        System.out.println("This is static method");
    }
}

