package com.roadTransport.RTVehicle.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table
@Entity
public class VehicleTemporaryDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @NotNull
    @Column
    private String vehicleType;

    @NotNull
    @Column(unique = true)
    private String vehicleNumber;

    @NotNull
    @Column
    private String ownerName;

    @NotNull
    @Column(length = 10)
    private long ownerMobileNumber;

    @NotNull
    @Column
    private String vehicleRcNumber;

    @NotNull
    @Column
    private String vehicleInsuranceNumber;

    @NotNull
    @Column
    private String vehicleTotalTyres;

    @NotNull
    @Column
    private String vehicleName;

    @NotNull
    @Column
    private String vehicleCompanyName;

    @Column(columnDefinition="TEXT")
    private String vehicleImage;

    @Column(columnDefinition="TEXT")
    private String rcImage;

    @Column(columnDefinition="TEXT")
    private String insuranceImage;

    @Column
    private String driverName;

    @NotNull
    @Column
    private long vehicleSeatingCapacity;

    @NotNull
    @Column
    private String vehicleSize;

    @NotNull
    @Column
    private String vehicleLoadCapacity;

    @NotNull
    @Column
    private String vehicleFuelType;

    @NotNull
    @Column
    private long vehicleModel;

    @NotNull
    @Column
    private String vehicleTransportName;

    @NotNull
    @Column
    private String vehicleTransportNumber;

    @Column
    private boolean vehicleStatus;

    @Column
    private long otp;

    @Column
    private long createdDate;

    @Column
    private long modiedDate;

    public long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }

    public long getModiedDate() {
        return modiedDate;
    }

    public void setModiedDate(long modiedDate) {
        this.modiedDate = modiedDate;
    }

    public long getOtp() {
        return otp;
    }

    public void setOtp(long otp) {
        this.otp = otp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getOwnerMobileNumber() {
        return ownerMobileNumber;
    }

    public void setOwnerMobileNumber(long ownerMobileNumber) {
        this.ownerMobileNumber = ownerMobileNumber;
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

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
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
        return "VehicleTemporayDetails{" +
                "id=" + id +
                ", vehicleType='" + vehicleType + '\'' +
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
                ", driverName='" + driverName + '\'' +
                ", vehicleSeatingCapacity=" + vehicleSeatingCapacity +
                ", vehicleSize='" + vehicleSize + '\'' +
                ", vehicleLoadCapacity='" + vehicleLoadCapacity + '\'' +
                ", vehicleFuelType='" + vehicleFuelType + '\'' +
                ", vehicleModel=" + vehicleModel +
                ", vehicleTransportName='" + vehicleTransportName + '\'' +
                ", vehicleTransportNumber='" + vehicleTransportNumber + '\'' +
                ", vehicleStatus=" + vehicleStatus +
                ", otp=" + otp +
                ", createdDate='" + createdDate + '\'' +
                ", modiedDate='" + modiedDate + '\'' +
                '}';
    }
}
