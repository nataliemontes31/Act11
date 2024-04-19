import java.util.Scanner;

public class Triangulo implements  Shape{

    private double lado1;
    private double lado2;
    private double lado3;
    private double area;
    private double perimetro;
    private double altura;
    private double base;

    public Triangulo() {
    }
    Scanner scanner = new Scanner(System.in);

    @Override
    public void getArea() {
        System.out.print("Digite la base: " );
        base = scanner.nextDouble();
        System.out.print("Digite la altura: ");
        altura = scanner.nextDouble();

        area = ((base * altura) / 2);
        System.out.println("La area es: " + area);
    }

    @Override
    public void getPerimetro() {
        System.out.print("Digite el lado 1: " );
        lado1 = scanner.nextDouble();
        System.out.print("Digite el lado 2: " );
        lado2 = scanner.nextDouble();
        System.out.print("Digite el lado 3: " );
        lado3 = scanner.nextDouble();

        perimetro = lado1 + lado2 + lado3;
        System.out.println("El perimetro es: " + perimetro);


    }
}
