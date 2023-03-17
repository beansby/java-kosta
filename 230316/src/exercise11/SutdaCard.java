package exercise11;

import java.util.HashMap;
import java.util.Objects;

public class SutdaCard { 
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);		
	}
	
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(isKwang, num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SutdaCard other = (SutdaCard) obj;
		return isKwang == other.isKwang && num == other.num;
	}
	
	

	@Override
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}

