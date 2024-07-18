class Agarbathi{
   
   String brandName;
   int id;
   int noOfSticks;
   String fragrance;
   double price;
   
   public boolean toPray(String brandName,int id,int noOfSticks,String fragrance,double price){
     boolean isforPooja=false;
	 if(brandName!=null&&id>0&&price>0){
	  this.brandName=brandName;
	  this.id=id;
	  this.noOfSticks=noOfSticks;
	  this.fragrance=fragrance;
	  this.price=price;
	  isforPooja=true;
	 }
     return isforPooja;
   }
   
   public void getAgarbathiInfo(){
	   System.out.println("Brand Name is: "+brandName);
	   System.out.println("Id: "+id);
	   System.out.println("Total Number of Sticks: "+noOfSticks);
	   System.out.println("Fragrance: "+fragrance);
	   System.out.println("Price: "+price);
   }
}