package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
	
	
/**
 * Plane game Frame
 * @author Qi Cao
 *
 */
public class MyGameFrame extends JFrame {
		
		Image planeImg = GameUtil.getImage("images/plane.png");
		Image bg = GameUtil.getImage("images/bg.jpg");
		
		Plane plane = new Plane(planeImg,250,250);
	
	@Override
		public void paint(Graphics g) { //auto run. g = a pan
	
			g.drawImage(bg,0,0, null);
			plane.drawSelf(g); //draw the plane
		}
	// help us to reDraw the window
	class PaintThread extends Thread{
		@Override
		public void run() {			
			while(true) {
				repaint(); //repaint window
				try {
					Thread.sleep(40);//fps  1s=1000ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}
	}
	
	// defind key monitor override method
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
		
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
		
		new PaintThread().start();// active repaint window
		addKeyListener(new KeyMonitor());// give window add keyboard monitor
	} 
	
	public static void main(String[] args) {
		MyGameFrame f= new MyGameFrame();
		f.launchFrame();
	}
}