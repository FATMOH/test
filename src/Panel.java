import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Panel extends JPanel {
	static int mouseX = 0 ;
	static int mouseY = 0 ;

	public void paintComponent(Graphics g){
		
		mouseX = MouseInfo.getPointerInfo().getLocation().x - getLocationOnScreen().x;
		mouseY = MouseInfo.getPointerInfo().getLocation().y - getLocationOnScreen().y;
		g.setColor(new Color(0,0,0));
		g.fillRect(0, 0, getSize().width, getSize().height);
		
		for(int x=0; x < Frame.x; x++){
			for(int y=0; y < Frame.y; y++){
				g.drawImage(new ImageIcon("case.png").getImage(), x*Frame.Size, y*Frame.Size,null);
				
				 if(Frame.Cases[x][y]==-1){
					
					g.drawImage(new ImageIcon("mine_perdu.gif").getImage(), x*Frame.Size, y*Frame.Size,null);
				
				}
				 
				else  if(Frame.Cases[x][y] > 0){
					if(Frame.Colors == 1){
						if(Frame.Cases[x][y]==1)g.setColor(new Color(161,6,132));
						if(Frame.Cases[x][y]==2)g.setColor(new Color(24,57,30));
						if(Frame.Cases[x][y]==3)g.setColor(new Color(255,0,0));
						if(Frame.Cases[x][y]==4)g.setColor(new Color(255,9,33));
						if(Frame.Cases[x][y]==5)g.setColor(new Color(0,0,0));
						if(Frame.Cases[x][y]==6)g.setColor(new Color(0,0,0));
						if(Frame.Cases[x][y]==7)g.setColor(new Color(0,0,0));
						if(Frame.Cases[x][y]==8)g.setColor(new Color(0,0,0));
						
					}
					//g.setColor(new Color(0,0,0));
					g.drawString(Integer.toString(Frame.Cases[x][y]), x*Frame.Size+2, y*Frame.Size+15);				
				}
				 if(Frame.Hidden[x][y]){
					 	//Graphics2D g2d=(Graphics2D) g;
						//g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, .8F));
					 	g.drawImage(new ImageIcon("c.gif").getImage(), x*Frame.Size, y*Frame.Size,null);
					 	//g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1F));
				 }
				 if(Frame.Flags[x][y]){
					 if(!Frame.finish){
						 g.drawImage(new ImageIcon("drapeau.gif").getImage(), x*Frame.Size, y*Frame.Size,null);
					 }
					 else if(Frame.Cases[x][y] == -1){
						 g.drawImage(new ImageIcon("drapeau.gif").getImage(), x*Frame.Size, y*Frame.Size,null); 
					 }
					 g.drawImage(new ImageIcon("drapeau.gif").getImage(), x*Frame.Size, y*Frame.Size,null); 
				}
			}
			
		}
		if(Frame.onScreen){
			g.setColor(new Color(0,0,0));
			g.fillRect(Frame.Cursor[0]*Frame.Size, Frame.Cursor[1]*Frame.Size, Frame.Size, Frame.Size);	}
		
	}
	
	
	
}
