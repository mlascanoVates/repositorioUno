import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class Main {

    //método usado en 2da Resolución
    public static int mayor(int n, int m){
        int a,b,c;
        a= abs(n+m);
        b =abs(n-m);
        c= (a+b)/2;
        return c;
    }

    public static void main(String[] args) {

        Scanner escanearNumero= new Scanner(System.in);
        int  mayor;
        int numeroEscaneado1, numeroEscaneado2;

        System.out.print("Ingrese un número por teclado: ");
        numeroEscaneado1 = Integer.parseInt(escanearNumero.nextLine());

        System.out.print("Ingrese otro número por teclado: ");
        numeroEscaneado2 = Integer.parseInt(escanearNumero.nextLine());

        //uso clase max de la biblioteca Math
        mayor=  max(numeroEscaneado1,numeroEscaneado2);
        System.out.println("El número mayor es: " + mayor);
        System.out.println();

        //2da Resolución
        //Solo recibe números positivos
        int numeroEscaneado3, numeroEscaneado4;
        System.out.print("Ingrese un número por teclado: ");
        numeroEscaneado3 = Integer.parseInt(escanearNumero.nextLine());

        System.out.print("Ingrese otro número por teclado: ");
        numeroEscaneado4 = Integer.parseInt(escanearNumero.nextLine());

        System.out.println();
        System.out.println("Otra manera de imprimir mayor 2: " + mayor(numeroEscaneado3,numeroEscaneado4));
    }
}