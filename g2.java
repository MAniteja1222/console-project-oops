import java.util.*;
class C
{
    static String Black = "\u001b[30m";
    static String Red = "\u001b[31m";
    static String Green = "\u001b[32m";
    static String Yellow = "\u001b[33m";
    static String Blue = "\u001b[34m";
    static String Magenta = "\u001b[35m";
    static String Cyan = "\u001b[36m";
    static String White = "\u001b[37m";
    static String BrightBlack = "\u001b[30;1m";
    static String BrightRed = "\u001b[31;1m";
    static String BrightGreen = "\u001b[32;1m";
    static String BrightYellow = "\u001b[33;1m";
    static String BrightBlue = "\u001b[34;1m";
    static String BrightMagenta = "\u001b[35;1m";
    static String BrightCyan = "\u001b[36;1m";
    static String BrightWhite = "\u001b[37;1m";

    static String Reset = "\u001b[0m";
    static String BackgroundBlack = "\u001b[40m";
    static String BackgroundRed = "\u001b[41m";
    static String BackgroundGreen = "\u001b[42m";
    static String BackgroundYellow = "\u001b[43m";
    static String BackgroundBlue = "\u001b[44m";
    static String BackgroundMagenta = "\u001b[45m";
    static String BackgroundCyan = "\u001b[46m";
    static String BackgroundWhite = "\u001b[47m";
    static String BackgroundBrightBlack = "\u001b[40;1m";
    static String BackgroundBrightRed = "\u001b[41;1m";
    static String BackgroundBrightGreen = "\u001b[42;1m";
    static String BackgroundBrightYellow = "\u001b[43;1m";
    static String BackgroundBrightBlue = "\u001b[44;1m";
    static String BackgroundBrightMagenta = "\u001b[45;1m";
    static String BackgroundBrightCyan = "\u001b[46;1m";
    static String BackgroundBrightWhite = "\u001b[47;1m";

    static String blink="\u001B[5m";
}
class Payment extends C
{
    static Scanner sc=new Scanner(System.in);
    long card=987654321123L;
    int cvv=233,c=0;
    static String cash="";
    String upi="9398217501@ybl";
    int pin=4646;
    Random R=new Random();
    int s_otp=R.nextInt(9999);
    Payment()
    {
        System.out.print(BrightWhite);
        System.out.println("SELECT PAYMENT METHOD :");
        System.out.println("-----------------------");
        System.out.println("CHOOSE YOUR PAYMENT OPTION :");
        System.out.println("-----------------------");
        System.out.println("Avialable Payments are :");
        System.out.println("1.Card Payment");
        System.out.println("2.UPI Payment");
        System.out.println("3.Cash On Delivery");
	System.out.println("4.Exit");
    }
    void otp_attempt()
    {
        if(c<3)
        {
            System.out.println("Enter 4 Digit OTP ! :");
            System.out.println(s_otp);
            int otp=sc.nextInt();
            if(s_otp==otp)
            {
                System.out.println(BrightGreen);
                System.out.println("Yahoo..! Payment Sucessful :)"+Reset);
            }
            else
            {
                System.out.println(Red);
                System.out.println("Wrong otp Try Again:"+Reset);
                c++;
                this.otp_attempt();
            }
        }
        else
        {
            System.out.println(Red);
            System.out.println("Limited Attempts Exceeded \nPlease Try Again After Sometime."+Reset);
	    System.exit(0);
        }
    }
    void card_details()
    {
        System.out.println("Enter Card Details :");
        System.out.println("Enter Card Number (Numbers Only !) :");
        long l=sc.nextLong();
        if(l==card)
        {
            System.out.println("Enter CVV :");
            int ncvv=sc.nextInt();
            if(ncvv==cvv)
            {
                System.out.println("Card Details Sucessfully Fetched :)");
                this.otp_attempt();
                     
            }
            else
            {
                System.out.println(Red);
                System.out.println("Invalid CVV"+Reset);
		this.card_details();
            }
        }
        else{
            System.out.println(Red);
            System.out.println("Wrong Card Number :(\nPlease Try Again :"+Reset);
            this.card_details();
        }
    
    }
    void upi_details()
    {
        
        System.out.println("Enter UPI Id :");
        String new_upi=sc.next();
        if(new_upi.equalsIgnoreCase(upi) )
        {
            System.out.println("UPI Details is Valid :)");
            this.pin_details();
            
        }
        else
        {
            System.out.println(Red);
            System.out.println("Invalid UPI ID..:(\nPLease Try Again !"+Reset);
            this.upi_details();
        }

    }
    void pin_details()
    {
        if(c<3)
        {
            System.out.println("Please Enter your UPI Pin :");
            int new_pin=sc.nextInt();
            if(new_pin==pin)
            {
                System.out.println(BrightGreen);
                System.out.println("Transaction Sucessful...:)"+Reset);
            }
            else
            {
                System.out.println(Red);
                System.out.println("Worng UPI Pin :(\nPlease Try Again :"+Reset);
                c++;
                this.pin_details();
            }
        }
        else
        {
            System.out.println(Red);
            System.out.println("Limited Attempts Exceeded \nPlease Try Again After Sometime..!"+Reset);
	    System.exit(0);
        }
    }   

    public static void payment(double amo)
    {
        System.out.println(A.BrightMagenta);
        Payment obj=new Payment();
        int option=sc.nextInt();
        if(option==1)
        {
            obj.card_details();        
        }
        else if(option==2)
        {        
            obj.upi_details();  
        }
        else if(option==3)
        {
             cash = "Note : Pay "+amo+" rs To Our Delivery Partner";
        }
	else if(option==4)
	{
		System.exit(0);
	}
        else
        {
            System.out.println("Invalid Option");
            System.out.println("Please Select Valid Option");
            payment(amo);
        }
    }
}
class Z extends C 
{
	static Scanner sc = new Scanner(System.in);
	Random obj = new Random();
	void login(String[] args)
	{
		String Number="";
		System.out.println("Enter Your Phone Number\nNote: You have to Enter Phone Number in digits only!");
		while(true)
		{
			Number = sc.next();
			if(Number.length()<10||Number.length()>10||("012345").contains(""+Number.charAt(0)))
			{
				System.out.println(Red+"Invalid Number\nPls Enter Valid Number!"+Reset);
			}
			else	
			{
				break;
			}
		}
		int a = obj.nextInt(1000)+1000;
		System.out.println(Green+"here is your otp  :  "+a+Reset);
		System.out.println("Enter Your otp");
		int otp = sc.nextInt();
		int z=3;
		while(z>0)
		{
			z--;
			if(otp==a)
			{
				System.out.println(Green+"Login Successfull!"+Reset);
				break;
			} 
			else
			{
				if(z==0)
				{

					G.main(args);
				}
				else
				{
					System.out.println("You Have Entered Invalid Otp!-You have only "+z+" Attempts");
					otp = sc.nextInt();
				}
			}
		}
		details(Number);
	}
	
