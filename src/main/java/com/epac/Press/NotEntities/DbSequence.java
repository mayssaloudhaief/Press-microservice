package com.epac.Press.NotEntities;

import org.springframework.data.annotation.Id;

//@AllArgsConstructor
public class DbSequence {
    @Id
    private  String ld;
    private  long val;

    public DbSequence() {
    }
    public DbSequence(String ld, long val) {
        this.ld = ld;
        this.val = val;
    }

    public String getLd() {
        return ld;
    }

    public void setLd(String ld) {
        this.ld = ld;
    }

    public long getVal() {
        return val;
    }

    public void setVal(long val) {
        this.val = val;
    }
}
