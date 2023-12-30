package aula19.labs;

public class Exer36 {
    public static void main(String[] args) {
        double[] A = new double[10];

        for (int i = 0; i < A.length; i++) {
            A[i] = Math.pow(2, i);
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
