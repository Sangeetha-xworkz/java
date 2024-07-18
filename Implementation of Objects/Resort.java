class Resort{
	int id;
	String ownerName;
	String propertyName;
	String areaInSqrt;	
	int noOfRooms;
	
	public boolean createResortPlanning(int id,String ownerName,String propertyName,String areaInSqrt,int noOfRooms){
       boolean isPlanningOk=false;
	   if(areaInSqrt!=null&&noOfRooms>0){
		   this.id=id;
		   this.ownerName=ownerName;
		   this.propertyName=propertyName;
		   this.areaInSqrt=areaInSqrt;
		   this.noOfRooms=noOfRooms;
		   
		   isPlanningOk=true;
	   }
	   return isPlanningOk;
	}
	
	public void getPlanInfo(){
		System.out.println("Id: "+id);
		System.out.println("Owner Name: "+ownerName);
		System.out.println("Property Name: "+propertyName);
		System.out.println("Total Area: "+areaInSqrt);
		System.out.println("Number Of Rooms: "+noOfRooms);
		
	}


}