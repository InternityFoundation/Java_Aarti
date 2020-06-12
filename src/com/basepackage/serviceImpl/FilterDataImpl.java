package com.basepackage.serviceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.basepackage.bean.Csv;
import com.basepackage.service.FilterData;

public class FilterDataImpl  implements FilterData {

	@Override
	public void filter() {
		
		try {
		
		Csv csvList = null;
		List<Csv> csvGet = Arrays.asList(csvList);
		System.out.println();
		//List<Csv> names = csvList.stream().filter(str->getUsername().length()>5).collect(Collectors.toList());
		List<Csv> names = csvGet.stream().filter(str-> str.getUsername().length()>6).collect(Collectors.toList());
		names.forEach(System.out::println);
		List<Csv> company = csvGet.stream().filter(c->c.getCompany() == "Mi" && c.getUsername().startsWith("A")).collect(Collectors.toList());
		company.forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}