import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ejercicio15 {
    /*Escribir un programa que elimine todos los elementos impares de una lista.*/
    public static List<Integer> eliminarImpares(List<Integer> lista) {
        List<Integer> listaPares = new ArrayList<>();
        for (Integer numero : lista) {
            if (numero % 2 == 0) {
                listaPares.add(numero);
            }
        }
        return listaPares;
    }//hace la lista de los pares
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();//lista completa
        System.out.println("Ingrese los elementos de la lista, escriba 'para' para finalizar:");
        String usuario;
        do {
            System.out.print("--> ");
            usuario = sc.nextLine();
            if (!usuario.equalsIgnoreCase("para")) {
                try {
                    int elemento = Integer.parseInt(usuario);
                    lista.add(elemento);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Por favor ingrese un número entero o escriba 'para' para detenerse.");
                }
            }
        } while (!usuario.equalsIgnoreCase("para"));//ingreso de elementos hasta que el usuario quiera parar

        List<Integer> listaSinImpares = eliminarImpares(lista);//combina la lista sin impares y el metodo de eliminaro los impares
        System.out.println("Lista original: " + lista);// muestra la lista con todos los elementos
        System.out.println("Lista sin impares: " + listaSinImpares);//muestra la lista sin impares
    }
}
