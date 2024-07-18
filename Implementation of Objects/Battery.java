class Battery{
  int id;
  String name;
  String weight;
  
  public boolean creationOfBatteries(int id,String name,String weight){
  
     boolean isBatteriesCreated=false;
	 if(name!=null&&weight!=null){
		this.id=id;
        this.name=name;
        this.weight=weight;		
		 isBatteriesCreated=true;
	 }
	 return isBatteriesCreated;
  }
  
  public void getBatteriesInfo(){
	  System.out.println("Id: "+id);
	  System.out.println("Bettery Name: "+name);
	  System.out.println("Weight: "+weight);
	  
  }
}