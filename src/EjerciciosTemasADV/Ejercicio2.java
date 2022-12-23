package EjerciciosTemasADV;

public class Ejercicio2 {
    //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

    public static void main(String[] args) {
        int [][] numeros = new int[2][4];
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 10;
        numeros[1][1] = 20;
        numeros[1][2] = 30;
        numeros[1][3] = 40;

        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Estoy en i = " + i + " ,j= " + j + " el valor de esta columna vale = " + numeros[i][j]);
            }

        }


    }
}
