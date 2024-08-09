package com.xworkz.hotelmanagement.rooms;

public class Rooms {
    public int roomNo;
    public int roomFloor;
    public String roomName;
    public String roomArea;
    public double price;

    public void getAllRoomNames(){
        System.out.println("Room Number: "+roomNo);
        System.out.println("Room located in Floor Number: "+roomFloor);
        System.out.println("Room Name: "+roomName);
        System.out.println("Room Area: "+roomArea);
        System.out.println("Room Color: "+price);
    }
}
