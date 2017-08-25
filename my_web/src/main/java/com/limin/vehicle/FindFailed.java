package com.limin.vehicle;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.limin.util.Regex;

public class FindFailed {

	public static void main(String[] args) {
		String file1 =  "./src/main/webapp/西部公交车辆数据.xls";
		String file2 =  "./src/main/webapp/1.xlsx";
		List<VehicleVo> list1 = readExcel(file1);
		List<VehicleVo> list2 = readExcel(file2);
		String string = compare(list1,list2);
		System.out.println("未导入的数据："+string);
	}
	
	private static String compare(List<VehicleVo> list1, List<VehicleVo> list2) {
		String result = "";
		for(int i=0;i<list1.size();i++){
			boolean flag = false;
			VehicleVo vo1 = list1.get(i);
			String no1 = vo1.getLicenceNo().trim().replaceAll("-", "");
			System.out.println("no1:"+no1);
			for(int j=0;j<list2.size();j++){
				VehicleVo vo2 = list2.get(j);
				String no2 = vo2.getLicenceNo().trim().replaceAll("-", "");
				if(no1.equals(no2)){
					flag = true;
					continue;
				}
				if(j==(list2.size()-1) && flag == false){
					result += no1+",";
				}
			}
		}
		return result;
	}

	public static List<VehicleVo> readExcel(String filename){
		boolean isE2007 = false;    //判断是否是excel2007格式  
        if(filename.endsWith("xlsx"))  
            isE2007 = true;  
        try {  
            InputStream input = new FileInputStream(filename);  //建立输入流  
            Workbook wb  = null;  
            if(isE2007){
            	wb = new XSSFWorkbook(input);
            }else{
            	wb = new HSSFWorkbook(input);  
            }
            Sheet sheet = wb.getSheetAt(0);     //获得第一个表单  
            Iterator<Row> rows = sheet.rowIterator(); //获得第一个表单的迭代器  
            ArrayList<VehicleVo> list = new ArrayList<VehicleVo>();
            while (rows.hasNext()) { 
                Row row = rows.next();  //获得行数据  
                //若当前为属性行，跳过
                if(row.getRowNum()==0){
                	continue;
                }
                VehicleVo vo = new VehicleVo();
                Cell cell = row.getCell(1);
                String cellValue = cell.getStringCellValue();
                vo.setLicenceNo(cellValue);
                if(Regex.checkIsNumber(cellValue)){
                	String desc = VehicleEnums.LicenceColor.getDesc(new Byte(cellValue));
                	vo.setLicenceColorDesc(desc);
                }else{
                	vo.setLicenceColorDesc(cellValue);
                }
                list.add(vo);
            }  
            return list;
        } catch (IOException ex) {  
            ex.printStackTrace();  
        }
		return null;  
	}
}
