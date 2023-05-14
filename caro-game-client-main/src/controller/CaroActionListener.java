
package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Point;

// ActionListener được gọi bất cứ khi nào bạn click button hoặc menu item.
// ActionListener thuộc về package java.awt.event, nó chỉ có một phương thức actionPerformed().

public class CaroActionListener implements ActionListener{
	
	private Point point;
	
	public CaroActionListener(Point p) {
		
		point = p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}