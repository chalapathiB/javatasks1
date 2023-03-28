public class MainSumInter {
    public static void main(String[] args) {
        SumInter sm = (a, b) -> a + b;
        System.out.println(sm.adding(3, 4));
        System.out.println(sm.adding(10, 100));

        LengthStr ls = (str) ->
        {
            return str.length();
        };
        System.out.println(ls.getLength("Bochollu Chalapathi"));

        BreadthStr bs = (str) ->
        {
            return str.length();
        };
        System.out.println("Length of the String is :" + bs.getBreadth("Chalapathi"));


        Runnable rn1 = ()->
        {
                for (int i = 1; i <=10; i++) {
                    System.out.println(i);
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        };
        Thread t1=new Thread(rn1);
        t1.setName("John");
        t1.start();
        Runnable rn2 = ()->
        {
            for (int i = 1; i <=10; i++) {
                System.out.println("The table of 2 is:"+i*2);
            }
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread t2=new Thread(rn2);
        t2.setName("Chala");
        t2.start();
    }
}

