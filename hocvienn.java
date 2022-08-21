package hocvien;
import java.io.Serializable;
public class hocvienn implements Serializable {
	private int id;
	private String name;
	private int age;
	private float mark;
	private String Class;
	
	public hocvienn() {
		
	}
	public hocvienn(int id, String name, int age, String Class, float mark) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mark = mark;
		this.Class = Class;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	public String getclass() {
		return Class;
	}
	public void setclass(String Class) {
		this.Class = Class;
	}
	
	
}
