class Battery{
  int id;
  String name;
  String weight;
  
  public Battery(int id,String name,String weight){
    this.id=id;
    this.name=name;
    this.weight=weight;	
  }
  
  public void getDetails(){
	  System.out.println("Id: "+id);
	  System.out.println("Name: "+name);
	  System.out.println("Weight: "+weight);  
  }
}