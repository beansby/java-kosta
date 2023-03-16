import java.util.Iterator;
import java.util.Objects;

public class Complex {
	int imaginary;
	int real;
	
	public Complex() {
	}

	public Complex(int real, int imaginary) {
		this.imaginary = imaginary;
		this.real = real;
	}

	@Override
	public String toString() {
		return real +"+"+ imaginary +"i";
	}

	
	@Override
	public int hashCode() {
//		return real+imaginary;	//real과 imaginary가 바뀌어도 동일한 값 
		return real*real+imaginary;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Complex == false) return false;
		Complex c = (Complex) obj;
		return c.real == real && c.imaginary == imaginary;
	}
}
