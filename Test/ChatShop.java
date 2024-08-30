
import java.util.*;
class ChatShop{
    
   static String name="Sri";
   static String ownerName="Shreee";
   
   static String chatNames[]={null,null,null,null,null,null};
   static double chatPrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
   static int chatNameIndex; 
   static int chatPriceIndex;
   static int index;
   
 public static boolean createChatName(String chatName){
       System.out.println("createChatName Started");
	    boolean ischatNameCreated=false;

	   if(chatNameIndex<chatNames.length){	
	     if(chatName!=null){
	       chatNames[chatNameIndex]=chatName;
		   chatNameIndex++;
		   ischatNameCreated=true;
		  
	      }else System.out.println("Chat Name is null, Please Give Chat Name...");
	   }else{
		   System.out.println("All Chat Names are ADDED......");
	   } 
	   System.out.println("createChatName ended");
      return ischatNameCreated;
   }
   
   
   public static boolean addChatPrice(double chatPrice){
	   
	   System.out.println("addChatPrice Started");
	   boolean isPriceAdded=false;
	   //here we need to take parameter name while giving condition
	   if(chatPrice>0.0){
		   chatPrices[chatPriceIndex]=chatPrice; chatPriceIndex++;
	       isPriceAdded=true;
	   }else System.out.println("Price Can't be Zero...");
	   
	   System.out.println("addChatPrice ended");
	   
	   return isPriceAdded;
   }
   
   public static void getChatNames(){
     
	 
	 System.out.println("Shop Name is: "+name);
	 System.out.println("Owner is: "+ownerName);
   
     System.out.println("Chat Name are: ");
	 for(String chatName:chatNames)
	
	   System.out.println(chatName);
	 }
   
   public static void getChatPrice(){
	   System.out.println("Price for each Chat: ");
		 for(double chatPrice:chatPrices)
		 System.out.println(chatPrice);
	 
   }
   
   
   //update ChatName
   public static boolean updateChatName(String oldChatName,String newChatName){
	   System.out.println("updateChatName Started");
	   boolean isChatNameUpdated=false;
	   for(int index=0;index<chatNames.length;index++){
		   if(oldChatName==chatNames[index]){
			   chatNames[index]=newChatName;
		        isChatNameUpdated=true;
		   }
	   }
	   if(isChatNameUpdated==false){
		   System.out.println(oldChatName+"not found");
	   }
	   System.out.println("updateChatName ended");
	   return isChatNameUpdated;
   }
   
   //DELETE OPERATION
   public static boolean deleteChatName(String chatNameTobeDeleted){
	   
	   System.out.println("deleteChatName Started");
	   boolean isChatNameDeleted=false;
	   
	   int oldIndex,newIndex;
	   for(oldIndex=0,newIndex=0;oldIndex<chatNames.length;oldIndex++){
		   if(chatNames[oldIndex]!=chatNameTobeDeleted){
			   chatNames[newIndex]=chatNames[oldIndex];
			   newIndex++;
			   //isChatNameDeleted=true;
		   }else isChatNameDeleted=true;

	   }
	   chatNames=Arrays.copyOf(chatNames,newIndex);
	   //copyOf: create a new size  with a duplicate for old array only
	   
	   if(isChatNameDeleted==false){
		   System.out.println(chatNameTobeDeleted+" not found");
	   }
	 System.out.println("deleteChatName ended");  
    return isChatNameDeleted;
	
   }
   

}