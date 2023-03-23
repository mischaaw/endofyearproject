import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Game extends JPanel implements Runnable, KeyListener{
	private BufferedImage back;
	private ImageIcon background;
	
	private int key; 
	private boolean spacebar;


	
	public Game() {
		back=null;
		Player p =new Player();
		//p.playmusic("ghost-whispers-6030.wav");
		new Thread(this).start();
		background = new ImageIcon("map.jpg");
	
			
			new Thread(this).start();	
			this.addKeyListener(this);
			key =-1; 
				
		spacebar=false;

			
	}
	
	private ArrayList<Box> setGs() {
		// TODO Auto-generated method stub
		ArrayList <Box> temp = new ArrayList <Box> ();
		
		
		
		return temp;

		
	}
	

	public void run() {
		try {
			while(true) {
				Thread.currentThread().sleep(5);
				repaint();
			}
		}
		catch(Exception e) {}
	}
	
	public void paint (Graphics g)
	{Graphics2D twoDgraph = (Graphics2D)g;
	if (back==null) {
		back =(BufferedImage) (createImage(getWidth(), getHeight()));
			}
	Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0, 0, getSize().width, getSize().height); 
		g2d.drawImage(background.getImage(),0,0, getWidth(),getHeight(),this);
		//drawGs(g2d);
		//need the image, x, y , height, width 
		
		//this causes it to slowly move around, the higher it goes the faster it goes 
		//if you set it as - it goes to the left
		
		
		
		//fh.setW(5);
		if(spacebar) {
			g2d.setColor(Color.white);
			g2d.setFont( new Font("Broadway", Font.BOLD, 200));
			g2d.drawString("Boo!", 450, 400);
		}
				
	twoDgraph.drawImage(back, 0, 0, null);
}


//DO NOT DELETE
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




//DO NOT DELETE
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		key= e.getKeyCode();
		System.out.println(key);
		
		if(key==32) {
			spacebar=true;
		}
		
		
		
	
	}


	//DO NOT DELETE
	@Override
	public void keyReleased(KeyEvent e) {
		
		if(key==32) {
			spacebar=false;
		}
		
		
	}
	
}
	



//photo credits: got image background from https://wall.alphacoders.com/tag/haunted-house-wallpapers
//photo credits: got ghost image from https://www.freeiconspng.com/images/ghost-png