package com.tns.ifet.assignment.employee;
 
import com.tns.ifet.assignment.employee.Manager; 
import com.tns.ifet.assignment.employee.Developer; 
import com.tns.ifet.assignment.employee.Utilities; 
	public class AssignmentMain { 
	    public static void main(String[] args) { 
	        Manager manager = new Manager("John", 101, 90000, "Sales"); 
	        Developer developer = new Developer("Alice", 102, 80000, "Java"); 
	        Utilities.printEmployeeDetails(manager); 
	        Utilities.printEmployeeDetails(developer); 
	    } 
	} 

