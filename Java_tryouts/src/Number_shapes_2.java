public class Number_shapes_2 {

    public static void main (String[] args) {

        class Number{

            int num;

            public boolean triangleNumber(){

                int triangleNumber = 1;

                for (int i = 1; i < num; i++){

                    i = triangleNumber + i;

                }

                if (triangleNumber == num){

                    return true;

                } else {

                    return false;

                }

            }


        }

        Number z = new Number();
        z.num = 6;
        System.out.println(z.triangleNumber());

    }

}
