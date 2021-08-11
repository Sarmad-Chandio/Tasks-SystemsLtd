package com.systems.inheritanceWithBeans;

public class SelfEmployee extends Person {
	
	private static String organizationName;
	
	public static String getOrganizationName() {
		return organizationName;
	}
	public static void setOrganizationName(String organizationName) {
		SelfEmployee.organizationName = organizationName;
	}
	 
	
}
