package com.wellshang.models;

public class Student {
    private String stdId;
    private int subMarkOne;
    private int subMarkTwo;
    private int totalSubMark;

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public int getSubMarkOne() {
        return subMarkOne;
    }

    public void setSubMarkOne(int subMarkOne) {
        this.subMarkOne = subMarkOne;
    }

    public int getSubMarkTwo() {
        return subMarkTwo;
    }

    public void setSubMarkTwo(int subMarkTwo) {
        this.subMarkTwo = subMarkTwo;
    }
    
    public int getTotalSubMark() {
        return totalSubMark;
    }
    public void setTotalSubMark(int totalSubMark) {
        this.totalSubMark = totalSubMark;
    }
}
