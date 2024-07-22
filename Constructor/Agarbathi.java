class Agarbathi{
   String brandName;
   int id;
   int noOfSticks;
   String fragrance;
   double price;
  
//parameterized Constructor  
   public Agarbathi(String brandName,int id,int noOfSticks,String fragrance,double price){
     this.brandName=brandName;
	 this.id=id;
	 this.noOfSticks=noOfSticks;
	 this.fragrance=fragrance;
	 this.price=price;
   }
   
   public void getDetails(){
	   System.out.println("Brand Name: "+brandName);
	   System.out.println("Id: "+id);
	   System.out.println("Number of Sticks: "+noOfSticks);
	   System.out.println("Fragrance: "+fragrance);
	   System.out.println("Price: "+price);
	   
   }
}