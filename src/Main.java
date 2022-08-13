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

        for (int i = 0; i < 3; ++i)
            if (i <= 0) {System.out.print(firstArr[0]);
            } else { System.out.print(" , " + firstArr[i]);}

        System.out.println();

        for ( int j = 0; j < 3; j++)
            if (j <= 0) {
            System.out.print(secondArr[0]);}
        else {System.out.print(" , " + secondArr[j]); }

        System.out.println();


        for (int k = 0; k < 4; k++)
             if (k <= 0) {System.out.print(thirdArr[0]); }
              else { System.out.print(" , " + thirdArr[k]); }

        System.out.println();

        System.out.println("Задание 3");

        for (int i = firstArr.length; i >= 3; i--)
            if (i<2) { System.out.print(firstArr.length); }
             else { System.out.print(firstArr.length  + " , ");}


        System.out.println();
        for (int j = secondArr.length - 1; j > 0; j--) {
            System.out.print(secondArr[j] - 1 + " , ");
        }

        System.out.println();

        for (
                int k = thirdArr.length - 1;
                k > 0; k--) {
            System.out.print(+thirdArr[k] + " , ");
        }
        if (thirdArr.length >= 1) {
            System.out.print(thirdArr[0]);
        }

        System.out.println();
        System.out.println("Задание 4");

      //  int firstArr2 = firstArr[]{1, 2, 3};
        // for (; firstArr2%2!= 0; firstArr2++);

        // { System.out.print(firstArr2 + " ");

        }
    }
