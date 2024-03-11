import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*Escribe un programa en Java que genere dos números enteros aleatorios entre 1 y 10 y
        luego solicite al usuario ingresar la suma de esos dos números. El programa debe verificar
        si la respuesta es correcta.*/
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("**************\n* Bienvenido *\n**************\n");
        System.out.println("Este programa te mostrara 2 numeros y tu me tendras\nque dar la respuesta ¿Listo?\n");
        int nR1 = random.nextInt(10)+1;// Numero Random 1
        int nR2 = random.nextInt(10)+1;// Numero Random 2
        System.out.println(nR1+" + "+nR2);
        int resultado = nR1 + nR2 ;// Suma para sacar el resultado
        System.out.println("\n¿Cual crees que es el resultado de esta operacion?");
        System.out.print("--> ");
        int respuestaU = sc.nextInt();// Respuesta del Usuario
        int intento = 0;
        do {
             if (resultado != respuestaU) {
                intento++;
                System.out.println("Sigue intentado, vas en el intento " + intento);
                System.out.println("\nRecuerda la operacion: "+nR1+" + "+nR2);
                System.out.println("\nIngresa tu nueva respuesta");
                System.out.print("--> ");
                respuestaU = sc.nextInt();

            }// Comprueba que el usuario no ha respondido correctamente
        }while (resultado != respuestaU);

        System.out.println("¡Correcto! La respuesta es: "+resultado);// aparecera cuando el usuario responda correctamente
    }
}
