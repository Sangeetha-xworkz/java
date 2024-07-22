class AmusementPark{
	String name;
	String place;
	int id ;
	int noOfGames;
	
	public AmusementPark(String name,String place,int id, int noOfGames){
		this.name=name;
		this.place=place;
		this.id=id;
		this.noOfGames=noOfGames;
	}
	
	public void getDetails(){
	  System.out.println("Park Name: "+name);
      System.out.println("Place: "+place);
      System.out.println("Id: "+id);
      System.out.println("Number of Games: "+noOfGames);	  
		
	}
}