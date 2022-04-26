import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AnonymousInnerClassDemo extends Applet {
	
	public void init() {
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				showStatus("Mouse Pressed.");
			}
		});
	}
}
