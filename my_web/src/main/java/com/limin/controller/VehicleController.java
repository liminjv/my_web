package com.limin.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.limin.vehicle.UpdateVehicle;
import com.limin.vehicle.VehicleVo;


@Controller
public class VehicleController {
	
	
	@ResponseBody
	@RequestMapping("/limin/vehicle/updateZq")
	public ModelMap updateForZQ(){
		ModelMap data = new ModelMap();
		System.out.println(new File(".").getAbsolutePath());
		ArrayList<VehicleVo> list = UpdateVehicle.readExcel("./src/main/webapp/zq_vehicle.xls");
		
		HashMap<String,ArrayList<VehicleVo>> map = UpdateVehicle.updateVehicle(list);
		
		ArrayList<VehicleVo> successList = map.get("successList");
		ArrayList<VehicleVo> failedList = map.get("failedList");
		ArrayList<VehicleVo> moreOneOrColorEList = map.get("moreOneOrColorEList");
		
		System.out.println("修改成功数量："+successList.size());
		System.out.println("修改失败的数量："+failedList.size());
		System.out.println("该车牌+颜色的车不止一辆的数量："+moreOneOrColorEList.size());
		
		data.put("修改成功数量：", successList.size());
		data.put("修改失败的数量：", failedList.size());
		data.put("该车牌+颜色的车不止一辆的数量：", moreOneOrColorEList.size());
		
		//把三个集合写入excel,保存到项目中
		writeExcel(map);
		
		return data;
	}
	
	
	@RequestMapping("/limin/vehicle/upZqExcel")
	public void updateVehicleAndExport(HttpServletResponse response){
		
	     // 生成提示信息，  
	     response.setContentType("application/vnd.ms-excel");  
	     String codedFileName = null;  
	     OutputStream outputStream = null;  
	     try{  
	         // 进行转码，使其支持中文文件名  
	         codedFileName = java.net.URLEncoder.encode("肇庆车辆数据更新结果"+System.currentTimeMillis(), "UTF-8");  
	         response.setHeader("content-disposition", "attachment;filename=" + codedFileName + ".xls");  
	         // response.addHeader("Content-Disposition", "attachment;   filename=" + codedFileName + ".xls");  
	 		
	         ArrayList<VehicleVo> list = UpdateVehicle.readExcel("./src/main/webapp/zq_vehicle.xls");
     		 HashMap<String,ArrayList<VehicleVo>> map = UpdateVehicle.updateVehicle(list);
	         HSSFWorkbook workbook = writeExcel2(map); 
	         
	         outputStream = response.getOutputStream();
	         workbook.write(outputStream);  
	     } catch (Exception e){
	    	 e.printStackTrace();
	     } finally {  
	         try  
	         {  
	        	 if(outputStream!=null){
	        		 outputStream.flush();  
	        		 outputStream.close();  
	        	 }
	         }  
	         catch (IOException e)  
	         {
	        	 e.printStackTrace();
	         }  
	     }  
	}
	public static void writeExcel(HashMap<String,ArrayList<VehicleVo>> map){
		ArrayList<VehicleVo> successList = map.get("successList");
		ArrayList<VehicleVo> failedList = map.get("failedList");
		ArrayList<VehicleVo> moreOneOrColorEList = map.get("moreOneOrColorEList");
		
		String[] arr = {"车牌号","车牌颜色","车型","车主"};
		//列数
		int columnNumber = 4;
		
		String url = "./src/main/webapp/zq"+System.currentTimeMillis()+".xls";
		File file = new File(url);
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(file);
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet1 = workbook.createSheet("更新成功的数据");
			HSSFSheet sheet2 = workbook.createSheet("更新失败的数据");
			HSSFSheet sheet3 = workbook.createSheet("车牌号+颜色出现重复的数据");
			
			//创建第一行，属性行，写入属性行
			//------------------start---------------
			HSSFRow row1 = sheet1.createRow(0);
			HSSFRow row2 = sheet2.createRow(0);
			HSSFRow row3 = sheet3.createRow(0);
			for(int i=0;i<columnNumber;i++){
				row1.createCell(i).setCellValue(arr[i]);
				row2.createCell(i).setCellValue(arr[i]);
				row3.createCell(i).setCellValue(arr[i]);
			}
			//------------------ent-----------------
			
			//写入集合数据
			//-----------sheet1 写入开始-------------------
			if(successList!=null && successList.size()>0){
				int i = 1;
				for(VehicleVo vo:successList){
					HSSFRow row = sheet1.createRow(i);
					row.createCell(0).setCellValue(vo.getLicenceNo());
					row.createCell(1).setCellValue(vo.getLicenceColorDesc());
					row.createCell(2).setCellValue(vo.getVehicleType());
					row.createCell(3).setCellValue(vo.getOwnerName());
					i++;
				}
			}
			//-----------sheet1 写入结束-------------------
			
			//-----------sheet2 写入开始-------------------
			if(failedList!=null && failedList.size()>0){
				int i = 1;
				for(VehicleVo vo:failedList){
					HSSFRow row = sheet2.createRow(i);
					row.createCell(0).setCellValue(vo.getLicenceNo());
					row.createCell(1).setCellValue(vo.getLicenceColorDesc());
					row.createCell(2).setCellValue(vo.getVehicleType());
					row.createCell(3).setCellValue(vo.getOwnerName());
					i++;
				}
			}
			//-----------sheet2 写入结束-------------------
			
			//-----------sheet3 写入开始-------------------
			if(moreOneOrColorEList!=null && moreOneOrColorEList.size()>0){
				int i = 1;
				for(VehicleVo vo:moreOneOrColorEList){
					HSSFRow row = sheet3.createRow(i);
					row.createCell(0).setCellValue(vo.getLicenceNo());
					row.createCell(1).setCellValue(vo.getLicenceColorDesc());
					row.createCell(2).setCellValue(vo.getVehicleType());
					row.createCell(3).setCellValue(vo.getOwnerName());
					i++;
				}
			}
			//-----------sheet3 写入结束-------------------
			
		    // 创建文件输出流，准备输出电子表格：这个必须有，否则你在sheet上做的任何操作都不会有效  
				workbook.write(outputStream);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(outputStream!=null){
					outputStream.flush();
					outputStream.close();
				}	
			} catch (IOException e) {
					e.printStackTrace();
			}
		}
	}
	
	
	
	public static HSSFWorkbook writeExcel2(HashMap<String,ArrayList<VehicleVo>> map){
		ArrayList<VehicleVo> successList = map.get("successList");
		ArrayList<VehicleVo> failedList = map.get("failedList");
		ArrayList<VehicleVo> moreOneOrColorEList = map.get("moreOneOrColorEList");
		
		String[] arr = {"车牌号","车牌颜色","车型","车主"};
		//列数
		int columnNumber = 4;
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet1 = workbook.createSheet("更新成功的数据");
		HSSFSheet sheet2 = workbook.createSheet("更新失败的数据");
		HSSFSheet sheet3 = workbook.createSheet("车牌号+颜色出现重复的数据");
		//创建第一行，属性行，写入属性行
		//------------------start---------------
		HSSFRow row1 = sheet1.createRow(0);
		HSSFRow row2 = sheet2.createRow(0);
		HSSFRow row3 = sheet3.createRow(0);
		for(int i=0;i<columnNumber;i++){
			row1.createCell(i).setCellValue(arr[i]);
			row2.createCell(i).setCellValue(arr[i]);
			row3.createCell(i).setCellValue(arr[i]);
		}
		//------------------ent-----------------
		//写入集合数据
		//-----------sheet1 写入开始-------------------
		if(successList!=null && successList.size()>0){
			int i = 1;
			for(VehicleVo vo:successList){
				HSSFRow row = sheet1.createRow(i);
				row.createCell(0).setCellValue(vo.getLicenceNo());
				row.createCell(1).setCellValue(vo.getLicenceColorDesc());
				row.createCell(2).setCellValue(vo.getVehicleType());
				row.createCell(3).setCellValue(vo.getOwnerName());
				i++;
			}
		}
		//-----------sheet1 写入结束-------------------
		//-----------sheet2 写入开始-------------------
		if(failedList!=null && failedList.size()>0){
			int i = 1;
			for(VehicleVo vo:failedList){
				HSSFRow row = sheet2.createRow(i);
				row.createCell(0).setCellValue(vo.getLicenceNo());
				row.createCell(1).setCellValue(vo.getLicenceColorDesc());
				row.createCell(2).setCellValue(vo.getVehicleType());
				row.createCell(3).setCellValue(vo.getOwnerName());
				i++;
			}
		}
		//-----------sheet2 写入结束-------------------
		//-----------sheet3 写入开始-------------------
		if(moreOneOrColorEList!=null && moreOneOrColorEList.size()>0){
			int i = 1;
			for(VehicleVo vo:moreOneOrColorEList){
				HSSFRow row = sheet3.createRow(i);
				row.createCell(0).setCellValue(vo.getLicenceNo());
				row.createCell(1).setCellValue(vo.getLicenceColorDesc());
				row.createCell(2).setCellValue(vo.getVehicleType());
				row.createCell(3).setCellValue(vo.getOwnerName());
				i++;
			}
		}
		//-----------sheet3 写入结束-------------------
		return workbook;
	}
}
