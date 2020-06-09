/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ets82;

/**
 *
 * @author YENIFER LOPEZ
 */
public class ETS82 {

    static boolean esPrimo(int numero) {
        boolean primo = true;

        if (numero == 0 || numero == 1) {
            return false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
            return primo;
        }
    }

    static int darLaVuelta(int numero) {
        String NUMERO = "" + numero; // convierte numero de int a String
        String RESULTADO = "";
        int posicion = NUMERO.length() - 1;
        do {
            RESULTADO += NUMERO.charAt(posicion);
            posicion--;
        } while (posicion >= 0);
        int resultado = Integer.parseInt(RESULTADO);
        return resultado;
    }

    static boolean esCapicua(int numero) {
        int numeroAlReves = darLaVuelta(numero);
        if (numero == numeroAlReves) {
            return true;
        } else {
            return false;
        }
    }

    static boolean esPrimoYCapicua(int numero) {
        if (esPrimo(numero) && esCapicua(numero)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean seguir = true;
        int numero = 0;
        int contador = 0;

        while (seguir) {
            if (esPrimoYCapicua(numero) == true) {
                System.out.println("" + numero);
                contador++; //guarda los número que son primos y capicúas en este contador
            }
            if (contador == 50){
                seguir = false;
            }
            numero++; //guardará los números en este contador para que los muestre por pantalla
        }
    }

}
