import java.util.Scanner;

public class Circulo implements Shape{

    private double diametro;
    private double radio;
    private double area;
    private double perimetro;
    private static final double pi = 3.1416;

    public Circulo() {
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void getArea() {
        System.out.print("Digite el diametro: ");
        diametro = scanner.nextDouble();

        radio = diametro/2;
        area = pi * Math.pow(radio,2);
        System.out.println("El area es: " + area);
    }

    @Override
    public void getPerimetro() {
        System.out.print("Digite el diametro: ");
        diametro = scanner.nextDouble();
        perimetro = pi * diametro;
        System.out.println("El perimetro es: " + perimetro);
    }
}
