package exception;

public class BankException extends Exception {
	
	//final 변수 -> Enum 
//	public static final int DOUBLE_ID = 100;
//	public static final int WITHDRAW = 101;
//	public static final int DEPOSIT = 102;
//	public static final int MENU = 103;
//	public static final int ACC_MENU = 104;
	
	BANK_ERR errCode;
	
	public BankException(String message, BANK_ERR code) {
		super(message);
		errCode = code;
	}

	@Override
	public String toString() {
		String errMsg = getMessage()+":";
		switch (errCode) {
			case DOUBLE_ID : errMsg += "중복된 계좌번호입니다.";
				break;
			case NOT_ID : errMsg += "없는 계좌번호입니다.";
				break;
			case WITHDRAW : errMsg += "잔액이 부족합니다.";
				break;
			case DEPOSIT : errMsg += "입금액 오류입니다.";
				break;
			case MENU : errMsg += "선택하신 메뉴는 없습니다.";
				break;
			case ACC_MENU : errMsg += "계좌 종류를 잘못 선택했습니다.";
				break;
			default:
				break;
		}
		return 
				super.toString()+" - "+
				errMsg;
	}
	
	
	
}
