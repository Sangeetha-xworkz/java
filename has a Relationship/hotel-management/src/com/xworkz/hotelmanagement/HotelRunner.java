package com.xworkz.hotelmanagement;

import com.xworkz.hotelmanagement.hotel.Hotel;
import com.xworkz.hotelmanagement.rooms.Rooms;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel=new Hotel();
        hotel.hotelName="";

        Rooms rooms=new Rooms();
        rooms.roomNo=18;
        rooms.roomFloor=3;
        rooms.roomName="Leela Palace";
        rooms.roomArea="90 msqr";
        rooms.price=23364;

        hotel.Allow(rooms);
    }
}
