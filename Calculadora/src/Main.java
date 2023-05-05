import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ingresoNumero = new Scanner(System.in);
        int numero1,numero2;
        int suma, diferencia, producto;
        double cociente;

        System.out.print("Ingrese un número entero: ");
        numero1 = ingresoNumero.nextInt();

        System.out.print("Ingrese un segundo número entero: ");
        numero2 = ingresoNumero.nextInt();

        suma= numero1 + numero2;
        diferencia= numero1 - numero2;
        producto= numero1* numero2;
        cociente= (double)numero1 / numero2;

        System.out.println("El resultado de su suma es: " + suma);
        System.out.println("El resultado de su diferencia es: " + diferencia);
        System.out.println("El resultado de su producto es: " + producto);
        System.out.println("El resultado de su cociente es: " + cociente);
        System.out.println();

    }
}