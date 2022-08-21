package hocvien;
import java.util.Comparator;
public class Sortbyname implements Comparator<hocvienn>{
	@Override
	public int compare(hocvienn hocvien1, hocvienn hocvien2) {
		return hocvien1.getName().compareTo(hocvien2.getName());
	}
}
