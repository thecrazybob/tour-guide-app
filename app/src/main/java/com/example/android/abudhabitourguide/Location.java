package com.example.android.abudhabitourguide;

/**
 * Created by Sohail on 12/31/16.
 */

public class Location {

    // Variables for Location Name, Address and Image Resource IDs
    private int mLocationName;
    private int mLocationAddress;
    private int mLocationImage;

    // Constructor without Image
    public Location(int LocationName, int LocationAddress) {
        mLocationName = LocationName;
        mLocationAddress = LocationAddress;
    }

    // Constructor with Image
    public Location(int LocationName, int LocationAddress, int LocationImage) {
        mLocationName = LocationName;
        mLocationAddress = LocationAddress;
        mLocationImage = LocationImage;
    }

    // Set Location Name
    public void setLocationName(int LocationName) {
        mLocationName = LocationName;
    }

    // Set Location Address
    public void setLocationAddress(int LocationAddress) {
        mLocationAddress = LocationAddress;
    }

    // Set Location Image
    public void setLocationImage(int LocationImage) {
        mLocationImage = LocationImage;
    }

    // Get Location Name
    public int getLocationName() {
        return mLocationName;
    }

    // Get Location Address
    public int getLocationAddress() {
        return mLocationAddress;
    }

    // Get Location Image
    public int getLocationImage() {
        return mLocationImage;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        if (mLocationImage == 0) {
            return false;
        }
        else { return true; }
    }

}
