import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {

        double a, b, c, delta, x1, x2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wspolczynniki rownania kwadratowego (a, b, c):\n");
        System.out.print("a: ");
        a = scanner.nextDouble();
        System.out.print("b: ");
        b = scanner.nextDouble();
        System.out.print("c: ");
        c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Wspolczynnik a nie moze byc rowny 0. Nie jest to rownanie kwadratowe.");
            return;
        }


        delta = b * b - 4 * a * c;


        switch (Double.compare(delta, 0)) {
            case 0:

                x1 = -b / (2 * a);
                System.out.printf("Rownanie ma jeden pierwiastek: x1 = %.2f\n", x1);
                break;
            case 1:

                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Rownanie ma dwa pierwiastki: x1 = %.2f, x2 = %.2f\n", x1, x2);
                break;
            case -1:
                System.out.println("Rownanie nie ma pierwiastkow rzeczywistych.");
                break;
        }

        scanner.close();
    }
}
