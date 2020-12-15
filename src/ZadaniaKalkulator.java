import java.util.Scanner;

    class Calculator {
            public static void main(String[] args) {

                System.out.println("Witaj w kalkulatorze \nPodaj liczbę, znak oraz drugą liczbę ");

                Scanner number = new Scanner(System.in);

                double x = number.nextInt();
                String math = number.next();
                double y = number.nextInt();

                while (x + y != 0) {

                    if (math.equals("+")) {
                        System.out.println(x + y);
                    } else if (math.equals("-")) {
                        System.out.println(x - y);
                    } else if (math.equals("*")) {
                        System.out.println(x * y);
                    } else if (math.equals("/")) {
                        System.out.println(x / y);
                    } else if (math.equals("%")) {
                        System.out.println(x % y + y);
                    } else {
                    }
                    break;
                }

            }
        }




