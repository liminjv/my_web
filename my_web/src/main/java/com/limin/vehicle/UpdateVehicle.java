package com.limin.vehicle;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.limin.util.DbTools;


public class UpdateVehicle {

	//肇庆高新区城市编号       高新区-441204
	private static String POPEDOM = "441204";

	/**
	 * 读取excel获取list 车辆vo对象
	 * @param fileName
	 * @return
	 */
	public static ArrayList<VehicleVo> readExcel(String fileName){
		boolean isE2007 = false;    //判断是否是excel2007格式  
        if(fileName.endsWith("xlsx"))  
            isE2007 = true;  
        try {  
            InputStream input = new FileInputStream(fileName);  //建立输入流  
            Workbook wb  = null;  
            if(isE2007){
            	wb = new XSSFWorkbook();
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
                Iterator<Cell> cells = row.cellIterator();    //获得第一行的迭代器
                int i=0;
                while(cells.hasNext()){
                	Cell cell = cells.next();
                	String param = cell.getStringCellValue().trim();
                	if(i==0){
                		vo.setLicenceNo(param);
                	}else if(i==1){
                		int colorNum = VehicleEnums.LicenceColor.getColorValue(param);
                		vo.setLicenceColorDesc(param);
                		vo.setLicenceColor(colorNum);
                	}else if(i==2){
                		vo.setVehicleType(param);
                	}else{
                		vo.setOwnerName(param);
                	}
                	i++;
                }
                list.add(vo);
            }  
            return list;
        } catch (IOException ex) {  
            ex.printStackTrace();  
        }
		return null;  
	}
	
	
	/**
	 * 更新车辆popedom字段
	 * @param list
	 * @return
	 */
	public static HashMap<String, ArrayList<VehicleVo>> updateVehicle(ArrayList<VehicleVo> list){
		if(list==null||list.size()==0) {
			return null;
		}
		//修改成功的车辆集合
		ArrayList<VehicleVo> successList = new ArrayList<VehicleVo>();
		//修改失败的车辆集合
		ArrayList<VehicleVo> failedList = new ArrayList<VehicleVo>();
		//修改了不止一条或颜色错误
		ArrayList<VehicleVo> moreOneOrColorEList = new ArrayList<VehicleVo>();
		
		String sql = "update vehicle set popedom=? where licence_no=? and licence_color=?";
		for(VehicleVo vo:list){
			if(vo.getLicenceColor()==0){
				//车牌颜色不存在
				moreOneOrColorEList.add(vo);
				continue;
			}
			try {
				int ret = DbTools.executeUpdate(sql, DbTools.makeParams(POPEDOM,vo.getLicenceNo(),vo.getLicenceColor()));
				if(ret==1){
					successList.add(vo);
				}else if(ret==0) {
					//该车辆不存在
					failedList.add(vo);
				}else{
					moreOneOrColorEList.add(vo);
				}
			} catch (InstantiationException | IllegalAccessException
					| InvocationTargetException | SQLException e) {
				e.printStackTrace();
			}
		}
		
		HashMap<String,ArrayList<VehicleVo>> map = new HashMap<String,ArrayList<VehicleVo>>();
		map.put("successList", successList);
		map.put("failedList", failedList);
		map.put("moreOneOrColorEList", moreOneOrColorEList);
		
		return map;
	}
	
	
	
}
