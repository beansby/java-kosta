package exercise;

/**
 * MyTv2 클래스의 멤버변수 isPowerOn, channel, volume 을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고 
 * 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter 메서드를 추가하라
 * 
 * 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는 기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
 * [Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
 * 메서드명 : gotoPrevChannel
 * 기 능 : 현재 채널을 이전 채널로 변경한다. 
 * 반환타입 : 없음
 * 매개변수 : 없음
 * @author ebina
 *
 */
public class Ex7_11 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
		
		System.out.println();
		
		t.setChannel(10); 
		System.out.println("CH:"+t.getChannel()); 
		t.setChannel(20); 
		System.out.println("CH:"+t.getChannel()); 
		t.gotoPrevChannel(); 
		System.out.println("CH:"+t.getChannel()); 
		t.gotoPrevChannel(); 
		System.out.println("CH:"+t.getChannel());
	}
}

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	int prev;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void gotoPrevChannel() {
		int tmp = this.channel;
		this.channel = prev;
		prev = tmp;
	}
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		prev = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
}