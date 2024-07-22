class NewsPaper{
  String companyName;
  int id;
  int noOfPages;
  String language;
  double price;
  
  public NewsPaper(String companyName,int id,int noOfPages,String language,double price){
     this.companyName=companyName;
	 this.id=id;
	 this.noOfPages=noOfPages;
	 this.language=language;
	 this.price=price;
  }
  
  public void getDetails(){
	  System.out.println("Comapny Name: "+companyName);
	  System.out.println("Id: "+id);
	  System.out.println("Number of Pages: "+noOfPages);
	  System.out.println("Languages: "+language);
	  System.out.println("Price: "+price);
  }
}