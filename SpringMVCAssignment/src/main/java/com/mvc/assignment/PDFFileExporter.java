package com.mvc.assignment;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class PDFFileExporter {
	public static ByteArrayInputStream employeeListToPDFFile(ArrayList<Employee> employees) {
		Document document = new Document();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		try {
			PdfPTable table = new PdfPTable(5);
			table.setWidthPercentage(100);

			PdfPCell cell = new PdfPCell(new Phrase("Employee Id"));
			table.addCell(cell);

			cell = new PdfPCell(new Phrase("Employee Name"));
			table.addCell(cell);
			
			cell = new PdfPCell(new Phrase("Employee Department"));
			table.addCell(cell);
			
			cell = new PdfPCell(new Phrase("Employee Designation"));
			table.addCell(cell);
			
			cell = new PdfPCell(new Phrase("Employee Salary"));
			table.addCell(cell);

			for (Employee emp : employees) {
				cell = new PdfPCell(new Phrase(String.valueOf(emp.getId())));
				table.addCell(cell);

				cell = new PdfPCell(new Phrase(emp.getName()));
				table.addCell(cell);

				cell = new PdfPCell(new Phrase(emp.getDepartment()));
				table.addCell(cell);

				cell = new PdfPCell(new Phrase(emp.getDesignation()));
				table.addCell(cell);

				cell = new PdfPCell(new Phrase(String.valueOf(emp.getSalary())));
				table.addCell(cell);
			}

			PdfWriter.getInstance(document, outputStream);
			document.open();
			document.add(table);

			document.close();
			return new ByteArrayInputStream(outputStream.toByteArray());
		} catch (DocumentException ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
