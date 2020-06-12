package com.basepackage.service;

//import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.basepackage.bean.Csv;
import com.basepackage.dao.InsertDatabaseImpl;
import com.basepackage.serviceImpl.FilterDataImpl;

public class ReadFileImpl implements ReadFile{
	@Override
 	public void readCsv() {
	
		 //read Csv 
		 List<Csv>  csvList = new ArrayList<>();
		 
			try {
				List<String> lines= Files.readAllLines(Paths.get("C:\\Users\\Shrijeet\\eclipse-workspace\\Assignment1\\file\\employee_data.txt"));
				for(String line :lines) {
					String[] result = line.split(",");
					csvList.add(new Csv(result[0],result[1], result[2],result[3]));
				//	System.out.println(result[0]+":"+result[1]+":"+result[2]+":"+result[3]);
					
					}
				System.out.println(csvList);
				InsertDatabaseImpl  insertData=new 	InsertDatabaseImpl();
				insertData.insertValue(csvList);
				InsertDatabaseImpl  checkUser = new  InsertDatabaseImpl();
				checkUser.checkAdmin();
				FilterData filterData = new FilterDataImpl();
				filterData.filter();
				}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
 }