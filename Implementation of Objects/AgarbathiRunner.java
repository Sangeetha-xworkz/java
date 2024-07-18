class AgarbathiRunner{

    public static void main(String[] pray){
  
     Agarbathi agar=new Agarbathi();
	 boolean isCreated=agar.toPray("Cycle Pure Agarbathi",1,10,"Gandha",10.00);
	 System.out.println("Created: "+isCreated);
	 agar.getAgarbathiInfo();
	 
	 Agarbathi agar1=new Agarbathi();
	 isCreated=agar1.toPray("Moksh Agarbathi",2,15,"Rose",50.00);
	 System.out.println("Created: "+isCreated);
	 agar1.getAgarbathiInfo();
	 
	 Agarbathi agar2=new Agarbathi();
	 isCreated=agar2.toPray("Mangaldeep Agarbathi",3,40,"Pure Rose",80.00);
	 System.out.println("Created: "+isCreated);
	 agar2.getAgarbathiInfo();
	 
	 Agarbathi agar3=new Agarbathi();
	 isCreated=agar3.toPray("Zed black Agarbathi",4,50,"Jasmin",100.00);
	 System.out.println("Created: "+isCreated);
	 agar3.getAgarbathiInfo();
	 
	 Agarbathi agar4=new Agarbathi();
	 isCreated=agar4.toPray("Hem Agarbathi",5,15,"SunFlower",70.00);
	 System.out.println("Created: "+isCreated);
	 agar4.getAgarbathiInfo();
	 
	 Agarbathi agar5=new Agarbathi();
	 isCreated=agar5.toPray("Patanjai Agarbathi",6,10,"Pineapple",45.00);
	 System.out.println("Created: "+isCreated);
	 agar5.getAgarbathiInfo();
	 
	 Agarbathi agar6=new Agarbathi();
	 isCreated=agar6.toPray("Tataf Agarbathi",7,50,"Orange",50.00);
	 System.out.println("Created: "+isCreated);
	 agar6.getAgarbathiInfo();
	 
	 Agarbathi agar7=new Agarbathi();
	 isCreated=agar7.toPray("Cycle Pure Agarbathi",8,30,"Hibiscus",80.00);
	 System.out.println("Created: "+isCreated);
	 agar7.getAgarbathiInfo();
	 
	 Agarbathi agar8=new Agarbathi();
	 isCreated=agar8.toPray("Hari Darshan Agarbathi",9,30,"Lavendor",40.00);
	 System.out.println("Created: "+isCreated);
	 agar8.getAgarbathiInfo();
	 
	 Agarbathi agar9=new Agarbathi();
	 isCreated=agar9.toPray("Moksh Agarbathi",10,12,"Pure Jasmin",40.00);
	 System.out.println("Created: "+isCreated);
	 agar9.getAgarbathiInfo();
	
    }
}