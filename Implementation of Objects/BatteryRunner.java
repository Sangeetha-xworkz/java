class BatteryRunner{

    public static void main(String[] charging){
   
      Battery charge=new Battery();
	  boolean isCreated=charge.creationOfBatteries(1,"Exide","20kW");
	  System.out.println("Batteries Created: "+isCreated);
	  charge.getBatteriesInfo();
	  
	  Battery charge1=new Battery();
	  isCreated=charge1.creationOfBatteries(2,"Amara Raj Batteries","30kW");
	  System.out.println("Batteries Created: "+isCreated);
	  charge1.getBatteriesInfo();
	  
	  Battery charge2=new Battery();
	  isCreated=charge2.creationOfBatteries(3,"HBL Power System","100kW");
	  System.out.println("Batteries Created: "+isCreated);
	  charge2.getBatteriesInfo();
	  
	  Battery charge3=new Battery();
	  isCreated=charge3.creationOfBatteries(4,"Okaya","50kW");
	  System.out.println("Batteries Created: "+isCreated);
	  charge3.getBatteriesInfo();
	  
	  Battery charge4=new Battery();
	  isCreated=charge4.creationOfBatteries(5,"Panasonic","10kW");
	  System.out.println("Batteries Created: "+isCreated);
	  charge4.getBatteriesInfo();
	  
	  Battery charge5=new Battery();
	  isCreated=charge5.creationOfBatteries(6,"Amaron","30kW");
	  System.out.println("Batteries Created: "+isCreated);
	  charge5.getBatteriesInfo();
	  
	  Battery charge6=new Battery();
	  isCreated=charge6.creationOfBatteries(7,"Loom Solar","2kW");
	  System.out.println("Batteries Created: "+isCreated);
	  charge6.getBatteriesInfo();
	  
	  Battery charge7=new Battery();
	  isCreated=charge7.creationOfBatteries(8,"Luminus","80kW");
	  System.out.println("Batteries Created: "+isCreated);
	  charge7.getBatteriesInfo();
	  
	  Battery charge8=new Battery();
	  isCreated=charge8.creationOfBatteries(9,"Su-Kam","50kW");
	  System.out.println("Batteries Created: "+isCreated);
	  charge8.getBatteriesInfo();
	  
	  Battery charge9=new Battery();
	  isCreated=charge9.creationOfBatteries(10,"Everyday Industry","30kW");
	  System.out.println("Batteries Created: "+isCreated);
	  charge9.getBatteriesInfo();
	  
    }
}