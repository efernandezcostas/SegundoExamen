package juegosingleton;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        FuncionesJuego juego1=new FuncionesJuego();
        juego1.crearJuego(
                Integer.parseInt(JOptionPane.showInputDialog("Numero de rondas")),
                Integer.parseInt(JOptionPane.showInputDialog("Máximo de intentos")),
                JOptionPane.showInputDialog("Alias"));
    }
}