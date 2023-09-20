package com.spanish.words.translate.demo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class WordsMapping {
    private LinkedList<String> objects = new LinkedList<>();


    public HashMap<String, String> getWords() throws IOException {
        ExcelProvider excelProvider = new ExcelProvider();
        XSSFSheet sheet = excelProvider.getWorkbook().getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext()) {

            Row row = rowIterator.next();

            //For each row, iterate through all the columns
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {

                Cell cell = cellIterator.next();

                //Check the cell type and format accordingly
                switch (cell.getCellType()) {
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "t");
                        break;
                    case STRING:
                        System.out.println(cell.getStringCellValue());
                        objects.add(cell.getStringCellValue());
//                            spanishPolishMap.put(split[0], split[1]);
                        break;
                }
            }
            System.out.println("");
        }
        excelProvider.getFile().close();
        HashMap<String, String> objectObjectHashMap = new HashMap<>();
        int siema = 1;
        int siema2 = 0;
        for (int i = 0; i < objects.size() / 2; i++) {
            System.out.println(objects.get(0));
            System.out.println(objects.get(1));
            objectObjectHashMap.put(objects.get(siema2), objects.get(siema));
            siema++;
            siema++;
            siema2++;
            siema2++;
        }
        System.out.println();
        return objectObjectHashMap;
    }
}


