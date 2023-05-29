package com.epac.Press.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)

public class StationQty {
        private String stationId;
        private int qtProduced;
        private int waste;
        private String productTy;

    public StationQty() {
    }

    public StationQty(String stationId, int qtProduced, int waste, String productTy) {
        this.stationId = stationId;
        this.qtProduced = qtProduced;
        this.waste = waste;
        this.productTy = productTy;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public int getQtProduced() {
        return qtProduced;
    }

    public int setQtProduced(int qtProduced) {
        this.qtProduced = qtProduced;
        return qtProduced;
    }

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public String getProductTy() {
        return productTy;
    }

    public void setProductTy(String productTy) {
        this.productTy = productTy;
    }
}
