package plane.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

/**
 * Plane game Frame
 * 
 * @author Qi Cao
 *
 */
public class MyGameFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;// remove some warning 
	
	Image planeImg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");

	Plane plane = new Plane(planeImg, 250, 250);

	Shell[] shells = new Shell[50];

	Explode explosion;
	// set time
	Date startTime = new Date();
	Date endTime;
	int period;// time played
	boolean restar = false;

	@Override
	public void paint(Graphics g) { // auto run. g = a pan
		Color c = g.getColor();
		g.drawImage(bg, 0, 0, null);// draw back ground image
		plane.drawSelf(g); // draw the plane

		// draw all the 50 Shell
		for (int i = 0; i < shells.length; i++) {
			shells[i].draw(g);// draw shell

			// determine if shells touching the plane
			boolean touch = shells[i].getRect().intersects(plane.getRect());
			// if touching what to do
			if (touch) {
				plane.live = false;
				if (explosion == null) { // this private everytime when it touch it recreate a explosion,now it only
											// create one
					explosion = new Explode(plane.x, plane.y);

					endTime = new Date();// create end time
					// calculate begaining time - endtime = played time. becasue it is in
					// millisecond need to /1000
					period = (int) ((endTime.getTime() - startTime.getTime()) / 1000);
				}

				explosion.draw(g);
			}		
			// Time show up on the window
			if (!plane.live) {
				g.setColor(Color.WHITE);
				Font f = new Font("Serif", Font.BOLD, 50);
				g.setFont(f);
				g.drawString("Time: " + period + " second", 100, 200);
				Font f2 = new Font("Serif", Font.BOLD, 30);
				g.setFont(f2);
				g.drawString("Press Enter to restart", 125, 300);
				
			}

		}
		g.setColor(c);
	}

	// help us to reDraw the window
	class PaintThread extends Thread {
		@Override
		public void run() {
			while (true) {
				repaint(); // repaint window
				try {
					Thread.sleep(40);// fps 1s=1000ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// defind key monitor override method
	class KeyMonitor extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
			if(e.getKeyCode()==KeyEvent.VK_ENTER){
				main(null);
				
			}
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
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		this.setLocation(300, 300); // left up corner is 0,0

		// exit the window
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new PaintThread().start();// active repaint window
		addKeyListener(new KeyMonitor());// give window add keyboard monitor
		// generate 50 Shell
		for (int i = 0; i < shells.length; i++) {
			shells[i] = new Shell();
		}
	}

	public static void main(String[] args) {
		
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	
		
	}

	// fix flicker for Frame
	private Image offScreenImage = null;

	public void update(Graphics g) {
		if (offScreenImage == null)
			offScreenImage = this.createImage(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);// width and height

		Graphics gOff = offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}
}
