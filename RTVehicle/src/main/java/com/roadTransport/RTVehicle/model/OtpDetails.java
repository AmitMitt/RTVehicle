package com.roadTransport.RTVehicle.model;


public class OtpDetails {

    private long Id;
    private long otpNumber;
    private long otpStartTime;
    private long otpEndTime;
    private long userMobileNumber;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getOtpNumber() {
        return otpNumber;
    }

    public void setOtpNumber(long otpNumber) {
        this.otpNumber = otpNumber;
    }

    public long getOtpStartTime() {
        return otpStartTime;
    }

    public void setOtpStartTime(long otpStartTime) {
        this.otpStartTime = otpStartTime;
    }

    public long getOtpEndTime() {
        return otpEndTime;
    }

    public void setOtpEndTime(long otpEndTime) {
        this.otpEndTime = otpEndTime;
    }

    public long getUserMobileNumber() {
        return userMobileNumber;
    }

    public void setUserMobileNumber(long userMobileNumber) {
        this.userMobileNumber = userMobileNumber;
    }
}
