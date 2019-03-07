package com.roadTransport.RTVehicle.model;

public class VehicleResponse {

    private String message;
    private long otp;

    public long getOtp() {
        return otp;
    }

    public void setOtp(long otp) {
        this.otp = otp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "VehicleResponse{" +
                "message='" + message + '\'' +
                ", otp=" + otp +
                '}';
    }
}
