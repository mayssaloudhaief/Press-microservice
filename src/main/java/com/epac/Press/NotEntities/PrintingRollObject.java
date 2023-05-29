package com.epac.Press.NotEntities;

import java.util.ArrayList;

public class PrintingRollObject
{
    private ArrayList<PrintingJobList> printingJobList;
    private int doPurge;
    private int numberOfRefreshPattern;
    private  String dummyBookLength;
    private String  repeatJobList;

    public PrintingRollObject() {
    }

    public ArrayList<PrintingJobList> getPrintingJobList() {
        return printingJobList;
    }

    public void setPrintingJobList(ArrayList<PrintingJobList> printingJobList) {
        this.printingJobList = printingJobList;
    }

    public int getDoPurge() {
        return doPurge;
    }

    public void setDoPurge(int doPurge) {
        this.doPurge = doPurge;
    }

    public int getNumberOfRefreshPattern() {
        return numberOfRefreshPattern;
    }

    public void setNumberOfRefreshPattern(int numberOfRefreshPattern) {
        this.numberOfRefreshPattern = numberOfRefreshPattern;
    }

    public String getDummyBookLength() {
        return dummyBookLength;
    }

    public void setDummyBookLength(String dummyBookLength) {
        this.dummyBookLength = dummyBookLength;
    }

    public String getRepeatJobList() {
        return repeatJobList;
    }

    public void setRepeatJobList(String repeatJobList) {
        this.repeatJobList = repeatJobList;
    }
}
