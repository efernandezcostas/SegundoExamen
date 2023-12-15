package juegosingleton;

import javax.swing.*;

/**
 * @autor Enrique Fernandez
 * @version 1
 * Funciones utilizadas en el juego
 */
public class FuncionesJuego {
    /**
     * Método para crear el juego
     *
     * @param rondas    rondas máximas de la partida
     * @param maxIntentos   máximo de intentos fallidos durante la partida
     * @param alias alias del juegador
     */
    public void crearJuego(int rondas, int maxIntentos, String alias){
        this.rondas=rondas;
        this.maxIntentos=maxIntentos;
        this.alias=alias;

        do {
            generarNumero();
            pedirNumero();
            comprobarNumero(numAleatirio, numUsuario);
        }while(numIntentos<=maxIntentos);

        comprobarRecord();
    }

    /**
     * Genera un número aleatorio
     *
     * @param numAleatorio numero aleatorio
     */
    private void generarNumero(){
        numAleatorio=Math.random()*10+1;
    }

    /**
     * Pide un número al usuario
     *
     * @param numUsuario numero usuario
     */
    public void pedirNumero(){
        numUsuario=Integer.parseInt(JOptionPane.showInputDialog("Escribe tu número"));
    }

    /**
     * Comprueba si los números coinciden
     *
     * @param numeroAleatorio
     * @param numUsuario
     */
    private void comprobarNumero(int numeroAleatorio,int numUsuario){
        if (numUsuario==numeroAleatorio){
            System.out.println("Has acertado");
            puntuacion++;
        }else{
            System.out.println("Has fallado");
            numIntentos++;
        }
    }

    /**
     * Comprueba si se superó el record
     *
     */
    public void comprobarRecord(){
        if (puntuacion>puntuacionRecord){
            aliasRecord=alias;
            puntuacionRecord=puntuacion;
            System.out.println("Nuevo record:\n"+aliasRecord+" - "+puntuacionRecord);
        }else{
            System.out.println("No has superado el record");
        }

    }
}
