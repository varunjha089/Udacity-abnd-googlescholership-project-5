package com.example.bharatmk257.guide;

public class Places {
    private String nameOfPlace;
    private int imageOfPlace;
    private String locationButton;
    public Places(){

    }

    public Places(String nameOfPlace,int imageOfPlace,String locationButton){
        this.nameOfPlace = nameOfPlace;
        this.imageOfPlace = imageOfPlace;
        this.locationButton = locationButton;
    }

    public String getNameOfPlace(){
        return nameOfPlace;
    }

    public void setNameOfPlace(String nameOfPlace) {
        this.nameOfPlace = nameOfPlace;
    }

    public int getImageOfPlace(){
        return imageOfPlace;
    }

    public void setImageOfPlace(int imageOfPlace) {
        this.imageOfPlace = imageOfPlace;
    }

    public String getLocationButton(){
        return locationButton;
    }

    public void setLocationButton(String locationButton) {
        this.locationButton = locationButton;
    }
}
