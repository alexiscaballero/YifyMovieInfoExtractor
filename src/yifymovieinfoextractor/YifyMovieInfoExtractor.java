/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yifymovieinfoextractor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.write.WriteException;
import ytorrents.YifyTorrents;
import ytorrents.unmarshall.MovieDTO;

/**
 *
 * @author User
 */
public class YifyMovieInfoExtractor {

    /**
     * @param args the command line arguments
     */
    private static final List<String> listaGeneros = new ArrayList();

    public static void cargarGeneros() {
        listaGeneros.add("Action");
        listaGeneros.add("Adventure");
        listaGeneros.add("Animation");
        listaGeneros.add("Biography");
        listaGeneros.add("Comedy");
        listaGeneros.add("Crime");
        listaGeneros.add("Documentary");
        listaGeneros.add("Drama");
        listaGeneros.add("Family");
        listaGeneros.add("Fantasy");
        listaGeneros.add("Film-Noir");
        listaGeneros.add("Game-Show");
        listaGeneros.add("History");
        listaGeneros.add("Horror");
        listaGeneros.add("Music");
        listaGeneros.add("Musical");
        listaGeneros.add("Mystery");
        listaGeneros.add("News");
        listaGeneros.add("Reality-TV");
        listaGeneros.add("Romance");
        listaGeneros.add("Sci-Fi");
        listaGeneros.add("Sport");
        listaGeneros.add("Talk-Show");
        listaGeneros.add("Thriller");
        listaGeneros.add("War");
        listaGeneros.add("Western");
    }

