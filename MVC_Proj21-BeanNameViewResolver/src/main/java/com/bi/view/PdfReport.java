package com.bi.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.bi.dto.StudentDTO;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class PdfReport extends AbstractPdfView {

	@Override
	public void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter writer, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		//collect data from map object
		ArrayList<StudentDTO> list=(ArrayList<StudentDTO>) map.get("report");
		//crate paragraph
		Paragraph p=new Paragraph("Record");
		//add paragraph to document
		doc.add(p);
		//create table
		Table table=new Table(3);
		for(StudentDTO dto : list) {
			table.addCell(String.valueOf(dto.getSno()));
			table.addCell(String.valueOf(dto.getSname()));
			table.addCell(String.valueOf(dto.getCourse()));
		}
		doc.add(table);
		
	}
}
