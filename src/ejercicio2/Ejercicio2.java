
package ejercicio2;

public class Ejercicio2 {


    public static void main(String[] args) {
        int suma = 0;
        int x = 20;

        // Realizo las operaciones
        suma = suma + x;
        int y = 40;
        x = x + (int) Math.pow(y, 2);
        suma = suma + x / y;

        // Muestro el valor de la suma
        System.out.println("El valor de la suma es: " + suma);
    }

}
