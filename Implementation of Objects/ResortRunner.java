class ResortRunner{

	public static void main(String[] resorttt){
	
	  Resort res = new Resort();
	  boolean isPlanCreated=res.createResortPlanning(1,"Sathvik","Gamyam Beach Resort","150 acre",100);
	  System.out.println("Created Plan is Ok: "+isPlanCreated);
	  res.getPlanInfo();

	  Resort res1= new Resort();
      isPlanCreated=res1.createResortPlanning(2,"Sangeetha","Evolve Back","200 acre",37);
	  System.out.println("Created Plan is Ok: "+isPlanCreated);
	  res1.getPlanInfo();
	  
	  Resort res2 = new Resort();
 	  isPlanCreated=res2.createResortPlanning(3,"Priyanka","Rosetta by Ferns","100 acre",42);
	  System.out.println("Created Plan is Ok: "+isPlanCreated);
	  res2.getPlanInfo();

	  Resort res3 = new Resort();
 	  isPlanCreated=res3.createResortPlanning(4,"Niveditha","Taj Resort","100 acre",100);
	  System.out.println("Created Plan is Ok: "+isPlanCreated);
	  res3.getPlanInfo();

	  Resort res4 = new Resort();
 	  isPlanCreated=res4.createResortPlanning(5,"Shivu","Swaswara Gokarna","150 acre",2);
	  System.out.println("Created Plan is Ok: "+isPlanCreated);
	  res4.getPlanInfo();

	  Resort res5 = new Resort();
 	  isPlanCreated=res5.createResortPlanning(6,"Pooja","Evolve Back","300 acre",40);
	  System.out.println("Created Plan is Ok: "+isPlanCreated);
	  res5.getPlanInfo();
	  
	  Resort res6 = new Resort();
 	  isPlanCreated=res6.createResortPlanning(7,"Pavithra","Machaan Plantation resort","200 acre",50);
	  System.out.println("Created Plan is Ok: "+isPlanCreated);
	  res6.getPlanInfo();

	  Resort res7 = new Resort();
 	  isPlanCreated=res7.createResortPlanning(8,"Divya","Regenta Resort","100 acre",20);
	  System.out.println("Created Plan is Ok: "+isPlanCreated);
	  res7.getPlanInfo();
       
	  Resort res8 = new Resort();
 	  isPlanCreated=res8.createResortPlanning(9,"Vani","Postcard Arabian Sea","250 acre",100);
	  System.out.println("Created Plan is Ok: "+isPlanCreated);
	  res8.getPlanInfo();

	  Resort res9 = new Resort();
 	  isPlanCreated=res9.createResortPlanning(10,"Priya","The Tamara","150 acre",38);
	  System.out.println("Created Plan is Ok: "+isPlanCreated);
	  res9.getPlanInfo();

	}
}