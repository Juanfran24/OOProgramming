/**
 *
 * @author Juan Esteban Franco Estacio
 * Algoritmos y Programación 2
 * 2023B
 *  Debe completar el código proporcionado con el fin de permitirle al programa:
 *
 * Calcular la suma total de horas de streaming de los 5 videojuegos
 * Obtener el nombre del videojuego con el mayor número de espectadores
 * Calcular el promedio de las horas transmitidas por los 5 juegos
 */
public class Parcial_Viernes {
    static String leaderboard_names[] = {"Starfield","GTA V","League of Legends","Valorant","Apex Legends"};
    //
    static int leaderboard_data[][];

    //COMPLETAR:declarar las constantes que determinan el tamaño
    //          de la matriz de datos

    //COMPLETAR: declarar variables para guardar las horas totales de
    //streaming y horas promedio:


    public static void main(String[] args)
    {
        int NUM_FILAS = 5, prom_horas = 0, total_horas = 0, id_videojuego = 0, mayor_horas = 0, sum_horas = 0;
        int[] filaArreglo;

        //inicializar matriz leaderboard data con 3 columnas y 5 filas

        //completar inicialización de matriz:
        leaderboard_data = new int[][]{
                {62421175, 844802, 534911},
                {29092967, 543349, 257160},
                {24202970, 88223, 264607},
                {19721916, 170929, 487273},
                {12701411, 657328, 361755}
        };

        //1. recorrido para calcular el total de horas de streaming
        // recorrido en la fila respectiva
        for(int fila=0; fila < NUM_FILAS; fila++ )
        {
            filaArreglo = leaderboard_data[fila];
            for (int i = 0; i < filaArreglo.length; i++) {
                if(i == 1){
                    total_horas += filaArreglo[i];
                }
            }
        }

        //2. Búsqueda del nombre del videojuego con mayor numero de
        //   espectadores
        //  (recorrido en la fila respectiva)
        for(int fila=0; fila < NUM_FILAS; fila++)
        {
            filaArreglo = leaderboard_data[fila];
            for (int i = 0; i < filaArreglo.length; i++) {
                if(i == 0){
                    if(filaArreglo[i] > mayor_horas) {
                        mayor_horas = filaArreglo[i];
                        id_videojuego = fila;
                    }
                }
            }
        }


        //3. Cálculo del promedio de horas transmitidas
        for(int fila=0; fila < NUM_FILAS; fila++)
        {
            filaArreglo = leaderboard_data[fila];
            for (int i = 0; i < filaArreglo.length; i++) {
                if(i == 0){
                    sum_horas += filaArreglo[i];
                }
            }
        }

        prom_horas =  sum_horas / NUM_FILAS;

        //4. Imprimir los 3 valores obtenidos en los puntos anteriores:
        System.out.println("Suma total horas streaming: " + total_horas);
        System.out.println("Nombre juego con mayor numero de espectadores: " + leaderboard_names[id_videojuego]);
        System.out.println("Promedio horas transmitidas: " + prom_horas);

    }

}
