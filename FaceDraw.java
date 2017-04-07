import java.awt.*;
import java.awt.event.*;


public class FaceDraw extends Frame{

	public void paint (Graphics g){
		
		//.drawRect(40, 40, 200, 200);
		
		// face
		g.drawOval(90, 70, 80, 80);
		//eyes
		g.drawOval(110, 95, 5, 5);
		g.drawOval(145, 95, 5, 5);
		//mouth
		g.drawArc(113, 115, 35, 20, 0, -180);
		
		
	}
		
	public static void main(String []args){
		 
		FaceDraw d = new FaceDraw();
		
		d.setSize(400,400);
		d.setTitle("FaceDraw");
		
		d.setVisible(true);
		d.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	}
		
}
		