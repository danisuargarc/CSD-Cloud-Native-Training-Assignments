package com.mvc.assignment;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileExporter {
	public static ByteArrayInputStream employeeListToExcelFile(ArrayList<Employee> employees) {
		try (Workbook workbook = new XSSFWorkbook()) {
			Sheet sheet = workbook.createSheet("Employees");

			Row row = sheet.createRow(0);

			Cell cell = row.createCell(0);
			cell.setCellValue("Employee Id");

			cell = row.createCell(1);
			cell.setCellValue("Employee Name");

			cell = row.createCell(2);
			cell.setCellValue("Employee Department");

			cell = row.createCell(3);
			cell.setCellValue("Employee Designation");

			cell = row.createCell(4);
			cell.setCellValue("Employee Salary");

			for (int i = 0; i < employees.size(); i++) {
				Row dataRow = sheet.createRow(i + 1);
				dataRow.createCell(0).setCellValue(employees.get(i).getId());
				dataRow.createCell(1).setCellValue(employees.get(i).getName());
				dataRow.createCell(2).setCellValue(employees.get(i).getDepartment());
				dataRow.createCell(3).setCellValue(employees.get(i).getDesignation());
				dataRow.createCell(4).setCellValue(employees.get(i).getSalary());
			}

			sheet.autoSizeColumn(0); 
			sheet.autoSizeColumn(1); 
			sheet.autoSizeColumn(2);
			sheet.autoSizeColumn(3); 
			sheet.autoSizeColumn(4);

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			workbook.write(outputStream);
			return new ByteArrayInputStream(outputStream.toByteArray());
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}
}