package com.tutorial3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

 class EmployeeE  {
	   int EmpNo;
	   String EmpName;
  public EmployeeE(int empNo, String empName) {
		super();
		EmpNo = empNo;
		EmpName = empName;
	}

@Override
public String toString() {
	return "EmployeeE [EmpNo=" +EmpNo+" ,EmpName=" +EmpName+ "] " ;
	
}
	
}
public class EmployeeSort {

	public static void main(String[] args) {
		
		
		List<EmployeeE> l= new ArrayList<>();
		l.add(new EmployeeE(101, "Barath"));
		l.add(new EmployeeE(105, "Arun"));
		l.add(new EmployeeE(104, "Chai"));
		l.add(new EmployeeE(102, "Esh"));
		l.add(new EmployeeE(103, "Dav"));
		System.out.println("Before sorting");
		for(EmployeeE ee : l) {
			System.out.println(ee);}
		System.out.println();
		
		//Collections.sort(l,(e1,e2)-> (e1.EmpNo<e2.EmpNo)?-1:(e1.EmpNo>e2.EmpNo)?1:0); // to sort emp no in ascending order		
	   //Collections.sort(l,(e1,e2)-> (e1.EmpNo<e2.EmpNo)?1:(e1.EmpNo>e2.EmpNo)?-1:0);  // to sort emp no in descending order
	 //Collections.sort(l,(e1,e2)->e1.EmpName.compareTo(e2.EmpName));  // names ascending order
	 Collections.sort(l,(e1,e2)->e2.EmpName.compareTo(e1.EmpName));// names descending order
	 
	for(EmployeeE e : l) {
		System.out.println(e);
	}

}}
