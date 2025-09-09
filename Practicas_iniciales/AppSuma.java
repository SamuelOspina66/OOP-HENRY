
package appsuma;

import java.util.Scanner; // el programa usa la clase Scanner

public class AppSuma
{
   // el método main empieza la ejecución de la aplicación en Java
   public static void main(String[] args)
   {
      // crea objeto Scanner para obtener la entrada de la ventana de comandos
      Scanner entrada = new Scanner(System.in);

      NumeroEntero numero1 = new NumeroEntero(5); // primer número a sumar
      NumeroEntero numero2 = new NumeroEntero(8);
      NumeroEntero suma = new NumeroEntero(5);

      System.out.println("numero1 es "+ numero1.getNumero());
      System.out.println("numero2 es "+ numero2.getNumero()); // indicador
      //numero1 = entrada.nextInt(); // lee el primer número del usuario

      //System.out.print("Escriba el segundo entero: "); // indicador
     
      //suma = numero1 + numero2; // suma los números, después almacena el total en suma

      //System.out.printf("La suma es %d%n", suma); // muestra la suma

      //entrada.close(); // cerrar el Scanner (opcional)
   } // fin del método main
}  // fin de la clase Suma

