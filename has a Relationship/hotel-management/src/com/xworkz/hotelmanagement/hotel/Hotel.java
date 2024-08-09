package com.xworkz.hotelmanagement.hotel;

import com.xworkz.hotelmanagement.rooms.Rooms;

public class Hotel {

       public String hotelName;
       public Rooms rooms;

       public boolean Allow(Rooms rooms){
           boolean isAllowed=false;

           if(hotelName==""){
               System.out.println("Hotel found...continue with further details");
               if(rooms!=null){
                   this.rooms=rooms;
                   this.rooms.getAllRoomNames();
                   System.out.println("Detail about available Rooms");
               }else System.out.println("Con't provide Room Details....Sorry");
           }else System.out.println("Hotel not found...");
           return isAllowed;
       }
}
