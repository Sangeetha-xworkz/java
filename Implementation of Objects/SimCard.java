class SimCard{

  int id;
  String name;
  String plan;
  
    public boolean simRequirements(int id,String name,String plan){
		boolean isAllRequirementsPresent=false;
		if(name!=null||plan!=null){
			this.id=id;
			this.name=name;
			this.plan=plan;
			isAllRequirementsPresent=true;
		}
       return isAllRequirementsPresent;
    }
	
	public void getSimInfo(){
		
		System.out.println("Id: "+id);
		System.out.println("SimCard Name: "+name);
		System.out.println("Plan: "+plan);
	}

}