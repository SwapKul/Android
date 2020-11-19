import java.util.Arrays;

public class Advance_string_manipulation {

    public static void main(String[] args) {

        String myString = "Nick x Sean x Fido x Sara";

        String[] splitstring = myString.split(" x ");

        System.out.println(Arrays.toString(splitstring));

        String river = "Mississippi";

        String[] riverString = river.split("s");

        System.out.println(Arrays.toString(riverString));

    }

}
