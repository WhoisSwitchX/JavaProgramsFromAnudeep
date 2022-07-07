package LabDay;

class student{
	
	private int id;
	private String name;
	private String course;
	
	void setId(int ab) {
		 id = ab;
	}
	void setName(String xy) {
		name = xy;
	}
	void setCourse(String mn) {
		course = mn;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCourse() {
		return course;
	}
}

public class studentDetails {

	public static void main(String[] args) {
		// 
		student saurabh = new student();
		
		saurabh.setName("Saurabh S. Mathe.");
		saurabh.setId(123);
		saurabh.setCourse("Java full Stack Developer");
		
		System.out.println(saurabh.getName());
		System.out.println(saurabh.getId());
		System.out.println(saurabh.getCourse());
	
	}

}