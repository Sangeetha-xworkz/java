class Resort{
	String areaInSqrt;
	String propertyName;
	String ownerName;
	int noOfRooms;
	int id;
	
	public Resort(String areaInSqrt,String propertyName,String ownerName,int noOfRooms,int id){
	  this.areaInSqrt=areaInSqrt;
	  this.propertyName=propertyName;
	  this.ownerName=ownerName;
	  this.noOfRooms=noOfRooms;
	  this.id=id;
	}
	
	public void getDetails(){
		System.out.println("Area in Square: "+areaInSqrt);
		System.out.println("Property Name: "+propertyName);
		System.out.println("Owner Name: "+ownerName);
		System.out.println("Number of Rooms: "+noOfRooms);
		System.out.println("Id: "+id);
	}
}