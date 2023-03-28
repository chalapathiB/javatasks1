public class Main {
    public static void main(String[] args) {
        Instrument[] instrument = new Instrument[10];
        instrument[0] = new Piano();
        instrument[1] = new Flute();
        instrument[2] = new Guitar();
        instrument[3] = new Piano();
        instrument[4] = new Flute();
        instrument[5] = new Guitar();
        instrument[6] = new Piano();
        instrument[7] = new Flute();
        instrument[8] = new Guitar();
        instrument[9] = new Piano();

        for (int i = 0; i < 10; i++)
        {
            instrument[i].functionPlay();
        }
    }
}