class SimCardRunner{

    public static void main(String[] card){
		
	  SimCard sim=new SimCard();
	  boolean ref=sim.simRequirements(1,"Artile","29 days");
      System.out.println("All Requiremets Present: "+ref);
      sim.getSimInfo();

	  SimCard sim1=new SimCard();
	  ref=sim1.simRequirements(2,"Jio","28 days");
      System.out.println("All Requiremets Present: "+ref);
      sim1.getSimInfo();

	  SimCard sim2=new SimCard();
	  ref=sim2.simRequirements(3,"Vada Phone","30 days");
      System.out.println("All Requiremets Present: "+ref);
      sim2.getSimInfo();

	  SimCard sim3=new SimCard();
	  ref=sim3.simRequirements(4,"BSNL","299 days");
      System.out.println("All Requiremets Present: "+ref);
      sim3.getSimInfo();

	  SimCard sim4=new SimCard();
	  ref=sim4.simRequirements(5,"MTNL","29 days");
      System.out.println("All Requiremets Present: "+ref);
      sim4.getSimInfo();
	  
	  SimCard sim5=new SimCard();
	  ref=sim5.simRequirements(6,"Vi","688 days");
      System.out.println("All Requiremets Present: "+ref);
      sim5.getSimInfo();

	  SimCard sim6=new SimCard();
	  ref=sim6.simRequirements(7,"IDEA","298 days");
      System.out.println("All Requiremets Present: "+ref);
      sim6.getSimInfo();

	  SimCard sim7=new SimCard();
	  ref=sim7.simRequirements(8,"Vada Phone","99 days");
      System.out.println("All Requiremets Present: "+ref);
      sim7.getSimInfo();

	  SimCard sim8=new SimCard();
	  ref=sim8.simRequirements(9,"Reliance","29 days");
      System.out.println("All Requiremets Present: "+ref);
      sim8.getSimInfo();

	  SimCard sim9=new SimCard();
	  ref=sim9.simRequirements(10,"Tata Docomo","29 days");
      System.out.println("All Requiremets Present: "+ref);
      sim9.getSimInfo();
	  
    }

}