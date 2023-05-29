package com.epac.Press.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ProductionPart extends Object {
    private long productionPartId;
    private String barcode;
    private String title;
    private String partId;
    private String publisher;
    private String publisherId;
    private long idJob;
    private String status ;
    private int    qtyDelivered;
    private int    qtyMin;
    private int    qtyMax;
    private float weight;
    private int producedBinder;
    private int    qtyRequested;
    private long parentId;
    private String isbn10;
    private String clientPartNum;
    private String coilType;
    private Pnl pnl;
    private  double unitPrice;
    private String bindingType;
    private String productionNote;
    private int productionPage;
    private String type;
    public ProductionPart() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getProductionPage() {
        return productionPage;
    }

    public void setProductionPage(int productionPage) {
        this.productionPage = productionPage;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "ProductionPart{" +
                "productionPartId=" + productionPartId +
                ", barcode='" + barcode + '\'' +

                '}';
    }

    public String getProductionNote() {
        return productionNote;
    }

    public void setProductionNote(String productionNote) {
        this.productionNote = productionNote;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getIdJob() {
        return idJob;
    }

    public void setIdJob(long idJob) {
        this.idJob = idJob;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getProductionPartId() {
        return productionPartId;
    }

    public void setProductionPartId(long productionPartId) {
        this.productionPartId = productionPartId;
    }

    public int getProducedBinder() {
        return producedBinder;
    }

    public void setProducedBinder(int producedBinder) {
        this.producedBinder = producedBinder;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getQtyDelivered() {
        return qtyDelivered;
    }

    public void setQtyDelivered(int qtyDelivered) {
        this.qtyDelivered = qtyDelivered;
    }

    public int getQtyMin() {
        return qtyMin;
    }

    public void setQtyMin(int qtyMin) {
        this.qtyMin = qtyMin;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getQtyMax() {
        return qtyMax;
    }

    public void setQtyMax(int qtyMax) {
        this.qtyMax = qtyMax;
    }

    public int getQtyRequested() {
        return qtyRequested;
    }

    public void setQtyRequested(int qtyRequested) {
        this.qtyRequested = qtyRequested;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getClientPartNum() {
        return clientPartNum;
    }

    public void setClientPartNum(String clientPartNum) {
        this.clientPartNum = clientPartNum;
    }

    public String getCoilType() {
        return coilType;
    }

    public void setCoilType(String coilType) {
        this.coilType = coilType;
    }

    public String getPartid() {
        return partId;
    }

    public void setPartid(String partid) {
        this.partId = partid;
    }

    public Pnl getPnl() {
        return pnl;
    }

    public void setPnl(Pnl pnl) {
        this.pnl = pnl;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
}

