package com.springboot.lawfirmapi.entity;


import javax.persistence.*;

//Employee Entity
@Entity //This will let Java know that this is an entity that we are going to map to a database table.
@Table(name = "law_firm") //This is for the actual name of the database table we are mapping to the class.

    //Define fields
public class LawFirm {

    //Fields
    @Id //This will map the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This will auto increment your primary key
    @Column(name = "firm_id") //This is mapping the primary key to the id column in the table.
    private int firmId;

    @Column(name = "firm_reg_number")
    private int firmRegNumber;

    @Column(name = "firm_name")
    private String firmName;

    @Column(name = "firm_address")
    private String firmAddress;

    @Column(name = "state")
    private String state;

    @Column(name ="firm_category" )
    private String firmCategory;

    @Column(name ="open_hr")
    private String openHr;

    @Column(name = "close_hr")
    private String closeHr;

    @Column(name = "firm_email")
    private String firmEmail;

    @Column(name = "firm_contact_no")
    private String firmContactNo;

    //Default Constructor
    public LawFirm(){

    }
    //Para Constructors

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
