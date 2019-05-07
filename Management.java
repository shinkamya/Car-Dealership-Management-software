import java.util.Scanner;
public class Management {
	public static Scanner keyb;
    public static void main(String[] args) {     
    	keyb = new Scanner(System.in);
    	Car Alto = new Car();
    	Car Santroxing= new Car();
    	Car WagonR=new Car();
    	for(int i=0;i<50;i++) {
    	System.out.print("\nChoose Operation\n1.Create\t2.Display\t3.Sell\t4.Exit\n");
       	{
       		byte dec=keyb.nextByte();
       		switch(dec) {
       		case 1:
       		{
    		System.out.print("\nChhose Option\n1.Alto\t2.Santro Xing\t3.Wagon R");
    		byte dec1=keyb.nextByte();
        	switch(dec1) {
        	case 1:
        		{	
        		System.out.print("Enter the No. Of Cars");
        		Alto.setnc(keyb.nextInt());
        		System.out.print("Enter the Year");
        		Alto.setmy(keyb.nextInt());
        		System.out.print("Enter the Colour");
        		Alto.setc(keyb.next());
        		Alto.setn("Alto");
        		System.out.print("Model");
        		Alto.setm(keyb.next());
        		Alto.total=Alto.total+Alto.getnc();
        		System.out.print("\n\n\tHurray!!!You Made it\n\nCreated Car Details are:\nFull Car Name : "+Alto.getn()+" "+Alto.getm()+"\tColour is : "+Alto.getc()+"\tYear Of Manufacturing is : "+Alto.getmy()+"\tAvailable Stock is : "+Alto.total);		
        		
        		}
        		break;
        	case 2:
        		{
        		System.out.print("Enter the No. Of Cars");
        		Santroxing.setnc(keyb.nextInt());
        		System.out.print("Enter the Year");
        		Santroxing.setmy(keyb.nextInt());
        		System.out.print("Enter the Colour");
        		Santroxing.setc(keyb.next());
        		Santroxing.setn("Santro Xing");
        		System.out.print("Model");
        		Santroxing.setm(keyb.next());
        		Santroxing.total=Santroxing.getnc()+Santroxing.total;
        		System.out.print("\n\n\tHurray!!!You Made it\n\nCreated Car Details are:\nFull Car Name : "+Santroxing.getn()+" "+Santroxing.getm()+"\tColour is : "+Santroxing.getc()+"\tYear Of Manufacturing is : "+Santroxing.getmy()+"\tAvailable Stock is : "+Santroxing.total);		
        		}
        	break;
        	case 3:
        		{
        		System.out.print("Enter the No. Of Cars");
        		WagonR.setnc(keyb.nextInt());
        		System.out.print("Enter the Year");
        		WagonR.setmy(keyb.nextInt());
        		System.out.print("Enter the Colour");
        		WagonR.setc(keyb.next());
        		WagonR.setn("Wagon-R");
        		System.out.print("Model");
        		WagonR.setm(keyb.next());
        		WagonR.total=WagonR.total+WagonR.getnc();
        		System.out.print("\n\n\tHurray!!!You Made it\n\nCreated Car Details are:\nFull Car Name : "+WagonR.getn()+" "+WagonR.getm()+"\tColour is : "+WagonR.getc()+"\tYear Of Manufacturing is : "+WagonR.getmy()+"\tAvailable Stock is : "+WagonR.total);		

        		} 
        	break;
        	default:
        		{
        		System.out.print("Please Exit and Try Gain Later");
        		}     
        		}
       			}
        	break;
        	case 2:
        		{
        		int totalcars=Alto.total+WagonR.total+Santroxing.total;
        		System.out.print("Welcome to Display Section \n It will Show you the Total No. of Cars in Stock \n\n\n Total Available Stock is : " + totalcars );
        		System.out.println("\nCar Name: Alto "+Alto.getm()+"\tColour: "+Alto.getc()+"\tYear: "+Alto.getmy()+"\tAvailale: "+Alto.total);
        		System.out.println("Car Name: WagonR "+WagonR.getm()+"\tColour: "+WagonR.getc()+"\tYear: "+WagonR.getmy()+"\tAvailale: "+WagonR.total);
        		System.out.println("Car Name: Santro Xing "+Santroxing.getm()+"\tColour: "+Santroxing.getc()+"\tYear: "+Santroxing.getmy()+"\tAvailale: "+Santroxing.total);
        		}
        		break;
        	case 3:
        		{
       			System.out.print("Aman welcomes you to Selling Department");
       			System.out.print("\nChhose Option\n1.Alto\t2.Santro Xing\t3.Wagon R");
        		byte dec2=keyb.nextByte();
            	switch(dec2) {
            	case 1:
            	{	
            	System.out.print("Enter the No. Of Cars");
           		Alto.setnc(keyb.nextInt());
           		if(Alto.total<Alto.getnc() )
           		{	System.out.println("Check Your Stock");           		
           		continue;  }
           		else
           		System.out.print("Enter the Year");
           		Alto.setmy(keyb.nextInt());
           		System.out.print("Enter the Colour");
           		Alto.setc(keyb.next());
           		Alto.setn("Alto");
           		System.out.print("Model");
           		Alto.setm(keyb.next());
           		Alto.total=Alto.total-Alto.getnc();
           		System.out.print("\n\n\tHurray!!!You Made it\n\nSold Car Details are:\nFull Car Name : "+Alto.getn()+" "+Alto.getm()+"\tColour is : "+Alto.getc()+"\tYear Of Manufacturing is : "+Alto.getmy()+"\tAvailable Stock is : "+Alto.total);
           		}
            	break;
            	case 2:
            	{
        		System.out.print("Enter the No. Of Cars");
        		Santroxing.setnc(keyb.nextInt());
        		if(Santroxing.total<Santroxing.getnc() )
           		{	System.out.println("Check Your Stock");           		
           		continue;  }
           		else
           		System.out.print("Enter the Year");
        		Santroxing.setmy(keyb.nextInt());
        		System.out.print("Enter the Colour");
        		Santroxing.setc(keyb.next());
        		Santroxing.setn("Santro Xing");
        		System.out.print("Model");
        		Santroxing.setm(keyb.next());
        		Santroxing.total=Santroxing.getnc()-Santroxing.total;
        		System.out.print("\n\n\tHurray!!!You Made it\n\nSold Car Details are:\nFull Car Name : "+Santroxing.getn()+" "+Santroxing.getm()+"\tColour is : "+Santroxing.getc()+"\tYear Of Manufacturing is : "+Santroxing.getmy()+"\tAvailable Stock is : "+Santroxing.total);		
            	}
            	break;
            	case 3:
            	{
            	System.out.print("Enter the No. Of Cars");
           		WagonR.setnc(keyb.nextInt());
           		if(WagonR.total<WagonR.getnc() )
           		{	System.out.println("Check Your Stock");           		
           		continue;  }
           		else
           		System.out.print("Enter the Year");
           		WagonR.setmy(keyb.nextInt());
           		System.out.print("Enter the Colour");
           		WagonR.setc(keyb.next());
           		WagonR.setn("Wagon-R");
           		System.out.print("Model");
           		WagonR.setm(keyb.next());
           		WagonR.total=WagonR.total-WagonR.getnc();
           		System.out.print("\n\n\tHurray!!!You Made it\n\nSold Car Details are:\nFull Car Name : "+WagonR.getn()+" "+WagonR.getm()+"\tColour is : "+WagonR.getc()+"\tYear Of Manufacturing is : "+WagonR.getmy()+"\tAvailable Stock is : "+WagonR.total);		
           		} 
            	break;
           		default:
            	{System.out.print("Please Exit and Try Again Later");
            	}     
            	}
        		}
        		break;
    			case 4:
    			{
    			System.exit(dec);
    			}
    			break;
    			default:
    			System.out.println("Service Unreachable");
    			}
       	}   
}}}