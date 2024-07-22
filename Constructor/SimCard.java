class SimCard{

  int id;
  String name;
  String plan;
  
  public SimCard(int id,String name,String plan){
    this.id=id;
    this.name=name;
    this.plan=plan;	
  }

  
  public void getPackDetails(){
	  System.out.println("Id: "+id);
	  System.out.println("Name: "+name);
	  System.out.println("Plan: "+plan);
  }
}