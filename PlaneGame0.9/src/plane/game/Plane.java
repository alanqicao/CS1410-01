package plane.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Plane extends GameObject{
	
	boolean live = true;
	
	
	boolean left,up,right,down;
	
	public void drawSelf(Graphics g) {
		if(live) {
			g.drawImage(img, (int) x, (int) y, null);
			if(left) {
				x-=speed;
			}
			if(right) {
				x+=speed;
			}
			if(up) {
				y-=speed; //y = y-speed
			}
			if(down) {
				y+=speed;
			}
		}else {
			//when plane die
		}
		
	}
	/**
	 * setting up plane
	 * @param img
	 * @param x
	 * @param y
	 */
	public Plane(Image img, double x, double y) {
		this.img = img;
		this.x=x;
		this.y=y;
		this.speed = 7; //plane speed
		this.width = 25; //plane img widt himg.getWidth(null)
		this.height= 25;//plane img height img.getHeight(null)
	}
	
	// when push key add direction
	public void addDirection(KeyEvent e){
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = true;
			break;
		case KeyEvent.VK_UP:
			up = true;
			break;
		case KeyEvent.VK_RIGHT:
			right = true;
			break;
		case KeyEvent.VK_DOWN:
			down = true;
			break;
		}
	}
	
	// stop moving direction
	public void minusDirection(KeyEvent e){
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = false;
			break;
		case KeyEvent.VK_UP:
			up = false;
			break;
		case KeyEvent.VK_RIGHT:
			right = false;
			break;
		case KeyEvent.VK_DOWN:
			down = false;
			break;
		}
	}
	
}
