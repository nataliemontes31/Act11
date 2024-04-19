import java.util.Scanner;

public class Cuadrado implements Shape{

    private double lado;
    private double area;
    private double perimetro;


    public Cuadrado() {
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void getArea() {
        System.out.print("Digite el lado: ");
        lado = scanner.nextDouble();

        area= lado * lado;
        System.out.println("El area es: " + area);

    }

    @Override
    public void getPerimetro() {
        System.out.print("Digite el lado: ");
        lado = scanner.nextDouble();

        perimetro= lado + lado + lado + lado;
        System.out.println("El area es: " + perimetro);
    }
}
