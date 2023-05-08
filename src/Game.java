import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Game extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener{
	private BufferedImage back;
	private ImageIcon background;

	private String screenstatus = "Home";
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
		p.playmusic("canadaanthem.wav");
		new Thread(this).start();
		background = new ImageIcon("map.jpg");
		alabama = new Button(920,560, (int)(155/2), (int)(70/2), new ImageIcon(".png"));
		alaska = new Button(60,590, (int)(200/2), (int)(150/2), new ImageIcon(".png"));
		arizona = new Button(220,500, (int)(250/2), (int)(100/2), new ImageIcon(".png"));
		arkansas = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		california = new Button(50,420, (int)(210/2), (int)(100/2), new ImageIcon(".png"));
		colorado = new Button(380,390, (int)(330/2), (int)(100/2), new ImageIcon("fruitbasket.png"));
		connecticut = new Button(1275,305, (int)(160/2), (int)(15/2), new ImageIcon("fruitbasket.png"));
		delware = new Button(1215,367, (int)(150/2), (int)(25/2), new ImageIcon("fruitbasket.png"));
		florida = new Button(1080,600, (int)(200/2), (int)(150/2), new ImageIcon(".png"));
		georgia = new Button(1010,555, (int)(200/2), (int)(50/2), new ImageIcon(".png"));
		hawaii = new Button(290,660, (int)(300/2), (int)(150/2), new ImageIcon(".png"));
		idaho = new Button(220,250, (int)(200/2), (int)(100/2), new ImageIcon(".png"));
		illinois = new Button(820,370, (int)(170/2), (int)(50/2), new ImageIcon("fruitbasket.png"));
		indiana = new Button(910,360, (int)(120/2), (int)(50/2), new ImageIcon("fruitbasket.png"));
		iowa = new Button(710,330, (int)(200/2), (int)(50/2), new ImageIcon("fruitbasket.png"));
		kansas = new Button(550,400, (int)(320/2), (int)(130/2), new ImageIcon("fruitbasket.png"));
		kentucky = new Button(920,430, (int)(220/2), (int)(50/2), new ImageIcon("fruitbasket.png"));
		louisiana = new Button(760,620, (int)(200/2), (int)(50/2), new ImageIcon(".png"));
		maine = new Button(1270,150, (int)(150/2), (int)(100/2), new ImageIcon("fruitbasket.png"));
		maryland = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		massachusetts = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		michigan = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		minnesota = new Button(400,400, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		mississippi = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		missouri = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		montana = new Button(300,150, (int)(400/2), (int)(150/2), new ImageIcon(".png"));
		nebraska = new Button(525,320, (int)(300/2), (int)(100/2), new ImageIcon(".png"));
		nevada = new Button(130,320, (int)(250/2), (int)(100/2), new ImageIcon(".png"));
		newhampshire = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		newjersey = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		newmexico = new Button(400,550, (int)(300/2), (int)(150/2), new ImageIcon("alaska.jpgj"));
		newyork = new Button(350,450, (int)(300/2), (int)(250/2), new ImageIcon("fruitbasket.png"));
		northcarolina = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		northdakota = new Button(525,150, (int)(300/2), (int)(150/2), new ImageIcon(".png"));
		ohio = new Button(525,240, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		oklahoma = new Button(590,475, (int)(300/2), (int)(100/2), new ImageIcon("fruitbasket.png"));
		oregon = new Button(50,200, (int)(300/2), (int)(150/2), new ImageIcon(".png"));
		pennsylvania = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		rhodeisland = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		southcarolina = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		southdakota = new Button(500,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		tennessee = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		texas = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		utah = new Button(250,370, (int)(250/2), (int)(100/2), new ImageIcon(".png"));
		vermont = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		virginia = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		washington = new Button(100,100, (int)(300/2), (int)(150/2), new ImageIcon(".png"));
		westvirginia = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		wisconsin = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon("fruitbasket.png"));
		wyoming = new Button(350,260, (int)(300/2), (int)(150/2), new ImageIcon(".png"));
			
			new Thread(this).start();	
			this.addKeyListener(this);
			this.addMouseListener(this);
			this.addMouseMotionListener(this);
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
		//g2d.drawImage(background.getImage(),0,0, getWidth(),getHeight(),this);
		//drawGs(g2d);
		//need the image, x, y , height, width 
		
		//this causes it to slowly move around, the higher it goes the faster it goes 
		//if you set it as - it goes to the left
		if(screenstatus.equals("Home")) {
			
			g2d.drawImage(background.getImage(),0,0, getWidth(),getHeight(),this);
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
		} else if(screenstatus.equals("California")){
			g2d.setColor(Color.BLACK);
			g2d.drawImage(new ImageIcon ("california.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
			g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
			g2d.drawString("California",  475, 100);
			g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
			g2d.drawString("Capital: Sacramento",  30, 175);
			g2d.drawString("Abbreviation: CA",  30, 275);
			g2d.drawString("Population: ~39.24 million",  30, 375);
			g2d.drawString("Biggest City: Los Angeles",  30, 475);
			g2d.drawString("State Bird: California Valley Quail",  30, 575);
			g2d.drawString("State Flower: California Poppy",  30, 675);
			System.out.println("you pressed California");
		} else if(screenstatus.equals("Washington")) {
			//g2d.clearRect(0, 0, getSize().width, getSize().height);
			g2d.setColor(Color.BLACK);
			g2d.drawImage(new ImageIcon ("washington.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
			g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
			g2d.drawString("Washington",  450, 100);
			g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
			g2d.drawString("Capital: Olympia",  30, 175);
			g2d.drawString("Abbreviation: WA",  30, 275);
			g2d.drawString("Population: ~7.74 million",  30, 375);
			g2d.drawString("Biggest City: Seattle",  30, 475);
			g2d.drawString("State Flower: Coast Rhododendron",  30, 575);
			g2d.drawString("State Bird: Goldfinch",  30, 675);
			System.out.println("you pressed Washington");
	} else if(screenstatus.equals("Nevada")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("nevada.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Nevada",  550, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Carson City",  30, 175);
		g2d.drawString("Abbreviation: NV",  30, 275);
		g2d.drawString("Population: ~3.41 million",  30, 375);
		g2d.drawString("Biggest City: Duckwater",  30, 475);
		g2d.drawString("State Flower: Big Sagebrush",  30, 575);
		g2d.drawString("State Bird: Mountain Bluebird",  30, 675);
		System.out.println("you pressed Nevada");
	} else if(screenstatus.equals("Arizona")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("arizona.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Arizona",  550, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Phoenix",  30, 175);
		g2d.drawString("Abbreviation: AZ",  30, 275);
		g2d.drawString("Population: ~7.27 million",  30, 375);
		g2d.drawString("Biggest City: Phoenix",  30, 475);
		g2d.drawString("State Flower: Saguaro",  30, 575);
		g2d.drawString("State Bird: Cactus Wren",  30, 675);
		System.out.println("you pressed Arizona");
	} else if(screenstatus.equals("Idaho")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("idaho.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Idaho",  550, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Boise",  30, 175);
		g2d.drawString("Abbreviation: ID",  30, 275);
		g2d.drawString("Population: ~1.91 million",  30, 375);
		g2d.drawString("Biggest City: Boise",  30, 475);
		g2d.drawString("State Flower: Syringa",  30, 575);
		g2d.drawString("State Bird: The Mountain Bluebird",  30, 675);
		System.out.println("you pressed Idaho");
	} else if(screenstatus.equals("Oregon")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("oregon.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Oregon",  550, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Salem",  30, 175);
		g2d.drawString("Abbreviation: OR",  30, 275);
		g2d.drawString("Population: ~4.25 million",  30, 375);
		g2d.drawString("Biggest City: Portland",  30, 475);
		g2d.drawString("State Flower: Oregon Grape",  30, 575);
		g2d.drawString("State Bird: Western Meadowlark",  30, 675);
		System.out.println("you pressed Oregon");
		//the south dakota button is not actually south dakota
	} else if(screenstatus.equals("South Dakota")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("southdakota.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("South Dakota",  450, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Pierre",  30, 175);
		g2d.drawString("Abbreviation: SD",  30, 275);
		g2d.drawString("Population: ~900,000",  30, 375);
		g2d.drawString("Biggest City: Sioux Falls",  30, 475);
		g2d.drawString("State Flower: American Pasque",  30, 575);
		g2d.drawString("State Bird: Ring-necked Pheasant",  30, 675);
		System.out.println("you pressed South Dakota");
	} else if(screenstatus.equals("Alaska")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("alaska.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Alaska",  550, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Juneau",  30, 175);
		g2d.drawString("Abbreviation: AK",  30, 275);
		g2d.drawString("Population: ~730,000",  30, 375);
		g2d.drawString("Biggest City: Anchorage",  30, 475);
		g2d.drawString("State Flower: The Alpine Forget-Me-Not",  30, 575);
		g2d.drawString("State Bird: Willow Ptarmigan",  30, 675);
		System.out.println("you pressed Alaska");
	} else if(screenstatus.equals("Hawaii")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("hawaii.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Hawaii",  550, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Honolulu",  30, 175);
		g2d.drawString("Abbreviation: HI",  30, 275);
		g2d.drawString("Population: ~1.45 million",  30, 375);
		g2d.drawString("Biggest City: Honolulu",  30, 475);
		g2d.drawString("State Flower: Yellow Hibiscus",  30, 575);
		g2d.drawString("State Bird: Nene",  30, 675);
		System.out.println("you pressed Hawaii");
	} else if(screenstatus.equals("Montana")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("montana.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Montana",  550, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Helena",  30, 175);
		g2d.drawString("Abbreviation: MT",  30, 275);
		g2d.drawString("Population: ~1.10 million",  30, 375);
		g2d.drawString("Biggest City: Billings",  30, 475);
		g2d.drawString("State Flower: Bitterroot",  30, 575);
		g2d.drawString("State Bird: Western Meadowlark",  30, 675);
		System.out.println("you pressed Montana");
	} else if(screenstatus.equals("Utah")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("utah.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Utah",  600, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Salt Lake City",  30, 175);
		g2d.drawString("Abbreviation: UT",  30, 275);
		g2d.drawString("Population: ~3.34 million",  30, 375);
		g2d.drawString("Biggest City: Salt Lake City",  30, 475);
		g2d.drawString("State Flower: Sego Lily",  30, 575);
		g2d.drawString("State Bird: The Seagull",  30, 675);
		System.out.println("you pressed Utah");
	} else if(screenstatus.equals("Wyoming")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("wyoming.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Wyoming",  530, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Cheyenne",  30, 175);
		g2d.drawString("Abbreviation: WY",  30, 275);
		g2d.drawString("Population: ~600,000",  30, 375);
		g2d.drawString("Biggest City: Salt Lake City",  30, 475);
		g2d.drawString("State Flower: Indian Paintbrush",  30, 575);
		g2d.drawString("State Bird: Western Meadowlark",  30, 675);
		System.out.println("you pressed Wyoming");
		//this is not the new mexico button!!! change this asap
	} else if(screenstatus.equals("New Mexico")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("newmexico.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("New Mexico",  530, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Santa Fe",  30, 175);
		g2d.drawString("Abbreviation: NM",  30, 275);
		g2d.drawString("Population: ~2.12 million",  30, 375);
		g2d.drawString("Biggest City: Albuquerque",  30, 475);
		g2d.drawString("State Flower: Yucca Flower",  30, 575);
		g2d.drawString("State Bird: Greater Roadrunner",  30, 675);
		System.out.println("you pressed New Mexico");
	} else if(screenstatus.equals("North Dakota")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("northdakota.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("North Dakota",  475, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Bismarck",  30, 175);
		g2d.drawString("Abbreviation: ND",  30, 275);
		g2d.drawString("Population: ~775,000",  30, 375);
		g2d.drawString("Biggest City: Fargo",  30, 475);
		g2d.drawString("State Flower: Prairie Rose",  30, 575);
		g2d.drawString("State Bird: Western Meadowlark",  30, 675);
		System.out.println("you pressed North Dakota");
	} else if(screenstatus.equals("Nebraska")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("nebraska.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Nebraska",  475, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Lincoln",  30, 175);
		g2d.drawString("Abbreviation: NE",  30, 275);
		g2d.drawString("Population: ~2 million",  30, 375);
		g2d.drawString("Biggest City: Omaha",  30, 475);
		g2d.drawString("State Flower: Solidago",  30, 575);
		g2d.drawString("State Bird: Western Meadowlark",  30, 675);
		System.out.println("you pressed Nebraska");
	} else if(screenstatus.equals("Louisiana")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("louisiana.png").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Louisiana",  475, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Baton Rouge",  30, 175);
		g2d.drawString("Abbreviation: LA",  30, 275);
		g2d.drawString("Population: ~4.6 million",  30, 375);
		g2d.drawString("Biggest City: New Orleans",  30, 475);
		g2d.drawString("State Flower: Magnolia",  30, 575);
		g2d.drawString("State Bird: Brown Pelican",  30, 675);
		System.out.println("you pressed Louisiana");
	} else if(screenstatus.equals("Florida")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("florida.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Florida",  550, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Tallahassee",  30, 175);
		g2d.drawString("Abbreviation: FL",  30, 275);
		g2d.drawString("Population: ~22 million",  30, 375);
		g2d.drawString("Biggest City: Jacksonville",  30, 475);
		g2d.drawString("State Flower: Orange Blossom",  30, 575);
		g2d.drawString("State Bird: Northern Mockingbird",  30, 675);
		System.out.println("you pressed Florida");
	} else if(screenstatus.equals("Alabama")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("alabama.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Alabama",  550, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Montgomery",  30, 175);
		g2d.drawString("Abbreviation: AL",  30, 275);
		g2d.drawString("Population: ~5 million",  30, 375);
		g2d.drawString("Biggest City: Birmingham",  30, 475);
		g2d.drawString("State Flower: Camellia",  30, 575);
		g2d.drawString("State Bird: Northern Flicker",  30, 675);
		System.out.println("you pressed Alabama");
	} else if(screenstatus.equals("Georgia")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("georgia.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Georgia",  550, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Atlanta",  30, 175);
		g2d.drawString("Abbreviation: GA",  30, 275);
		g2d.drawString("Population: ~10.8 million",  30, 375);
		g2d.drawString("Biggest City: Atlanta",  30, 475);
		g2d.drawString("State Flower: Rosa Laevigata",  30, 575);
		g2d.drawString("State Bird: Brown Thrasher",  30, 675);
		System.out.println("you pressed Georgia");
		
		
		//fh.setW(5);
		if(spacebar) {
			g2d.setColor(Color.white);
			g2d.setFont( new Font("Broadway", Font.BOLD, 200));
			g2d.drawString("Boo!", 450, 400);
			

		}
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
		if(key==72) {
			if(!screenstatus.equals("Home")) {
			screenstatus.equals("Home");
			}
		}
		
		
		
	
	}


	//DO NOT DELETE
	@Override
	public void keyReleased(KeyEvent e) {
		
		if(key==32) {
			spacebar=false;
		}
		
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Lol this mean the mouse works ig?");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(california.hover(e.getX(), e.getY())) {
			screenstatus = "California";
			System.out.println("you clicked California");
		}
		if(washington.hover(e.getX(), e.getY())) {
			screenstatus = "Washington";
		}
		if(nevada.hover(e.getX(), e.getY())) {
			screenstatus = "Nevada";
		}
		if(arizona.hover(e.getX(), e.getY())) {
			screenstatus = "Arizona";
		}
		if(idaho.hover(e.getX(), e.getY())) {
			screenstatus = "Idaho";
		}
		if(oregon.hover(e.getX(), e.getY())) {
			screenstatus = "Oregon";
		}
		if(southdakota.hover(e.getX(), e.getY())) {
			screenstatus = "South Dakota";
		}
		if(alaska.hover(e.getX(), e.getY())) {
			screenstatus = "Alaska";
		}
		if(hawaii.hover(e.getX(), e.getY())) {
			screenstatus = "Hawaii";
		}
		if(montana.hover(e.getX(), e.getY())) {
			screenstatus = "Montana";
		}
		if(utah.hover(e.getX(), e.getY())) {
			screenstatus = "Utah";
		}
		if(wyoming.hover(e.getX(), e.getY())) {
			screenstatus = "Wyoming";
		}
		if(newmexico.hover(e.getX(), e.getY())) {
			screenstatus = "New Mexico";
		}
		if(northdakota.hover(e.getX(), e.getY())) {
			screenstatus = "North Dakota";
		}
		if(nebraska.hover(e.getX(), e.getY())) {
			screenstatus = "Nebraska";
		}
		if(louisiana.hover(e.getX(), e.getY())) {
			screenstatus = "Louisiana";
		}
		if(florida.hover(e.getX(), e.getY())) {
			screenstatus = "Florida";
		}
		if(alabama.hover(e.getX(), e.getY())) {
			screenstatus = "Alabama";
		}
		if(georgia.hover(e.getX(), e.getY())) {
			screenstatus = "Georgia";
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}
