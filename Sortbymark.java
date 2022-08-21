package hocvien;
import java.util.Comparator;
public class Sortbymark implements Comparator<hocvienn> {
	@Override
	public int compare(hocvienn hocvienn1, hocvienn hocvienn2) {
		if(hocvienn1.getMark() > hocvienn2.getMark()) {
			return 1;
		}
		return -1;
	}
}
