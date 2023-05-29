package com.epac.Press.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)

@Document(collection="Ordre")

public class Ordre {
    @Id
   // private Integer _id;
    private String _id;

    private String clientPoNumber;
    private Date dateExpected;
    private Date dateReceipt;
    private Date dateDelivered;
    private String type;
    private String ProductionNote;

    public String getOrderid() {
        return _id;
    }

    public void setOrderid(String orderid) {
        this._id = orderid;
    }

    private ArrayList<ProductionPart> productionParts;
    private int sNum;
    private String requesterName;
    private Date proofDate;
    private int quantity ;
    private String clientId;
    private String orderNum;
    private String priorityLevel;
    private String owner;
    private String shipAttn;
    private String billAttn;
    private Date completeDate;
    public Ordre() { }






    public String getClientPoNumber() {
        return clientPoNumber;
    }

    public void setClientPoNumber(String clientPoNumber) {
        this.clientPoNumber = clientPoNumber;
    }

    public Date getDateExpected() {
        return dateExpected;
    }

    public void setDateExpected(Date dateExpected) {
        this.dateExpected = dateExpected;
    }

    public Date getDateReceipt() {
        return dateReceipt;
    }

    public void setDateReceipt(Date dateReceipt) {
        this.dateReceipt = dateReceipt;
    }

    public Date getDateDelivered() {
        return dateDelivered;
    }

    public void setDateDelivered(Date dateDelivered) {
        this.dateDelivered = dateDelivered;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductionNote() {
        return ProductionNote;
    }

    public void setProductionNote(String productionNote) {
        ProductionNote = productionNote;
    }

    public ArrayList<ProductionPart> getProductionParts() {
        return productionParts;
    }

    public void setProductionParts(ArrayList<ProductionPart> productionParts) {
        this.productionParts = productionParts;
    }

    public int getsNum() {
        return sNum;
    }

    public void setsNum(int sNum) {
        this.sNum = sNum;
    }

    public String getRequesterName() {
        return requesterName;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    public Date getProofDate() {
        return proofDate;
    }

    public void setProofDate(Date proofDate) {
        this.proofDate = proofDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getShipAttn() {
        return shipAttn;
    }

    public void setShipAttn(String shipAttn) {
        this.shipAttn = shipAttn;
    }

    public String getBillAttn() {
        return billAttn;
    }

    public void setBillAttn(String billAttn) {
        this.billAttn = billAttn;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }



}
