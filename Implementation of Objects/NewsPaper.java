class NewsPaper{
  String companyName;
  int id;
  int noOfPages;
  String language;
  double price;
  
  public boolean createNewsAboutCurrentAffairs(String companyName,int id,int noOfPages,String language,double price){
    boolean isNewsAboutCurrentAffairs=false;
        
	   if(companyName!=null&&id>0&&price>0){
		   this.companyName=companyName;
		   this.id=id;
		   this.noOfPages=noOfPages;
		   this.language=language;
		   this.price=price;
		   isNewsAboutCurrentAffairs=true;
	   }
	   return isNewsAboutCurrentAffairs;
  }
  
  public void getNewsPaperInfo(){
	  System.out.println("Company Name: "+companyName);
      System.out.println("Id: "+id);
      System.out.println("Number of Pages: "+noOfPages);
      System.out.println("Language: "+language);
      System.out.println("Total Price: "+price);	  
  }
}