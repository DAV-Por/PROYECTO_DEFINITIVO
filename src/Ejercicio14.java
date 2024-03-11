import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio14 {
    /*Escribir un programa que elimine los elementos duplicados de una lista.*/
    public static <T> List<T> eliminarDuplicados(List<T> lista) {
        Set<T> conjunto = new HashSet<>(lista);
        return new ArrayList<>(conjunto);//se eliminan los elementos
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();// la lista donde se van a almacenar los elementos ingresados por el usuario
        System.out.println("Ingrese los elementos para la lista, escriba 'para' cuando haya terminado.");
        while (true) {
            System.out.print("--> ");
            String usuario = sc.next();
            if (usuario.equalsIgnoreCase("para")) {
                break;
            } else {
                try {
                    int numero = Integer.parseInt(usuario);
                    lista.add(numero);
                } catch (NumberFormatException e) {
                    System.out.println("No válida ingrese un número válido o 'para'.");
                }
            }
        }//para ingresar los elementos o parar

        List<Integer> listaSinDuplicados = eliminarDuplicados(lista);
        System.out.println("\nLista sin elementos duplicados:");
        System.out.println(listaSinDuplicados);//se muestra la lista sin los elementos duplicados

    }


}
