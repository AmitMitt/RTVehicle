package com.roadTransport.RTVehicle.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class DeletedVehicleData {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column
    private String vehicleType;

    @Column
    private String vehicleNumber;

    @Column
    private String ownerName;

    @Column
    private long ownerMobileNumber;

    @Column
    private String vehicleRcNumber;

    @Column
    private String vehicleInsuranceNumber;

    @Column
    private String vehicleTotalTyres;

    @Column
    private String vehicleName;

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

    @Column
    private long vehicleSeatingCapacity;

    @Column
    private String vehicleSize;

    @Column
    private String vehicleLoadCapacity;

    @Column
    private String vehicleFuelType;

    @Column
    private long vehicleModel;

    @Column
    private String vehicleTransportName;

    @Column
    private String vehicleTransportNumber;

    @Column
    private boolean vehicleStatus;

    @Column
    private String createdDate;

    @Column
    private long otp;

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

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "DeletedVehicleData{" +
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
                ", createdDate='" + createdDate + '\'' +
                ", otp='" + otp + '\'' +
                '}';
    }
}
