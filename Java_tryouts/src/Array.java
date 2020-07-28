import java.util.*;

public class Array {

    public static void main (String[] args) {

        int[] primeNumbers = {2, 3, 5, 7, 11, 13};  //arrays are primitive
        System.out.println(primeNumbers);
        System.out.println(primeNumbers[1]);
        System.out.println(primeNumbers.length);
        List list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);
        list.add(13);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println(list.toString());
        List countries = new ArrayList();
        countries.add("India");
        countries.add("Russia");
        countries.add("USA");
        countries.remove(2);
        countries.add("Scotland");
        System.out.println(countries.toString());

    }

}
