package Tema1;

public class Try_catch_finally {

    public static void main(String[] args) {

        try {
            int result = 5 / 0;
            System.out.println("fin");
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Cierre de recursos");
        }


    }
}
