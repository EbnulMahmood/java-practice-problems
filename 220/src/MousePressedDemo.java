import java.applet.Applet;
import java.awt.event.*;
public class MousePressedDemo extends Applet {
	
	public void init() {
		addMouseListener(new MyMouseAdapter(this));
	}
}

class MyMouseAdapter extends MouseAdapter {
	MousePressedDemo mousePressedDemo;
	
	public MyMouseAdapter(MousePressedDemo mousePressedDemo) {
		this.mousePressedDemo = mousePressedDemo;
	}
	
	public void mousePressed(MouseEvent me) {
		mousePressedDemo.showStatus("Mouse Pressed.");
	}
}
