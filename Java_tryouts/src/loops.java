import java.util.Arrays;

public class loops {

    public static void main (String[] args) {

        int x = 1;

        while (x <= 5) { // because if x<=10 then it will go till 20 but we want it till 10 only

            System.out.println(2 * x);

            x++;

        }

        for (int y = 1; y <= 5; y++) {

            System.out.println(2 * y);

        }

        for (int a = 1; a <= 10; a++) {

            System.out.println( 3 * a);

        }

        int f = 0;

        for (int b = 1; b <= 10; b++) {
            f = f + b;
            System.out.println(f);

        }

        String[] names = {"Rob", "Jose", "Rolf", "Anne"};
        System.out.println(Arrays.toString(names));

    }

}
