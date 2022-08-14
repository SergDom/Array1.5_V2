import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задание 1");

        int[] firstArr = new int[3];

        double[] secondArr = new double[]{1.57, 7.654, 9.986};

        int[] thirdArr = new int[4];
        thirdArr[0] = 2;
        thirdArr[1] = 4;
        thirdArr[2] = 8;
        thirdArr[3] = 10;

        System.out.println();
        System.out.println("Задание 2");

        firstArr[0] = 1;
        firstArr[1] = 2;
        firstArr[2] = 3;

        for (int i = 0; i < firstArr.length; ++i)
            if (i == 0) {
                System.out.print(firstArr[i]);
            } else {
                System.out.print(" , " + firstArr[i]);
            }

        System.out.println();

        for (int j = 0; j < secondArr.length; j++)
            if (j == 0) {
                System.out.print(secondArr[j]);
            } else {
                System.out.print(" , " + secondArr[j]);
            }

        System.out.println();


        for (int k = 0; k < thirdArr.length; k++)
            if (k == 0) {
                System.out.print(thirdArr[k]);
            } else {
                System.out.print(" , " + thirdArr[k]);
            }

        System.out.println();

        System.out.println("Задание 3");

        for (int i = firstArr.length - 1; i >= 0; i--) {
            System.out.print(firstArr[i]);
            if (i != 0)
                System.out.print(" , ");
        }


        System.out.println();
        for (int j = secondArr.length - 1; j >= 0; j--) {
            System.out.print(secondArr[j]);
            if (j != 0) {
                System.out.print(" , ");
            }
        }

        System.out.println();

        for (int k = thirdArr.length - 1; k >= 0; k--) {
            System.out.print(thirdArr[k]);

            if (k != 0) {
                System.out.print(" , ");
            }
        }

        System.out.println();

        System.out.println("Задание 4");

        for (int i = 0; i < firstArr.length; i++)
            if (firstArr[i] % 2 == 1) {
                firstArr[i]++;
                System.out.print(firstArr[i]);
            } else {
                System.out.print(" , " + (firstArr[i]));
                if (i != firstArr.length - 1) {
                    System.out.print(" , ");
                }
            }

    }
}

