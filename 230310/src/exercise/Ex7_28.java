package exercise;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 아래의 EventHandler를 익명 클래스(anonymous class)로 변경
 * @author ebina
 *
 */
public class Ex7_28 {
	public static void main(String[] args) {
		Frame f = new Frame(); 
//		f.addWindowListener(new EventHandler());
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		}
		);
	}
}

class EventHandler extends WindowAdapter { 
	public void windowClosing(WindowEvent e) { 
		e.getWindow().setVisible(false); 
		e.getWindow().dispose(); 
		System.exit(0);
	}
}

