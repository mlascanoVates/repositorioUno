import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Se lee dos números desde archivo y se muestra el resultado de la suma, diferencia, producto y división: ");
        File archivo = new File ("Leer.txt");
        FileReader leerArchivo = new FileReader (archivo);
        BufferedReader buffer = new BufferedReader(leerArchivo);

        int suma, diferencia, producto;
        double cociente;
        int linea, linea2;

        linea = Integer.parseInt(buffer.readLine());
        linea2= Integer.parseInt(buffer.readLine());
        System.out.println("Primer número es: " + linea);
        System.out.println("Segundo número es: " + linea2);

        suma= linea + linea2;
        diferencia=linea - linea2 ;
        producto= linea * linea2;
        cociente= (double)linea / linea2;

        System.out.println("El resultado de su suma es: " + suma);
        System.out.println("El resultado de su diferencia es: " + diferencia);
        System.out.println("El resultado de su producto es: " + producto);
        System.out.println("El resultado de su cociente es: " + cociente);
        System.out.println();
/*

        //CALCULADORA OP2
        System.out.println("Lee con Scanner dos números desde archivo y se muestra el resultado de la suma, diferencia, producto y división: ");
        File archivo2 = new File("Leer.txt");
        Scanner leerArchivo2 = new Scanner(archivo2);

        int linea3, linea4;
        int suma2, diferencia2, producto2;
        double cociente2;

        linea3 = Integer.parseInt(leerArchivo2.nextLine());
        linea4 = Integer.parseInt(leerArchivo2.nextLine());
        System.out.println("Primer número es: " + linea3);
        System.out.println("Segundo número es: " + linea4);

        suma2= linea3 + linea4;
        diferencia2=linea3 - linea4 ;
        producto2= linea3 * linea4;
        cociente2= (double)linea3 / linea4;

        System.out.println("El resultado de su suma es: " + suma2);
        System.out.println("El resultado de su diferencia es: " + diferencia2);
        System.out.println("El resultado de su producto es: " + producto2);
        System.out.println("El resultado de su cociente es: " + cociente2);
        System.out.println();
*/
    }
}