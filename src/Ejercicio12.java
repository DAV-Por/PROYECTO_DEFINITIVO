import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio12 {
    /*Escribir un programa que encuentre el producto de todos los números
    pares en un vector de enteros.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> seleccionados = new ArrayList<>(); //aqui se guardaran los numeros selccionados
        System.out.println("**************\n* Bienvenido *\n**************\n");
        int capacidad = 10; // tamaño inicial del vector
        int[] vector = new int[capacidad];
        int contador = 0;
        System.out.println("Ingrese los numeros que quiere ingresar a la lista\ncuando termine escriba 'parar' ");
        while (true) {
            System.out.print("--> ");
            String usuario = sc.next();
            if (usuario.equalsIgnoreCase("parar")) {
                break;
            } else {
                try {
                    int numero = Integer.parseInt(usuario);
                    if (contador == vector.length) {
                        int[] temporal = new int[capacidad * 2];// si el vector está lleno, se hace el doble de grande
                        System.arraycopy(vector, 0, temporal, 0, capacidad);
                        vector = temporal;
                        capacidad *= 2;
                    }
                    vector[contador++] = numero;
                } catch (NumberFormatException e) {
                    System.out.println("No valido, por favor ingrese un numero o la palabra 'parar'");
                }
            }
        }

        int pares = 1;
        boolean hayPares = false;
        System.out.print("Numeros seleccionados: ");
        for (int i = 0; i < contador; i++) {
            if (vector[i] % 2 == 0) {
                hayPares = true;
                System.out.print(vector[i] + " ");
                pares *= vector[i];
            }
        }
        if (hayPares) {
            System.out.println("\nEl producto de todos los números pares ingresados es: " + pares);
        } else {
            System.out.println("\nNo se ingresaron números pares.");
        }
    }
}

