class NewsPaperRunner{

    public static void main(String[] currentNews){
  
      NewsPaper news=new NewsPaper();
	  boolean isCreated=news.createNewsAboutCurrentAffairs("Dainik Bhaskar",1,8,"Hindi",20);
	  System.out.println("News about Current Affairs: "+isCreated);
	  news.getNewsPaperInfo();
	  
	  NewsPaper news1=new NewsPaper();
	  isCreated=news1.createNewsAboutCurrentAffairs("Malayala Manorama",2,5,"Malayala",10.00);
	  System.out.println("News about Current Affairs: "+isCreated);
	  news1.getNewsPaperInfo();
	  
	  NewsPaper news2=new NewsPaper();
	  isCreated=news2.createNewsAboutCurrentAffairs("Times of India",3,10,"English",20.00);
	  System.out.println("News about Current Affairs: "+isCreated);
	  news2.getNewsPaperInfo();

	  NewsPaper news3=new NewsPaper();
	  isCreated=news3.createNewsAboutCurrentAffairs("Amar Ujala",4,5,"Hindi",12.00);
	  System.out.println("News about Current Affairs: "+isCreated);
	  news3.getNewsPaperInfo();

	  NewsPaper news4=new NewsPaper();
	  isCreated=news4.createNewsAboutCurrentAffairs("Eenadu",5,6,"Telugu",13.00);
	  System.out.println("News about Current Affairs: "+isCreated);
	  news4.getNewsPaperInfo();

	  NewsPaper news5=new NewsPaper();
	  isCreated=news5.createNewsAboutCurrentAffairs("Vijaya Karnataka",6,8,"Kannada",15.00);
	  System.out.println("News about Current Affairs: "+isCreated);
	  news5.getNewsPaperInfo();
      
	  NewsPaper news6=new NewsPaper();
	  isCreated=news6.createNewsAboutCurrentAffairs("Daily Sakal",7,5,"Telugu",25.00);
	  System.out.println("News about Current Affairs: "+isCreated);
	  news6.getNewsPaperInfo();

	  NewsPaper news7=new NewsPaper();
	  isCreated=news7.createNewsAboutCurrentAffairs("Ananda Bazar Patrika",8,5,"Bengali",5.00);
	  System.out.println("News about Current Affairs: "+isCreated);
	  news7.getNewsPaperInfo();

	  NewsPaper news8=new NewsPaper();
	  isCreated=news8.createNewsAboutCurrentAffairs("Industan Time",9,12,"Hindi",28.00);
	  System.out.println("News about Current Affairs: "+isCreated);
	  news8.getNewsPaperInfo();

	  NewsPaper news9=new NewsPaper();
	  isCreated=news9.createNewsAboutCurrentAffairs("Lokmat",10,8,"Telugu",30.00);
	  System.out.println("News about Current Affairs: "+isCreated);
	  news9.getNewsPaperInfo();
       
    }
}