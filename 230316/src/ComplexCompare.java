import java.util.Comparator;

public class ComplexCompare implements Comparator<Complex>{

	@Override
	public int compare(Complex o1, Complex o2) {
		//복소수 : 3+5i -> i는 허수 , 실수부 비교 후 같으면 허수부 비교  
		//앞이 크면 양수, 같으면 0, 뒤가 크면 음수 
		int ret = o1.real - o2.real;
		if(ret == 0) {
			ret = o1.imaginary - o2.imaginary;
		}
		return ret;
	}
}


