package com.pluralsight;

public class Reservation {
    private String roomType;
    private double roomPrice;
    private int numOfNights;
    private boolean isWeekend;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }
    public void setRoomPrice(){
        if(roomType.equalsIgnoreCase("king")) {
            this.roomPrice = 139;
        }
        if(roomType.equalsIgnoreCase("double")) {
            this.roomPrice = 124;
        }
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        if(isWeekend) {
            return numOfNights * ((roomPrice * .1) + roomPrice);

        } else {
            return numOfNights * roomPrice;
        }
    }
}
