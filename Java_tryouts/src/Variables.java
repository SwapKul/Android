public class Variables {
    public static void main (String[] args) {

        int favouriteNumber = 15;  //primitive, for decimals use double
        System.out.println("My favourite number is " + favouriteNumber);
        boolean userLikesPizza = true;  //primitive
        System.out.println(userLikesPizza);
        int age = 21;
        String myName = "Swapnil";  //  not primitive since its a class, classes are defined with capital letters at the start
        System.out.println("My name is " + myName +", and I am " + age + "years old");
        double a = 3.2;
        double b = 4.6;
        System.out.println(a*b);
        String myString = "shdbjanw";
        System.out.println(myString.length());
        String firstName = "Swapnil";
        String lastName = "Kulshreshtha";
        int length = firstName.length() + lastName.length();
        System.out.println("My full name has the character length of " + length + " alphabets");
        System.out.println("My name is " + firstName + " " + lastName);


    }
}
