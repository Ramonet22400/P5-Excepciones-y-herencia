package EX_05;

//5. Propón y soluciona un ejercicio que trabaje las excepciones.

// El ejercicio que propongo es el siguiente:
//
// Tenemos que entrar por teclado una serie de palabras para avanzar sobre un cuestionario.

import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabra= "Hello";
        do {
            try {

                System.out.println("¿Quiere empezar el cuestionario?");
                palabra = sc.nextLine();

                if (palabra.equals("Si")) {

                    System.out.println("Muy bien!! Empezemos.");
                    System.out.println("¿Cual es la capital de España?");
                    palabra = sc.nextLine();

                    if (palabra.equals("Madrid")) {

                        System.out.println("Perfecto. Veo que tenemos un listillo.");
                        System.out.println("Haber una mas difícil. ¿Cual es el río mas largo de España?");
                        palabra = sc.nextLine();

                        if (palabra.equals("Ebro")) {

                            System.out.println("Bueno, bueno, bueno. Esta es ya chunga chunga: ¿En que año estamos?");
                            palabra = sc.nextLine();

                            if (palabra.equals("2022")) {

                                System.out.println("Sin palabras. As completado el cuestionario con exito. Bienvenido a Vox");
                            }
                        }
                    }

                } else if (palabra.equals("No")) {
                    System.out.println("Okay no pasa nada :( ");
                }else {
                    throw new NotDiccionario("El parametro introducido es incorrecto.");
                }

            } catch (Exception e) {

                System.out.println("La respuesta es incorrecta o está mal escrita.");
            } catch (NotDiccionario e) {
                throw new RuntimeException(e);
            }
        } while (true);
    }
}
