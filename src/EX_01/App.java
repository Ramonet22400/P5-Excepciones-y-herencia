package EX_01;

public class App {

    // 1. Define una clase “NegativeNumberException” que herede de “Exception” y que
    //contenga un constructor sin parámetros y un constructor que reciba como parámetro
    //un String, de tal modo que ambos invoquen a los constructores de la clase “Exception”
    //correspondientes.

    public static void main(String[] args) throws NeagtiveNumberException {
        throw new NeagtiveNumberException("El programa no va :( ");
    }
}

