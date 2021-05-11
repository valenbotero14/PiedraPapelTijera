package PiedraPapelTijera.app;

import PiedraPapelTijera.dominio.Juego;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;


public class AppJuego {

    public static void main(String[] args) {
        boolean Ejecutar = true;
        while (Ejecutar) {
            List<String> opcionesJuego = Arrays.asList("Ver instrucciones", "Jugar", "Ver resultados");
            int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Bienvenid@ \n ¿Qué quieres hacer?", "POO - Piedra, Papel o Tijera", 0, JOptionPane.QUESTION_MESSAGE, null, opcionesJuego.toArray(), null);
            switch (opcionSeleccionada) {
                case 0: {
                    JOptionPane.showMessageDialog(null, "El objetivo es vencer al oponente seleccionando el arma que gana, según las siguientes reglas:\n " +
                            "La piedra aplasta la tijera. (Gana la piedra).\n La tijera corta el papel. (Gana la tijera).\n El papel envuelve la piedra. (Gana el papel). \n En caso de empate (que dos jugadores elijan el mismo elemento), se juega otra vez.");
                    break;
                }
                case 1: {
                    List<String> opciones = Arrays.asList("Piedra", "Papel", "Tijera");
                    String miJugada = (String) JOptionPane.showInputDialog(null, "¡Juguemos! \n Por pafvor, selecciona una opción ", "POO - Piedra, Papel o Tijera", JOptionPane.QUESTION_MESSAGE, null, opciones.toArray(), "Piedra");
                    int jugadaMaquina = (int) Math.round(Math.random() * 2);
                    int jugadaUsuario = Juego.getResultMiJugada(miJugada);
                    mensaje("Tu selecconaste:  " + miJugada + "\n" + "La computadora: " + Juego.geteleccionMaquina(jugadaMaquina) + "\n\n" + Juego.getResultado(jugadaUsuario, jugadaMaquina));
                    break;
                }
                case 2: {
                    mensaje("Tu: " + Juego.getGanadasUsuaio() + " Partidas Ganadas." + "\n" + "La computadora: " + Juego.getGanadasMaquina() + " Partidas Ganadas." + "\n" + "Empates: " + Juego.getEmpate() + " Partidas.");
                    break;

                }

                default:
                    int verificador1 = JOptionPane.showConfirmDialog(null, "¿Desea salir?");
                    if (verificador1 == 1 || verificador1 == 2) {
                        Ejecutar = true;
                    } else if (verificador1 == 0) {
                        Ejecutar = false;
                    }

            }
        }
    }




    private static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }
}