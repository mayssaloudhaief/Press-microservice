package com.epac.Press.NotEntities;

public class PrintingJobList {

    Job job;
    int numberOfCopies;

    public PrintingJobList()
    {
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

}
