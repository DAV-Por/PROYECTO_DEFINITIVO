import java.util.*;

public class Ejercicio16 {
    /* Escribir un programa que elimine todas las claves de un HashMap que tengan
        un valor menor que un número dado.*/
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        //valores del HashMap
        hashMap.put("Elemento 1", 24);
        hashMap.put("Elemento 2", 13);
        hashMap.put("Elemento 3", 5);
        hashMap.put("Elemento 4", 2);
        hashMap.put("Elemento 5", 9);

        System.out.println("HashMap original:");//se muestra el hashMap original
        System.out.println(hashMap);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese el número menor para eliminar las claves: ");
        int numeroMenor = sc.nextInt();

        List<String> clavesEliminadas = new ArrayList<>();//Lista para guardar calves eliminadas

        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < numeroMenor) {
                clavesEliminadas.add(entry.getKey()); // Almacenar la clave eliminada
                iterator.remove();
            }
        }// se eliminan las claves menores

        System.out.println("\nClaves eliminadas:");
        for (String clave : clavesEliminadas) {
            System.out.print(clave+", ");
        }//muestra que claves se eliminaron

        System.out.println("\nHashMap después de eliminar claves menores que " + numeroMenor + ":");
        System.out.println(hashMap);//hashMap despues de eliminar


    }
}
