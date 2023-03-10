
//일회성 클래스 -> 익명으로 구현 
//class LoginClick implements IClick {
//	@Override
//	public void click() {
//		System.out.println("로그인 처리");
//	}
//}

public class InterfaceTest2 {
	public static void main(String[] args) {
		Button loginBtn = new Button();
//		loginBtn.addClickEventListner(new LoginClick());
		
		//익명구현클래스 : 클래스 정의, 생성 & 매개변수로 전달  == IClick 인터페이스 상속받아 추상메소드 오버라이딩
		loginBtn.addClickEventListner(new IClick() {	//이벤트를 저장했다가 onClick() 호출시 
			@Override
			public void click() {
				System.out.println("로그인 처리");	
			}
		});
		loginBtn.onClick();
		
	}
}


class Button {
	IClick iClick;
	
	public void onClick() {
		System.out.println("버튼이 눌림");
		if(iClick != null) {
			iClick.click();
		}
	}
	
	//click() 구현 = 인터페이스만 상속 받아서 가져옴, 함수만 오버라이드 
	public void addClickEventListner(IClick iClick) {
		this.iClick = iClick;
	}
}

//클래스 상속이 더 큰 단위 
interface IClick {
	void click();
}

