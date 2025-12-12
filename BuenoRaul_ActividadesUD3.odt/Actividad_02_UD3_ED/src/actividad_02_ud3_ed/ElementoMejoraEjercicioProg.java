package actividad_02_ud3_ed;

import java.util.Scanner;

public class ElementoMejoraEjercicioProg {
    public static int mayorMenor(int num1, int num2){
        int maximo;
        if (num1<num2){
        maximo = num2;
        }
        else{
        maximo = num1;
        }
        return(maximo);
    }
    public static int mayorMenor3(int num1, int num2, int num3){
        int maximo;
        if (num1>num2 && num1>num3){
        maximo = num1;
        }
        if (num2>num1 && num2>num3){
        maximo = num2;
        }
        else{
        maximo = num3;
        }
        return(maximo);
    }
    public static void main(String[] args) {
        {
        // Comparación de dos números
        System.out.println("Función de dos números.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();
        System.out.println("El número mayor es " + mayorMenor(num1, num2));
        }
        {
        // Comparación de tres números
        System.out.println("Función de tres números.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num3 = sc.nextInt();
        System.out.println("El número mayor es " + mayorMenor3(num1, num2, num3));
        }
    }
}