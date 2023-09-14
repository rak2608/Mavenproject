package com.amdocs.Employee;
class Emp
{
	int emp_id;
	String name;
    int salary;
    
    public int getEmp_id()
    {  
        return emp_id;  
    }  
    public void setEmp_id(int emp_id)
    {  
        this.emp_id = emp_id;  
    }  
    public int getSalary()
    {  
        return salary;  
    }  
    public void setSalary(int salary) 
    {  
        this.salary = salary;  
    }  
    public String getName() 
    {
        return name;  
    }  
    public void setName(String name) 
    {  
        this.name = name;  
    }  
}
public class App 
{
    public static void main( String[] args )
    {
        Emp e=new Emp();
        e.setEmp_id(101);
        e.setSalary(50000);
        e.setName("Raksha");
        
    }
}
