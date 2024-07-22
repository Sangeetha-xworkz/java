class Garden{
	String name;
	String place;
	int id ;
	
	public Garden(String name,String place,int id){
         this.name=name;
		 this.place=place;
		 this.id=id;
	}
	
	public void getDetails(){
		System.out.println("Name: "+name);
		System.out.println("Place: "+place);
		System.out.println("Id: "+id);
	}
}