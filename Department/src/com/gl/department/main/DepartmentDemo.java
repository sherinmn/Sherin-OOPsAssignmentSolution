package com.gl.department.main;

import com.gl.department.services.AdminDepartment;
import com.gl.department.services.HrDepartment;
import com.gl.department.services.TechDepartment;

public class DepartmentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminDepartment admin=new AdminDepartment();
		HrDepartment hr=new HrDepartment();
		TechDepartment tech=new TechDepartment();
		
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday()+"\n");
		
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday()+"\n");
		
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday()+"\n");

	}

}
