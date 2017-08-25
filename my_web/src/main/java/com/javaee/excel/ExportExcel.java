package com.javaee.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.record.cf.FontFormatting;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 导出Excel
 * @author limin
 * 2017年6月12日
 */
public class ExportExcel {
	
	public static Workbook export(Object obj,boolean flag){
		Workbook book = null;
		if(flag){
			// 2007 版excel
			book = new XSSFWorkbook();
		}else{
			book = new HSSFWorkbook();
		}
		//创建工作簿
		Sheet sheet = book.createSheet("测试NO.1");
		//获取FormulaEvaluator实例，操作公式。
		//静态方法evaluateAllFormulaCells(book)执行一个excel文件的所有公式
		//更新相应单元格公式evaluator.evaluateFormulaCell(cell);--执行cell的公式当它的依赖单元格变化了需执行此方法重新计算  
		FormulaEvaluator evaluator = null;
		// 创建HSSFPatriarch对象,HSSFPatriarch是所有注释的容器.
		Drawing patr = null;
		// 定义注释的大小和位置,详见文档
		Comment comment = null;
		if (book instanceof HSSFWorkbook) {
			evaluator = new HSSFFormulaEvaluator((HSSFWorkbook) book);
			patr = sheet.createDrawingPatriarch();
			comment = ((HSSFPatriarch) patr).createComment(new HSSFClientAnchor(0, 0, 0, 0, (short)4, 2, (short) 6, 5));
			// 设置注释内容
			comment.setString(new HSSFRichTextString("可以在POI中添加注释！"));
			// 设置注释作者. 当鼠标移动到单元格上是可以在状态栏中看到该内容.
			comment.setAuthor("limin.");
		}else{//XSSFWorkbook
			evaluator = new XSSFFormulaEvaluator((XSSFWorkbook) book);
			patr = sheet.createDrawingPatriarch();
		}
		
		//字体
		Font font = book.createFont();
		font.setFontName("宋体");
		font.setBoldweight(Font.BOLDWEIGHT_BOLD);// 粗体
		font.setFontHeightInPoints((short) 14);// 字体大小
		font.setItalic(true);//是否使用斜体
//		font.setStrikeout(true);//是否使用划线  中划线 
		font.setUnderline(FontFormatting.U_SINGLE_ACCOUNTING); // 下划线从FontFormatting取静态变量
		// 单元格样式
		CellStyle style = book.createCellStyle();
		style.setFont(font); //设置字体font --
		//水平布局 
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 居中 --
		// 设置背景颜色
		style.setFillForegroundColor(HSSFColor.WHITE.index);//设置前景颜色
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);//填充方式，前色填充
		// 边框填充
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);//下边框
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
	        style.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框
	        style.setWrapText(true);//设置自动换行 --
	        
	        // 单元格合并
//	        Region region = new Region(0, (short)0, 0, (short)3);//参数1：行号 参数2：起始列号 参数3：行号 参数4：终止列号
	        // 或者用
//	        CellRangeAddress region1 = new CellRangeAddress(0, 0, (short) 0, (short) 3);
	        //合并单元格
//	        sheet.addMergedRegion(region1);
	       
	        // 行
	        for(int i=0;i<5;i++){
	        	Row row = sheet.createRow(i);
	        	for(int j=0;j<10;j++){
	        		Cell cell = row.createCell(j);
	        		//cell.setCellValue("我是第"+(i+1)+"行，第"+(j+1)+"列");
	        		cell.setCellValue("asdfdsfsdfs");
	        		cell.setCellStyle(style);
	        		if(j==3){
	        			cell.setCellFormula("UPPER(A1)");
	        			System.out.println(cell.getCellType());
	        		}
	        		//
	        		if(cell.getCellType()==Cell.CELL_TYPE_FORMULA){
	        			CellValue cellValue = evaluator.evaluate(cell);
	        			cell.setCellValue(cellValue.getStringValue());
	        			System.out.println("2:"+cell.getCellType());
	        		}
	        		// 自适应列宽
	        		sheet.autoSizeColumn(j, true);
	        	}
	        }
	        
	        
	        return book;
	}
	
	
	public static void main(String[] args) throws IOException {
		FileOutputStream outputStream = new FileOutputStream(new File("export.xlsx"));
		Workbook book = export(null, true);
		System.out.println(book.getClass().getName());
		book.write(outputStream);
		outputStream.flush();
		outputStream.close();
	}
}
