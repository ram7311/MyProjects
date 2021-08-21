package com.online.hql;


import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.luv2code.hibernate.demo.entity.Shopping;
 
/**
 * A simple Java program that exports data from database to Excel file.
 * @author Nam Ha Minh
 * (C) Copyright codejava.net
 */
public class Createexcel {
 
         
    public void export(List<Shopping> result) {
 
    	
        String excelFilePath = "Reviews-export.xlsx";
 
        try {
            
 
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Reviews");
 
            writeHeaderLine(sheet);
 
            writeDataLines(result, workbook, sheet);
 
            FileOutputStream outputStream = new FileOutputStream(excelFilePath);
            workbook.write(outputStream);
            workbook.close();
 
 
        } catch (SQLException e) {
            System.out.println("Datababse error:");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File IO error:");
            e.printStackTrace();
        }
    }
 
    private void writeHeaderLine(XSSFSheet sheet) {
 
        Row headerRow = sheet.createRow(0);
 
        Cell headerCell = headerRow.createCell(0);
        headerCell.setCellValue("ID");
 
        headerCell = headerRow.createCell(1);
        headerCell.setCellValue("PRODUCT");
 
        headerCell = headerRow.createCell(2);
        headerCell.setCellValue("PRICE");
 
    }
 
    private void writeDataLines(List<Shopping> result, XSSFWorkbook workbook,
            XSSFSheet sheet) throws SQLException {
        int rowCount = 1;
 
       for(Shopping shp:result) {
            int id = shp.getId();
            String product = shp.getProduct();
            String price = shp.getPrice();
 
            Row row = sheet.createRow(rowCount++);
 
            int columnCount = 0;
            Cell cell = row.createCell(columnCount++);
            cell.setCellValue(id);
 
            cell = row.createCell(columnCount++);
            cell.setCellValue(product);
 
            cell = row.createCell(columnCount);
            cell.setCellValue(price);
 
        }
    }
 
}