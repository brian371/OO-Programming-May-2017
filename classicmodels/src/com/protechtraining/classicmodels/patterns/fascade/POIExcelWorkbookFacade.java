package com.protechtraining.classicmodels.patterns.fascade;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.protechtraining.classicmodels.model.Product;
import com.protechtraining.classicmodels.patterns.flyweight.CellStyleFactory;
import com.protechtraining.classicmodels.patterns.flyweight.CellStyleFactory.StyleType;

// https://poi.apache.org/spreadsheet/quick-guide.html#NewWorkbook

public class POIExcelWorkbookFacade implements ExcelWorkbookFacade {
	private Workbook workbook = new XSSFWorkbook();
	private CellStyleFactory cellStyleFactory;

	public POIExcelWorkbookFacade() {
		cellStyleFactory = new CellStyleFactory(workbook);
	}

	
	private void createHeaderCell(Row row, int column, String headerText) {
		
		Cell cell = row.createCell(column);
		cell.setCellStyle(cellStyleFactory.getStyle(StyleType.HEADER_STYLE));
		cell.setCellValue(headerText);
	}
	
	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.patterns.adaptor.ExcelWorkbookAdapter#createProductDetailReport(java.lang.String, java.util.List)
	 */
	@Override
	public void createProductDetailReport(String sheetName,
			List<Product> products) {
		String safeSheetName = WorkbookUtil.createSafeSheetName(sheetName);
		Sheet sheet = workbook.createSheet(safeSheetName);

		// create header row
		

		int rowCount = 0, colCount = 0;;
		Row header = sheet.createRow(rowCount++);
		createHeaderCell(header, colCount++, "Product Code");
		createHeaderCell(header, colCount++, "Description");
		createHeaderCell(header, colCount++, "Product Line");
		createHeaderCell(header, colCount++, "Name");
		createHeaderCell(header, colCount++, "Scale");
		createHeaderCell(header, colCount++, "Vendor");
		createHeaderCell(header, colCount++, "Selling Price");
		createHeaderCell(header, colCount++, "MSRp");

		// dump out List of products
		for (Product p : products) {
			Row row = sheet.createRow(rowCount++);
			colCount = 0;
			row.createCell(colCount++).setCellValue(p.getCode());
			row.createCell(colCount++).setCellValue(p.getDescription());
			row.createCell(colCount++).setCellValue(p.getLine().toString());
			row.createCell(colCount++).setCellValue(p.getName());
			row.createCell(colCount++).setCellValue(p.getScale());
			row.createCell(colCount++).setCellValue(p.getVendor());
			row.createCell(colCount++).setCellValue(p.getSalePrice());
			row.createCell(colCount++).setCellValue(p.getMSRP());
		}
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.patterns.adaptor.ExcelWorkbookAdapter#saveToFile(java.lang.String)
	 */
	@Override
	public void saveToFile(String fileName) throws IOException {
		FileOutputStream fileOut = new FileOutputStream(fileName);
		workbook.write(fileOut);
		fileOut.close();
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.patterns.adaptor.ExcelWorkbookAdapter#getWorkbook()
	 */
	@Override
	public Workbook getWorkbook() {
		return workbook;
	}
}
