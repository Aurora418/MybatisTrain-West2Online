/*
* 实体类
* */
package com.aurora.pojo;

public class Student {
    private String Snum;
    private String Sname;
    private String Ssex;
    private String Tname;
    private int Sclass;

    public Student() {
    }

    public Student(String snum, String sname, String ssex, String tname, int sclass) {
        Snum = snum;
        Sname = sname;
        Ssex = ssex;
        Tname = tname;
        Sclass = sclass;
    }

    public String getSnum() {
        return Snum;
    }

    public void setSnum(String snum) {
        Snum = snum;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSsex() {
        return Ssex;
    }

    public void setSsex(String ssex) {
        Ssex = ssex;
    }

    public String getTname() {
        return Tname;
    }

    public void setTname(String tname) {
        Tname = tname;
    }

    public int getSclass() {
        return Sclass;
    }

    public void setSclass(int sclass) {
        Sclass = sclass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Snum='" + Snum + '\'' +
                ", Sname='" + Sname + '\'' +
                ", Ssex='" + Ssex + '\'' +
                ", Tname='" + Tname + '\'' +
                ", Sclass=" + Sclass +
                '}';
    }
}
