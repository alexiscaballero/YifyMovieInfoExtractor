package yifymovieinfoextractor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jxl.CellView;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel {

    private WritableCellFormat timesBoldUnderline;
    private WritableCellFormat times;
    private String inputFile;
    private int ultimaFila = 1;
    private WritableWorkbook workbook = null;
    private WritableSheet sheet;

    public void setOutputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public void open() throws IOException, WriteException {
        File file = new File(inputFile);
        WorkbookSettings wbSettings = new WorkbookSettings();
        wbSettings.setLocale(new Locale("en", "EN"));
        workbook = Workbook.createWorkbook(file, wbSettings);
        workbook.createSheet("Datos Peliculas Yify", 0);
        // Lets create a times font
        WritableFont times10pt = new WritableFont(WritableFont.TIMES, 10);
        // Define the cell format
        times = new WritableCellFormat(times10pt);
        // Lets automatically wrap the cells
        times.setWrap(true);
        // create create a bold font with unterlines
        WritableFont times10ptBoldUnderline = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false,
                UnderlineStyle.SINGLE);
        timesBoldUnderline = new WritableCellFormat(times10ptBoldUnderline);
        // Lets automatically wrap the cells
        timesBoldUnderline.setWrap(true);
        CellView cv = new CellView();
        cv.setFormat(times);
        cv.setFormat(timesBoldUnderline);
        cv.setAutosize(true);
        sheet = workbook.getSheet(0);
    }

    public WritableSheet getSheet() {
        return this.sheet;
    }

    public void cabeceraColumnas(List<String> listaTexto) throws WriteException {
        int i = 0;
        for (String string : listaTexto) {
            addLabel(i, 0, string);
            i++;
        }
    }

    public void avanzarFila() {
        ultimaFila++;
    }

    public void agregarDatoFila(Object dato, int columna) throws WriteException {
        if (dato.getClass() == String.class) {
            addLabel(columna, ultimaFila, dato.toString());
        } else {
            if (dato.getClass() == Integer.class) {
                addNumber(columna, ultimaFila, ((Integer) dato).doubleValue());
            } else {
                addNumber(columna, ultimaFila, (double) dato);
            }
        }
    }

    private void addCaption(int column, int row, String s) throws RowsExceededException, WriteException {
        Label label;
        label = new Label(column, row, s, timesBoldUnderline);
        sheet.addCell(label);
    }

    private void addNumber(int column, int row, double numero) throws WriteException, RowsExceededException {
        Number number;
        number = new Number(column, row, numero, times);
        sheet.addCell(number);
    }

    private void addLabel(int column, int row, String s) throws WriteException, RowsExceededException {
        Label label;
        label = new Label(column, row, s, times);
        sheet.addCell(label);
    }

    public static void main(String[] args) throws WriteException, IOException {
        Excel test = new Excel();
        test.setOutputFile("datos.xls");
        test.open();
        List listaCabeceras = new ArrayList();
        listaCabeceras.add("Columna1");
        listaCabeceras.add("Columna2");
        listaCabeceras.add("Columna3");
        listaCabeceras.add("Columna4");
        test.cabeceraColumnas(listaCabeceras);
        test.agregarDatoFila(1992, 0);
        test.agregarDatoFila(1992, 1);
        test.agregarDatoFila(1992, 2);
        test.agregarDatoFila(1992, 3);
        test.avanzarFila();
        test.agregarDatoFila(19.92, 0);
        test.agregarDatoFila(19.92, 1);
        test.agregarDatoFila(19.92, 2);
        test.agregarDatoFila(19.92, 3);
        test.guardarDatos();
    }

    public void guardarDatos() throws IOException, WriteException {
        workbook.write();
        workbook.close();
    }
}
