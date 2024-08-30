class ChatShopRunner{

   public static void main(String[] shop){
   
     boolean isAdded=ChatShop.createChatName("Bhel Puri");
	 System.out.println("Chat Name Added : "+isAdded);
	  isAdded=ChatShop.createChatName("Masala Puri");
	 System.out.println("Chat Name Added : "+isAdded);
	  isAdded=ChatShop.createChatName("Sev Puri");
	 System.out.println("Chat Name Added : "+isAdded);
	  isAdded=ChatShop.createChatName("Tikki Puri");
	 System.out.println("Chat Name Added : "+isAdded);
	  
	  isAdded=ChatShop.createChatName("Pani Puri");
	 System.out.println("Chat Name Added : "+isAdded);
	  
	  isAdded=ChatShop.createChatName("Dhai Puri");
	 System.out.println("Chat Name Added : "+isAdded);
	  
	 isAdded=ChatShop.createChatName("Mix Puri");
	 System.out.println("Chat Name Added : "+isAdded);
	  
	 
	 ChatShop.getChatNames();
	 
	 
	 //for updateChatName
	 boolean chatNameUpdate=ChatShop.updateChatName("Tikki Puri","Samosa");
	 System.out.println("Chat Name Updated: "+chatNameUpdate);

	  chatNameUpdate=ChatShop.updateChatName("Masala Puri","Toast");
	 System.out.println("Chat Name Updated: "+chatNameUpdate);

     ChatShop.getChatNames();
	 
	 //deleteChatName
	 boolean isChatNameDeleted=ChatShop.deleteChatName("Samosa");
	 System.out.println("Chat Name Deleted: "+isChatNameDeleted);
	 
	 isChatNameDeleted=ChatShop.deleteChatName(null);
	 System.out.println("Chat Name Deleted: "+isChatNameDeleted);
	 
	 ChatShop.getChatNames();
   }

}