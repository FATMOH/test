import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class mouseListener implements MouseListener{
	static boolean Left = false;
	static  boolean Right = false;
	
	public void mouseClicked(MouseEvent e) {
	
		
	}

	public void mouseEntered(MouseEvent e) {
	
		
	}

	public void mouseExited(MouseEvent e) {
	
		
	}

	
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == 1) Left = true;
		if(e.getButton() == 3) Right = true;
	}

	
	public void mouseReleased(MouseEvent e) {
		
		
	}
	

}
