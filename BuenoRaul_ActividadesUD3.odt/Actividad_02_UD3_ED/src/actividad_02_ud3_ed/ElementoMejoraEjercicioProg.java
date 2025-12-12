package actividad_02_ud3_ed;

import java.util.Scanner;

/**
 * Clase para comparar números y decir cuál de los dos o los tres es el mayor.
 */
public class ElementoMejoraEjercicioProg {

    /**
     * Devuelve el número mayor entre dos números
     * @param num1 el primer número
     * @param num2 el segundo número
     * @return el número más grande
     */
    public static int mayorMenor(int num1, int num2) {
        int maximo;
        if (num1 < num2) {
            maximo = num2;
        } else {
            maximo = num1;
        }
        return maximo;
    }

    /**
     * Devuelve el número mayor de los tres números
     * @param num1 el primer número
     * @param num2 el segundo número
     * @param num3 el tercer número
     * @return el número más grande de los 3
     */
    public static int mayorMenor3(int num1, int num2, int num3) {
        int maximo;

        if (num1 > num2 && num1 > num3) {
            maximo = num1;
        } else if (num2 > num1 && num2 > num3) {
            maximo = num2;
        } else {
            maximo = num3;
        }

        return maximo;
    }

    /**
     * Fuunción para números y mostrar el mayor de ellos utilizando lo establecido en la clase de arriba.
     */
    public static void main(String[] args) {

        // Comparación de dos números
        System.out.println("Función de dos números.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();
        System.out.println("El número mayor es " + mayorMenor(num1, num2));

        // Comparación de tres números
        System.out.println("Función de tres números.");
        System.out.println("Introduce un número: ");
        int num3_1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num3_2 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num3_3 = sc.nextInt();
        System.out.println("El número mayor es " + mayorMenor3(num3_1, num3_2, num3_3));
    }
}