    public static void main(String[] args) {
        try {
            cargarGeneros();
            Excel test = new Excel();
            test.setOutputFile("datosYify.xls");
            test.open();
            List listaCabeceras = new ArrayList();
            listaCabeceras.add("ID");
            listaCabeceras.add("TITULO");
            listaCabeceras.add("AÑO");
            listaCabeceras.add("IDIOMA");
            listaCabeceras.add("PUNTAJE");
            listaCabeceras.add("DURACION");
            listaCabeceras.add("DESCARGAS");
            listaCabeceras.add("LIKES");
            listaCabeceras.addAll(listaGeneros);
            listaCabeceras.add("OSCARS");
            listaCabeceras.add("NOMINACIONES");
            listaCabeceras.add("OTROS PREMIOS");
            test.cabeceraColumnas(listaCabeceras);

            for (int i = 1; i < 5550; i++) {
                try {
                    MovieDTO pelicula = YifyTorrents.getInstancia().getMovie(i + "");
                    System.out.print(pelicula.getId());
                    test.agregarDatoFila(pelicula.getId(), 0);
                    System.out.print(" ");
                    System.out.print(pelicula.getTittle());
                    test.agregarDatoFila(pelicula.getTittle(), 1);
                    System.out.print(" ");
                    System.out.print(pelicula.getYear());
                    test.agregarDatoFila(pelicula.getYear(), 2);
                    System.out.print(" ");
                    System.out.print(pelicula.getLanguage());
                    test.agregarDatoFila(pelicula.getLanguage(), 3);
                    System.out.print(" ");
                    System.out.print(pelicula.getRating());
                    test.agregarDatoFila(pelicula.getRating(), 4);
                    System.out.print(" ");
                    System.out.print(pelicula.getRuntime());
                    test.agregarDatoFila(pelicula.getRuntime(), 5);
                    System.out.print(" ");
                    System.out.print(pelicula.getDownloadCount());
                    test.agregarDatoFila(pelicula.getDownloadCount(), 6);
                    System.out.print(" ");
                    System.out.print(pelicula.getLikeCount());
                    test.agregarDatoFila(pelicula.getLikeCount(), 7);
                    System.out.print(" ");
                    System.out.print(pelicula.getGenres());
                    agregarCeldasGenero(test,pelicula.getGenres());
                    System.out.print(" ");
                    System.out.printf(pelicula.getOscars()+"");
                    test.agregarDatoFila(pelicula.getOscars(), 34);
                    System.out.print(" ");
                    System.out.printf(pelicula.getNominaciones()+"");
                    test.agregarDatoFila(pelicula.getNominaciones(), 35);
                    System.out.print(" ");
                    System.out.printf(pelicula.getOtrosPremios()+"");
                    test.agregarDatoFila(pelicula.getOtrosPremios(), 36);
                    System.out.println();
                    test.avanzarFila();
                } catch (Exception ex) {
                    Logger.getLogger(YifyMovieInfoExtractor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            test.guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(YifyMovieInfoExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (WriteException ex) {
            Logger.getLogger(YifyMovieInfoExtractor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void agregarCeldasGenero(Excel test, List<String> listaGeneros) throws WriteException {
        
            if (listaGeneros.contains("Action")) {
                test.agregarDatoFila(1, 8);
            } else {
                test.agregarDatoFila(0, 8);
            }
            if (listaGeneros.contains("Adventure")) {
                test.agregarDatoFila(1, 9);
            } else {
                test.agregarDatoFila(0, 9);
            }
            if (listaGeneros.contains("Animation")) {
                test.agregarDatoFila(1, 10);
            } else {
                test.agregarDatoFila(0, 10);
            }
            if (listaGeneros.contains("Biography")) {
                test.agregarDatoFila(1, 11);
            } else {
                test.agregarDatoFila(0, 11);
            }
            if (listaGeneros.contains("Comedy")) {
                test.agregarDatoFila(1, 12);
            } else {
                test.agregarDatoFila(0, 12);
            }
            if (listaGeneros.contains("Crime")) {
                test.agregarDatoFila(1, 13);
            } else {
                test.agregarDatoFila(0, 13);
            }
            if (listaGeneros.contains("Documentary")) {
                test.agregarDatoFila(1, 14);
            } else {
                test.agregarDatoFila(0, 14);
            }
            if (listaGeneros.contains("Drama")) {
                test.agregarDatoFila(1, 15);
            } else {
                test.agregarDatoFila(0, 15);
            }
            if (listaGeneros.contains("Family")) {
                test.agregarDatoFila(1, 16);
            } else {
                test.agregarDatoFila(0, 16);
            }
            if (listaGeneros.contains("Fantasy")) {
                test.agregarDatoFila(1, 17);
            } else {
                test.agregarDatoFila(0, 17);
            }
            if (listaGeneros.contains("Film-Noir")) {
                test.agregarDatoFila(1, 18);
            } else {
                test.agregarDatoFila(0, 18);
            }
            if (listaGeneros.contains("Game-Show")) {
                test.agregarDatoFila(1, 19);
            } else {
                test.agregarDatoFila(0, 19);
            }
            if (listaGeneros.contains("History")) {
                test.agregarDatoFila(1, 20);
            } else {
                test.agregarDatoFila(0, 20);
            }
            if (listaGeneros.contains("Horror")) {
                test.agregarDatoFila(1, 21);
            } else {
                test.agregarDatoFila(0, 21);
            }
            if (listaGeneros.contains("Music")) {
                test.agregarDatoFila(1, 22);
            } else {
                test.agregarDatoFila(0, 22);
            }
            if (listaGeneros.contains("Musical")) {
                test.agregarDatoFila(1, 23);
            } else {
                test.agregarDatoFila(0, 23);
            }
            if (listaGeneros.contains("Mystery")) {
                test.agregarDatoFila(1, 24);
            } else {
                test.agregarDatoFila(0, 24);
            }
            if (listaGeneros.contains("News")) {
                test.agregarDatoFila(1, 25);
            } else {
                test.agregarDatoFila(0, 25);
            }
            if (listaGeneros.contains("Reality-TV")) {
                test.agregarDatoFila(1, 26);
            } else {
                test.agregarDatoFila(0, 26);
            }
            if (listaGeneros.contains("Romance")) {
                test.agregarDatoFila(1, 27);
            } else {
                test.agregarDatoFila(0, 27);
            }
            if (listaGeneros.contains("Sci-Fi")) {
                test.agregarDatoFila(1, 28);
            } else {
                test.agregarDatoFila(0, 28);
            }
            if (listaGeneros.contains("Sport")) {
                test.agregarDatoFila(1, 29);
            } else {
                test.agregarDatoFila(0, 29);
            }
            if (listaGeneros.contains("Talk-Show")) {
                test.agregarDatoFila(1, 30);
            } else {
                test.agregarDatoFila(0, 30);
            }
            if (listaGeneros.contains("Thriller")) {
                test.agregarDatoFila(1, 31);
            } else {
                test.agregarDatoFila(0, 31);
            }
            if (listaGeneros.contains("War")) {
                test.agregarDatoFila(1, 32);
            } else {
                test.agregarDatoFila(0, 32);
            }
            if (listaGeneros.contains("Western")) {
                test.agregarDatoFila(1, 33);
            } else {
                test.agregarDatoFila(0, 33);
            }
    }
}
