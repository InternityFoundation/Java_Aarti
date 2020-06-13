package com.basepackage.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.basepackage.bean.Csv;
import com.helper.FactoryProvider;

public class FilterData extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
	//to get
		
		Csv csvGet = null;
		Session s = FactoryProvider.getFactory().openSession();
		Transaction tx = s.beginTransaction();
		List<Csv> csvList = Arrays.asList(csvGet);
		@SuppressWarnings("unchecked")
		List<Csv> name = (List<Csv>) csvList.stream().filter(d-> ((Csv) s).getUsername().startsWith("S"));
		System.out.println(name);
		List<Csv> names = csvList.stream().filter(str->((CharSequence) str).length()>5).collect(Collectors.toList());
		names.forEach(System.out::println);
		List<Csv> company = csvList.stream().filter(c->c.getCompany() == "Mi" && c.getUsername().startsWith("A")).collect(Collectors.toList());
		company.forEach(System.out::println);
		tx.commit();
		s.close();

}
}