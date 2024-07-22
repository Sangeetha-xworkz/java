class AtmMachine{
      
	  int id;
	  String branch;
	  String bankName;
	  String typeOfAtm;
	  double checkBalance;
	
    public AtmMachine(int id,String branch,String bankName,String typeOfAtm,double checkBalance){
        this.id=id;
       	this.branch=branch;
        this.bankName=bankName;
        this.typeOfAtm=typeOfAtm;
        this.checkBalance=checkBalance;		
    }
	
	public void getAtmDetails(){
		System.out.println("Id: "+id);
		System.out.println("Branch: "+branch);
		System.out.println("Bank Name: "+bankName);
		System.out.println("Type of Atm: "+typeOfAtm);
		System.out.println("Check Balance: "+checkBalance);
		
	}
}