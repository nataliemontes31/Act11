import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       
            Circulo circulo = new Circulo();
            Triangulo triangulo = new Triangulo();
            Cuadrado cuadrado = new Cuadrado();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Seleccione una opcion a calcular");
            System.out.println("1) Area");
            System.out.println("2) Perimetro");
            System.out.print("Opcion: ");
            int opc1 = scanner.nextInt();

            if (opc1 == 1) {
                System.out.println("Selecciona la figura a sacar el area");
                System.out.println("1) Circulo");
                System.out.println("2) Triangulo");
                System.out.println("3) Cuadrado");
                System.out.print("Opcion: ");
                int opc2 = scanner.nextInt();

                switch (opc2) {
                    case 1:
                        circulo.getArea();
                        break;
                    case 2:
                        triangulo.getArea();
                        break;
                    case 3:
                        cuadrado.getArea();
                        break;
                }


            } else if (opc1 == 2) {

                System.out.println("Selecciona la figura a sacar el perimetro");
                System.out.println("1) Circulo");
                System.out.println("2) Triangulo");
                System.out.println("3) Cuadrado");
                System.out.print("Opcion: ");
                int opc2 = scanner.nextInt();

                switch (opc2) {
                    case 1:
                        circulo.getPerimetro();
                        break;
                    case 2:
                        triangulo.getPerimetro();
                        break;
                    case 3:
                        cuadrado.getPerimetro();
                        break;
                }

            } else {
                System.out.println("No digitaste un numero correcto");
            }



    }
}
