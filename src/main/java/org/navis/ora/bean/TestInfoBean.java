package org.navis.ora.bean;

import java.math.BigDecimal;

public class TestInfoBean {
    private BigDecimal serialkey;

    private String testkey;

    private String testvalue;

    private String comments;

    public BigDecimal getSerialkey() {
        return serialkey;
    }

    public void setSerialkey(BigDecimal serialkey) {
        this.serialkey = serialkey;
    }

    public String getTestkey() {
        return testkey;
    }

    public void setTestkey(String testkey) {
        this.testkey = testkey == null ? null : testkey.trim();
    }

    public String getTestvalue() {
        return testvalue;
    }

    public void setTestvalue(String testvalue) {
        this.testvalue = testvalue == null ? null : testvalue.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}