package Algorithms;


public class Wielkanoc extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "wyznaczamy datę wielkanocy";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int rokUzytkownika = Integer.parseInt(input[1]);

        float a = rokUzytkownika%19;

        float b1 = rokUzytkownika / 100;
        int b = (int)b1;

        float c = rokUzytkownika%100;

        float d1 = b1/4;
        int d = (int)d1;

        float e = b1%4;

        float f1 = ((b1 + 8)/25);
        int f = (int)f1;

        float g1 = (b - f + 1)/3;
        int g = (int)g1;

        float h = (19*a+b-d-g+15)%30;

        float i = ((int)c/4);

        int k = (int) (c%4);

        float l = (32 + 2 * e + 2 * i - h - k)%7;

        float m = ((int)(a + 11 * h + 22 * l) / 451);

        float p = (h + l - 7 * m + 114) % 31;

        int dzienWielkanocy = (int)p + 1;
        float miesiacWielkanocy = ((int)(h + l - 7 * m + 114)/31);

        String miesiac;
        if (miesiacWielkanocy == 4) {
           miesiac = "kwiecień";
        }
        else {
            miesiac = "marzec";
        }
        System.out.println(dzienWielkanocy + "  " + miesiac);
    }
}
