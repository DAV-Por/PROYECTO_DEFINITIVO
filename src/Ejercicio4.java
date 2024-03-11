import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio4 {
    public static <string> void main (String[] args){
        /*Desarrolla un programa en Java que permita calcular el monto final de una
        inversión después de un cierto número de años, utilizando la fórmula de in-
        terés compuesto. El programa debe pedir al usuario ingresar la cantidad in-
        icial invertida, la tasa de interés anual y el número de años. Luego, mues-
        tra el monto final.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("**************\n* Bienvenido *\n**************\n");
        System.out.println("Por favor introduce tu capital inicial para invertir: ");
        System.out.println("*NO INCLUYAS NI PUNTOS NI COMAS*");
        System.out.print("--> ");
        int ci = sc.nextInt(); // ci = Capital Inicial
        System.out.println("Ahora dime en cuanto tiempo (años) vas a invertir: ");
        int t = sc.nextInt();// t = Tiempo
        System.out.println("Ya casi terminamos, solo falta el interes anual: ");
        System.out.println("*INTRODUCELO EN PORCENTAJE*");
        System.out.print("--> ");
        double ia = sc.nextInt();// ia = Interes Anual
        ia = ia/100;// se pasa el porcentaje a decimal
        double cf = ci * Math.pow(1+ia, t); //la fórmula de interés compuesto
        DecimalFormat formato = new DecimalFormat("#,###.00"); //formato para separar los numeros con comas y puntos
        double ganan = cf - ci;// ganan = al valor de la ganancias
        String ganancias = formato.format(ganan); // aqui se tranforma en un string para poder aplicarle el fornato
        String vf = formato.format(cf);// se aplica el formato al capital final con una variable llamada vf signifia Valor Final
        System.out.println("Listo, tu monto final es: "+vf+"\nY tus ganacnias fueron de: "+ ganancias);

    }
}
