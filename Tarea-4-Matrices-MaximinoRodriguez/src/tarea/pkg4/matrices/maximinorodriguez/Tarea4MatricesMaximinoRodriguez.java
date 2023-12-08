/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg4.matrices.maximinorodriguez;

import java.util.Scanner;

/**
 *
 * @author maxas
 */
public class Tarea4MatricesMaximinoRodriguez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Hecha por Maximino Rodriguez y Antony Diaz
        
        Scanner entrada = new Scanner(System.in);
        String[][] matrizjugador1 = llenar();
        matrizjugador1 = barcoabajo(matrizjugador1);
        matrizjugador1 = barcoderecha(matrizjugador1);
        matrizjugador1 = barcopequeño(matrizjugador1);
        String[][] matrizjugador2 = llenar();
        matrizjugador2 = barcoabajo(matrizjugador2);
        matrizjugador2 = barcoderecha(matrizjugador2);
        matrizjugador2 = barcopequeño(matrizjugador2);
        String[][] matriz1silencioso = llenar();
        String[][] matriz2silencioso = llenar();
        System.out.println("Cual es la opcion que usted desea ingresar? ");
        System.out.println("1)Modo simple");
        System.out.println("2)Modo Silencioso");
        System.out.println("Eliga la opcion de su conveniencia: ");
        int opcionjgd = entrada.nextInt();
        int contjgd1 = 0;
        int contjgd2 = 0;
        int filajgd1 = 0;
        int columnajgd1 = 0;
        int filajgd2 = 0;
        int columnajgd2 = 0;
        switch (opcionjgd) {
            case 1:
                while (contjgd1 < 3 && contjgd2 < 3) {//Mientras el contador del jugador 1 y 2 sea inferior a 3 se repite el ciclo
                    imprimir(matrizjugador1);//imprime tablero de jugador 1
                    System.out.println("Tablero Jugador 1");
                    imprimir(matrizjugador2);//imprime tablero de jugador 2
                    System.out.println("Tablero Jugador 2");
                    System.out.println("");
                    System.out.println("Jugador 1 Digite fila: ");
                    filajgd1 = entrada.nextInt();
                    validarfilas(filajgd1);//valida que la fila este dentro del rango 
                    System.out.println("Jugador 1 Digite columna: ");
                    columnajgd1 = entrada.nextInt();
                    validarcolumnas(columnajgd1);//valida que la columna este dentro del rango
                    if (matrizjugador2[filajgd1][columnajgd1] == " ") {
                        System.out.println("Bomba al agua jugador 1");
                        matrizjugador2[filajgd1][columnajgd1] = "X";
                    } else if (matrizjugador2[filajgd1][columnajgd1] == "*") {
                        contjgd1++;
                        System.out.println(
                        "UY jugador 2 su barco ha sido danado por el jugador 1");
                        matrizjugador2[filajgd1][columnajgd1] = "X";
                    }
                    System.out.println("Jugador 2 Digite fila: ");
                    filajgd2 = entrada.nextInt();
                    validarfilas(filajgd2);
                    System.out.println("Jugador 2 Digite columna: ");
                    columnajgd2 = entrada.nextInt();
                    validarcolumnas(columnajgd2);
                    if (matrizjugador1[filajgd2][columnajgd2] == " ") {
                        System.out.println("Bomba al agua jugador 2");
                        matrizjugador1[filajgd2][columnajgd2] = "X";
                    } else if (matrizjugador1[filajgd2][columnajgd2] == "*") {
                        contjgd2++;
                        System.out.println(
                        "UY jugador 1 su barco ha sido danado por el jugador 2");
                        matrizjugador1[filajgd2][columnajgd2] = "X";
                    }
                }
                if (contjgd1 == 3) {
                    System.out.println("Felicidades jugador 1 ganaste");
                } else {
                    System.out.println("Felicidades jugador 2 ganaste");
                }
                break;
            case 2:
                while (contjgd1 < 3 && contjgd2 < 3) {
                    imprimir(matriz1silencioso);//imprime tablero de jugador 1
                    System.out.println("Tablero Jugador 1");
                    imprimir(matriz2silencioso);//imprime tablero de jugador 2
                    System.out.println("Tablero Jugador 2");
                    System.out.println("");
                    System.out.println("Jugador 1 Digite fila: ");
                    filajgd1 = entrada.nextInt();
                    validarfilas(filajgd1);//valida que la fila este dentro del  rango 
                    System.out.println("Jugador 1 Digite columna: ");
                    columnajgd1 = entrada.nextInt();
                    validarcolumnas(columnajgd1);//valida que la columna este dentro del rango
                    if (matrizjugador2[filajgd1][columnajgd1] == " ") {
                        System.out.println("Bomba al agua jugador 1");
                        matrizjugador2[filajgd1][columnajgd1] = "X";
                        matriz2silencioso[filajgd1][columnajgd1] = "X";
                    } else if (matrizjugador2[filajgd1][columnajgd1] == "*") {
                        contjgd1++;
                        System.out.println("UY jugador 2 su barco ha sido danado por el jugador 1");
                        matrizjugador2[filajgd1][columnajgd1] = "X";
                        matriz2silencioso[filajgd1][columnajgd1] = "X";
                    }
                    System.out.println("Jugador 2 Digite fila: ");
                    filajgd2 = entrada.nextInt();
                    validarfilas(filajgd2);
                    System.out.println("Jugador 2 Digite columna: ");
                    columnajgd2 = entrada.nextInt();
                    validarcolumnas(columnajgd2);
                    if (matrizjugador1[filajgd2][columnajgd2] == " ") {
                        System.out.println("Bomba al agua jugador 2");
                        matrizjugador1[filajgd2][columnajgd2] = "X";
                        matriz1silencioso[filajgd1][columnajgd1] = "X";

                    } else if (matrizjugador1[filajgd2][columnajgd2] == "*") {
                        contjgd2++;
                        System.out.println(
                        "UY jugador 1 su barco ha sido danado por el jugador 2");
                        matrizjugador1[filajgd2][columnajgd2] = "X";
                        matriz1silencioso[filajgd1][columnajgd1] = "X";
                    }
                }
                if (contjgd1 == 3) {
                    System.out.println("Felicidades jugador 1 ganaste");
                } else {
                    System.out.println("Felicidades jugador 2 ganaste");
                }
        }
    }

    public static String[][] llenar() {
        String[][] matriz = new String[6][5];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = " ";
            }
        }//ya me lleno de espacios la matriz
        return matriz;
    }

    public static int validarfilas(int filas) {
        Scanner entrada = new Scanner(System.in);
        while (filas < 0 || filas > 5) {
            System.out.println("Digite correctamente la fila");
            filas = entrada.nextInt();
        }
        return filas;
    }

    public static int validarcolumnas(int columnas) {
        Scanner entrada = new Scanner(System.in);
        while (columnas < 0 || columnas > 4) {
            System.out.println("Digite correctamente la fila");
            columnas = entrada.nextInt();
        }
        return columnas;
    }

    public static void imprimir(String[][] matriz) {
        System.out.print(" ");
        for (int i = 0; i <= 4; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            System.out.print(i + "");
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static String[][] barcoabajo(String[][] matriz) {
        int maxfilas = 5;
        int cont = 0;
        int minfilas = 0;
        int maxcolumnas = 4;
        int mincolumnas = 0;
        int filasfinal = 0;
        int columnasfinal = 0;
        int filas = (int) (minfilas + Math.random() * (maxfilas - minfilas + 1));
        int columnas = (int) (mincolumnas + Math.random() * (maxcolumnas
                - mincolumnas + 1));
        while (cont < 2) {
            cont = 0;
            filas = (int) (minfilas + Math.random() * (maxfilas - minfilas + 1));
            columnas = (int) (mincolumnas + Math.random() * (maxcolumnas
                    - mincolumnas + 1));
            filasfinal = filas;
            columnasfinal = columnas;
            if ((filas + 2 <= maxfilas) && (matriz[filas][columnas] == " ")
                    && (columnas != 0)) {
                for (int i = 1; i <= 2; i++) {
                    if (matriz[filas][columnas] == " ") {
                        cont++;//decifrar si hay espacio para poner el barco y si no se reinicia el ciclo
                    }
                    filas++;
                }//fin del for
            }
        }//fin del while
        for (int i = 1; i <= 3; i++) {
            matriz[filasfinal][columnasfinal] = "*";
            filasfinal++;
        }
        return matriz;
    }

    public static String[][] barcoderecha(String[][] matriz) {
        int maxfilas = 5;
        int cont = 0;
        int minfilas = 0;
        int maxcolumnas = 4;
        int mincolumnas = 0;
        int filasfinal = 0;
        int columnasfinal = 0;
        int filas = (int) (minfilas + Math.random() * (maxfilas - minfilas + 1));
        int columnas = (int) (mincolumnas + Math.random() * (maxcolumnas
                - mincolumnas + 1));
        while (cont < 2) {
            cont = 0;
            filas = (int) (minfilas + Math.random() * (maxfilas - minfilas + 1));
            columnas = (int) (mincolumnas + Math.random() * (maxcolumnas
                    - mincolumnas + 1));
            filasfinal = filas;
            columnasfinal = columnas;
            if (columnas + 2 < maxfilas && matriz[filas][columnas] == " ") {
                for (int i = 1; i <= 2; i++) {
                    if (matriz[filas][columnas] == " ") {
                        cont++;//decifrar si hay espacio para poner el barco y si no se reinicia el ciclo
                    }
                    columnas++;
                }//fin del for
            }
        }//fin del while
        for (int i = 1; i <= 3; i++) {
            matriz[filasfinal][columnasfinal] = "*";
            columnasfinal++;
        }
        return matriz;
    }

    public static String[][] barcopequeño(String[][] matriz) {
        int maxfilas = 5;
        int cont = 0;
        int minfilas = 0;
        int maxcolumnas = 4;
        int mincolumnas = 0;
        int filasfinal = 0;
        int columnasfinal = 0;
        int filas = (int) (minfilas + Math.random() * (maxfilas - minfilas + 1));
        int columnas = (int) (mincolumnas + Math.random() * (maxcolumnas
                - mincolumnas + 1));
        while (cont < 1) {
            cont = 0;
            filas = (int) (minfilas + Math.random() * (maxfilas - minfilas + 1));
            columnas = (int) (mincolumnas + Math.random() * (maxcolumnas
                    - mincolumnas + 1));
            filasfinal = filas;
            columnasfinal = columnas;
            if (columnas + 1 < maxcolumnas && matriz[filas][columnas] == " ") {
                for (int i = 1; i <= 1; i++) {
                    columnas++;
                    if (matriz[filas][columnas] == " ") {
                        cont++;
                    }
                }
            }//fin del if
        }//fin del while
        for (int i = 1; i <= 2; i++) {
            matriz[filasfinal][columnasfinal] = "*";
            columnasfinal++;
        }
        return matriz;
    }
}

