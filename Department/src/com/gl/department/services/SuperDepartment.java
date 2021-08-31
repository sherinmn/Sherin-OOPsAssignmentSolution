package com.gl.department.services;

public abstract class SuperDepartment {
	
	public String departmentName()
	{
		return "Super Department";
	}
	
	public String getTodaysWork()
	{
		return "No work as of now";
	}
	
	public String getWorkDeadline()
	{
		return "Nil";
	}
	
	public String isTodayAHoliday()
	{
		return "Today is not a Holiday";
	}

}
