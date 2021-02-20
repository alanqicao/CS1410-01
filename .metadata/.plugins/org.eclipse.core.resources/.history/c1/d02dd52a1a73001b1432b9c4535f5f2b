package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
	
	
/**
 * Plane game Frame
 * @author Qi Cao
 *
 */
public class MyGameFrame extends JFrame {
		
		Image ball = GameUtil.getImage("images/smallBall.png");
	
	@Override
		public void paint(Graphics g) { //auto run. g = a pan
			Color c= g.getColor(); // keep original color
			Font f = g.getFont(); // keep original font
			g.setColor(Color.BLUE);
			
			g.drawLine(100, 100, 300, 300);
			g.drawRect(100, 100, 300, 300);
			g.drawOval(100, 100, 300, 300);
			g.fillRect(100, 100, 40, 40);
			g.setColor(Color.RED);
			g.setFont(new Font("Monospaced",Font.BOLD,50));
			g.drawString("who am i ", 200, 200);
			g.setColor(c); // set back to original color
			g.setFont(f);// set back to original Font
			g.drawImage(ball,250,250, null);
		}
	
// setting up window
	public void launchFrame() {
		this.setTitle("Qi Cao Game project");
		this.setVisible(true); 
		this.setSize(500,500);
		this.setLocation(300,300); //left up corner is 0,0
		
		//exit the window 
		this.addWindowListener(new WindowAdapter() {
			
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		});
	} 
	
	public static void main(String[] args) {
		MyGameFrame f= new MyGameFrame();
		f.launchFrame();
	}
}
