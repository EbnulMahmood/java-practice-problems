import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InnerClassDemo extends Applet {
	
	public void init() {
		addMouseListener(new MyMouseAdapter());
	}
	
	public class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent me) {
			showStatus("Mouse Pressed.");
		}
	}
}
