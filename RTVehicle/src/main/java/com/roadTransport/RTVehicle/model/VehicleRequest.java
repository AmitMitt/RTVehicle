package com.roadTransport.RTVehicle.model;

public class VehicleRequest {

    private String vehicleType;
    private String vehicleNumber;
    private String ownerName;
    private long ownerMobileNumber;
    private String vehicleRcNumber;
    private String vehicleInsuranceNumber;
    private String vehicleTotalTyres;
    private String vehicleName;
    private String vehicleCompanyName;
    private String vehicleImage;
    private String rcImage;
    private String insuranceImage;
    private String driverImage;
    private String driverName;
    private long driverAge;
    private String driverLicenceImage;
    private String driverLicenceNumber;
    private long vehicleSeatingCapacity;
    private String vehicleSize;
    private String vehicleLoadCapacity;
    private String vehicleFuelType;
    private long vehicleModel;
    private String vehicleTransportName;
    private String vehicleTransportNumber;
    private boolean vehicleStatus;

    public long getOwnerMobileNumber() {
        return ownerMobileNumber;
    }

    public void setOwnerMobileNumber(long ownerMobileNumber) {
        this.ownerMobileNumber = ownerMobileNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleRcNumber() {
        return vehicleRcNumber;
    }

    public void setVehicleRcNumber(String vehicleRcNumber) {
        this.vehicleRcNumber = vehicleRcNumber;
    }

    public String getVehicleInsuranceNumber() {
        return vehicleInsuranceNumber;
    }

    public void setVehicleInsuranceNumber(String vehicleInsuranceNumber) {
        this.vehicleInsuranceNumber = vehicleInsuranceNumber;
    }

    public String getVehicleTotalTyres() {
        return vehicleTotalTyres;
    }

    public void setVehicleTotalTyres(String vehicleTotalTyres) {
        this.vehicleTotalTyres = vehicleTotalTyres;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleCompanyName() {
        return vehicleCompanyName;
    }

    public void setVehicleCompanyName(String vehicleCompanyName) {
        this.vehicleCompanyName = vehicleCompanyName;
    }

    public String getVehicleImage() {
        return vehicleImage;
    }

    public void setVehicleImage(String vehicleImage) {
        this.vehicleImage = vehicleImage;
    }

    public String getRcImage() {
        return rcImage;
    }

    public void setRcImage(String rcImage) {
        this.rcImage = rcImage;
    }

    public String getInsuranceImage() {
        return insuranceImage;
    }

    public void setInsuranceImage(String insuranceImage) {
        this.insuranceImage = insuranceImage;
    }

    public String getDriverImage() {
        return driverImage;
    }

    public void setDriverImage(String driverImage) {
        this.driverImage = driverImage;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public long getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(long driverAge) {
        this.driverAge = driverAge;
    }

    public String getDriverLicenceImage() {
        return driverLicenceImage;
    }

    public void setDriverLicenceImage(String driverLicenceImage) {
        this.driverLicenceImage = driverLicenceImage;
    }

    public String getDriverLicenceNumber() {
        return driverLicenceNumber;
    }

    public void setDriverLicenceNumber(String driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber;
    }

    public long getVehicleSeatingCapacity() {
        return vehicleSeatingCapacity;
    }

    public void setVehicleSeatingCapacity(long vehicleSeatingCapacity) {
        this.vehicleSeatingCapacity = vehicleSeatingCapacity;
    }

    public String getVehicleSize() {
        return vehicleSize;
    }

    public void setVehicleSize(String vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    public String getVehicleLoadCapacity() {
        return vehicleLoadCapacity;
    }

    public void setVehicleLoadCapacity(String vehicleLoadCapacity) {
        this.vehicleLoadCapacity = vehicleLoadCapacity;
    }

    public String getVehicleFuelType() {
        return vehicleFuelType;
    }

    public void setVehicleFuelType(String vehicleFuelType) {
        this.vehicleFuelType = vehicleFuelType;
    }

    public long getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(long vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleTransportName() {
        return vehicleTransportName;
    }

    public void setVehicleTransportName(String vehicleTransportName) {
        this.vehicleTransportName = vehicleTransportName;
    }

    public String getVehicleTransportNumber() {
        return vehicleTransportNumber;
    }

    public void setVehicleTransportNumber(String vehicleTransportNumber) {
        this.vehicleTransportNumber = vehicleTransportNumber;
    }

    public boolean isVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(boolean vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    @Override
    public String toString() {
        return "VehicleRequest{" +
                "vehicleType='" + vehicleType + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerMobileNumber=" + ownerMobileNumber +
                ", vehicleRcNumber='" + vehicleRcNumber + '\'' +
                ", vehicleInsuranceNumber='" + vehicleInsuranceNumber + '\'' +
                ", vehicleTotalTyres='" + vehicleTotalTyres + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleCompanyName='" + vehicleCompanyName + '\'' +
                ", vehicleImage='" + vehicleImage + '\'' +
                ", rcImage='" + rcImage + '\'' +
                ", insuranceImage='" + insuranceImage + '\'' +
                ", driverImage='" + driverImage + '\'' +
                ", driverName='" + driverName + '\'' +
                ", driverAge=" + driverAge +
                ", driverLicenceImage='" + driverLicenceImage + '\'' +
                ", driverLicenceNumber='" + driverLicenceNumber + '\'' +
                ", vehicleSeatingCapacity=" + vehicleSeatingCapacity +
                ", vehicleSize='" + vehicleSize + '\'' +
                ", vehicleLoadCapacity='" + vehicleLoadCapacity + '\'' +
                ", vehicleFuelType='" + vehicleFuelType + '\'' +
                ", vehicleModel=" + vehicleModel +
                ", vehicleTransportName='" + vehicleTransportName + '\'' +
                ", vehicleTransportNumber='" + vehicleTransportNumber + '\'' +
                ", vehicleStatus=" + vehicleStatus +
                '}';
    }
}
