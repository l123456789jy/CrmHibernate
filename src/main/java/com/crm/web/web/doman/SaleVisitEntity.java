package com.crm.web.web.doman;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "sale_visit", schema = "crm_hibernate", catalog = "")
public class SaleVisitEntity {
    private String visitId;
    private Long visitCustId;
    private Long visitUserId;
    private Long visitLkmId;
    private Date visitTime;
    private String visitAddr;
    private String visitDetail;
    private Date visitNexttime;

    @Id
    @Column(name = "visit_id")
    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    @Basic
    @Column(name = "visit_cust_id")
    public Long getVisitCustId() {
        return visitCustId;
    }

    public void setVisitCustId(Long visitCustId) {
        this.visitCustId = visitCustId;
    }

    @Basic
    @Column(name = "visit_user_id")
    public Long getVisitUserId() {
        return visitUserId;
    }

    public void setVisitUserId(Long visitUserId) {
        this.visitUserId = visitUserId;
    }

    @Basic
    @Column(name = "visit_lkm_id")
    public Long getVisitLkmId() {
        return visitLkmId;
    }

    public void setVisitLkmId(Long visitLkmId) {
        this.visitLkmId = visitLkmId;
    }

    @Basic
    @Column(name = "visit_time")
    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    @Basic
    @Column(name = "visit_addr")
    public String getVisitAddr() {
        return visitAddr;
    }

    public void setVisitAddr(String visitAddr) {
        this.visitAddr = visitAddr;
    }

    @Basic
    @Column(name = "visit_detail")
    public String getVisitDetail() {
        return visitDetail;
    }

    public void setVisitDetail(String visitDetail) {
        this.visitDetail = visitDetail;
    }

    @Basic
    @Column(name = "visit_nexttime")
    public Date getVisitNexttime() {
        return visitNexttime;
    }

    public void setVisitNexttime(Date visitNexttime) {
        this.visitNexttime = visitNexttime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleVisitEntity that = (SaleVisitEntity) o;
        return Objects.equals(visitId, that.visitId) &&
                Objects.equals(visitCustId, that.visitCustId) &&
                Objects.equals(visitUserId, that.visitUserId) &&
                Objects.equals(visitLkmId, that.visitLkmId) &&
                Objects.equals(visitTime, that.visitTime) &&
                Objects.equals(visitAddr, that.visitAddr) &&
                Objects.equals(visitDetail, that.visitDetail) &&
                Objects.equals(visitNexttime, that.visitNexttime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visitId, visitCustId, visitUserId, visitLkmId, visitTime, visitAddr, visitDetail, visitNexttime);
    }
}