	 void details(String pho)
	{
		System.out.println();
		System.out.println("Enter Your FirstName");
		String FirstName = sc.next();
		System.out.println("Enter Your LastName");
		String LastName = sc.next();
		System.out.println();
		System.out.println("Enter Your EmailId");
		String EMAIL="";
		while(true)
		{
			String s = sc.next();
			if((s.indexOf(".")==s.lastIndexOf(".")&&s.contains("."))&&(s.split("@")).length==2&&((s.replace(
" ","")).length()==s.length()))
			{
				EMAIL=s;
				break;
			}
			else
			{
				System.out.println(Red+"Enter Valid Email Id...."+Reset);
			}

		}
		System.out.println();
		System.out.println(Green+"Welcome "+FirstName+" "+LastName+" Start Buying!!!"+Reset);
	}
	
}
interface I1
{
	void vegetables();
	void kitchen();
}
interface I2
{
	void kitchen2();
	void diary();
}
interface I3
{
	void fruits();
	void instant();
}
abstract class A extends C
{
	abstract void snacks();
	abstract void cooldrinks();
	abstract void tea();
	abstract void dry();
}
class G extends A implements I1,I2,I3 
{
static Scanner sc=new Scanner(System.in);
	static double tbill=0;
	static String desc="";
 public void vegetables()
	{
		System.out.println();
		System.out.println("press 1 to choose Brinjal");
		System.out.println("press 2 to choose Chilli");
		System.out.println("press 3 to choose Cauliflower");
		System.out.println("press 4 to choose Lady'sfinger");
		System.out.println("press 5 to choose Onion");
		System.out.println("press 6 to choose Potato");
		System.out.println("press 7 to choose Spinach");
		System.out.println("press 8 to choose Tomato");
		System.out.println("press 9 to return to main menu");
		int veg=sc.nextInt();
	 switch(veg)
        {
		case 1:		
			System.out.println("1kg = 40Rs");
			System.out.println("enter no of kgs");
			int a=sc.nextInt();
			 int bill1=40*a;
			if(desc.contains("Brinjal"))
				update("Brinjal",40,a);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Brinjal",40,a,bill1);
			tbill=tbill+bill1;
			vegetables();
			break;
		case 2:		
			System.out.println("1kg = 40Rs");
			System.out.println("enter no of kgs");
			int b=sc.nextInt();
			 int bill2=40*b;
			if(desc.contains("Chilli"))
				update("Chilli",40,b);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Chilli",40,b,bill2);
			tbill=tbill+bill2;
			vegetables();
			break;
		case 3:		
			System.out.println("1kg = 20Rs");
			System.out.println("enter no of kgs");
			int c=sc.nextInt();
			 int bill3=20*c;
			if(desc.contains("Cauliflower"))
				update("Cauliflower",20,c);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Cauliflower",20,c,bill3);
			tbill=tbill+bill3;
			vegetables();
			break;
		case 4:		
			System.out.println("1kg = 40Rs");
			System.out.println("enter no of kgs");
			int d=sc.nextInt();
			 int bill4=40*d;
			if(desc.contains("Lady'sfinger"))
				update("Lady'sfinger",40,d);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Lady'sfinger",40,d,bill4);
			tbill=tbill+bill4;
			vegetables();
			break;
		case 5:		
			System.out.println("1kg = 20Rs");
			System.out.println("enter no of kgs");
			int e=sc.nextInt();
			 int bill5=20*e;
			if(desc.contains("Onion"))
				update("Onion",20,e);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Onion",20,e,bill5);
			tbill=tbill+bill5;
			vegetables();
			break;
		case 6:		
			System.out.println("1kg = 30Rs");
			System.out.println("enter no of kgs");
			int f=sc.nextInt();
			 int bill6=30*f;
			if(desc.contains("Potato"))
				update("Potato",30,f);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Potato",30,f,bill6);
			tbill=tbill+bill6;
			vegetables();
			break;
		case 7:		
			System.out.println("1bundle = 5Rs");
			System.out.println("enter no of bundles");
			int g=sc.nextInt();
			 int bill7=5*g;
			if(desc.contains("Spinach"))
				update("Spinach",5,g);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Spinach",5,g,bill7);
			tbill=tbill+bill7;
			vegetables();
			break;
		case 8:		
			System.out.println("1kg = 20Rs");
			System.out.println("enter no of kgs");
			int h=sc.nextInt();
			 int bill8=20*h;
			if(desc.contains("Tomato"))
				update("Tomato",20,h);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Tomato",20,h,bill8);
			tbill=tbill+bill8;
			vegetables();
			break;
		case 9:
			gro();		
			break;
		default:
			System.out.println(Red+"Plzz! Enter Valid Number"+Reset);
			vegetables();
		}
    	}
public void kitchen()
	{
		System.out.println();
		System.out.println("press 1 to choose Aashirwad Atta");
		System.out.println("press 2 to choose Fortune Basmati Rice");
		System.out.println("press 3 to choose Kurnool Sona Masoori Rice");
		System.out.println("press 4 to choose Supreme Harvest Besan");
		System.out.println("press 5 to choose Supreme Harvest Chana Dal");
		System.out.println("press 6 to choose Supreme Harvest Moong Dal");
		System.out.println("press 7 to choose Supreme Harvest Upma Sooji ");
		System.out.println("press 8 to choose Supreme Harvest Wheat Flour");
		System.out.println("press 9 to return to main menu");
		int kit=sc.nextInt();
	 switch(kit)
        {
		case 1:		
			System.out.println("1pack(1kg) = 70Rs");
			System.out.println("enter no of packs");
			int h1=sc.nextInt();
			 int bill31=70*h1;
			if(desc.contains("Aashirwad Atta"))
				update("Aashirwad Atta",70,h1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Aashirwad Atta",70,h1,bill31);
			tbill=tbill+bill31;
			kitchen();
			break;
		case 2:		
			System.out.println("1pack(1kg) = 175Rs");
			System.out.println("enter no of packs");
			int i1=sc.nextInt();
			 int bill32=175*i1;
			if(desc.contains("Fortune Basmati Rice"))
				update("Fortune Basmati Rice",175,i1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Fortune Basmati Rice",175,i1,bill32);
			tbill=tbill+bill32;
			kitchen();
			break;
		case 3:		
			System.out.println("1pack(1kg) = 79Rs");
			System.out.println("enter no of packs");
			int j1=sc.nextInt();
			 int bill33=79*j1;
			if(desc.contains("Kurnool Sona Masoori Rice"))
				update("Kurnool Sona Masoori Rice",79,j1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Kurnool Sona Masoori Rice",79,j1,bill33);
			tbill=tbill+bill33;
			kitchen();
			break;
		case 4:		
			System.out.println("1pack(500g) = 50Rs");
			System.out.println("enter no of packs");
			int k1=sc.nextInt();
			 int bill34=50*k1;
			if(desc.contains("Supreme Harvest Besan"))
				update("Supreme Harvest Besan",50,k1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Supreme Harvest Besan",50,k1,bill34);
			tbill=tbill+bill34;
			kitchen();
			break;
		case 5:		
			System.out.println("1pack(500g) = 60Rs");
			System.out.println("enter no of packs");
			int l1=sc.nextInt();
			 int bill35=60*l1;
			if(desc.contains("Supreme Harvest Chana Dal"))
				update("Supreme Harvest Chana Dal",60,l1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Supreme Harvest Chana Dal",60,l1,bill35);
			tbill=tbill+bill35;
			kitchen();
			break;
		case 6:		
			System.out.println("1pack(500g) = 97Rs");
			System.out.println("enter no of packs");
			int m1=sc.nextInt();
			 int bill36=97*m1;
			if(desc.contains("Supreme Harvest Moong Dal"))
				update("Supreme Harvest Moong Dal",97,m1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Supreme Harvest Moong Dal",97,m1,bill36);
			tbill=tbill+bill36;
			kitchen();
			break;
		case 7:		
			System.out.println("1pack(500g) = 30Rs");
			System.out.println("enter no of packs");
			int n1=sc.nextInt();
			 int bill37=30*n1;
			if(desc.contains("Supreme Harvest Upma Sooji"))
				update("Supreme Harvest Upma Sooji",30,n1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Supreme Harvest Upma Sooji",30,n1,bill37);
			tbill=tbill+bill37;
			kitchen();
			break;
		case 8:		
			System.out.println("1pack(500g) = 44Rs");
			System.out.println("enter no of packs");
			int o1=sc.nextInt();
			 int bill38=44*o1;
			if(desc.contains("Supreme Harvest Wheat Flour"))
				update("Supreme Harvest Wheat Flour",44,o1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Supreme Harvest Wheat Flour",44,o1,bill38);
			tbill=tbill+bill38;
			kitchen();
			break;
		case 9:
			gro();		
			break;
		default:
			System.out.println(Red+"Plzz! Enter Valid Number"+Reset);
			kitchen();
		}
    		}
public void kitchen2()
	{
		System.out.println();
		System.out.println("press 1 to choose Freedom Refined Sunflower Oil");
		System.out.println("press 2 to choose Gold Drop Sunflower Oil");
		System.out.println("press 3 to choose Organic Groundnut Oil");
		System.out.println("press 4 to choose Organic Coconut Oil");
		System.out.println("press 5 to choose Organic Gingely Oil");
		System.out.println("press 6 to choose Organic Mustard Oil");
		System.out.println("press 7 to choose Organic Ricebran Oil");
		System.out.println("press 8 to choose Organic Cow Ghee");
		System.out.println("press 9 to return to main menu");
		int kit2=sc.nextInt();
	 switch(kit2)
        {
		case 1:		
			System.out.println("1pack(1L) = 119Rs");
			System.out.println("enter no of packs");
			int p1=sc.nextInt();
			 int bill39=119*p1;
			if(desc.contains("Freedom Refined Sunflower Oil"))
				update("Freedom Refined Sunflower Oil",119,p1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Freedom Refined Sunflower Oil",119,p1,bill39);
			tbill=tbill+bill39;
			kitchen2();
			break;
		case 2:		
			System.out.println("1pack(1L) = 109Rs");
			System.out.println("enter no of packs");
			int q1=sc.nextInt();
			 int bill40=109*q1;
			if(desc.contains("Gold Drop Sunflower Oil"))
				update("Gold Drop Sunflower Oil",109,q1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Gold Drop Sunflower Oil",109,q1,bill40);
			tbill=tbill+bill40;
			kitchen2();
			break;
		case 3:		
			System.out.println("1pack(1L) = 282Rs");
			System.out.println("enter no of packs");
			int r1=sc.nextInt();
			 int bill41=282*r1;
			if(desc.contains("Organic Groundnut Oil"))
				update("Organic Groundnut Oil",282,r1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Organic Groundnut Oil",282,r1,bill41);
			tbill=tbill+bill41;
			kitchen2();
			break;
		case 4:		
			System.out.println("1pack(1L) = 250Rs");
			System.out.println("enter no of packs");
			int s1=sc.nextInt();
			 int bill42=250*s1;
			if(desc.contains("Organic Coconut Oil"))
				update("Organic Coconut Oil",250,s1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Organic Coconut Oil",250,s1,bill42);
			tbill=tbill+bill42;
			kitchen2();
			break;
		case 5:		
			System.out.println("1pack(500m1) = 270Rs");
			System.out.println("enter no of packs");
			int t1=sc.nextInt();
			 int bill43=270*t1;
			if(desc.contains("Organic Gingely Oil"))
				update("Organic Gingely Oil",270,t1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Organic Gingely Oil",270,t1,bill43);
			tbill=tbill+bill43;
			kitchen2();
			break;
		case 6:		
			System.out.println("1pack(1L) = 380Rs");
			System.out.println("enter no of packs");
			int u1=sc.nextInt();
			 int bill44=380*u1;
			if(desc.contains("Organic Mustard Oil"))
				update("Organic Mustard Oil",380,u1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Organic Mustard Oil",380,u1,bill44);
			tbill=tbill+bill44;
			kitchen2();
			break;
		case 7:		
			System.out.println("1pack(1L) = 129Rs");
			System.out.println("enter no of packs");
			int v1=sc.nextInt();
			 int bill45=129*v1;
			if(desc.contains("Organic Ricebran Oil"))
				update("Organic Ricebran Oil",129,v1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Organic Ricebran Oil",129,v1,bill45);
			tbill=tbill+bill45;
			kitchen2();
			break;
		case 8:		
			System.out.println("1pack(195ml) = 329Rs");
			System.out.println("enter no of packs");
			int w1=sc.nextInt();
			 int bill46=329*w1;
			if(desc.contains("Organic Cow Ghee"))
				update("Organic Cow Ghee",329,w1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Organic Cow Ghee",329,w1,bill46);
			tbill=tbill+bill46;
			kitchen2();
			break;
		case 9:
			gro();		
			break;
		default:
			System.out.println(Red+"Plzz! Enter Valid Number"+Reset);
			kitchen2();
		}
    		}
public void diary()
	{
		System.out.println();
		System.out.println("press 1 to choose Amul Butter");
		System.out.println("press 2 to choose Eggs");
		System.out.println("press 3 to choose Britania Milk Bread");
		System.out.println("press 4 to choose Britania Brown Bread");
		System.out.println("press 5 to choose Heritage Milk");
		System.out.println("press 6 to choose Heritage Fullcream Milk");
		System.out.println("press 7 to choose Heritage Total Curd");
		System.out.println("press 8 to choose Id Fresh Paneer");
		System.out.println("press 9 to return to main menu");
		int dia=sc.nextInt();
	 switch(dia)
        {
		case 1:		
			System.out.println("1pack = 59Rs");
			System.out.println("enter no of packs");
			int i=sc.nextInt();
			 int bill9=59*i;
			if(desc.contains("Amul Butter"))
				update("Amul Butter",59,i);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Amul Butter",59,i,bill9);
			tbill=tbill+bill9;
			diary();
			break;
		case 2:		
			System.out.println("1box(12 pieces) = 85Rs");
			System.out.println("enter no of boxes");
			int j=sc.nextInt();
			 int bill10=85*j;
			if(desc.contains("Eggs"))
				update("Eggs",85,j);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Eggs",85,j,bill10);
			tbill=tbill+bill10;
			diary();
			break;
		case 3:		
			System.out.println("1pack = 45Rs");
			System.out.println("enter no of packs");
			int k=sc.nextInt();
			 int bill11=45*k;
			if(desc.contains("Britania Milk Bread"))
				update("Britania Milk Bread",45,k);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Britania Milk Bread",45,k,bill11);
			tbill=tbill+bill11;
			diary();
			break;
		case 4:		
			System.out.println("1pack = 50Rs");
			System.out.println("enter no of packs");
			int l=sc.nextInt();
			 int bill12=50*l;
			if(desc.contains("Britania Brown Bread"))
				update("Britania Brown Bread",50,l);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Britania Brown Bread",50,l,bill12);
			tbill=tbill+bill12;
			diary();
			break;
		case 5:		
			System.out.println("1pack = 30Rs");
			System.out.println("enter no of packs");
			int m=sc.nextInt();
			 int bill13=30*m;
			if(desc.contains("Heritage Milk"))
				update("Heritage Milk",30,m);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Heritage Milk",30,m,bill13);
			tbill=tbill+bill13;
			diary();
			break;
		case 6:		
			System.out.println("1pack = 40Rs");
			System.out.println("enter no of packs");
			int n=sc.nextInt();
			 int bill14=40*n;
			if(desc.contains("Heritage Full Cream Milk"))
				update("Heritage Full Cream Milk",40,n);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Heritage Full Cream Milk",40,n,bill14);
			tbill=tbill+bill14;
			diary();
			break;
		case 7:		
			System.out.println("1pack = 45Rs");
			System.out.println("enter no of packs");
			int o=sc.nextInt();
			 int bill15=45*o;
			if(desc.contains("Heritage Total Curd"))
				update("Heritage Total Curd",45,o);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Heritage Total Curd",45,o,bill15);
			tbill=tbill+bill15;
			diary();
			break;
		case 8:		
			System.out.println("1pack = 220Rs");
			System.out.println("enter no of packs");
			int p=sc.nextInt();
			 int bill16=220*p;
			if(desc.contains("Id Fresh Paneer"))
				update("Id Fresh Paneer",220,p);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Id Fresh Paneer",220,p,bill16);
			tbill=tbill+bill16;
			diary();
			break;
		case 9:
			gro();	
			break;
		default:
			System.out.println(Red+"Plzz! Enter Valid Number"+Reset);
			diary();
		}
    		}
public void fruits()
	{
		System.out.println();
		System.out.println("press 1 to choose Apple");
		System.out.println("press 2 to choose Banana");
		System.out.println("press 3 to choose Coconut");
		System.out.println("press 4 to choose Grapes");
		System.out.println("press 5 to choose Orange");
		System.out.println("press 6 to choose Pineapple");
		System.out.println("press 7 to choose Pomegranate");
		System.out.println("press 8 to return to main menu");
		int fru=sc.nextInt();
	 switch(fru)
        {
		case 1:		
			System.out.println("1piece = 20Rs");
			System.out.println("enter no of pieces");
			int q=sc.nextInt();
			 int bill24=20*q;
			if(desc.contains("Apple"))
				update("Apple",20,q);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Apple",220,q,bill24);
			tbill=tbill+bill24;
			fruits();
			break;
		case 2:		
			System.out.println("1pack(12 pieces) = 50Rs");
			System.out.println("enter no of packs");
			int r=sc.nextInt();
			 int bill25=50*r;
			if(desc.contains("Banana"))
				update("Banana",50,r);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Banana",50,r,bill25);
			tbill=tbill+bill25;
			fruits();
			break;
		case 3:		
			System.out.println("1piece = 50Rs");
			System.out.println("enter no of pieces");
			int s=sc.nextInt();
			 int bill26=50*s;
			if(desc.contains("Coconut"))
				update("Coconut",50,s);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Coconut",50,s,bill26);
			tbill=tbill+bill26;
			fruits();
			break;
		case 4:		
			System.out.println("1kg = 70Rs");
			System.out.println("enter no of kgs");
			int t=sc.nextInt();
			 int bill27=70*t;
			if(desc.contains("Grapes"))
				update("Grapes",70,t);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Grapes",70,t,bill27);
			tbill=tbill+bill27;
			fruits();
			break;
		case 5:		
			System.out.println("1piece = 20Rs");
			System.out.println("enter no of pieces");
			int u=sc.nextInt();
			 int bill28=20*u;
			if(desc.contains("Orange"))
				update("Orange",20,u);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Orange",20,u,bill28);
			tbill=tbill+bill28;
			fruits();
			break;
		case 6:		
			System.out.println("1piece = 40Rs");
			System.out.println("enter no of pieces");
			int v=sc.nextInt();
			 int bill29=40*v;
			if(desc.contains("Pineapple"))
				update("Pineapple",40,v);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Pineapple",40,v,bill29);
			tbill=tbill+bill29;
			fruits();
			break;
		case 7:		
			System.out.println("1piece = 20Rs");
			System.out.println("enter no of pieces");
			int w=sc.nextInt();
			 int bill30=20*w;
			if(desc.contains("Pomegranate"))
				update("Pomegranate",20,w);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Pomegranate",20,w,bill30);
			tbill=tbill+bill30;
			fruits();
			break;
		case 8:
			gro();		
			break;
		default:
			System.out.println(Red+"Plzz! Enter Valid Number"+Reset);
			fruits();
		}
    		}
public void instant()
	{
		System.out.println();
		System.out.println("press 1 to choose Id Fresh Chapathi");
		System.out.println("press 2 to choose Id Fresh Paratha");
		System.out.println("press 3 to choose Id Fresh Idly Batter");
		System.out.println("press 4 to choose Id Fresh Dosa Batter");
		System.out.println("press 5 to choose Maggi Noodles");
		System.out.println("press 6 to choose Yippee Noodles");
		System.out.println("press 7 to choose Know Cup Soup(classic tomato)");
		System.out.println("press 8 to return to main menu");
		int ins=sc.nextInt();
	 switch(ins)
        {
		case 1:		
			System.out.println("1pack = 85Rs");
			System.out.println("enter no of packs");
			int a1=sc.nextInt();
			 int bill17=85*a1;
			if(desc.contains("Id Fresh Chapathi"))
				update("Id Fresh Chapathi",85,a1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Id Fresh Chapathi",85,a1,bill17);
			tbill=tbill+bill17;
			instant();
			break;
		case 2:		
			System.out.println("1pack = 90Rs");
			System.out.println("enter no of packs");
			int b1=sc.nextInt();
			 int bill18=50*b1;
			if(desc.contains("Id Fresh Paratha"))
				update("Id Fresh Paratha",50,b1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Id Fresh Paratha",50,b1,bill18);
			tbill=tbill+bill18;
			instant();
			break;
		case 3:		
			System.out.println("1pack(1kg) = 85Rs");
			System.out.println("enter no of packs");
			int c1=sc.nextInt();
			 int bill19=85*c1;
			if(desc.contains("Id Fresh Idli Batter"))
				update("Id Fresh Idli Batter",85,c1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Id Fresh Idli Batter",85,c1,bill19);
			tbill=tbill+bill19;
			instant();
			break;
		case 4:		
			System.out.println("1pack(1kg) = 85Rs");
			System.out.println("enter no of packs");
			int d1=sc.nextInt();
			 int bill20=85*d1;
			if(desc.contains("Id Fresh Dosa Batter"))
				update("Id Fresh Dosa Batter",85,d1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Id Fresh Dosa Batter",85,d1,bill20);
			tbill=tbill+bill20;
			instant();
			break;
		case 5:		
			System.out.println("1pack(800g) = 155Rs");
			System.out.println("enter no of packs");
			int e1=sc.nextInt();
			 int bill21=155*e1;
			if(desc.contains("Maggi Noodles"))
				update("Maggi Noodles",155,e1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Maggi Noodles",155,e1,bill21);
			tbill=tbill+bill21;
			instant();
			break;
		case 6:		
			System.out.println("1pack(720g) = 135Rs");
			System.out.println("enter no of packs");
			int f1=sc.nextInt();
			 int bill22=135*f1;
			if(desc.contains("Yippee Noodles"))
				update("Yippee Noodles",135,f1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Yippee Noodles",135,f1,bill22);
			tbill=tbill+bill22;
			instant();
			break;
		case 7:		
			System.out.println("1pack(50g) = 55Rs");
			System.out.println("enter no of packs");
			int g1=sc.nextInt();
			 int bill23=55*g1;
			if(desc.contains("Know Cup Soup(classic tomato)"))
				update("Know Cup Soup(classic tomato)",55,g1);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Know Cup Soup(classic tomato)",55,g1,bill23);
			tbill=tbill+bill23;
			instant();
			break;
		case 8:
			gro();		
			break;
		default:
			System.out.println(Red+"Plzz! Enter Valid Number"+Reset);
			instant();
		}
    		}
void snacks()
	{
		System.out.println();
		System.out.println("press 1 to choose Bingo Mad Angles");
		System.out.println("press 2 to choose Cadbury Dairy Milk Silk Heart Blush");
		System.out.println("press 3 to choose Hide and Seek");
		System.out.println("press 4 to choose Kitkat");
		System.out.println("press 5 to choose Kurkure Masala Munch");
		System.out.println("press 6 to choose Lays Magic Masala");
		System.out.println("press 7 to choose Moms Magic");
		System.out.println("press 8 to choose Pringles Original Potato Chips");
		System.out.println("press 9 to return to main menu");
		int sna=sc.nextInt();
	switch(sna)
	{
		case 1:
			System.out.println("1pack(350g) = 100Rs");
			System.out.println("enter no of packs");
			int a2=sc.nextInt();
			int bill47=100*a2;
			if(desc.contains("Bingo Mad Angles"))
				update("Bingo Mad Angles",100,a2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Bingo Mad Angles",100,a2,bill47);
			tbill=tbill+bill47;
			snacks();
			break;
		case 2:		
			System.out.println("1pack(250g) = 280Rs");
			System.out.println("enter no of packs");
			int b2=sc.nextInt();
			 int bill48=280*b2;
			if(desc.contains("Cadbury Dairy Milk Silk"))
				update("Cadbury Dairy Milk Silk",280,b2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Cadbury Dairy Milk Silk",280,b2,bill48);
			tbill=tbill+bill48;
			snacks();
			break;
		case 3:		
			System.out.println("1pack(200g) = 48Rs");
			System.out.println("enter no of packs");
			int c2=sc.nextInt();
			int bill49=48*c2;
			if(desc.contains("Hide and Seek"))
				update("Hide and Seek",48,c2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Hide and Seek",48,c2,bill49);
			tbill=tbill+bill49;
			snacks();
			break;
		case 4:		
			System.out.println("1pack(27.5g) = 25Rs");
			System.out.println("enter no of packs");
			int d2=sc.nextInt();
			 int bill50=25*d2;
			if(desc.contains("Kitkat"))
				update("Kitkat",25,d2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Kitkat",25,d2,bill50);
			tbill=tbill+bill50;
			snacks();
			break;
		case 5:		
			System.out.println("1pack(77g) = 20Rs");
			System.out.println("enter no of packs");
			int e2=sc.nextInt();
			 int bill51=20*e2;
			if(desc.contains("Kurkure Masala Munch"))
				update("Kurkure Masala Munch",20,e2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Kurkure Masala Munch",20,e2,bill51);
			tbill=tbill+bill51;
			snacks();
			break;
		case 6:		
			System.out.println("1pack(90g) = 50Rs");
			System.out.println("enter no of packs");
			int f2=sc.nextInt();
			 int bill52=50*f2;
			if(desc.contains("Lays Magic Masala"))
				update("Lays Magic Masala",50,f2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Lays Magic Masala",50,f2,bill52);
			tbill=tbill+bill52;
			snacks();
			break;
		case 7:		
			System.out.println("1pack(197) = 45Rs");
			System.out.println("enter no of packs");
			int g2=sc.nextInt();
			 int bill53=45*g2;
			if(desc.contains("Moms Magic"))
				update("Moms Magic",45,g2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Moms Magic",45,g2,bill53);
			tbill=tbill+bill53;
			snacks();
			break;
		case 8:		
			System.out.println("1box(107g) = 95Rs");
			System.out.println("enter no of boxes");
			int h2=sc.nextInt();
			 int bill54=95*h2;
			if(desc.contains("Pringles Original Potato Chips"))
				update("Pringles Original Potato Chips",95,h2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Pringles Original Potato Chips",95,h2,bill54);
			tbill=tbill+bill54;
			snacks();
			break;
		case 9:
			gro();		
			break;
		default:
			System.out.println(Red+"Plzz! Enter Valid Number"+Reset);
			snacks();
		}
    		}
void cooldrinks()
	{
		System.out.println();
		System.out.println("press 1 to choose B Natural Mixed Mango Juice");
		System.out.println("press 2 to choose Coca-cola Diet Coke Can");
		System.out.println("press 3 to choose Minute Maid Pulpy Orange Juice");
		System.out.println("press 4 to choose Pepsi Black Can");
		System.out.println("press 5 to choose Red Bull Energy Drink");
		System.out.println("press 6 to choose Sprite");
		System.out.println("press 7 to choose Thums up");
		System.out.println("press 8 to choose Tropicana Mixed Fruit Delight");
		System.out.println("press 9 to return to main menu");
		int cd=sc.nextInt();
	switch(cd)
	{
		case 1:
			System.out.println("1bottle(1L) = 120Rs");
			System.out.println("enter no of bottles");
			int i2=sc.nextInt();
			int bill55=120*i2;
			if(desc.contains("B Natural Mixed Mango Juice"))
				update("B Natural Mixed Mango Juice",120,i2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","B Natural Mixed Mango Juice",120,i2,bill55);
			tbill=tbill+bill55;
			cooldrinks();
			break;
		
		case 2:		
			System.out.println("1can(300ml) = 40Rs");
			System.out.println("enter no of cans");
			int j2=sc.nextInt();
			int bill56=40*j2;
			if(desc.contains("Coca-cola Diet Coke Can"))
				update("Coca-cola Diet Coke Can",40,j2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Coca-cola Diet Coke Can",40,j2,bill56);
			tbill=tbill+bill56;
			cooldrinks();
			break;
		case 3:		
			System.out.println("1bottle(1L) = 79Rs");
			System.out.println("enter no of bottle");
			int k2=sc.nextInt();
			int bill57=79*k2;
			if(desc.contains("Minute Maid Pulpy Orange Juice"))
				update("Minute Maid Pulpy Orange Juice",79,k2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Minute Maid Pulpy Orange Juice",79,k2,bill57);
			tbill=tbill+bill57;
			cooldrinks();
			break;
		case 4:		
			System.out.println("1can(250ml) = 35Rs");
			System.out.println("enter no of cans");
			int l2=sc.nextInt();
			int bill58=35*l2;
			if(desc.contains("Pepsi Black Can"))
				update("Pepsi Black Can",35,l2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Pepsi Black Can",35,l2,bill58);
			tbill=tbill+bill58;
			cooldrinks();
			break;
		case 5:		
			System.out.println("1bottle(250ml) = 124Rs");
			System.out.println("enter no of bottles");
			int m2=sc.nextInt();
			int bill59=124*m2;
			if(desc.contains("Red Bull Energy Drink"))
				update("Red Bull Energy Drink",124,m2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Red Bull Energy Drink",124,m2,bill59);
			tbill=tbill+bill59;
			cooldrinks();
			break;
		case 6:		
			System.out.println("1bottle(750ml)= 41Rs");
			System.out.println("enter no of bottles");
			int n2=sc.nextInt();
			int bill60=41*n2;
			if(desc.contains("Sprite"))
				update("Sprite",41,n2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Sprite",41,n2,bill60);
			tbill=tbill+bill60;
			cooldrinks();
			break;
		case 7:		
			System.out.println("1bottle(2.25L) = 80Rs");
			System.out.println("enter no of bottles");
			int o2=sc.nextInt();
			int bill61=80*o2;
			if(desc.contains("Thumbs up"))
				update("Thumbs up",80,o2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Thumbs up",80,o2,bill61);
			tbill=tbill+bill61;
			cooldrinks();
			break;
		case 8:		
			System.out.println("1bottle(1L) = 107Rs");
			System.out.println("enter no of bottles");
			int p2=sc.nextInt();
			int bill62=107*p2;
			if(desc.contains("Tropicana Mixed Fruit Delight"))
				update("Tropicana Mixed Fruit Delight",107,p2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Tropicana Mixed Fruit Delight",107,p2,bill62);
			tbill=tbill+bill62;
			cooldrinks();
			break;
		case 9:
			gro();
			break;
		default:
			System.out.println(Red+"Plzz! Enter Valid Number"+Reset);
			cooldrinks();
		}
    		}
void tea()
	{
		System.out.println();
		System.out.println("press 1 to choose Bru Instant Coffee");
		System.out.println("press 2 to choose Brooke Bond Red Label Tea");
		System.out.println("press 3 to choose Boost Energy Drink Pouch");
		System.out.println("press 4 to choose Chakra Gold Premium Leaf Tea");
		System.out.println("press 5 to choose Continental Xtra Instant Jar");
		System.out.println("press 6 to choose Cadbury Bournvita Choco Jar");
		System.out.println("press 7 to choose iD Instant Coffee Powder");
		System.out.println("press 8 to choose Nestle Everyday Dairy Jar");
		System.out.println("press 9 to return to main menu");
		int te=sc.nextInt();
	switch(te)
	{
		case 1:
			System.out.println("1packet(100g) = 207Rs");
			System.out.println("enter no of packets");
			int q2=sc.nextInt();
			int bill63=207*q2;
			if(desc.contains("Bru Instant Coffee"))
				update("Bru Instant Coffee",207,q2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Bru Instant Coffee",207,q2,bill63);
			tbill=tbill+bill63;
			tea();
			break;
		
		case 2:		
			System.out.println("1packet(1kg) = 580Rs");
			System.out.println("enter no of packets");
			int r2=sc.nextInt();
			int bill64=580*r2;
			if(desc.contains("Brooke Bond Red Label Tea"))
				update("Brooke Bond Red Label Tea",580,r2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Brooke Bond Red Label Tea",580,r2,bill64);
			tbill=tbill+bill64;
			tea();
			break;
		case 3:		
			System.out.println("1pouch(500g) = 299Rs");
			System.out.println("enter no of pouches");
			int s2=sc.nextInt();
			int bill65=299*s2;
			if(desc.contains("Boost Energy Drink Pouch"))
				update("Boost Energy Drink Pouch",299,s2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Boost Energy Drink Pouch",299,s2,bill65);
			tbill=tbill+bill65;
			tea();
			break;
		case 4:		
			System.out.println("1packet(500g) = 360Rs");
			System.out.println("enter no of packets");
			int t2=sc.nextInt();
			int bill66=360*t2;
			if(desc.contains("Chakra Gold Premium Leaf Tea"))
				update("Chakra Gold Premium Leaf Tea",360,t2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Chakra Gold Premium Leaf Tea",360,t2,bill66);
			tbill=tbill+bill66;
			tea();
			break;
		case 5:		
			System.out.println("1jar(200g) = 299Rs");
			System.out.println("enter no of jars");
			int u2=sc.nextInt();
			int bill67=299*u2;
			if(desc.contains("Continental Xtra Instant Jar"))
				update("Continental Xtra Instant Jar",299,u2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Continental Xtra Instant Jar",299,u2,bill67);
			tbill=tbill+bill67;
			tea();
			break;
		case 6:		
			System.out.println("1jar(500g)= 255Rs");
			System.out.println("enter no of jars");
			int v2=sc.nextInt();
			int bill68=255*v2;
			if(desc.contains("Cadbury Bournvita Choco Jar"))
				update("Cadbury Bournvita Choco Jar",255,v2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Cadbury Bournvita Choco Jar",255,v2,bill68);
			tbill=tbill+bill68;
			tea();
			break;
		case 7:		
			System.out.println("1packet(50g) = 105Rs");
			System.out.println("enter no of packets");
			int w2=sc.nextInt();
			int bill69=105*w2;
			if(desc.contains("iD Instant Coffee Powder"))
				update("iD Instant Coffee Powder",105,w2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","iD Instant Coffee Powder",105,w2,bill69);
			tbill=tbill+bill69;
			tea();
			break;
		case 8:		
			System.out.println("1Jar(200g) = 127Rs");
			System.out.println("enter no of Jars");
			int x2=sc.nextInt();
			int bill70=127*x2;
			if(desc.contains("Nestle Everyday Dairy Jar"))
				update("Nestle Everyday Dairy Jar",127,x2);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Nestle Everyday Dairy Jar",127,x2,bill70);
			tbill=tbill+bill70;
			tea();
			break;
		case 9:
			gro();		
			break;
		default:
			System.out.println(Red+"Plzz! Enter Valid Number"+Reset);
			tea();
		}
    		}
void dry()
	{
		System.out.println();
		System.out.println("press 1 to choose Cumin Powder");
		System.out.println("press 2 to choose Eastern Biriyani Masala");
		System.out.println("press 3 to choose Everest Chicken Masala");
		System.out.println("press 4 to choose Happilo Premium Afghani Anjeer");
		System.out.println("press 5 to choose Farmley Pre California Almonds");
		System.out.println("press 6 to choose MTR Sambar Powder");
		System.out.println("press 7 to choose Nutraj Cashew");
		System.out.println("press 8 to choose Three Mango Mirchi Powder");
		System.out.println("press 9 to return to main menu");
		int dry=sc.nextInt();
	switch(dry)
	{
		case 1:
			System.out.println("1packet(50g) = 68Rs");
			System.out.println("enter no of packets");
			int a3=sc.nextInt();
			int bill71=68*a3;
			if(desc.contains("Cumin Powder"))
				update("Cumin Powder",68,a3);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Cumin Powder",68,a3,bill71);
			tbill=tbill+bill71;
			dry();
			break;
		
		case 2:		
			System.out.println("1packet(100g) = 76Rs");
			System.out.println("enter no of packets");
			int b3=sc.nextInt();
			int bill72=76*b3;
			if(desc.contains("Eastern Biriyani Masala"))
				update("Eastern Biriyani Masala",76,b3);
			else 	
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Eastern Biriyani Masala",76,b3,bill72);
			tbill=tbill+bill72;
			dry();
			break;
		case 3:		
			System.out.println("1packet(100g) = 108Rs");
			System.out.println("enter no of packets");
			int c3=sc.nextInt();
			int bill73=108*c3;
			if(desc.contains("Everest Chicken Masala"))
				update("Everest Chicken Masala",108,c3);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Everest Chicken Masala",108,c3,bill73);
			tbill=tbill+bill73;
			dry();
			break;
		case 4:		
			System.out.println("1packet(200g) = 268Rs");
			System.out.println("enter no of packets");
			int d3=sc.nextInt();
			int bill74=268*d3;
			if(desc.contains("Happilo Premium Afghani Anjeer"))
				update("Happilo Premium Afghani Anjeer",268,d3);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Happilo Premium Afghani Anjeer",268,d3,bill74);
			tbill=tbill+bill74;
			dry();
			break;
		case 5:		
			System.out.println("1packet(1kg) = 920Rs");
			System.out.println("enter no of packets");
			int e3=sc.nextInt();
			int bill75=920*e3;
			if(desc.contains("Farmley Pre California Almonds"))
				update("Farmley Pre California Almonds",920,e3);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Farmley Pre California Almonds",920,e3,bill75);
			tbill=tbill+bill75;
			dry();
			break;
		case 6:		
			System.out.println("1packet(100g)= 76Rs");
			System.out.println("enter no of packets");
			int f3=sc.nextInt();
			int bill76=76*f3;
			if(desc.contains("MTR Sambar Powder"))
				update("MTR Sambar Powder",76,f3);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","MTR Sambar Powder",76,f3,bill76);
			tbill=tbill+bill76;
			dry();
			break;
		case 7:		
			System.out.println("1packet(1kg) = 998Rs");
			System.out.println("enter no of packets");
			int g3=sc.nextInt();
			int bill77=998*g3;
			if(desc.contains("Nutraj Cashew"))
				update("Nutraj Cashew",998,g3);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Nutraj Cashew",998,g3,bill77);
			tbill=tbill+bill77;
			dry();
			break;
		case 8:		
			System.out.println("1packet(500g) = 524Rs");
			System.out.println("enter no of packets");
			int h3=sc.nextInt();
			int bill78=524*h3;
			if(desc.contains("Three Mango Mirchi Powder"))
				update("Three Mango Mirchi Powder",524,h3);
			else 
				desc+=String.format("%-32s%-4dx %-2d  = %d\n","Three Mango Mirchi Powder",524,h3,bill78);
			tbill=tbill+bill78;
			dry();
			break;
		case 9:
			gro();		
			break;
		default:
			System.out.println(Red+"Plzz! Enter Valid Number"+Reset);
			dry();
		}
    		}
	public static void gro()
	{
		System.out.println();
		System.out.println(BackgroundWhite+ Green);
		System.out.println("press 1  to choose CoolDrinks");
		System.out.println("press 2  to choose Diary");
		System.out.println("press 3  to choose DryFruits & Masalas");
		System.out.println("press 4  to choose Fruits");
		System.out.println("press 5  to choose Instant Food");
		System.out.println("press 6  to choose KitchenGrocery( Atta, Dal, Rice )");
		System.out.println("press 7  to choose KitchenGrocery( Edible Oils & Ghee)");
		System.out.println("press 8  to choose Snacks");
		System.out.println("press 9  to choose Tea, Coffee & More");
		System.out.println("press 10 to choose Vegetables");
		System.out.println("press 11 to see your bill"+Reset);
		System.out.println("press 12 to exit from application"+Reset);
		I1 obj1=new G();
		I2 obj2=new G();
		I3 obj3=new G();
		A  obj4=new G();
		int gro=sc.nextInt();
		switch(gro)
		{
		case 1:		
			
			obj4.cooldrinks();
			break;
		case 2:		
			
			obj2.diary();
			break;
		case 3:		
			
			obj4.dry();
			break;
		case 4:		
			
			obj3.fruits();
			break;
		case 5:		

			obj3.instant();
			break;
		case 6:		
			
			obj1.kitchen();
			break;
		case 7:		
			
			obj2.kitchen2();
			break;
		case 8:
			obj4.snacks();		
			break;
		case 9:		
			
			obj4.tea();
			break;
		case 10:		
			
			obj1.vegetables();
			break;
		case 11:
			break;
		case 12:
			System.exit(0);
		default:
		
			System.out.print(Red+"Enter Valid Number\n"+Reset);
			gro();
		}
	}	
	public static void update(String s, int n, int a3)
	{
		int indCP = desc.indexOf(s)+s.length();
		int indX = desc.indexOf("x ", indCP);
		int sp = desc.indexOf("  ",indX);
		int Q =  Integer.parseInt(desc.substring(indX+2,sp));
		String fs = desc.substring(0,indCP-s.length());
		String ls = desc.substring(desc.indexOf("\n",indCP));
		desc = String.format("%s%-32s%-4dx %-2d  = %d%s",fs,s,n,(a3+Q),(n*(Q+a3)),ls);	
	}
	public static void Delete(String s)
	{
		String s1 = sc.nextLine();
		int indI = desc.indexOf(s1);
		int indE = desc.indexOf("\n", indI);
		String ss = desc.substring(desc.lastIndexOf("= ",indE)+2,indE);
		int DV = Integer.parseInt(ss);
		tbill -= DV; 
		desc = desc.substring(0,indI)+desc.substring(indE+1);
		if(tbill!=0.0)
		{
			System.out.println();
			System.out.println();
			System.out.println("--------------------------------------------------");
			System.out.println("                 Total Bill");
			System.out.println();
			System.out.println(desc);
			System.out.println();
			System.out.println("Your Total Bill is                      :"+tbill);
			System.out.println("--------------------------------------------------");
		}
	
	}
	static String add()
	{
			System.out.println();
			System.out.println("Before Going to Payment Section Please Enter Your Valid Adress!   ");
			String dno="",stname="",coname="",cityname="", pincode="";
		while(true)
		{
			System.out.println();
			System.out.print("Enter H.no/F.no        : ");
			dno=sc.next();
			System.out.print("Enter Street no/name   : ");
			stname=sc.next();
			System.out.print("Enter Colony name      : ");
			coname=sc.next();
			System.out.print("Enter City name        : ");
			cityname=sc.next();
			System.out.print("Enter Pin Code         : ");
			pincode=sc.next();
			if(("hyderabad").equals(cityname.toLowerCase()))
			{
				break;
			}
			else
			{
				System.out.println(Red+"We are available in 'hyderabad' only...."+Reset);
				System.out.println("Press 1 to Change address ");
				System.out.println("Press 2 to Exit");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("Enter new Address....");
						break;
					case 2:
						System.exit(0);
				}
			}
		}
		return dno+" ,"+stname+" ,"+coname+" ,"+cityname+" ,"+pincode;
	}
	public static void main(String []args)
	{
		System.out.println(BackgroundWhite+Blue+"     ******     WELCOME TO  CV INSTAMART     *****     "+Reset);
		System.out.println(blink+White+"			   -Busy? we got you covered :)"+Reset);
		System.out.println();
		 Z obj1 = new Z();
		System.out.println();
		System.out.print(Yellow);
		System.out.println("Please Select an option");
		System.out.println();	
		System.out.println(blink+"Press 1 to Login");
		System.out.println("Press 2 to Exit"+Reset);
		switch(sc.nextInt())
		{
		case 1:
			obj1.login(args);
			break;
		case 2:
			System.exit(0);
			break;
		}
		gro();
		
		System.out.println();
		
		
	while(true)	
	{
		
		if(tbill!=0.0)
		{
		
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("                 Total Bill");
		System.out.println();
		System.out.println(desc);
		System.out.println();
		System.out.println("Your Total Bill is:                    "+tbill);
		System.out.println("--------------------------------------------------");
			System.out.println();
			System.out.println("Press 1 to Delete an Item ");
			System.out.println("Note: You have to type item name as per in bill to -> Delete");
			System.out.println("Press Other Digit to Continue to Payment");
			int val = sc.nextInt();
			while(val==1)
			{
				Delete(sc.nextLine());
				if(tbill==0.0)
					break;
				else
					{
						System.out.println();
						System.out.println("Press 1 to Delete an Item");
						System.out.println("Note: You have to type item name as per in bill to -> Delete");
						System.out.println("Press Other Digit to Continue to Payment");
						val = sc.nextInt();
					}
			}
			break;
		}

		if(tbill==0.0)
		{
			System.out.println();
			System.out.println(Red+"There Are 0 Items You Have Been Selected So Please Select Items"+Reset);
			gro();
		}
	}
		
		{
			String address=add();
			Payment.payment(tbill);	
			System.out.println();
			System.out.println(Green+Payment.cash+Reset);
			System.out.println(Green+"Your Adress is : "+address+Reset+Yellow+"\nYour Order Will Reach You In Some time");
			System.out.println(BackgroundBrightWhite+Blue+"         Have A Great Day  :)         "+Reset);	
		}
		
	}

}