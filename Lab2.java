public class Lab2 {
    public static void main(String[] args) {
        /* 0414
           C5 = 4 -> C = A*B
           C7 = 1 -> byte
           C11 = 7 -> Обчислити суму найбільших елементів
           в стовпцях матриці з непарними номерами та найменших
           елементів в стовпцях матриці з парними номерами
        */

        byte[][] matrixA = {
                {1, 2, 1, 4},
                {1, 0, 2, 3},
                {7, 9, 4, 6}
        };

        byte[][] matrixB = {
                {0, 5, 7, 4},
                {1, 3, 0, 4},
                {5, 0, 3, 6},
                {9, 1, 2, 1}
        };

        int rowsA = matrixA.length;
        int colA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colB = matrixB[0].length;
        byte[][] matrixC = new byte[rowsA][colB];

        if (colA != rowsB) {
            System.out.println("Error! Matrix multiplication can't be done!");
        } else {
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colB; j++) {
                    for (int k = 0; k < rowsB; k++) {
                        matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

            System.out.println("Matrix multiplication:");
            for (int i = 0; i < matrixC.length; i++) {
                for (int j = 0; j < matrixC[0].length; j++) {
                    System.out.printf("%4d ", matrixC[i][j]);
                }
                System.out.println();
            }
        }
    }
}