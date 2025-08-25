package ec.edu.uea.busquedaarreglo;

public class BusquedaArreglo {

    public static void main(String[] args) {
        //Escribe un programa que incluya una matriz bidimensional 
        //(puede ser una matriz pequeña de 3x3) con valores numéricos.

        int[][] matriz = {
            {4, 7, 2}, //Fila 0
            {9, 1, 5}, // Fila 1
            {3, 8, 6} // Fila 2
        };

        //Implementa una función que realice una búsqueda en la 
        //matriz para encontrar un valor específico que definas.
        int buscar = 8;
        int[] pos = buscar(matriz, buscar);

        //Muestra un mensaje que indique si el valor se encontró o no, 
        //y muestra su posición en la matriz si se encontró.
        //Si encuentra el valor en la matriz me va a devolver 
        //la fila y la columan en la que se encuentra
        if (pos[0] != -1) {
            System.out.println(" valor encontrado");
            System.out.println(" Fila:"+pos[0]+", Columna"+pos[1]);
        } else {
            System.out.println("Valor no encontrado");
        }
    }

    //caso contrario me va a devolver -1 y -1
    static int[] buscar(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
