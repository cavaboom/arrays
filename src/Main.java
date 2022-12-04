public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] array1 = new int [3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double[] array2 = {1.57, 7.654, 9.986};

        byte[] array3 = {33, 52, 120};
        System.out.println("Задание 2");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}