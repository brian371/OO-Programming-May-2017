package com.protechtraining.classicmodels.patterns.facade;

import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;

import com.protechtraining.classicmodels.model.Product;

public interface ExcelWorkbookFacade {

	public abstract void createProductDetailReport(String sheetName,
			List<Product> products);

	public abstract void saveToFile(String fileName) throws IOException;

	public abstract Workbook getWorkbook();

}