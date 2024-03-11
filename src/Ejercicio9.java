import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        /*Desarrolla un programa en Java que solicite al usuario ingresar dos números enteros
        positivos y luego calcule y muestre su máximo común divisor (MCD).*/

        Scanner sc = new Scanner(System.in);
        int num1,num2;
        boolean MCD = false;

        while (true){
            System.out.println("Ingrese el primer numero este debe ser menor");
            num1 = sc.nextInt();
            System.out.println("Ignrese el segundo numero este debe ser mayor");
            num2 = sc.nextInt();

            if ((num1 > 0) && (num2> 0) && (num1 != num2) && (num1 < num2)){

                int i = num1;
                while ((!MCD) && (i>=1)){
                    if ((num1 % i == 0) && (num2 % i == 0)){
                        System.out.println("El maximo comun divisor de "+num1+" y "+num2+" es "+i);
                        MCD = true;
                    }else{
                        i--;
                    }
                }

                {break;}

            }
            else{
                if (num1 == num2){
                    System.out.println("DEBES INGRESAR NUMEROS DIFERENTES ENTRE SI");
                }else if (num1 > num2){
                    System.out.println("El numero "+num1+" es incorrecto, este debe ser mayor que numero 2");
                }
                else if (num1 <= 0){
                    System.out.println("El numero "+num1+" es incorrecto, debe ser mayor y diferente de 0");
                }else{
                    System.out.println("El numero "+num2+" es incorrecto, debe ser mayor y diferente de 0");
                }

            }
        }


    }
}
