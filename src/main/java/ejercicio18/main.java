package ejercicio18;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        /** lista series */
        Serie serie1 = new Serie(" Breaking Bad ", 5, " Drama ", " Vince Gilligan ");
        Serie serie2 = new Serie(" Black Mirror ", 5, " Ciencia ficción ", " Charlie Brooker ");
        Serie serie3 = new Serie(" BoJack Horseman ", 6, " Comedia ", " Bob-Waksberg ");
        Serie serie4 = new Serie(" One Piece ", 20, " Aventura/anime ", " Eiichiro Oda ");
        Serie serie5 = new Serie(" You ", 3, " Suspenso ", " Greg Berlanti ");

        ArrayList<Serie> ArraySeries = new ArrayList<>();
        ArraySeries.add(serie1);
        ArraySeries.add(serie2);
        ArraySeries.add(serie3);
        ArraySeries.add(serie4);
        ArraySeries.add(serie5);

        ArraySeries.get(0).Entregar();
        ArraySeries.get(3).Entregar();


        /** lista videojuegos */

        Videojuego videojuego1 = new Videojuego();
        Videojuego videojuego2 = new Videojuego(" Assassin's Creed Revelations ", 12);
        Videojuego videojuego3 = new Videojuego(" Fallout New Vegas ", 147, " PostApocaliptico/ Mundo abierto ", " Bethesda ");
        Videojuego videojuego4 = new Videojuego(" Dark Souls 3", 96, " Soulslike ", " FromSoftware");
        Videojuego videojuego5 = new Videojuego(" GTA V ", 79, " Acción ", " RockstarGames ");

        ArrayList<Videojuego> ArrayVideojuego = new ArrayList<>();
        ArrayVideojuego.add(videojuego1);
        ArrayVideojuego.add(videojuego2);
        ArrayVideojuego.add(videojuego3);
        ArrayVideojuego.add(videojuego4);
        ArrayVideojuego.add(videojuego5);

        ArrayVideojuego.get(2).Entregar();
        ArrayVideojuego.get(4).Entregar();

        int seriesEntregadas = 0;
        int serieMasTemporadas = 0;
        Serie serieMasTemporadasObj = new Serie();
        /** determinar serie mas larga */
        for (Serie serie : ArraySeries) {
            if (serie.getnumeroTemporadas() > serieMasTemporadas) {
                serieMasTemporadas = serie.getnumeroTemporadas();
                serieMasTemporadasObj = serie;
            }
            if (serie.isEntregado()) {
                seriesEntregadas += 1;
                serie.Devolver();
            }
        }

        Videojuego videojuegoMasHoras = new Videojuego();
        int masHorasVideojuego = 0;
        int videojuegosEntregados = 0;
        for (Videojuego videojuego : ArrayVideojuego) {
            if (videojuego.getHorasEstimadas() > masHorasVideojuego) {
                masHorasVideojuego = videojuego.getHorasEstimadas();
                videojuegoMasHoras = videojuego;
            }
            if (videojuego.isEntregado()) {
                videojuegosEntregados += 1;
                videojuego.Devolver();
            }
        }
        /** salida */
        System.out.println("Series entregadas: " + seriesEntregadas);
        System.out.println("Videojuegos entregados: " + videojuegosEntregados);
        System.out.println("Juego con más horas");
        System.out.println(videojuegoMasHoras.toString());
        System.out.println("Serie con mas temporadas");
        System.out.println(serieMasTemporadasObj.toString());

    }
}
