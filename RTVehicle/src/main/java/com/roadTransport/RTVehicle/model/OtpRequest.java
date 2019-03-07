package com.roadTransport.RTVehicle.model;

public class OtpRequest {

    private String vehicleNumber;
    private long otp;
    private long userMobileNumber;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public long getOtp() {
        return otp;
    }

    public void setOtp(long otp) {
        this.otp = otp;
    }

    public long getUserMobileNumber() {
        return userMobileNumber;
    }

    public void setUserMobileNumber(long userMobileNumber) {
        this.userMobileNumber = userMobileNumber;
    }

    @Override
    public String toString() {
        return "OtpRequest{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", otp=" + otp +
                ", userMobileNumber=" + userMobileNumber +
                '}';
    }
}
