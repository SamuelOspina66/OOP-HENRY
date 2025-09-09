package calculator;
import java.util.Scanner; // el programa usa la clase Scanner

public class Calculator {
    public Calculator() {

    }

    public int add(int a, int b) {
        return a + b;
    }   

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public double divide(int a, int b) {
        return a/b;
    }
        
    public int modulo(int a, int b) {
        return a%b;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculator myCalculator = new Calculator(); 

        System.out.print("Escriba el primer digito: ");
        int num1 = entrada.nextInt();

        System.out.print("Escriba el segundo digito: ");
        int num2 = entrada.nextInt();

        System.out.println("Suma: " + myCalculator.add(num1, num2));
        System.out.println("Resta: " + myCalculator.substract(num1, num2));
        System.out.println("Multiplicación: " + myCalculator.multiply(num1, num2));
        System.out.println("División: " + myCalculator.divide(num1, num2));
        System.out.println("Módulo: " + myCalculator.modulo(num1, num2));

    }
}



