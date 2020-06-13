package com.basepackage.serviceImpl;

//import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.basepackage.bean.Csv;
import com.basepackage.dao.InsertDatabaseImpl;
import com.basepackage.service.DeleteData;
import com.basepackage.service.FilterData;
import com.basepackage.service.ReadFile;

public class ReadFileImpl implements ReadFile{
	@Override
 	public void readCsv() {
	
		 //read Csv 
		 List<Csv>  csvList = new ArrayList<>();
		 
			try {
				List<String> lines= Files.readAllLines(Paths.get("C:\\Users\\Shrijeet\\eclipse-workspace\\Assignment1\\file\\employee_data.txt"));
				for(String line :lines) {
					String[] result = line.split(",");
					csvList.add(new Csv(Integer.parseInt(result[0]),result[1], result[2],result[3],result[4]));
				System.out.println(result[0]+":"+result[1]+":"+result[2]+":"+result[3] +":"+result[4]);
					
					}
				System.out.println(csvList);
				InsertDatabaseImpl  insertData=new 	InsertDatabaseImpl();
				insertData.insertValue(csvList);
				insertData.selectData();
				FilterData filter = new FilterDataImpl();
				filter.filterData();
				DeleteData delete = new DeleteDataImpl();
				delete.deleteData();
				
				
				}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
 }