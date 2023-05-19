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
	private Button delaware;
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
		background = new ImageIcon("usofa.png");
		alabama = new Button(920,560, (int)(155/2), (int)(70/2), new ImageIcon(".png"));
		alaska = new Button(60,590, (int)(200/2), (int)(150/2), new ImageIcon(".png"));
		arizona = new Button(220,500, (int)(250/2), (int)(100/2), new ImageIcon(".png"));
		arkansas = new Button(740,500, (int)(200/2), (int)(100/2), new ImageIcon(".png"));
		california = new Button(50,420, (int)(210/2), (int)(100/2), new ImageIcon(".png"));
		colorado = new Button(380,390, (int)(330/2), (int)(100/2), new ImageIcon(".png"));
		connecticut = new Button(1275,305, (int)(160/2), (int)(15/2), new ImageIcon(".png"));
		delaware = new Button(1215,367, (int)(150/2), (int)(25/2), new ImageIcon(".png"));
		florida = new Button(1080,600, (int)(200/2), (int)(150/2), new ImageIcon(".png"));
		georgia = new Button(1010,555, (int)(200/2), (int)(50/2), new ImageIcon(".png"));
		hawaii = new Button(290,660, (int)(300/2), (int)(150/2), new ImageIcon(".png"));
		idaho = new Button(220,250, (int)(200/2), (int)(100/2), new ImageIcon(".png"));
		illinois = new Button(820,370, (int)(170/2), (int)(50/2), new ImageIcon(".png"));
		indiana = new Button(910,360, (int)(120/2), (int)(50/2), new ImageIcon(".png"));
		iowa = new Button(710,330, (int)(200/2), (int)(50/2), new ImageIcon(".png"));
		kansas = new Button(550,400, (int)(320/2), (int)(130/2), new ImageIcon(".png"));
		kentucky = new Button(920,430, (int)(220/2), (int)(50/2), new ImageIcon(".png"));
		louisiana = new Button(760,620, (int)(200/2), (int)(50/2), new ImageIcon(".png"));
		maine = new Button(1270,150, (int)(150/2), (int)(100/2), new ImageIcon(".png"));
		maryland = new Button(1220,385, (int)(150/2), (int)(25/2), new ImageIcon(".png"));
		massachusetts = new Button(1230,270, (int)(150/2), (int)(15/2), new ImageIcon(".png"));
		michigan = new Button(910,300, (int)(200/2), (int)(50/2), new ImageIcon(".png"));
		minnesota = new Button(680,190, (int)(200/2), (int)(100/2), new ImageIcon(".png"));
		mississippi = new Button(835,530, (int)(155/2), (int)(70/2), new ImageIcon(".png"));
		missouri = new Button(740,435, (int)(200/2), (int)(50/2), new ImageIcon(".png"));
		montana = new Button(300,150, (int)(400/2), (int)(150/2), new ImageIcon(".png"));
		nebraska = new Button(525,320, (int)(300/2), (int)(100/2), new ImageIcon(".png"));
		nevada = new Button(130,320, (int)(250/2), (int)(100/2), new ImageIcon(".png"));
		newhampshire = new Button(1250,240, (int)(60/2), (int)(50/2), new ImageIcon(".png"));
		newjersey = new Button(1230,340, (int)(100/2), (int)(50/2), new ImageIcon(".png"));
		newmexico = new Button(360,500, (int)(300/2), (int)(150/2), new ImageIcon(".jpg"));
		newyork = new Button(1130,250, (int)(200/2), (int)(100/2), new ImageIcon(".png"));
		southcarolina = new Button(1050,500, (int)(200/2), (int)(50/2), new ImageIcon(".png"));
		northdakota = new Button(525,150, (int)(300/2), (int)(150/2), new ImageIcon(".png"));
		ohio = new Button(990,355, (int)(150/2), (int)(50/2), new ImageIcon(".png"));
		oklahoma = new Button(590,475, (int)(300/2), (int)(100/2), new ImageIcon(".png"));
		oregon = new Button(50,200, (int)(300/2), (int)(150/2), new ImageIcon(".png"));
		pennsylvania = new Button(1080,320, (int)(250/2), (int)(50/2), new ImageIcon(".png"));
		rhodeisland = new Button(1280,290, (int)(180/2), (int)(25/2), new ImageIcon(".png"));
		northcarolina = new Button(1080,450, (int)(250/2), (int)(100/2), new ImageIcon(".png"));
		southdakota = new Button(525,240, (int)(300/2), (int)(150/2), new ImageIcon(".png"));
		tennessee = new Button(880,475, (int)(250/2), (int)(50/2), new ImageIcon(".png"));
		texas = new Button(550,550, (int)(300/2), (int)(150/2), new ImageIcon(".png"));
		utah = new Button(250,370, (int)(250/2), (int)(100/2), new ImageIcon(".png"));
		vermont = new Button(1210,220, (int)(80/2), (int)(25/2), new ImageIcon(".png"));
		virginia = new Button(1115,410, (int)(150/2), (int)(50/2), new ImageIcon(".png"));
		washington = new Button(100,100, (int)(300/2), (int)(150/2), new ImageIcon(".png"));
		westvirginia = new Button(1050,390, (int)(100/2), (int)(80/2), new ImageIcon(".png"));
		wisconsin = new Button(780,250, (int)(200/2), (int)(50/2), new ImageIcon(".png"));
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
			drawButton(g2d, delaware);
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
		g2d.setColor(Color.WHITE);
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
		g2d.setColor(Color.WHITE);
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
		g2d.setColor(Color.WHITE);
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
	} else if(screenstatus.equals("Delaware")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("delaware.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Delaware",  550, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Dover",  30, 175);
		g2d.drawString("Abbreviation: DE",  30, 275);
		g2d.drawString("Population: ~1 million",  30, 375);
		g2d.drawString("Biggest City: Wilmington",  30, 475);
		g2d.drawString("State Flower: Peach Blossom",  30, 575);
		g2d.drawString("State Bird: Delaware Blue Hen",  30, 675);
		System.out.println("you pressed Delaware");
	} else if(screenstatus.equals("Connecticut")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("connecticut.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Connecticut",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Hartford",  30, 175);
		g2d.drawString("Abbreviation: CT",  30, 275);
		g2d.drawString("Population: ~3.6 million",  30, 375);
		g2d.drawString("Biggest City: Bridgeport",  30, 475);
		g2d.drawString("State Flower: Mountain-laurel",  30, 575);
		g2d.drawString("State Bird: American Robin",  30, 675);
		System.out.println("you pressed Connecticut");
	} else if(screenstatus.equals("Arkansas")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("arkansas.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Arkansas",  500, 100);
		g2d.setColor(Color.WHITE);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Little Rock",  30, 175);
		g2d.drawString("Abbreviation: AR",  30, 275);
		g2d.drawString("Population: ~3 million",  30, 375);
		g2d.drawString("Biggest City: Little Rock",  30, 475);
		g2d.drawString("State Flower: Apple Blossom",  30, 575);
		g2d.drawString("State Bird: Northern Mockingbird",  30, 675);
		System.out.println("you pressed Arkansas");
	} else if(screenstatus.equals("Colorado")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("colorado.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Colorado",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Denver",  30, 175);
		g2d.drawString("Abbreviation: CO",  30, 275);
		g2d.drawString("Population: ~5.8 million",  30, 375);
		g2d.drawString("Biggest City: Denver",  30, 475);
		g2d.drawString("State Flower: Colorado Blue Columbine",  30, 575);
		g2d.drawString("State Bird: Lark Bunting",  30, 675);
		System.out.println("you pressed Colorado");
	} else if(screenstatus.equals("Illinois")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("illinois.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Illinois",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Springfield",  30, 175);
		g2d.drawString("Abbreviation: IL",  30, 275);
		g2d.drawString("Population: ~12.8 million",  30, 375);
		g2d.drawString("Biggest City: Chicago",  30, 475);
		g2d.drawString("State Flower: Common Blue Violet",  30, 575);
		g2d.drawString("State Bird: Northern Cardinal",  30, 675);
		System.out.println("you pressed Illinois");
	} else if(screenstatus.equals("Indiana")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("indiana.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Indiana",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Indianapolis",  30, 175);
		g2d.drawString("Abbreviation: IN",  30, 275);
		g2d.drawString("Population: ~6.8 million",  30, 375);
		g2d.drawString("Biggest City: Indianapolis",  30, 475);
		g2d.drawString("State Flower: Peony",  30, 575);
		g2d.drawString("State Bird: Northern Cardinal",  30, 675);
		System.out.println("you pressed Indiana");
	} else if(screenstatus.equals("Maine")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("maine.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Maine",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Augusta",  30, 175);
		g2d.drawString("Abbreviation: ME",  30, 275);
		g2d.drawString("Population: ~1.4 million",  30, 375);
		g2d.drawString("Biggest City: Portland",  30, 475);
		g2d.drawString("State Flower: White Pine Cone",  30, 575);
		g2d.drawString("State Bird: Chickadee",  30, 675);
		System.out.println("you pressed Maine");
	} else if(screenstatus.equals("Kentucky")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("kentucky.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Kentucky",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Frankfort",  30, 175);
		g2d.drawString("Abbreviation: KY",  30, 275);
		g2d.drawString("Population: ~4.5 million",  30, 375);
		g2d.drawString("Biggest City: Louisville",  30, 475);
		g2d.drawString("State Flower: Giant Goldenrod",  30, 575);
		g2d.drawString("State Bird: Northern Cardinal",  30, 675);
		System.out.println("you pressed Kentucky");
	} else if(screenstatus.equals("Oklahoma")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("oklahoma.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Oklahoma",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Oklahoma City",  30, 175);
		g2d.drawString("Abbreviation: OK",  30, 275);
		g2d.drawString("Population: ~3.9 million",  30, 375);
		g2d.drawString("Biggest City: Oklahoma City",  30, 475);
		g2d.drawString("State Flower: Rosa 'Oklahoma'",  30, 575);
		g2d.drawString("State Bird: Scissor-tailed Flycatcher",  30, 675);
		System.out.println("you pressed Oklahoma");
	} else if(screenstatus.equals("Kansas")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("kansas.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Kansas",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Topeka",  30, 175);
		g2d.drawString("Abbreviation: KS",  30, 275);
		g2d.drawString("Population: ~2.9 million",  30, 375);
		g2d.drawString("Biggest City: Wichita",  30, 475);
		g2d.drawString("State Flower: Wild Sunflower",  30, 575);
		g2d.drawString("State Bird: Western Meadowlark",  30, 675);
		System.out.println("you pressed Kansas");
	} else if(screenstatus.equals("Ohio")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("ohio.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Ohio",  550, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Columbus",  30, 175);
		g2d.drawString("Abbreviation: OH",  30, 275);
		g2d.drawString("Population: ~11.8 million",  30, 375);
		g2d.drawString("Biggest City: Columbus",  30, 475);
		g2d.drawString("State Flower: Carnation",  30, 575);
		g2d.drawString("State Bird: Cardinal",  30, 675);
		System.out.println("you pressed Ohio");
	} else if(screenstatus.equals("Iowa")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("iowa.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Iowa",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Des Moines",  30, 175);
		g2d.drawString("Abbreviation: IA",  30, 275);
		g2d.drawString("Population: ~3.2 million",  30, 375);
		g2d.drawString("Biggest City: Des Moines",  30, 475);
		g2d.drawString("State Flower: Prairie Rose",  30, 575);
		g2d.drawString("State Bird: American Goldfinch",  30, 675);
		System.out.println("you pressed Iowa");
	} else if(screenstatus.equals("Maryland")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("maryland.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Maryland",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Baltimore",  30, 175);
		g2d.drawString("Abbreviation: MD",  30, 275);
		g2d.drawString("Population: ~6.2 million",  30, 375);
		g2d.drawString("Biggest City: Baltimore",  30, 475);
		g2d.drawString("State Flower: Black-Eyed Susan",  30, 575);
		g2d.drawString("State Bird: Baltimore Oriole",  30, 675);
		System.out.println("you pressed Maryland");
	} else if(screenstatus.equals("Rhode Island")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("rhodeisland.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Rhode Island",  450, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Providence",  30, 175);
		g2d.drawString("Abbreviation: RI",  30, 275);
		g2d.drawString("Population: ~1 million",  30, 375);
		g2d.drawString("Biggest City: Providence",  30, 475);
		g2d.drawString("State Flower: Common Blue Violet",  30, 575);
		g2d.drawString("State Bird: Rhode Island Red",  30, 675);
		System.out.println("you pressed Rhode Island");
	} else if(screenstatus.equals("Vermont")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("vermont.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Vermont",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Montpelier",  30, 175);
		g2d.drawString("Abbreviation: VT",  30, 275);
		g2d.drawString("Population: ~650,000",  30, 375);
		g2d.drawString("Biggest City: Burlington",  30, 475);
		g2d.drawString("State Flower: Red Clover",  30, 575);
		g2d.drawString("State Bird: Hermit Thrush",  30, 675);
		System.out.println("you pressed Vermont");
	} else if(screenstatus.equals("New York")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("newyork.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("New York",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Albany",  30, 175);
		g2d.drawString("Abbreviation: NY",  30, 275);
		g2d.drawString("Population: ~8.5 million",  30, 375);
		g2d.drawString("Biggest City: New York City",  30, 475);
		g2d.drawString("State Flower: Rose",  30, 575);
		g2d.drawString("State Bird: Eastern Bluebird",  30, 675);
		System.out.println("you pressed New York");
	} else if(screenstatus.equals("Texas")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("texas.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Texas",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Austin",  30, 175);
		g2d.drawString("Abbreviation: TX",  30, 275);
		g2d.drawString("Population: ~29.5 million",  30, 375);
		g2d.drawString("Biggest City: Houston",  30, 475);
		g2d.drawString("State Flower: Bluebonnet",  30, 575);
		g2d.drawString("State Bird: Mockingbird",  30, 675);
		System.out.println("you pressed Texas");
	} else if(screenstatus.equals("South Carolina")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.drawImage(new ImageIcon ("southcarolina.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("South Carolina",  400, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Columbia",  30, 175);
		g2d.drawString("Abbreviation: SC",  30, 275);
		g2d.drawString("Population: ~5.2 million",  30, 375);
		g2d.drawString("Biggest City: Charleston",  30, 475);
		g2d.drawString("State Flower: Yellow Jessamine",  30, 575);
		g2d.drawString("State Bird: Carolina Wren",  30, 675);
		System.out.println("you pressed South Carolina");
	} else if(screenstatus.equals("North Carolina")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("northcarolina.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("North Carolina",  400, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Raleigh",  30, 175);
		g2d.drawString("Abbreviation: NC",  30, 275);
		g2d.drawString("Population: ~10.5 million",  30, 375);
		g2d.drawString("Biggest City: Charlotte",  30, 475);
		g2d.drawString("State Flower: Flowering Dogwood",  30, 575);
		g2d.drawString("State Bird: Northern Cardinal",  30, 675);
		System.out.println("you pressed North Carolina");
	} else if(screenstatus.equals("Michigan")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("michigan.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Michigan",  450, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Lansing",  30, 175);
		g2d.drawString("Abbreviation: MI",  30, 275);
		g2d.drawString("Population: ~10 million",  30, 375);
		g2d.drawString("Biggest City: Detroit",  30, 475);
		g2d.drawString("State Flower: Apple Blossom",  30, 575);
		g2d.drawString("State Bird: American Robin",  30, 675);
		System.out.println("you pressed Michigan");
	} else if(screenstatus.equals("New Hampshire")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("newhampshire.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("New Hampshire",  400, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Concord",  30, 175);
		g2d.drawString("Abbreviation: NH",  30, 275);
		g2d.drawString("Population: ~1.4 million",  30, 375);
		g2d.drawString("Biggest City: Manchester City",  30, 475);
		g2d.drawString("State Flower: Purple Lilac",  30, 575);
		g2d.drawString("State Bird: Purple Finch",  30, 675);
		System.out.println("you pressed New Hampshire");
	} else if(screenstatus.equals("Missouri")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("missouri.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Missouri",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Jefferson City",  30, 175);
		g2d.drawString("Abbreviation: MO",  30, 275);
		g2d.drawString("Population: ~6.1 million",  30, 375);
		g2d.drawString("Biggest City: Kansas City",  30, 475);
		g2d.drawString("State Flower: Crataegus Punctata",  30, 575);
		g2d.drawString("State Bird: Eastern Bluebird",  30, 675);
		System.out.println("you pressed Missouri");
	} else if(screenstatus.equals("Massachusetts")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("massachusetts.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Massachusetts",  450, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Boston",  30, 175);
		g2d.drawString("Abbreviation: MA",  30, 275);
		g2d.drawString("Population: ~7 million",  30, 375);
		g2d.drawString("Biggest City: Boston",  30, 475);
		g2d.drawString("State Flower: Mayflower",  30, 575);
		g2d.drawString("State Bird: Black-capped Chickadee",  30, 675);
		System.out.println("you pressed Massachusetts");
	} else if(screenstatus.equals("Wisconsin")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("wisconsin.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Wisconsin",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Madison",  30, 175);
		g2d.drawString("Abbreviation: WI",  30, 275);
		g2d.drawString("Population: ~5.8 million",  30, 375);
		g2d.drawString("Biggest City: Milwaukee",  30, 475);
		g2d.drawString("State Flower: Common Blue Violet",  30, 575);
		g2d.drawString("State Bird: Robin",  30, 675);
		System.out.println("you pressed Wisconsin");
	} else if(screenstatus.equals("Minnesota")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("minnesota.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Minnesota",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Saint Paul",  30, 175);
		g2d.drawString("Abbreviation: MN",  30, 275);
		g2d.drawString("Population: ~5.7 million",  30, 375);
		g2d.drawString("Biggest City: Minneapolis",  30, 475);
		g2d.drawString("State Flower: Showy Lady's Slippers",  30, 575);
		g2d.drawString("State Bird: Loon",  30, 675);
		System.out.println("you pressed Minnesota");
	} else if(screenstatus.equals("Mississippi")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("mississippi.png").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Mississippi",  400, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Jackson",  30, 175);
		g2d.drawString("Abbreviation: MS",  30, 275);
		g2d.drawString("Population: ~3 million",  30, 375);
		g2d.drawString("Biggest City: Jackson",  30, 475);
		g2d.drawString("State Flower: Magnolia",  30, 575);
		g2d.drawString("State Bird: Northern Mockingbird",  30, 675);
		System.out.println("you pressed Mississippi");
	} else if(screenstatus.equals("Virginia")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("virginia.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Virginia",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Richmond",  30, 175);
		g2d.drawString("Abbreviation: VA",  30, 275);
		g2d.drawString("Population: ~8.6 million",  30, 375);
		g2d.drawString("Biggest City: Virginia Beach",  30, 475);
		g2d.drawString("State Flower: Flowering Dogwood",  30, 575);
		g2d.drawString("State Bird: Northern Cardinal",  30, 675);
		System.out.println("you pressed Virginia");
	} else if(screenstatus.equals("West Virginia")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("westvirginia.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("West Virginia",  400, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Charleston",  30, 175);
		g2d.drawString("Abbreviation: WV",  30, 275);
		g2d.drawString("Population: ~1.8 million",  30, 375);
		g2d.drawString("Biggest City: Charleston",  30, 475);
		g2d.drawString("State Flower: Rhododendron",  30, 575);
		g2d.drawString("State Bird: Cardinal",  30, 675);
		System.out.println("you pressed West Virginia");
	} else if(screenstatus.equals("New Jersey")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("newjersey.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("New Jersey",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Trenton",  30, 175);
		g2d.drawString("Abbreviation: NJ",  30, 275);
		g2d.drawString("Population: ~9.3 million",  30, 375);
		g2d.drawString("Biggest City: Newark",  30, 475);
		g2d.drawString("State Flower: Common Blue Violet",  30, 575);
		g2d.drawString("State Bird: American Goldfinch",  30, 675);
		System.out.println("you pressed New Jersey");
	} else if(screenstatus.equals("Tennessee")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("tennessee.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Tennessee",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Nashville",  30, 175);
		g2d.drawString("Abbreviation: TN",  30, 275);
		g2d.drawString("Population: ~7 million",  30, 375);
		g2d.drawString("Biggest City: Nashville",  30, 475);
		g2d.drawString("State Flower: Irises",  30, 575);
		g2d.drawString("State Bird: Northern Mockingbird",  30, 675);
		System.out.println("you pressed Tennessee");
	} else if(screenstatus.equals("Pennsylvania")) {
		//g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);
		g2d.drawImage(new ImageIcon ("pennsylvania.jpg").getImage(), 0,0, getWidth(), getHeight(), this);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 100));
		g2d.drawString("Pennsylvania",  500, 100);
		g2d.setFont(new Font ("Times New Roman", Font.BOLD, 60));
		g2d.drawString("Capital: Harrisburg",  30, 175);
		g2d.drawString("Abbreviation: PA",  30, 275);
		g2d.drawString("Population: ~13 million",  30, 375);
		g2d.drawString("Biggest City: Philadelphia",  30, 475);
		g2d.drawString("State Flower: Mountain-laurel",  30, 575);
		g2d.drawString("State Bird: Ruffed Grouse",  30, 675);
		System.out.println("you pressed Pennsylvania");

	
		
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
		
		//if(key==32) {
		//	spacebar=true;
			
		//}
		if(key==72) {
			System.out.println("you pressed H!");
			if(!screenstatus.equals("Home")) {
			screenstatus = ("Home");
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
		//System.out.println("Lol this mean the mouse works ig?");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(california.hover(e.getX(), e.getY())) {
			screenstatus = "California";
			//System.out.println("you clicked California");
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
		if(delaware.hover(e.getX(), e.getY())) {
			screenstatus = "Delaware";
		}
		if(connecticut.hover(e.getX(), e.getY())) {
			screenstatus = "Connecticut";
		}
		if(arkansas.hover(e.getX(), e.getY())) {
			screenstatus = "Arkansas";
		}
		if(colorado.hover(e.getX(), e.getY())) {
			screenstatus = "Colorado";
		}
		if(illinois.hover(e.getX(), e.getY())) {
			screenstatus = "Illinois";
		}
		if(indiana.hover(e.getX(), e.getY())) {
			screenstatus = "Indiana";
		}
		if(iowa.hover(e.getX(), e.getY())) {
			screenstatus = "Iowa";
		}
		if(kansas.hover(e.getX(), e.getY())) {
			screenstatus = "Kansas";
		}
		if(kentucky.hover(e.getX(), e.getY())) {
			screenstatus = "Kentucky";
		}
		if(maine.hover(e.getX(), e.getY())) {
			screenstatus = "Maine";
		}
		if(maryland.hover(e.getX(), e.getY())) {
			screenstatus = "Maryland";
		}
		if(massachusetts.hover(e.getX(), e.getY())) {
			screenstatus = "Massachusetts";
		}
		if(michigan.hover(e.getX(), e.getY())) {
			screenstatus = "Michigan";
		}
		if(minnesota.hover(e.getX(), e.getY())) {
			screenstatus = "Minnesota";
		}
		if(mississippi.hover(e.getX(), e.getY())) {
			screenstatus = "Mississippi";
		}
		if(missouri.hover(e.getX(), e.getY())) {
			screenstatus = "Missouri";
		}
		if(newhampshire.hover(e.getX(), e.getY())) {
			screenstatus = "New Hampshire";
		}
		if(newjersey.hover(e.getX(), e.getY())) {
			screenstatus = "New Jersey";
		}
		if(newyork.hover(e.getX(), e.getY())) {
			screenstatus = "New York";
		}
		if(northcarolina.hover(e.getX(), e.getY())) {
			screenstatus = "North Carolina";
		}
		if(ohio.hover(e.getX(), e.getY())) {
			screenstatus = "Ohio";
		}
		if(oklahoma.hover(e.getX(), e.getY())) {
			screenstatus = "Oklahoma";
		}
		if(pennsylvania.hover(e.getX(), e.getY())) {
			screenstatus = "Pennsylvania";
		}
		if(rhodeisland.hover(e.getX(), e.getY())) {
			screenstatus = "Rhode Island";
		}
		if(southcarolina.hover(e.getX(), e.getY())) {
			screenstatus = "South Carolina";
		}
		if(tennessee.hover(e.getX(), e.getY())) {
			screenstatus = "Tennessee";
		}
		if(texas.hover(e.getX(), e.getY())) {
			screenstatus = "Texas";
		}
		if(vermont.hover(e.getX(), e.getY())) {
			screenstatus = "Vermont";
		}
		if(virginia.hover(e.getX(), e.getY())) {
			screenstatus = "Virginia";
		}
		if(westvirginia.hover(e.getX(), e.getY())) {
			screenstatus = "West Virginia";
		}
		if(wisconsin.hover(e.getX(), e.getY())) {
			screenstatus = "Wisconsin";
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
