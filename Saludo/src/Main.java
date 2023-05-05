import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ingresoNombre = new Scanner(System.in);
        String nombre;
        System.out.print("Por favor ingrese su nombre: ");
        nombre= ingresoNombre.nextLine();
        System.out.println("Gracias por ingresar su nombre " + nombre);
    }
}