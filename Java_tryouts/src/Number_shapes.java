public class Number_shapes {

    public static void main (String[] args) {

        class Number{

            int num;

            public boolean triangularNumber(){

                int x = 1;

                int triangleNumber = 1;

                while (triangleNumber < num) {

                    x++;
                    triangleNumber = triangleNumber + x;

                }

                return triangleNumber == num;

            }

            public boolean squareNumber () {

                double squareRoot = Math.sqrt(num);

                return squareRoot % 1 == 0; // or we could use return squareRoot == Math.floor(squareRoot)

            }

        }

        Number z = new Number();
        z.num = 625;
        System.out.println(z.squareNumber());


    }

}
