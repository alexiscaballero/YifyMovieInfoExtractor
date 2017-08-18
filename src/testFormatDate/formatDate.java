/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testFormatDate;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 *
 * @author alexis
 */
public class formatDate {

    public static void main(String[] args) {
        String date = "01 May 1992";
        date = date.replace("Jan", "05");
        date = date.replace("Feb", "05");
        date = date.replace("Mar", "05");
        date = date.replace("Apr", "05");
        date = date.replace("May", "05");
        date = date.replace("Jun", "05");
        date = date.replace("Jul", "05");
        date = date.replace("Aug", "05");
        date = date.replace("Sep", "05");
        date = date.replace("Oct", "05");
        date = date.replace("Nov", "05");
        date = date.replace("Dec", "05");
        org.joda.time.format.DateTimeFormatter formatter = DateTimeFormat.forPattern("dd mm yyyy");
        DateTime dt = formatter.parseDateTime(date);
        System.out.println(dt);
    }
}
