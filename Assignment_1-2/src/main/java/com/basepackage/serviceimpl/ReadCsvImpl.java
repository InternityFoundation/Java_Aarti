package com.basepackage.serviceimpl;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.basepackage.bean.Csv;
import com.basepackage.dao.DaoInterfaceForInsertion;
import com.basepackage.data.SaveData;
import com.basepackage.service.ReadFile;

public class ReadCsvImpl implements ReadFile {
	@Override
		public void readCsv() {
		// read csv
		List<Csv> csvList = new ArrayList<>();
		String filePath = "C:\\Users\\Shrijeet\\eclipse-workspace\\Assignment_1-2\\file\\employee_data.txt";
		try {
			List<String> lines = Files.readAllLines(Paths.get(filePath));
			for (String line : lines) {
				String[] result = line.split(",");
				csvList.add(new Csv( result[1], result[2], result[3], result[4], result[5], result[6]));
				
			}
			System.out.println(csvList.toString());
			
			DaoInterfaceForInsertion daoInterfaceForInsertion = new SaveData();
			daoInterfaceForInsertion.insertValue(csvList, null, null);
			
			DaoInterfaceForInsertion checkUser = new SaveData();
			checkUser.checkAdmin();
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
