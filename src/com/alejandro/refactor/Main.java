package com.alejandro.refactor;

public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int puntuacioJugador1, int puntuacionJugador2) {
        String puntuacion = "";
        int puntuacionActual=0;

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
        else if (puntuacioJugador1 >=4 || puntuacionJugador2 >=4)
        {
            int ventajaPuntuacion = puntuacioJugador1-puntuacionJugador2;
            if (ventajaPuntuacion==1) puntuacion ="Advantage player1";
            else if (ventajaPuntuacion ==-1) puntuacion ="Advantage player2";
            else if (ventajaPuntuacion>=2) puntuacion = "Win for player1";
            else puntuacion ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) puntuacionActual = puntuacioJugador1;
                else { puntuacion+="-"; puntuacionActual = puntuacionJugador2;}
                switch(puntuacionActual)
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