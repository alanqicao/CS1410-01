package cn.sxt.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Plane extends GameObject{
	
	int speed =4; //plane speed
	
	boolean left,up,right,down;
	
	public void drawSelf(Graphics g) {
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
	}
	public Plane(Image img, double x, double y) {
		this.img = img;
		this.x=x;
		this.y=y;
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
