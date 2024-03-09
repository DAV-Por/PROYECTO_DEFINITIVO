import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        /*Escribe un programa en Java que permita al usuario convertir una cantidad de dinero
        de una moneda a otra. El programa debe pedir al usuario ingresar la cantidad de dinero
        en una moneda (por ejemplo, dólares) y la tasa de cambio a la otra moneda (por ejemplo,
                euros). Luego, debe realizar la conversión y mostrar el resultado.*/
        int repetir = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("************************");
            System.out.println("**Conversion de moneda**");
            System.out.println("************************\n1.Dolares a Euros");
            System.out.println("************************\n2.Euros a Dolares");
            System.out.println("************************");
            System.out.println("-->");

            int opcion = sc.nextInt();
            float valoreu = 1.09f;
            float valordolar = 0.92f;

            switch (opcion) {
                case 1:
                    System.out.println("**Ingrese el numero de dolares**");
                    System.out.println("-->");
                    float dolares = sc.nextFloat();
                    float conversion = dolares / valordolar;
                    System.out.println("--El valor de " + dolares + " Dolares equivalen a " + conversion + " Euros--");

                    break;
                case 2:
                    System.out.println("**Ingrese el numero de Euros**");
                    System.out.println("-->");
                    float euros = sc.nextFloat();
                    float conv = euros * valoreu;
                    System.out.println("--El valor de " + euros + " Dolares equivalen a " + conv + " Euros--");

                    break;
            }
            System.out.println("**¿Desea repetir este codigo?**");
            System.out.println("* 1. Si                       *");
            System.out.println("* 2. No                       *");
            System.out.println("*******************************");
            System.out.print("---> ");
            repetir = sc.nextInt();
        }while(repetir != 2);
    }
}