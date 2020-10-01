package models;

import javax.persistence.*;


@Entity
@Table (name = "test_table")
public class table {
    @Id
    private String ssoid;
    private String ts;
    private String grp;
    private String type;
    private String subtype;
    private String url;
    private String orgid;
    private String formid;
    private String code;
    private String ymdh;



    public table() {
    }

    public table(String ssoid, String ts, String grp,String type,String subtype,String url,String orgid,String formid,String code,String ymdh) {
        this.ssoid = ssoid;
        this.ts = ts;
        this.grp = grp;
        this.type = type;
        this.subtype = subtype;
        this.url = url;
        this.orgid = orgid;
        this.formid = formid;
        this.code = code;
        this.ymdh = ymdh;

    }

    public String getssoid() {
        return ssoid;
    }

    public void setssoid(String ssoid) {
        this.ssoid = ssoid;
    }

    public void setts(String ts) {
        this.ts = ts;
    }

    public void setgrp(String grp) {
        this.grp = grp;
    }

    public void settype(String type) {
        this.type = type;
    }

    public void setsubtype(String subtype) {
        this.subtype = subtype;
    }

    public void seturl(String url) {
        this.url = url;
    }

    public void setorgid(String orgid) {
        this.orgid = orgid;
    }

    public void setformid(String formid) {
        this.formid = formid;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public void setymdh(String ymdh) {
        this.ymdh = ymdh;
    }

    public String getts() {
        return ts;
    }

    public String getgrp() {
        return grp;
    }

    public String gettype() {
        return type;
    }

    public String getsubtype() {
        return subtype;
    }

    public String geturl() {
        return url;
    }

    public String getorgid() {
        return orgid;
    }

    public String getformid() {
        return formid;
    }

    public String getcode() {
        return code;
    }

    public String getymdh() {
        return ymdh;
    }



}
