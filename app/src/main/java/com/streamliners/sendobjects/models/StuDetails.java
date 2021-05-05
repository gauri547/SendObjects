package com.streamliners.sendobjects.models;

import android.os.Parcel;
import android.os.Parcelable;

public class StuDetails implements Parcelable {
    private String name;
    private String rollNumber;
    private String mobileNumber;
    private String gender;

    /**
     * constructor to construct StuDetails class
     */
    public StuDetails(){
    }

    /**
     *
     * @param name
     * @param rollNumber
     * @param mobileNumber
     * @param gender
     */

    public StuDetails(String name,String rollNumber,String mobileNumber,String gender){
        this.name = name;
        this.rollNumber = rollNumber;
        this.mobileNumber = mobileNumber;
        this.gender = gender;

    }

    public StuDetails(Parcel in){
        String[] data = new String[4];
        in.readStringArray(data);
        // the order should be same as in ToParcel() method
        this.name = data[0];
        this.rollNumber = data[1];
        this.mobileNumber = data[2];
        this.gender = data[3];
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeStringArray(new String[]{this.name,
                this.rollNumber,
                this.mobileNumber,
                this.gender});
    }
    public static final Parcelable.Creator CREATOR= new Parcelable.Creator(){
        public StuDetails createFromParcel(Parcel in){
            return new StuDetails(in);
        }
        public StuDetails[] newArray(int size){
            return new StuDetails[size];
        }
    };
    // all the getters

    /**
     * @return name of the student
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return roll number of the student
     */

    public String getRollNumber() {
        return rollNumber;
    }

    /**
     *
     * @return mobile number of the student
     */

    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     *
     * @return gender of the student
     */
    public String getGender() {
        return gender;
    }
}
