package com.springboot.lawfirmapi.entity;

public class LawFirm {

    //Fields
    private int firmId;
    private int firmRegNumber;
    private String firmName;
    private String firmAddress;
    private String state;
    private String firmCategory;
    private String openHr;
    private String closeHr;
    private String firmEmail;
    private String firmContactNo;

    //Constructors

    public LawFirm(int firmId, int firmRegNumber, String firmName,
                   String firmAddress, String state, String firmCategory,
                   String openHr, String closeHr, String firmEmail, String firmContactNo) {
        this.firmId = firmId;
        this.firmRegNumber = firmRegNumber;
        this.firmName = firmName;
        this.firmAddress = firmAddress;
        this.state = state;
        this.firmCategory = firmCategory;
        this.openHr = openHr;
        this.closeHr = closeHr;
        this.firmEmail = firmEmail;
        this.firmContactNo = firmContactNo;
    }

    //Getters & Setters

    public int getFirmId() {
        return firmId;
    }

    public void setFirmId(int firmId) {
        this.firmId = firmId;
    }

    public int getFirmRegNumber() {
        return firmRegNumber;
    }

    public void setFirmRegNumber(int firmRegNumber) {
        this.firmRegNumber = firmRegNumber;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getFirmAddress() {
        return firmAddress;
    }

    public void setFirmAddress(String firmAddress) {
        this.firmAddress = firmAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFirmCategory() {
        return firmCategory;
    }

    public void setFirmCategory(String firmCategory) {
        this.firmCategory = firmCategory;
    }

    public String getOpenHr() {
        return openHr;
    }

    public void setOpenHr(String openHr) {
        this.openHr = openHr;
    }

    public String getCloseHr() {
        return closeHr;
    }

    public void setCloseHr(String closeHr) {
        this.closeHr = closeHr;
    }

    public String getFirmEmail() {
        return firmEmail;
    }

    public void setFirmEmail(String firmEmail) {
        this.firmEmail = firmEmail;
    }

    public String getFirmContactNo() {
        return firmContactNo;
    }

    public void setFirmContactNo(String firmContactNo) {
        this.firmContactNo = firmContactNo;
    }

    //ToString

    @Override
    public String toString() {
        return "LawFirm{" +
                "firmId=" + firmId +
                ", firmRegNumber=" + firmRegNumber +
                ", firmName='" + firmName + '\'' +
                ", firmAddress='" + firmAddress + '\'' +
                ", state='" + state + '\'' +
                ", firmCategory='" + firmCategory + '\'' +
                ", openHr='" + openHr + '\'' +
                ", closeHr='" + closeHr + '\'' +
                ", firmEmail='" + firmEmail + '\'' +
                ", firmContactNo='" + firmContactNo + '\'' +
                '}';
    }
}
