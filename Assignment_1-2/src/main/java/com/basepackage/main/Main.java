package com.basepackage.main;
import java.sql.SQLException;

import com.basepackage.service.ReadFile;
import com.basepackage.serviceimpl.ReadCsvImpl;


public class Main {

	public static void main(String[] args) throws SQLException {
		ReadFile readCsv = new ReadCsvImpl();
		readCsv.readCsv();

	}

}
