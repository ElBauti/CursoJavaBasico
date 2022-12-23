package Tema5;

public class Arrays {

    public static void main(String[] args) {

//        int[] numeros = new int[]{1,2,3,4,5};
//
//        int numeros[] = { 1, 2, 3, 4, 5};
//        for (int numero: numeros) {
//            System.out.println(numero);
//        }
//        System.out.println("La longitud del array es de: " + numeros.length);


//        int bidimensional[][] = new int[2][4];
//        bidimensional[0][0] = 1;
//        bidimensional[0][1] = 2;
//        bidimensional[0][2] = 3;
//        bidimensional[0][3] = 4;
//
//        bidimensional[1][0] = 10;
//        bidimensional[1][1] = 20;
//        bidimensional[1][2] = 30;
//        bidimensional[1][3] = 40;
        int bidimensional[][] ={
                {1, 2, 3, 4},
                {10,20,30,40}
        };
        for (int i = 0; i < bidimensional.length; i++) {
            System.out.println("valor de i: "+ i);
            for (int j = 0; j < bidimensional[i].length; j++) {
                System.out.println("Estoy en i = " + i + " ,j= " + j + " el valor de esta columna vale = " + bidimensional[i][j]);
            }
        }








    }
}

