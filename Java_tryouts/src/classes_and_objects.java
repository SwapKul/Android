public class Classes_and_objects {

    public static void main (String[] args) {

        class User {

            int score;

            public boolean hasWon() {

                if (score >= 100) {

                    return true;

                } else {

                    return false;

                }

            }

        }

        User bob = new User();
        bob.score = 10;
        System.out.println(bob.hasWon());

        class Number {

            int num;

            public boolean isPositive() {

                return num >0;

            }

        }

        Number trial = new Number();
        trial.num = 2;

        if (trial.isPositive()) {

            System.out.println(trial.num + " is positive.");

        } else {

            System.out.println(trial.num + " is negative.");

        }

    }

}
