class Shampoo{

   String brandName;
   int id;
   String quantity;
   String type;
   double price;
   String mgfDate;
   String expDate;
    public Shampoo(String brandName,int id,String quantity,String type,double price,String mgfDate,String expDate){
	   this.brandName=brandName;
	   this.id=id;
	   this.quantity=quantity;
	   this.type=type;
	   this.price=price;
	   this.mgfDate=mgfDate;
	   this.expDate=expDate;
	}
	
	public void getDetails(){
		System.out.println("Brand Name: "+brandName);
		System.out.println("Id: "+id);
		System.out.println("Quantity: "+quantity);
		System.out.println("Type: "+type);
		System.out.println("Price: "+price);
		System.out.println("Mgf Date: "+mgfDate);
		System.out.println("Exp Date: "+expDate);
	}
}