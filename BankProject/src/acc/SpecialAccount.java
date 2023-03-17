package acc;

import exception.BankException;

//등급 : vip(0.04%), gold(0.03%), silver(0.02%), normal(0.01%) 
// 10000 -> 10400
//기능 : 이자 지급, 등급에 따라 입금 시 이자율만큼 추가로 입금 
public class SpecialAccount extends Account {
	String grade;
	private double rate;

	public SpecialAccount(String id, String name, int balance, String grade) {
		super(id, name, balance);
		setGrade(grade);
	}

	@Override
	public void deposit(int money) throws BankException {
		super.deposit(money +(int)(money*rate));
	}
	

	@Override
	public String info() {
		return super.info()+", 등급 : "+getGrade();
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
		switch (grade) {
			case "VIP" : rate = 0.04; break;
			case "Gold" : rate = 0.03; break;
			case "Silver" : rate = 0.02; break;
			case "Normal" : rate = 0.01; break;
			default: break;
		}
	}
}
