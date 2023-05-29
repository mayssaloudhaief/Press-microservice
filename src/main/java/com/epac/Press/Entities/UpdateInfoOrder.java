package com.epac.Press.Entities;

public class UpdateInfoOrder {

        private long productionPartId;
        private  int sNumber;
        private float s0Height;

    public UpdateInfoOrder(int sNumber, float s0Height) {
        this.sNumber = sNumber;
        this.s0Height = s0Height;
    }

    public UpdateInfoOrder() {
    }

    public UpdateInfoOrder(long productionPartId, int sNumber, float s0Height) {
        this.productionPartId = productionPartId;
        this.sNumber = sNumber;
        this.s0Height = s0Height;
    }

        public long getProductionPartId() {
        return productionPartId;
    }

        public void setProductionPartId(long productionPartId) {
        this.productionPartId = productionPartId;
    }

        public int getsNumber() {
        return sNumber;
    }

        public void setsNumber(int sNumber) {
        this.sNumber = sNumber;
    }

        public float getS0Height() {
        return s0Height;
    }

        public void setS0Height(float s0Height) {
        this.s0Height = s0Height;
    }

    }
