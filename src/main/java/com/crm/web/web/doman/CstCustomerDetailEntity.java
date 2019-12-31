package com.crm.web.web.doman;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cst_customer_detail", schema = "crm_hibernate", catalog = "")
public class CstCustomerDetailEntity {
    private long custId;
    private String custRegion;
    private String custZip;
    private String custAddress;
    private String custFax;
    private String custWebsite;
    private String custLicence;
    private String custCorporation;
    private Long custCapital;
    private String custBank;
    private String custPic;
    private String custMemo;

    @Id
    @Column(name = "cust_id")
    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    @Basic
    @Column(name = "cust_region")
    public String getCustRegion() {
        return custRegion;
    }

    public void setCustRegion(String custRegion) {
        this.custRegion = custRegion;
    }

    @Basic
    @Column(name = "cust_zip")
    public String getCustZip() {
        return custZip;
    }

    public void setCustZip(String custZip) {
        this.custZip = custZip;
    }

    @Basic
    @Column(name = "cust_address")
    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    @Basic
    @Column(name = "cust_fax")
    public String getCustFax() {
        return custFax;
    }

    public void setCustFax(String custFax) {
        this.custFax = custFax;
    }

    @Basic
    @Column(name = "cust_website")
    public String getCustWebsite() {
        return custWebsite;
    }

    public void setCustWebsite(String custWebsite) {
        this.custWebsite = custWebsite;
    }

    @Basic
    @Column(name = "cust_licence")
    public String getCustLicence() {
        return custLicence;
    }

    public void setCustLicence(String custLicence) {
        this.custLicence = custLicence;
    }

    @Basic
    @Column(name = "cust_corporation")
    public String getCustCorporation() {
        return custCorporation;
    }

    public void setCustCorporation(String custCorporation) {
        this.custCorporation = custCorporation;
    }

    @Basic
    @Column(name = "cust_capital")
    public Long getCustCapital() {
        return custCapital;
    }

    public void setCustCapital(Long custCapital) {
        this.custCapital = custCapital;
    }

    @Basic
    @Column(name = "cust_bank")
    public String getCustBank() {
        return custBank;
    }

    public void setCustBank(String custBank) {
        this.custBank = custBank;
    }

    @Basic
    @Column(name = "cust_pic")
    public String getCustPic() {
        return custPic;
    }

    public void setCustPic(String custPic) {
        this.custPic = custPic;
    }

    @Basic
    @Column(name = "cust_memo")
    public String getCustMemo() {
        return custMemo;
    }

    public void setCustMemo(String custMemo) {
        this.custMemo = custMemo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CstCustomerDetailEntity that = (CstCustomerDetailEntity) o;
        return custId == that.custId &&
                Objects.equals(custRegion, that.custRegion) &&
                Objects.equals(custZip, that.custZip) &&
                Objects.equals(custAddress, that.custAddress) &&
                Objects.equals(custFax, that.custFax) &&
                Objects.equals(custWebsite, that.custWebsite) &&
                Objects.equals(custLicence, that.custLicence) &&
                Objects.equals(custCorporation, that.custCorporation) &&
                Objects.equals(custCapital, that.custCapital) &&
                Objects.equals(custBank, that.custBank) &&
                Objects.equals(custPic, that.custPic) &&
                Objects.equals(custMemo, that.custMemo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custId, custRegion, custZip, custAddress, custFax, custWebsite, custLicence, custCorporation, custCapital, custBank, custPic, custMemo);
    }
}
