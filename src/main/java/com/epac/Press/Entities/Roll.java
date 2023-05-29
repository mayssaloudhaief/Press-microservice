package com.epac.Press.Entities;

import com.epac.Press.Entities.Ordre;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import java.util.ArrayList;
import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)


public class Roll {
    @Id
    private long rollId;
    private String mediaId;
    private String status;
    private float length;
    private float originalLength;
    private float duration;
    private String type;
    private long weight;
    private long waste;
    private String creator;
    private Date creationDate;
    private String machineType;
    private String priorityLevel;
    private Date dateExpacted;
    @Transient
    private ArrayList<String> productionPartIds;
    // private ArrayList<MachineOrdering> machineOrderings;
    @Transient
    private float rollWidth;
    @Transient
    private String shortName;
    @Transient
    private String paperTypeId;
    //  @Transient
    //  private PaperMediaType paperMediaType;
    @Transient
    private ArrayList<Ordre> ordres;

    public Roll() {
    }

    public Roll(long rollId, String status, float length, long weight, String creator, Date creationDate, String shortName, String paperTypeId) {
        this.rollId = rollId;
        this.status = status;
        this.length = length;
        this.weight = weight;
        this.creator = creator;
        this.creationDate = creationDate;
        this.shortName = shortName;
        this.paperTypeId = paperTypeId;
    }

    public long getRollId() {
        return rollId;
    }

    public void setRollId(long rollId) {
        this.rollId = rollId;
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

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getWaste() {
        return waste;
    }

    public void setWaste(long waste) {
        this.waste = waste;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
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

    public ArrayList<String> getProductionPartIds() {
        return productionPartIds;
    }

    public void setProductionPartIds(ArrayList<String> productionPartIds) {
        this.productionPartIds = productionPartIds;
    }

    public float getRollWidth() {
        return rollWidth;
    }

    public void setRollWidth(float rollWidth) {
        this.rollWidth = rollWidth;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getPaperTypeId() {
        return paperTypeId;
    }

    public void setPaperTypeId(String paperTypeId) {
        this.paperTypeId = paperTypeId;
    }

    public ArrayList<Ordre> getOrdres() {
        return ordres;
    }

    public void setOrdres(ArrayList<Ordre> ordres) {
        this.ordres = ordres;
    }
}
