package aula46.labs;

public class Teste {
    public static void main(String[] args) {
        Quadrado f1 = new Quadrado("Quadrado" ,2);

        Circulo f2 = new Circulo("Circulo", 2);

        Triangulo f3 = new Triangulo("Triangulo", 3, 2);

        Cubo f4 = new Cubo("Cubo", 3);

        Cilindro f5 = new Cilindro("Cilindro", 3, 2);

        Piramide f6 = new Piramide("Piramide", 3, 2, 4, 4, f1);

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = f1;
        figuras[1] = f2;
        figuras[2] = f3;
        figuras[3] = f4;
        figuras[4] = f5;
        figuras[5] = f6;

        for (FiguraGeometrica figura : figuras) {
            System.out.println("----------------");
            System.out.println(figura.getNome());

            if (figura instanceof Figura2D) {
                Figura2D f2d = (Figura2D) figura;
                System.out.println(f2d.calcularArea());
            }

            if (figura instanceof Figura3D) {
                Figura3D f3d = (Figura3D) figura;
                System.out.println(f3d.calcularArea());
                System.out.println(f3d.calcularVolume());
            }
        }
    }
}
