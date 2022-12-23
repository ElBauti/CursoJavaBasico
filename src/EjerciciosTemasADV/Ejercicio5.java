package EjerciciosTemasADV;

public class Ejercicio5 {
    /*
    Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
     que será capturada por su llamante (desde "main", por ejemplo).
     Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso:
     "Demo de código".
     */


    public static void main(String[] args) throws ArithmeticException {
        try {
            DividePorCero();
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de codigo");
        }
    }

    static int DividePorCero(){
        int num1,num2;
        num1 = 4;
        num2 = 0;
        int resultado = num1 / num2;
        return resultado;
    }
}
