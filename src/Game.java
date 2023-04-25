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
	private Button alabama;
	private Button alaska;
	private Button arizona;
	private Button arkansas;
	private Button california;
	private Button colorado;
	private Button connecticut;
	private Button delware;
	private Button florida;
	private Button georgia;
	private Button hawaii;
	private Button idaho;
	private Button illinois;
	private Button indiana;
	private Button iowa;
	private Button kansas;
	private Button kentucky;
	private Button louisiana;
	private Button maine;
	private Button maryland;
	private Button massachusetts;
	private Button michigan;
	private Button minnesota;
	private Button mississippi;
	private Button missouri;
	private Button montana;
	private Button nebraska;
	private Button nevada;
	private Button newhampshire;
	private Button newjersey;
	private Button newmexico;
	private Button newyork;
	private Button northcarolina;
	private Button northdakota;
	private Button ohio;
	private Button oklahoma;
	private Button oregon;
	private Button pennsylvania;
	private Button rhodeisland;
	private Button southcarolina;
	private Button southdakota;
	private Button tennessee;
	private Button texas;
	private Button utah;
	private Button vermont;
	private Button virginia;
	private Button washington;
	private Button westvirginia;
	private Button wisconsin;
	private Button wyoming;
	
	
	public Game() {
		back=null;
		Player p =new Player();
		//p.playmusic("ghost-whispers-6030.wav");
		new Thread(this).start();
		background = new ImageIcon("map.jpg");
		alabama = new Button(920,560, (int)(155/2), (int)(70/2), new ImageIcon("fruitbasket.png"));
		alaska = new Button(60,590, (int)(200/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		arizona = new Button(220,500, (int)(250/2), (int)(100/2), new ImageIcon("fruitbasket.png"));
		arkansas = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		california = new Button(50,420, (int)(210/2), (int)(100/2), new ImageIcon("fruitbasket.png"));
		colorado = new Button(380,390, (int)(330/2), (int)(100/2), new ImageIcon("fruitbasket.png"));
		connecticut = new Button(1275,305, (int)(160/2), (int)(15/2), new ImageIcon("fruitbasket.png"));
		delware = new Button(1215,367, (int)(150/2), (int)(25/2), new ImageIcon("fruitbasket.png"));
		florida = new Button(1080,600, (int)(200/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		georgia = new Button(1010,555, (int)(200/2), (int)(50/2), new ImageIcon("fruitbasket.png"));
		hawaii = new Button(290,660, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		idaho = new Button(220,250, (int)(200/2), (int)(100/2), new ImageIcon("fruitbasket.png"));
		illinois = new Button(820,370, (int)(170/2), (int)(50/2), new ImageIcon("fruitbasket.png"));
		indiana = new Button(910,360, (int)(120/2), (int)(50/2), new ImageIcon("fruitbasket.png"));
		iowa = new Button(710,330, (int)(200/2), (int)(50/2), new ImageIcon("fruitbasket.png"));
		kansas = new Button(550,400, (int)(320/2), (int)(130/2), new ImageIcon("fruitbasket.png"));
		kentucky = new Button(920,430, (int)(220/2), (int)(50/2), new ImageIcon("fruitbasket.png"));
		louisiana = new Button(760,620, (int)(200/2), (int)(50/2), new ImageIcon("fruitbasket.png"));
		maine = new Button(1270,150, (int)(150/2), (int)(100/2), new ImageIcon("fruitbasket.png"));
		maryland = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		massachusetts = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		michigan = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		minnesota = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		mississippi = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		missouri = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		montana = new Button(300,150, (int)(400/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		nebraska = new Button(525,320, (int)(300/2), (int)(100/2), new ImageIcon("fruitbasket.png"));
		nevada = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		newhampshire = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		newjersey = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		newmexico = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		newyork = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		northcarolina = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		northdakota = new Button(525,150, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		ohio = new Button(525,240, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		oklahoma = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		oregon = new Button(50,200, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		pennsylvania = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		rhodeisland = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		southcarolina = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		southdakota = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		tennessee = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		texas = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		utah = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		vermont = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		virginia = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		washington = new Button(100,100, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		westvirginia = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		wisconsin = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		wyoming = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
			
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
		
		drawButton(g2d, alabama);
		drawButton(g2d, alaska);
		drawButton(g2d, arizona);
		drawButton(g2d, arkansas);
		drawButton(g2d, california);
		drawButton(g2d, colorado);
		drawButton(g2d, connecticut);
		drawButton(g2d, delware);
		drawButton(g2d, florida);
		drawButton(g2d, georgia);
		drawButton(g2d, hawaii);
		drawButton(g2d, idaho);
		drawButton(g2d, illinois);
		drawButton(g2d, indiana);
		drawButton(g2d, iowa);
		drawButton(g2d, kansas);
		drawButton(g2d, kentucky);
		drawButton(g2d, louisiana);
		drawButton(g2d, maine);
		drawButton(g2d, maryland);
		drawButton(g2d, massachusetts);
		drawButton(g2d, michigan);
		drawButton(g2d, minnesota);
		drawButton(g2d, mississippi);
		drawButton(g2d, missouri);
		drawButton(g2d, montana);
		drawButton(g2d, nebraska);
		drawButton(g2d, nevada);
		drawButton(g2d, newhampshire);
		drawButton(g2d, newjersey);
		drawButton(g2d, newmexico);
		drawButton(g2d, newyork);
		drawButton(g2d, northcarolina);
		drawButton(g2d, northdakota);
		drawButton(g2d, ohio);
		drawButton(g2d, oklahoma);
		drawButton(g2d, oregon);
		drawButton(g2d, pennsylvania);
		drawButton(g2d, rhodeisland);
		drawButton(g2d, southcarolina);
		drawButton(g2d, southdakota);
		drawButton(g2d, tennessee);
		drawButton(g2d, texas);
		drawButton(g2d, utah);
		drawButton(g2d, vermont);
		drawButton(g2d, virginia);
		drawButton(g2d, washington);
		drawButton(g2d, westvirginia);
		drawButton(g2d, wisconsin);
		drawButton(g2d, wyoming);
			
		//fh.setW(5);
		if(spacebar) {
			g2d.setColor(Color.white);
			g2d.setFont( new Font("Broadway", Font.BOLD, 200));
			g2d.drawString("Boo!", 450, 400);
			

		}
				
	twoDgraph.drawImage(back, 0, 0, null);
}

	private void drawButton(Graphics g2d, Button button) {
		g2d.drawImage(button.getImg().getImage(), button.getX(), button.getY(), button.getW(), button.getH(), this);
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