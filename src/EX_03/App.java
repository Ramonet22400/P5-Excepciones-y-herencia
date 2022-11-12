package EX_03;

import java.lang.reflect.Array;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int[] array1;
        array1 = new int[10];

        try {
            System.out.println("Introduzca un valor al array: ");
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 20; i++) {
                array1[i]=sc.nextInt();  //Guardamos cada valor en su posicion
            }

        } catch (Exception MaxLengthArr) {

            System.out.println("Se a sobrepasado el limite del array.");

            Scanner sc2 = new Scanner(System.in);
            String respuesta;
            respuesta = sc2.nextLine();

            System.out.println("Si desea ampliar el array escibra: yes Si no es el caso escriba cualquier otra cosa.");

            if (respuesta.equals("yes")) {
                array1 = new int[20];

                for (int i = 0; i < 20; i++) {
                    array1[i]=sc2.nextInt();  //Guardamos cada valor en su posicion
                }

                System.out.println("Ahora si el array a superado su tamño maximo, y no se puede ampliar mas. ");

            } else {
                System.out.println("El programa a finalizado.");
            }
        }
    }
}
