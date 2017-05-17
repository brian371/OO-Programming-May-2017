package com.protechtraining.classicmodels.patterns.flyweight;

import java.util.HashMap;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Workbook;

public class CellStyleFactory {
	private Workbook workbook;
	private static final HashMap<StyleType, CellStyle> styleCache = new HashMap<StyleType, CellStyle>();

	public CellStyleFactory(Workbook workbook) {
		super();
		this.workbook = workbook;
	}

	public CellStyle getStyle(StyleType styleType) {
		CellStyle style = styleCache.get(styleType);

		if (style == null) {
			switch (styleType) {
			case HEADER_STYLE:
				System.out.println("Cell style created..");
				style = workbook.createCellStyle();
				Font font = workbook.createFont();
				font.setBoldweight(Font.BOLDWEIGHT_BOLD);
				style.setFont(font);
				style.setAlignment(CellStyle.ALIGN_CENTER);

				styleCache.put(StyleType.HEADER_STYLE, style);
				break;
			default:
				throw new RuntimeException("Style " + styleType + " not supported in CellStyleFactory.");
			}
		}

		return style;
	}

	public static enum StyleType {
		HEADER_STYLE
	}
}
