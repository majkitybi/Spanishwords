package com.spanish.words.translate.demo;

import lombok.Getter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelProvider {
    @Getter
    private FileInputStream file;

    //Create Workbook instance holding reference to .xlsx file
   @Getter
    private XSSFWorkbook workbook;

    public ExcelProvider() throws IOException {
        file = new FileInputStream("src/main/resources/hiszpanski (1).xlsx");
        workbook  = new XSSFWorkbook(file);
    }


}

