import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int num1,digito;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero positivo");
        num1 = sc.nextInt();
        if (num1 < 0){
            System.out.println("El numero debe ser mayor que 0, intentalo nuevamente");
            return;
        }
        System.out.println("Ingresa el digito que deseas buscar en este numero");
        digito = sc.nextInt();
        int contador=0;
        int digitoActual;
        while (num1 > 0) {
            digitoActual = num1 % 10;
            if (digitoActual == digito) {
                contador++;
            }
            num1 = num1 / 10;
        
        }
        System.out.println("El digito "+digito+" aparece "+contador+" veces en el numero "+num1);
        
    }
}
