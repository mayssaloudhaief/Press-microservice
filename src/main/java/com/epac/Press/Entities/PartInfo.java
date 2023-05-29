package com.epac.Press.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Comparator;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PartInfo
{
    private String partId;
    private  String jobId;
    private String subpartId;
    private String newJobId;
    private String JobIdStandard;
    private int quantity;
    private float sNumberWaste;
    private String title;
    private String bindingType;
    private  int sNumber;
    private float s0Height;
    private String smHeight;

    public PartInfo() {
    }

    public String getSubpartId() {
        return subpartId;
    }

    public void setSubpartId(String subpartId) {
        this.subpartId = subpartId;
    }

    public String getSmHeight() {
        return smHeight;
    }

    public void setSmHeight(String smHeight) {
        this.smHeight = smHeight;
    }

    public String getNewJobId() {
        return newJobId;
    }

    public void setNewJobId(String newJobId) {
        this.newJobId = newJobId;
    }

    public float getsNumberWaste() {
        return sNumberWaste;
    }

    public void setsNumberWaste(float sNumberWaste) {
        this.sNumberWaste = sNumberWaste;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getsNumber() {
        return sNumber;
    }

    public void setsNumber(int sNumber) {
        this.sNumber = sNumber;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getS0Height() {
        return s0Height;
    }

    public void setS0Height(float s0Height) {
        this.s0Height = s0Height;
    }

    public String getJobIdStandard() {
        return JobIdStandard;
    }

    public void setJobIdStandard(String jobIdStandard) {
        JobIdStandard = jobIdStandard;
    }

    public static Comparator<PartInfo> sortPartInfoByPriority=new Comparator<PartInfo>() {
        @Override
        public int compare(PartInfo p1, PartInfo p2)
        {
            int i=0;
            i= (int) (p1.getS0Height() - p2.getS0Height());
            if(i==0)
                i=p1.getPartId().compareTo(p2.getPartId());
            return  i;
        }
    };
}
