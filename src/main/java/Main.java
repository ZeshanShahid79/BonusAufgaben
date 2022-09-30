//import java.util.Scanner;
public class Main {
        public static void main(String[] args) {

            String name = "Zeshan";
            myName5Times(name);
            System.out.println(name);
            System.out.println("Bitte Namen eingeben: ");
            name = inputName();
            System.out.println(name);

        }
        public static String myNameIs(String name) {
            return name;
        }
        public static int myName5Times(String name) {
            int counter = 0;
            for (; counter < 5; counter++ ){
                System.out.println(name + " Counter in Schleife: " + counter);
            }
            System.out.println(counter);
            return (counter);
        }
        public static boolean valueGreater0(int value) {
            /*
            if (value <= 0){
                return false;
            }
             */
            return value > 0;
        }

        public static int squareNumber(int value) {
            return value*value;
        }

        // Testen mit Scanner nicht möglich
        public static String inputName(){
            return new java.util.Scanner(System.in).nextLine();
        }
    }