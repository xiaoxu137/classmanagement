package com.clsmagent.pojo.info;

import java.sql.Date;

public class ShowStuInfo {
    private String code;
    private String stuname;
    private String stugender;
    private int stugenderCode;
    private Date stubirth;
    private String stuphone;
    private String stuaddress;
    private String stuimg;
    private String stupos;
    private int stuposCode;

    public int getStugenderCode() {
        return stugenderCode;
    }

    public void setStugenderCode(int stugenderCode) {
        this.stugenderCode = stugenderCode;
    }

    public int getStuposCode() {
        return stuposCode;
    }

    public void setStuposCode(int stuposCode) {
        this.stuposCode = stuposCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStugender() {
        return stugender;
    }

    public void setStugender(String stugender) {
        this.stugender = stugender;
    }

    public Date getStubirth() {
        return stubirth;
    }

    public void setStubirth(Date stubirth) {
        this.stubirth = stubirth;
    }

    public String getStuphone() {
        return stuphone;
    }

    public void setStuphone(String stuphone) {
        this.stuphone = stuphone;
    }

    public String getStuaddress() {
        return stuaddress;
    }

    public void setStuaddress(String stuaddress) {
        this.stuaddress = stuaddress;
    }

    public String getStuimg() {
        return stuimg;
    }

    public void setStuimg(String stuimg) {
        this.stuimg = stuimg;
    }

    public String getStupos() {
        return stupos;
    }

    public void setStupos(String stupos) {
        this.stupos = stupos;
    }
}
