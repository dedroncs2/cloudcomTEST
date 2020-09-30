package models;

import javax.persistence.*;


@Entity
@Table (name = "test_table")
public class table {
    @Id
    @Column(name = "ssoid")
    private String ssoid;
    @Column(name = "ts")
    private String ts;
    @Column(name = "grp")
    private String grp;
    @Column(name = "type")
    private String type;
    @Column(name = "subtype")
    private String subtype;
    @Column(name = "url")
    private String url;
    @Column(name = "orgid")
    private String orgid;
    @Column(name = "formid")
    private String formid;
    @Column(name = "code")
    private String code;
    @Column(name = "ymdh")
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

    public String getSsoid() {
        return ssoid;
    }

    public void setSsoid(String ssoid) {
        this.ssoid = ssoid;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setGrp(String grp) {
        this.grp = grp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public void setFormid(String formid) {
        this.formid = formid;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setYmdh(String ymdh) {
        this.ymdh = ymdh;
    }

    public String getTs() {
        return ts;
    }

    public String getGrp() {
        return grp;
    }

    public String getType() {
        return type;
    }

    public String getSubtype() {
        return subtype;
    }

    public String getUrl() {
        return url;
    }

    public String getOrgid() {
        return orgid;
    }

    public String getFormid() {
        return formid;
    }

    public String getCode() {
        return code;
    }

    public String getYmdh() {
        return ymdh;
    }



}
