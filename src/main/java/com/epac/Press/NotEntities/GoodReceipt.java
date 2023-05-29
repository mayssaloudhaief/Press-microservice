package com.epac.Press.NotEntities;

public class GoodReceipt {
    private  Job job;
    private String status;
    private long printedSheetCount;
    private  long totalSheetCount;
    private  long numberOfCopies;

    public GoodReceipt() {
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getPrintedSheetCount() {
        return printedSheetCount;
    }

    public void setPrintedSheetCount(long printedSheetCount) {
        this.printedSheetCount = printedSheetCount;
    }

    public long getTotalSheetCount() {
        return totalSheetCount;
    }

    public void setTotalSheetCount(long totalSheetCount) {
        this.totalSheetCount = totalSheetCount;
    }

    public long getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(long numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
}
