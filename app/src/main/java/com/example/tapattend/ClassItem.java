package com.example.tapattend;

public class ClassItem {

    private long cid;
    private String className;
    private String subjectName;

    public ClassItem(long cid, String subjectName, String className) {
        this.cid = cid;
        this.subjectName = subjectName;
        this.className = className;
    }

    public ClassItem(String subjectName, String className) {
        this.subjectName = subjectName;
        this.className = className;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) { // Change from int to long
        this.cid = cid;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
