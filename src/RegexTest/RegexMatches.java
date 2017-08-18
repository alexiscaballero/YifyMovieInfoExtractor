package RegexTest;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    public static List<Integer> calcularCantidadPremios(String line) {

        List<Integer> listaPremios = new ArrayList();
        //Solo Otros Premios.
        String pattern = "([1-9]\\d*)( win[s]*).";
        //Solo nominaciones.
        String pattern2 = "([1-9]+) nomination(s)*.";
        //Otros Premios y Nominaciones.
        String pattern3 = "([1-9]*) win(s)* & ([1-9]*) nomination(s)*.";
        //Oscars, Otros Premios y Nominaciones.
        String pattern4 = "Won ([1-9]+) Oscar. Another ([1-9]+) (win[s]*) & ([1-9]+) nomination[s]*.";
        //Nominaciones, Oscars, Otros Premios y Más Nominaciones
        String pattern5 = "(Nominated for )([1-9]+)( Oscar(s)*. Another )([1-9]+)( win(s)* & )([1-9]+) nomination(s)*.";

        //Chequeo que tenga solo premios.
        if (Pattern.compile(pattern).matcher(line).matches()) {
            listaPremios.add(0);
            listaPremios.add(0);
            listaPremios.add(getPremios(line).get(0));
        } else {
            //Chequeo que tenga solo nominaciones.
            if (Pattern.compile(pattern2).matcher(line).matches()) {
                listaPremios.add(0);
                listaPremios.add(getPremios(line).get(0));
                listaPremios.add(0);
            } else {
                //Chequeo que tenga premios y nominaciones.
                if (Pattern.compile(pattern3).matcher(line).matches()) {
                    listaPremios.add(0);
                    listaPremios.add(getPremios(line).get(0));
                    listaPremios.add(getPremios(line).get(1));
                } else {
                    //Chequeo que tenga oscars, otros premios y nominaciones.
                    if (Pattern.compile(pattern4).matcher(line).matches()) {
                        listaPremios.add(getPremios(line).get(0));
                        listaPremios.add(getPremios(line).get(2));
                        listaPremios.add(getPremios(line).get(1));
                    } else {
                        //Chequeo que tenga nominaciones, oscars, otros premios y más nominaciones.
                        if (Pattern.compile(pattern5).matcher(line).matches()) {
                            listaPremios.add(getPremios(line).get(1));
                            listaPremios.add(getPremios(line).get(0)+getPremios(line).get(3));
                            listaPremios.add(getPremios(line).get(2));
                        } else {
                            listaPremios.add(0);
                            listaPremios.add(0);
                            listaPremios.add(0);
                        }
                    }
                }
            }
        }
        return listaPremios;
    }

    private static List<Integer> getPremios(String texto) {
        List<Integer> numeros = new ArrayList();
        //String patternNumeros = "(?:\\d*\\.)?\\d+";
        String patternNumeros = "(\\d)*";
        Pattern r = Pattern.compile(patternNumeros);
        Matcher m = r.matcher(texto);
        if (m.find()) {
            for (int i = 0; i < m.groupCount(); i++) {
                numeros.add(Integer.parseInt(m.group(i)));
            }
        }
        return numeros;
    }
}
