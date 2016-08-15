package hashcode;

import java.util.HashSet;

//import hashcode.Employee.Student;

class Employee{
	
	private int id;
	private String ename;
	Employee(int id,String ename){
		
		this.id=id;
		this.ename=ename;
		
	}

	public String toString(){
		
		return "["+id+ " , " +ename+"]";
	}

}


	
	class Student{
		
		private int rollNum;
		private String sname;
		
		Student(int rollNum,String sname){
			
			this.rollNum=rollNum;
			this.sname=sname;
		}
		
		public String toString(){
			
			return "["+rollNum+ "," +sname+"]";
		}
		
		
	}


public class HashEqualSet {
	
	public static void main(String[]args){
		
		Employee e1=new Employee(234,"Tabrez");
		Employee e2=new Employee(235,"Ibrez");
		
		HashSet<Employee> emp=new HashSet<Employee>();
		emp.add(e1);
		emp.add(e2);
		
		Student s1=new Student(245,"Aisha");
		Student s2=new Student(246,"Razia");
		HashSet<Student>st=new HashSet<Student>();
		st.add(s1);
		st.add(s2);
		
		System.out.println(st);
		System.out.println(emp);
		
		
	}

}
