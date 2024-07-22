class SunGlasses{
  int id;
  String name;
  String type;
  double price;
  
  public SunGlasses(int id,String name,String type,double price){
	  this.id=id;
	  this.name=name;
	  this.type=type;
	  this.price=price;
  }
  
  public void getDetails(){
     System.out.println("Id: "+id);
	 System.out.println("Name: "+name);
	 System.out.println("Type: "+type);
	 System.out.println("Price: "+price);
  }

}