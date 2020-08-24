import java.util.Arrays;

public class Try_catch {

    public static void main(String[] args) {

        int[] array = new int[2];

        try {
            for (int i=0; i<3; i++) {
                array[i] = i;
            }
        } catch (Exception e) {
            System.out.println("There was a problem!");
        }

        System.out.println(Arrays.toString(array));

    }

}
