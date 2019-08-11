package chapter_05_information_hiding;

public class Student {
	private String name;
	private int number;
	private int age;
	private int grade;
	private String schoolName;
	private String records;
	
	
// name - getter/setter
	public void setName(String name) {
		this.name = name;
	}	
	public String getName() {
		return this.name;
	}
	
	
// number - getter/setter
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return this.number;
	}
	
	
// age - getter/setter
	public void setAge(int age) {
		this.age = age;
	}	
	public int getAge() {
		return this.age;
	}
	
	
// grade - getter/setter
	public void setGrade(int grade) {
		this.grade = grade;
	}	
	public int getGrade() {
		return this.grade;
	}
	
	
// schoolName - getter/setter
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}	
	public String getSchoolName() {
		return this.schoolName;
	}
	
	
// records - getter/setter
	public void setRecords(String records) {
		this.records = records;
	}
	public String getRecords() {
		return this.records;
	}
}
