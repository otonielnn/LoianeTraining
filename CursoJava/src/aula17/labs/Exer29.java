package aula17.labs;

import java.util.Scanner;

public class Exer29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int numero = input.nextInt();

        for (int i = 1; i <= numero; i++) {
            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
    
            if (primo) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
