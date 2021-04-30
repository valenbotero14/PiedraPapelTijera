package PiedraPapelTijera.dominio;

public class Juego {

    private static String eleccionMaquina;
    private static String Resultado;
    private static int ResultMiJugada;
    private static int resultadoJugada;
    private static int ganadasUsuaio;
    private static int ganadasMaquina;
    private static int empate;

    public static int getGanadasUsuaio() {
        return ganadasUsuaio;
    }

    public static int getGanadasMaquina() {
        return ganadasMaquina;
    }

    public static int getEmpate() {
        return empate;
    }

    public static int getResultMiJugada(String miJugada) {
        if(miJugada.equals("Piedra")){
            resultadoJugada = 0;
        }else if (miJugada.equals("Papel")){
            resultadoJugada = 1;
        }else if (miJugada.equals("Tijera")){
            resultadoJugada = 2;
        }
        return resultadoJugada;

    }

    public static String geteleccionMaquina(int jugadaMaquina){
        String resultadoMaquina="";
        if(jugadaMaquina == 0){
            resultadoMaquina =" Piedra";
        }else if (jugadaMaquina == 1){
            resultadoMaquina =" Papel";
        }else if (jugadaMaquina == 2 ){
            resultadoMaquina = "Tijera";
        }
        return resultadoMaquina;

    }


    public static String getResultado(int resultadoJugada, int jugadaMaquina) {
        String resultado = "";
        if (resultadoJugada == jugadaMaquina){
            resultado = "¡Empate!";
            empate++;
        } else {
            switch (resultadoJugada) {
                case 0:
                    if (jugadaMaquina == 1){
                        resultado = "¡Perdiste! ";
                        ganadasMaquina++;
                    } else {
                        resultado = "¡Ganaste! ";
                        ganadasUsuaio++;
                    }
                    break;
                case 1:
                    if ( jugadaMaquina== 2) {
                        resultado = "¡Perdiste! ";
                        ganadasMaquina++;
                    } else {
                        resultado = "¡Ganaste! ";
                        ganadasUsuaio++;
                    }
                    break;
                case 2:
                    if (jugadaMaquina == 0){
                        resultado = "¡Perdiste! ";
                        ganadasMaquina++;
                    } else {
                        resultado = "¡Ganaste! ";
                        ganadasMaquina++;
                    }
                    break;
                default:
                    return "Error";
            }

        }

        return resultado;
    }
}


