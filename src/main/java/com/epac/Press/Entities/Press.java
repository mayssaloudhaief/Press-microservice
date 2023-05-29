package com.epac.Press.Entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Press {
    @Id
    private long rollId;
    private float rollWidth;
    private String machineType;
    private float duration;
    private String type;
    private long waste;
    private String Creator;
    private Date creationDate;
    private String priorityLevel;
    private Date  dateExpacted;
    private String shortName;
    private ArrayList<ProductionPartInfo>productionPartInfos;
    private ArrayList<PartInfo>partInfos;
    public  boolean paused;
    private long ordering;
    private  String machineId;
    private String paperTypeId;
    private String mediaId;
    private String status;
    private float length;
    private float originalLength;
    private String CoverStatus;
    private String mode;

    public Press() {
    }


    public long getRollId() {
        return rollId;
    }

    public void setRollId(long rollId) {
        this.rollId = rollId;
    }

    public float getRollWidth() {
        return rollWidth;
    }

    public void setRollWidth(float rollWidth) {
        this.rollWidth = rollWidth;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getWaste() {
        return waste;
    }

    public void setWaste(long waste) {
        this.waste = waste;
    }

    public String getCreator() {
        return Creator;
    }

    public void setCreator(String creator) {
        Creator = creator;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public Date getDateExpacted() {
        return dateExpacted;
    }

    public void setDateExpacted(Date dateExpacted) {
        this.dateExpacted = dateExpacted;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public ArrayList<ProductionPartInfo> getProductionPartInfos() {
        return productionPartInfos;
    }

    public void setProductionPartInfos(ArrayList<ProductionPartInfo> productionPartInfos) {
        this.productionPartInfos = productionPartInfos;
    }

    public boolean isPaused() {
        return paused;
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    public long getOrdering() {
        return ordering;
    }

    public void setOrdering(long ordering) {
        this.ordering = ordering;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getPaperTypeId() {
        return paperTypeId;
    }

    public void setPaperTypeId(String paperTypeId) {
        this.paperTypeId = paperTypeId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getOriginalLength() {
        return originalLength;
    }

    public void setOriginalLength(float originalLength) {
        this.originalLength = originalLength;
    }

    public String getCoverStatus() {
        return CoverStatus;
    }

    public void setCoverStatus(String coverStatus) {
        CoverStatus = coverStatus;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ArrayList<PartInfo> getPartInfos() {
        return partInfos;
    }

    public void setPartInfos(ArrayList<PartInfo> partInfos) {
        this.partInfos = partInfos;
    }
}


