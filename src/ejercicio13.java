import java.util.Scanner;



public class ejercicio13 {
    /* Escribir un programa que encuentre el elemento máximo en un vector de enteros. es
    decir el número más grande*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,nmayor = 0;
        int[] numeros = new int[5];
        for (i = 0; i < numeros.length; i++){
            System.out.println("Ingresa un numero");
            numeros[i] = sc.nextInt();
        }
        for (i = 0; i < numeros.length; i++){
            if (numeros[i] > nmayor){
                nmayor = numeros[i];
            }
        }

        System.out.println("El numero ingresado mayor es: "+nmayor );

    }
}
