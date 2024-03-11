import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
       /*Escribe un programa en Java que solicite al usuario ingresar un número entero positivo.
         Luego, muestra un patrón de asteriscos como el siguiente ejemplo, donde cada fila tiene el
         mismo número de asteriscos que el número ingresado:*/
        System.out.println("**************\n* Bienvenido *\n**************\n");
        System.out.println("Este programa dibujara una piramide con el numero de \nniveles que usted determine en el siguiente espacio.");
        System.out.println("--> ");
        Scanner sc = new Scanner(System.in);
        int nivel = sc.nextInt();// se le pide al usuario el numero de niveles
        for (int i = 1; i <= nivel; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }//este for los dibujara

    }
}
