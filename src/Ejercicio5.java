import java.util.Scanner;
public class Ejercicio5

{
    public static void main(String[] args) {
       /* Escribe un programa en Java que solicite al usuario ingresar un número entero positivo.

        Luego, suma todos los dígitos del número y muestra el resultado.
                Ejemplo: Usuario ingresa 12 → El programa retorna 3
        SumDigitos = 1+2= 3  */
        int repetir = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("--Ingresa un numero entero positivo--\n-->");
            int numero = sc.nextInt();
            //metodo para obtener el tamaño del numero para recorrer uno por uno sus digitos y sumarlos
            int num = Integer.toString(numero).length();
            int total = 0;
            for (int i = 0; i < num; i++) {
                String numerin = String.valueOf(Integer.toString(numero).charAt(i));
                total += Integer.parseInt(numerin);
                System.out.println("--La suma total de los digitos de este numero es:"+total+"--");
            }
            System.out.println("* ¿Desea repetir este codigo? *");
            System.out.println("* 1. Si                       *");
            System.out.println("* 2. No                       *");
            System.out.println("*******************************");
            System.out.print("---> ");
            repetir = sc.nextInt();
        }while(repetir != 2);
    }
}
