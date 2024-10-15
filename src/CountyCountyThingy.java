public class Main {
    public static void main(String[] args) {
        int numberA = -1;
        int numberB = 31;
        int numberC = -3;
        int numberD = 12;

        //I used these just because it is easier to read

        for (int i = 0; i <= 30; i++) {
            numberA += 1;
            System.out.print(numberA + " ");
        }
        System.out.println(" ");
        for (int i = 30; i >= 0; i--) {
            numberB -= 1;
            System.out.print(numberB + " ");
        }
        System.out.println(" ");
        for (int i = 0; i <= 18; i++) {
            numberC += 3;
            System.out.print(numberC + " ");
        }
        System.out.println(" ");
        for (int i = 5; i >= 0; i--) {
            numberD -= 2;
            System.out.print(numberD + " ");
        }
    }
}