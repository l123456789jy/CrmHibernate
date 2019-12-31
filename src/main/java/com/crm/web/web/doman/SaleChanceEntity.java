package com.crm.web.web.doman;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "sale_chance", schema = "crm_hibernate", catalog = "")
public class SaleChanceEntity {
    private String chanId;
    private String chanName;
    private long chanCustId;
    private long chanUserId;
    private Integer chanMoney;
    private String chanType;
    private String chanSource;
    private String chanState;
    private Long chanLkmId;
    private Date chanLinktime;
    private String chanDesc;

    @Id
    @Column(name = "chan_id")
    public String getChanId() {
        return chanId;
    }

    public void setChanId(String chanId) {
        this.chanId = chanId;
    }

    @Basic
    @Column(name = "chan_name")
    public String getChanName() {
        return chanName;
    }

    public void setChanName(String chanName) {
        this.chanName = chanName;
    }

    @Basic
    @Column(name = "chan_cust_id")
    public long getChanCustId() {
        return chanCustId;
    }

    public void setChanCustId(long chanCustId) {
        this.chanCustId = chanCustId;
    }

    @Basic
    @Column(name = "chan_user_id")
    public long getChanUserId() {
        return chanUserId;
    }

    public void setChanUserId(long chanUserId) {
        this.chanUserId = chanUserId;
    }

    @Basic
    @Column(name = "chan_money")
    public Integer getChanMoney() {
        return chanMoney;
    }

    public void setChanMoney(Integer chanMoney) {
        this.chanMoney = chanMoney;
    }

    @Basic
    @Column(name = "chan_type")
    public String getChanType() {
        return chanType;
    }

    public void setChanType(String chanType) {
        this.chanType = chanType;
    }

    @Basic
    @Column(name = "chan_source")
    public String getChanSource() {
        return chanSource;
    }

    public void setChanSource(String chanSource) {
        this.chanSource = chanSource;
    }

    @Basic
    @Column(name = "chan_state")
    public String getChanState() {
        return chanState;
    }

    public void setChanState(String chanState) {
        this.chanState = chanState;
    }

    @Basic
    @Column(name = "chan_lkm_id")
    public Long getChanLkmId() {
        return chanLkmId;
    }

    public void setChanLkmId(Long chanLkmId) {
        this.chanLkmId = chanLkmId;
    }

    @Basic
    @Column(name = "chan_linktime")
    public Date getChanLinktime() {
        return chanLinktime;
    }

    public void setChanLinktime(Date chanLinktime) {
        this.chanLinktime = chanLinktime;
    }

    @Basic
    @Column(name = "chan_desc")
    public String getChanDesc() {
        return chanDesc;
    }

    public void setChanDesc(String chanDesc) {
        this.chanDesc = chanDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleChanceEntity that = (SaleChanceEntity) o;
        return chanCustId == that.chanCustId &&
                chanUserId == that.chanUserId &&
                Objects.equals(chanId, that.chanId) &&
                Objects.equals(chanName, that.chanName) &&
                Objects.equals(chanMoney, that.chanMoney) &&
                Objects.equals(chanType, that.chanType) &&
                Objects.equals(chanSource, that.chanSource) &&
                Objects.equals(chanState, that.chanState) &&
                Objects.equals(chanLkmId, that.chanLkmId) &&
                Objects.equals(chanLinktime, that.chanLinktime) &&
                Objects.equals(chanDesc, that.chanDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chanId, chanName, chanCustId, chanUserId, chanMoney, chanType, chanSource, chanState, chanLkmId, chanLinktime, chanDesc);
    }
}
