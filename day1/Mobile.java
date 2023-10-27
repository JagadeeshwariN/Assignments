 package week1.day1;

public class Mobile {

//	Methods makeCall() sendMessage()
	
	public void makeCall()
	{
		
		String mobileModel= "iPhone7";
		float mobileWeight = 10.23f;
		System.out.println("Mobile Model :" + mobileModel);
		System.out.println("Mobile Weight :" + mobileWeight);
	}
	
	public void sendMessage()
	{
		boolean isFullCharged = true;
		int mobileCost = 50000;
		System.out.println("Mobile Charged :" + isFullCharged);
		System.out.println("Mobile Cost :" +mobileCost);
	}
	
	public static void main(String[] args) {
		
    Mobile Mobj = new Mobile();
    System.out.println("This is my Mobile");
    Mobj.makeCall();
    Mobj.sendMessage();
    
	}

}
