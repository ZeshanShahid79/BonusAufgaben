

    public class Main {
        public static void main(String[] args) {

            String name = "Zeshan";
            myName5Times(name);
            System.out.println(name);

        }

        public static String myNameIs(String name) {
            return name;
        }

        public static int myName5Times(String name) {
            int counter = 0;
            for (; counter < 5; counter++ ){
                System.out.println(name + counter);

            }
            System.out.println(counter);
            return (counter);
        }
    }


