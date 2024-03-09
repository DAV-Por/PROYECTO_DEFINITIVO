import javax.swing.*;
import java.util.Scanner;

public class Ejercicio11 {
    /*Escribir un programa que calcule la suma de todos los elementos en un vector de enteros.*/
    public static void main(String[] args) {

        int suma = 0;
        String temp = "";
        Scanner sc = new Scanner(System.in);
        int[] vectorDeSuma = new int[5];
        for (int i = 0; i < vectorDeSuma.length; i++) {
            System.out.println("Digite un numero");
            vectorDeSuma[i] = sc.nextInt();
        }
        for (int i = 0; i < vectorDeSuma.length; i++){
            suma += vectorDeSuma[i];
        }
        System.out.println("Los elementos del vector son los siguientes: "+temp);
        System.out.println("El total de la suma de los elementos es: "+suma);
    }
}
