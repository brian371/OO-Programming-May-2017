package com.protechtraining.classicmodels.patterns.fascade;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.protechtraining.classicmodels.config.CommandLineConfig;
import com.protechtraining.classicmodels.config.DatabaseConfig;
import com.protechtraining.classicmodels.dao.ProductDao;
import com.protechtraining.classicmodels.model.Product;

public class FascadeMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				CommandLineConfig.class, DatabaseConfig.class);

		ProductDao productDao = ctx.getBean("productDaoImpl", ProductDao.class);
		List<Product> products = productDao.findAll(null);

		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println(cf.format(38.3));
		
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
