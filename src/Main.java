public class Main {
    public static void main(String[] args) {

        //System.out.println("Задание 1");

        int[] boxInt = new int[3];
        boxInt[0] = 1;
        boxInt[1] = 2;
        boxInt[2] = 3;

        double[] boxDouble = {1.57, 7.654, 9.986};

        char[] boxChar = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("Задание 2");

        for (int i = 0; i < boxInt.length; i++) {
            if (i == boxInt.length - 1) {
                System.out.println(boxInt[i]);
                break;
            }
            System.out.print(boxInt[i] + ", ");
        }
        for (int i = 0; i < boxDouble.length; i++) {
            if (i == boxDouble.length - 1) {
                System.out.println(boxDouble[i]);
                break;
            }
            System.out.print(boxDouble[i] + ", ");
        }
        for (int i = 0; i < boxChar.length; i++) {
            if (i == boxChar.length - 1) {
                System.out.println(boxChar[i]);
                break;
            }
            System.out.print(boxChar[i] + ", ");
        }
    }
}