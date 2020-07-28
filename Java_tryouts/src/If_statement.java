public class If_statement {

    public static void main (String[] args) {

        int age = 19;


        if (age == 18) {

            System.out.println("User is 18");

        } else if (age > 18) {

            System.out.println("User is over 18");

        } else {

            System.out.println("User is below 18");

        }

        int[] age2 = {56, 67};

        if (age2[1] > age2[0]) {

            System.out.println("Second integer is greater than first!");

        } else if (age2[0] > age2[1]) {

            System.out.println("First integer is greater than second!");

        } else {

            System.out.println("Both integers are same!");

        }

    }

}
