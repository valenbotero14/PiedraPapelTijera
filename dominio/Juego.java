package PiedraPapelTijera.dominio;

public class Juego {

    private static String eleccionMaquina;
    private static String Resultado;
    private static String ResultMiJugada;
    private static int jugadaMaquina;
    private static int resultadoJugada;


    public static String getResultMiJugada(String miJugada) {
        if(miJugada.equals("Piedra")){
            resultadoJugada = 0;
        }else if (miJugada.equals("Papel")){
            resultadoJugada = 1;
        }else if (miJugada.equals("Tijera")){
            resultadoJugada = 2;
        }
        return miJugada;

    }

    public static String geteleccionMaquina(int jugadaMaquina){
        String resultadoMaquina="";
        if(jugadaMaquina == 0){
            resultadoMaquina =" Piedra.";
        }else if (jugadaMaquina == 1){
            resultadoMaquina =" Papel.";
        }else if (jugadaMaquina == 2 ){
            resultadoMaquina = "Tijera.";
        }
        return resultadoMaquina;

    }


    public static String getResultado(int resultadoJugada, int jugadaMaquina) {
        String resultado = "";
        if (resultadoJugada == jugadaMaquina){
            resultado = "Es un empate.";
        } else {
            switch (resultadoJugada) {
                case 0:
                    if (jugadaMaquina == 1){
                        resultado = "Perdiste. ";
                    } else {
                        resultado = "Ganaste. ";
                    }
                    break;
                case 1:
                    if ( jugadaMaquina== 2) {
                        resultado = "Perdiste. ";
                    } else {
                        resultado = "Ganaste. ";
                    }
                    break;
                case 2:
                    if (jugadaMaquina == 0){
                        resultado = "Perdiste. ";
                    } else {
                        resultado = "Ganaste. ";
                    }
                    break;
                default:
                    return "Se produjo un error";
            }

        }

        return resultado;
    }
}
