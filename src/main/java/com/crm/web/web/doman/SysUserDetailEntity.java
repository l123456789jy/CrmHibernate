package com.crm.web.web.doman;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sys_user_detail", schema = "crm_hibernate", catalog = "")
public class SysUserDetailEntity {
    private long userDetailId;
    private Integer userAge;
    private String userAddr;
    private String userResume;

    @Id
    @Column(name = "user_detail_id")
    public long getUserDetailId() {
        return userDetailId;
    }

    public void setUserDetailId(long userDetailId) {
        this.userDetailId = userDetailId;
    }

    @Basic
    @Column(name = "user_age")
    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Basic
    @Column(name = "user_addr")
    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    @Basic
    @Column(name = "user_resume")
    public String getUserResume() {
        return userResume;
    }

    public void setUserResume(String userResume) {
        this.userResume = userResume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUserDetailEntity that = (SysUserDetailEntity) o;
        return userDetailId == that.userDetailId &&
                Objects.equals(userAge, that.userAge) &&
                Objects.equals(userAddr, that.userAddr) &&
                Objects.equals(userResume, that.userResume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userDetailId, userAge, userAddr, userResume);
    }
}
