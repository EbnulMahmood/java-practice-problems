package guiExample;

import java.awt.*;

import javax.swing.JFrame;

public class GridLayout extends Frame {

	public GridLayout(int widthInPixels, int heightInPixels) {
		
		setTitle("Grid Example");
		setSize(widthInPixels, heightInPixels);
		int numberOfRows = 4;
		int numberOfColumns = 3;
		setLayout(new java.awt.GridLayout(numberOfRows, numberOfColumns));
		for (int label = 1; label < 13; label++)
			add(new Button(String.valueOf(label)));
		show();
	}

	public static void main(String[] args) {

		new GridLayout(175, 100);
	}
}
