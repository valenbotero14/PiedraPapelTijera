package PiedraPapelTijera.app;

import PiedraPapelTijera.dominio.Juego;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;


public class AppJuego {
    private static int resultadoJugada;
    private static int jugadaMaquina;

    public static void main(String[] args) {
        boolean Ejecutar = true;
        List<String> opcionesJuego = Arrays.asList("Ver instrucciones", "Jugar", "Ver resultados");
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Bienvenid@ \n ¿Qué quieres hacer?", "POO - Piedra, Papel o Tijera", 0, JOptionPane.QUESTION_MESSAGE, null, opcionesJuego.toArray(), null);

        while (Ejecutar) {
            try {
                switch (opcionSeleccionada) {
                    case 0: {
                        JOptionPane.showMessageDialog(null, "El objetivo es vencer al oponente seleccionando el arma que gana, según las siguientes reglas:\n " +
                                "La piedra aplasta la tijera. (Gana la piedra).\n La tijera corta el papel. (Gana la tijera).\n El papel envuelve la piedra. (Gana el papel). \n En caso de empate (que dos jugadores elijan el mismo elemento), se juega otra vez.");
                    }
                    case 1: {
                        List<String> opciones = Arrays.asList("Piedra","Papel","Tijera");
                        String miJugada = (String)JOptionPane.showInputDialog(null, "¡Juguemos! \n Por pafvor, selecciona una opción ", "POO - Piedra, Papel o Tijera", JOptionPane.QUESTION_MESSAGE, null, opciones.toArray(), "Piedra");
                        int jugadaMaquina = (int) Math.round(Math.random() * 2);
                        mensaje("Tu selecconaste:  " +Juego.getResultMiJugada(miJugada)+"\n"+"La computadora: "+Juego.geteleccionMaquina(jugadaMaquina)+"\n"+Juego.getResultado(resultadoJugada,jugadaMaquina));
                    }

                    case 2: {
                    }

                    default:
                        mensaje("No selecciono ninguna opcion!! Ya valimos");
                        Ejecutar = false;

                }
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: No ingreso nada!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }
}
