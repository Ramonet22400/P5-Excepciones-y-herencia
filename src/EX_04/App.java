package EX_04;

//4. Crea un programa con un bucle while que pida al usuario un número entero y
//muestre el resultado del cuadrado. En caso de introducir un carácter o valor que no
//sea un número, captura la excepción y vuelva a pedirle el número hasta que sea
//correcto. Añada el código a la tabla.


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            try {

                System.out.println("Introduzca un numero porfavor. ");
                String numero = sc.nextLine();

                    int numero_int = Integer.parseInt(numero);
                    int cuadrado;

                    cuadrado = numero_int * numero_int;

                    System.out.println("El cuadrado de "+numero_int+" es: "+cuadrado);



            } catch (Exception FormatError) {

                System.out.println("El valor introducido es incorrecto, porfavor vuelva a introducir un valor. ");

            }
        }while(sc.hasNextInt());

    }
}
