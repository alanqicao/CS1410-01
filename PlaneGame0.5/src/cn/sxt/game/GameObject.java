package cn.sxt.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

/**
 * game object super class
 * 
 * @author caose_000
 *
 */
public class GameObject {
	Image img;
	double x, y;
	int speed;
	int width, height;

	public void drawSelf(Graphics g) {
		g.drawImage(img, (int) x, (int) y, null);
	}

	/**
	 * @param img
	 * @param x
	 * @param y
	 * @param speed
	 * @param width
	 * @param height
	 */
	public GameObject(Image img, double x, double y, int speed, int width, int height) {
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
	}

	/**
	 * @param img
	 * @param x
	 * @param y
	 */
	public GameObject(Image img, double x, double y) {
		this.img = img;
		this.x = x;
		this.y = y;
	}

	public GameObject() {
		
	}
	
	/**
	 * return object rectangle for latter detection impact
	 * @return
	 */
	public Rectangle getRect() {
		return new Rectangle((int)x,(int)y,width,height);
	}

}
