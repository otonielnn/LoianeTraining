package aula34.labs;

public class Contador {
    private static int count = 0;

    public Contador() {
        incrementar();
    }

    public static void incrementar() {
        count++;
    }
    
    public static void zerar() {
        count = 0;
    }

    public static int valor() {
        return count;
    }
    
}