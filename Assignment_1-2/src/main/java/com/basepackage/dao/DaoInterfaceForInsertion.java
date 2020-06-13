
  package com.basepackage.dao;
  
  import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.basepackage.bean.Csv;
  
  public interface DaoInterfaceForInsertion { 
	  
	 void insertValue(List<Csv> csvList, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException;
	 void checkAdmin();
 }
 