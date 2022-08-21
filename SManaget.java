package hocvien;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class SManaget {
	public static Scanner scanner = new Scanner(System.in);
	private List<hocvienn> studentList;
	private QuanlyHV quanly;
	
	public SManaget() {
		quanly = new QuanlyHV();
		studentList = quanly.read();
	}
	
	public void add() {
		int id = (studentList.size() >0)? (studentList.size() +1):1;
		System.out.println("student id = "+ id);
		String name = inputName();
		int age = inputAge();
		String Class = inputClasss();
		float mark = inputMark();
		
		hocvienn Hocvien = new hocvienn(id, name, age,Class, mark);
		studentList.add(Hocvien);
		quanly.write(studentList);
	}
		public void edit(int id) {
			boolean isExisted = false;
			int size = studentList.size();
			
			for(int i=0; i< size; i++) {
				if(studentList.get(i).getId() == id) {
					isExisted = true;
					studentList.get(i).setName(inputName());
					studentList.get(i).setAge(inputAge());
					studentList.get(i).setclass(inputClasss());
					studentList.get(i).setMark(inputMark());
					break;
				}
			}
			if(!isExisted) {
				System.out.printf("id = %d K co. \n", id);
			}else {
				quanly.write(studentList);
			}
		}
		public void delete(int id) {
			hocvienn Hocvien = null;
			int size = studentList.size();
			for(int i=0; i<size; i++) {
				if(studentList.get(i).getId() == id) {
					Hocvien = studentList.get(i);
					break;
				}
			}
			if(Hocvien != null) {
				studentList.remove(Hocvien);
				quanly.write(studentList);
				
			}else {
				System.out.printf("K tim dc "+id);
			}
		}
		public void Sortbyname() {
			Collections.sort(studentList, new Sortbyname());
		}
		public void Sortbymark() {
			Collections.sort(studentList, new Sortbymark());
		}
		public void show() {
			for(hocvienn Hocvien : studentList) {
				System.out.format("%5d ", Hocvien.getId());
				System.out.format("%20s ", Hocvien.getName());
				System.out.format("%5d ", Hocvien.getAge());
				System.out.format("%20s ", Hocvien.getclass());
				System.out.format("%10.1f%n", Hocvien.getMark());
				
			}
		}
		public int inputId() {
			System.out.print("Nhap id: ");
	        while (true) {
	            try {
	                int id = Integer.parseInt((scanner.nextLine()));
	                return id;
	            } catch (NumberFormatException ex) {
	                System.out.print("invalid! Nhap lai: ");
	            }
	        }
	    }
		private String inputName() {
	        System.out.print("Nhap ten: ");
	        return scanner.nextLine();
	    }
		private String inputClasss() {
			 System.out.print("Nhap lop: ");
		        return scanner.nextLine();
		}
		private int inputAge() {
	        System.out.print("Nhap tuoi: ");
	        while (true) {
	            try {
	                byte age = Byte.parseByte((scanner.nextLine()));
	                if (age < 0 && age > 100) {
	                    throw new NumberFormatException();
	                }
	                return age;
	            } catch (NumberFormatException ex) {
	                System.out.print("invalid! Nhap lai: ");
	            }
	        }
	    }
		private float inputMark(){
			 System.out.print("Nhap diem: ");
		        while (true) {
		            try {
		                float gpa = Float.parseFloat((scanner.nextLine()));
		                if (gpa < 0.0 && gpa > 10.0) {
		                    throw new NumberFormatException();
		                }
		                return gpa;
		            } catch (NumberFormatException ex) {
		                System.out.print("invalid! Nhap lai: ");
		            }
		        }
		    }
		 public List<hocvienn> getStudentList(){
			return studentList;
		 }
		 public void setStudentList(List<hocvienn> studentList) {
			 this.studentList = studentList;
		 }
}
