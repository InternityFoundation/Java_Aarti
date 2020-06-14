package com.basepackage.main;
import com.basepackage.service.ReadFile;
import com.basepackage.serviceImpl.ReadFileImpl;

public class Main {
	public static void main(String[] args) {
			
		ReadFile readCsv = new ReadFileImpl();
         readCsv.readCsv();         
	}
}
