package com.protechtraining.classicmodels.patterns.facade;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.protechtraining.classicmodels.config.CommandLineConfig;
import com.protechtraining.classicmodels.config.DatabaseConfig;
import com.protechtraining.classicmodels.dao.ProductDao;
import com.protechtraining.classicmodels.model.Product;

public class FacadeExampleMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				CommandLineConfig.class, DatabaseConfig.class);

		ProductDao productDao = ctx.getBean("productDaoImpl", ProductDao.class);
		List<Product> products = productDao.findAll(null);

		ExcelWorkbookFacade excelWorkbook = new POIExcelWorkbookFacade();
		excelWorkbook.createProductDetailReport("current products", products);
		try {
			excelWorkbook.saveToFile("products.xlsx");
			System.out.println("Workbook saved.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
