package com.example.oopproject.Nawez;

public class Securityguardlostitemreport {
    private int sgid;
    private String SGname;
    private int Visitorid;
    private String visitorname;
    private String Reportlog;

    public Securityguardlostitemreport(int sgid, String SGname, int visitorid, String visitorname, String reportlog) {
        this.sgid = sgid;
        this.SGname = SGname;
        Visitorid = visitorid;
        this.visitorname = visitorname;
        Reportlog = reportlog;
    }

    public int getSgid() {
        return sgid;
    }

    public void setSgid(int sgid) {
        this.sgid = sgid;
    }

    public String getSGname() {
        return SGname;
    }

    public void setSGname(String SGname) {
        this.SGname = SGname;
    }

    public int getVisitorid() {
        return Visitorid;
    }

    public void setVisitorid(int visitorid) {
        Visitorid = visitorid;
    }

    public String getVisitorname() {
        return visitorname;
    }

    public void setVisitorname(String visitorname) {
        this.visitorname = visitorname;
    }

    public String getReportlog() {
        return Reportlog;
    }

    public void setReportlog(String reportlog) {
        Reportlog = reportlog;
    }
}
