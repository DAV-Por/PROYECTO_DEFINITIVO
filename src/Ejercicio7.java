import java.util.Scanner;
public class Ejercicio7
{
    public static void main(String[] args) {
        /*Crea un programa en Java que solicite al usuario ingresar tres números enteros.
        Luego, muestra los números en orden ascendente, utilizando condicionales para determinar
        cuál es el mayor, el intermedio y el menor.*/
        int repetir = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("--Digite un numero entero--\n-->");
            int n1 = sc.nextInt();
            System.out.println("--Digite un numero entero--\n-->");
            int n2 = sc.nextInt();
            System.out.println("--Digite un numero entero--\n-->");
            int n3 = sc.nextInt();


            if ((n1 > n2) && (n2 > n3)) {
                System.out.println("--Orden--");
                System.out.println("--"+n1+"--");
                System.out.println("--"+n2+"--");
                System.out.println("--"+n3+"--");

            } else if ((n1 > n3) && (n3 > n2)) {
                System.out.println("--Orden--");
                System.out.println("--"+n1+"--");
                System.out.println("--"+n3+"--");
                System.out.println("--"+n2+"--");

            } else if ((n2 > n1) && (n1 > n3)) {
                System.out.println("--Orden--");
                System.out.println("--"+n2+"--");
                System.out.println("--"+n1+"--");
                System.out.println("--"+n3+"--");


            } else if ((n2 > n3) && (n3 > n1)) {
                System.out.println("--Orden--");
                System.out.println("--"+n2+"--");
                System.out.println("--"+n3+"--");
                System.out.println("--"+n1+"--");


            } else if ((n3 > n1) && (n1 > n2)) {
                System.out.println("Orden:");
                System.out.println("--"+n3+"--");
                System.out.println("--"+n1+"--");
                System.out.println("--"+n2+"--");

            } else if ((n3 > n2) && (n2 > n1)) {
                System.out.println("Orden:");
                System.out.println("--"+n3+"--");
                System.out.println("--"+n2+"--");
                System.out.println("--"+n1+"--");
            } else {
                System.out.println("ERROR");
            }
            System.out.println("* ¿Desea repetir este codigo? *");
            System.out.println("* 1. Si                       *");
            System.out.println("* 2. No                       *");
            System.out.println("*******************************");
            System.out.print("---> ");
            repetir = sc.nextInt();
        }while (repetir != 2);

    }
}