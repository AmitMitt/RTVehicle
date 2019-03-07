package com.roadTransport.RTVehicle.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Table
@Entity
public class VehicleDetails implements Serializable {

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
    private String createdDate;

    @Column
    private String modifedDate;

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifedDate() {
        return modifedDate;
    }

    public void setModifedDate(String modifedDate) {
        this.modifedDate = modifedDate;
    }

    public long getOwnerMobileNumber() {
        return ownerMobileNumber;
    }

    public void setOwnerMobileNumber(long ownerMobileNumber) {
        this.ownerMobileNumber = ownerMobileNumber;
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
        return "VehicleDetails{" +
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
                ", modifedDate='" + modifedDate + '\'' +
                '}';
    }
}
