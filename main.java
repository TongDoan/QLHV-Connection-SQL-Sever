package hocvien;
import java.util.Scanner;
public class main {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		String choose = null;
		boolean exit = false;
		SManaget SMG = new SManaget();
		int studentId;
		
		showMenu();
		 while (true) {
	            choose = scanner.nextLine();
	            switch (choose) {
	            case "1":
	                SMG.add();
	                break;
	            case "2":
	                studentId = SMG.inputId();
	                SMG.edit(studentId);
	                break;
	            case "3":
	                studentId = SMG.inputId();
	                SMG.delete(studentId);
	                break;
	            case "4":
	                SMG.Sortbymark();
	                break;
	            case "5":
	                SMG.Sortbyname();
	                break;
	            case "6":
	                SMG.show();
	                break;
	            case "0":
	                System.out.println("exit-->!");
	                exit = true;
	                break;
	            default:
	                System.out.println("Vui long chon cac phim 1/2/3/4/5/6/0. !!");
	                break;
	            }
	            if (exit) {
	                break;
	            }
	            // show menu
	            showMenu();
	        }
	    }
	public static void showMenu() {
        System.out.println("-----------Menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by mark.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Vui long chon: ");
    }
	}

