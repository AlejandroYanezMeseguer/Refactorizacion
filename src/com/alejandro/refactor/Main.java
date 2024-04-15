package com.alejandro.refactor;

public class Main {
    /**
     * @param puntuacioJugador1
     * @param puntuacionJugador2
     * @return retorna la variable puntuacion que recoje el jugador ganador
     */
    public static String getScore(int puntuacioJugador1, int puntuacionJugador2) {
        String puntuacion = "";
        final int DIFERENCIA_MAXIMA=4;

        if (puntuacioJugador1 == puntuacionJugador2) {
            switch (puntuacioJugador1)
            {
                case 0:
                    puntuacion = "Love-All";
                    break;
                case 1:
                    puntuacion = "Fifteen-All";
                    break;
                case 2:
                    puntuacion = "Thirty-All";
                    break;
                case 3:
                    puntuacion = "Forty-All";
                    break;
                default:
                    puntuacion = "Deuce";
                    break;

            }
        }
        else if (puntuacioJugador1 >=DIFERENCIA_MAXIMA || puntuacionJugador2 >=DIFERENCIA_MAXIMA)
        {
            int ventajaPuntuacion = puntuacioJugador1-puntuacionJugador2;
            if (ventajaPuntuacion==1) puntuacion ="Advantage player1";
            else if (ventajaPuntuacion ==-1) puntuacion ="Advantage player2";
            else if (ventajaPuntuacion>=2) puntuacion = "Win for player1";
            else puntuacion ="Win for player2";
        }
        else
        {
            int auxPuntuacionActual=0;
            for (int i=1; i<3; i++)
            {
                if (i==1) auxPuntuacionActual = puntuacioJugador1;
                else { puntuacion+="-"; auxPuntuacionActual = puntuacionJugador2;}
                switch(auxPuntuacionActual)
                {
                    case 0:
                        puntuacion+="Love";
                        break;
                    case 1:
                        puntuacion+="Fifteen";
                        break;
                    case 2:
                        puntuacion+="Thirty";
                        break;
                    case 3:
                        puntuacion+="Forty";
                        break;
                }
            }

        }
    return puntuacion;
    }
}