package com.epac.Press.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)

public class ProductionPartInfo {
    @Id
    private Long productionPartId;
    private int    qtyRequested;
    private int qtyMin;
    private String partId;
    private String bindingType;
    private String priorityLevel;
    private Date dateExpacted;
    private  int imposition;
    private String colors;
    private float height;
    private  float width;
    private  float thikness;
    private float s0Height;
    private String smHeight;
    private  int productionPage;
    private ArrayList<StationQty> stationQties;
    private Date creationDate;
    // private ArrayList<String>currentStation;
    private  int sNumber;
    private String title;
    private long idOrder;
    private Boolean Varnish;
    private String coverType;
    private int rollWidh;
    private String coverFinishType;
    private String coverPaperType;
    private boolean threeHoleDrill;
    private boolean perf;
    private boolean shrinkwrap;
    private String headAndTailBands;
    private String spineType;
    private String CoverStatus;
    private long rollId;
    private int splitNumber;
    private boolean dustJacket;
    private boolean securityLabel;
    private float sNumberWaste;
    private String status;
    private Subpart subpart;
    private int initGrouped;
    private ArrayList<String> grouped ;
    private ArrayList<String> options ;

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }
    public ProductionPartInfo() {
    }

    public Long getProductionPartId() {
        return productionPartId;
    }

    public void setProductionPartId(Long productionPartId) {
        this.productionPartId = productionPartId;
    }

    public int getQtyRequested() {
        return qtyRequested;
    }

    public void setQtyRequested(int qtyRequested) {
        this.qtyRequested = qtyRequested;
    }

    public int getQtyMin() {
        return qtyMin;
    }

    public void setQtyMin(int qtyMin) {
        this.qtyMin = qtyMin;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
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

    public int getImposition() {
        return imposition;
    }

    public void setImposition(int imposition) {
        this.imposition = imposition;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getThikness() {
        return thikness;
    }

    public void setThikness(float thikness) {
        this.thikness = thikness;
    }

    public float getS0Height() {
        return s0Height;
    }

    public void setS0Height(float s0Height) {
        this.s0Height = s0Height;
    }

    public String getSmHeight() {
        return smHeight;
    }

    public void setSmHeight(String smHeight) {
        this.smHeight = smHeight;
    }

    public int getProductionPage() {
        return productionPage;
    }

    public void setProductionPage(int productionPage) {
        this.productionPage = productionPage;
    }

    public ArrayList<StationQty> getStationQties() {
        return stationQties;
    }

    public void setStationQties(ArrayList<StationQty> stationQties) {
        this.stationQties = stationQties;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getsNumber() {
        return sNumber;
    }

    public void setsNumber(int sNumber) {
        this.sNumber = sNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public Boolean getVarnish() {
        return Varnish;
    }

    public void setVarnish(Boolean varnish) {
        Varnish = varnish;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public int getRollWidh() {
        return rollWidh;
    }

    public void setRollWidh(int rollWidh) {
        this.rollWidh = rollWidh;
    }

    public String getCoverFinishType() {
        return coverFinishType;
    }

    public void setCoverFinishType(String coverFinishType) {
        this.coverFinishType = coverFinishType;
    }

    public String getCoverPaperType() {
        return coverPaperType;
    }

    public void setCoverPaperType(String coverPaperType) {
        this.coverPaperType = coverPaperType;
    }

    public boolean isThreeHoleDrill() {
        return threeHoleDrill;
    }

    public void setThreeHoleDrill(boolean threeHoleDrill) {
        this.threeHoleDrill = threeHoleDrill;
    }

    public boolean isPerf() {
        return perf;
    }

    public void setPerf(boolean perf) {
        this.perf = perf;
    }

    public boolean isShrinkwrap() {
        return shrinkwrap;
    }

    public void setShrinkwrap(boolean shrinkwrap) {
        this.shrinkwrap = shrinkwrap;
    }

    public String getHeadAndTailBands() {
        return headAndTailBands;
    }

    public void setHeadAndTailBands(String headAndTailBands) {
        this.headAndTailBands = headAndTailBands;
    }

    public String getSpineType() {
        return spineType;
    }

    public void setSpineType(String spineType) {
        this.spineType = spineType;
    }

    public String getCoverStatus() {
        return CoverStatus;
    }

    public void setCoverStatus(String coverStatus) {
        CoverStatus = coverStatus;
    }

    public long getRollId() {
        return rollId;
    }

    public void setRollId(long rollId) {
        this.rollId = rollId;
    }

    public int getSplitNumber() {
        return splitNumber;
    }

    public void setSplitNumber(int splitNumber) {
        this.splitNumber = splitNumber;
    }

    public boolean isDustJacket() {
        return dustJacket;
    }

    public void setDustJacket(boolean dustJacket) {
        this.dustJacket = dustJacket;
    }

    public boolean isSecurityLabel() {
        return securityLabel;
    }

    public void setSecurityLabel(boolean securityLabel) {
        this.securityLabel = securityLabel;
    }

    public float getsNumberWaste() {
        return sNumberWaste;
    }

    public void setsNumberWaste(float sNumberWaste) {
        this.sNumberWaste = sNumberWaste;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Subpart getSubpart() {
        return subpart;
    }

    public void setSubpart(Subpart subpart) {
        this.subpart = subpart;
    }

    public int getInitGrouped() {
        return initGrouped;
    }

    public void setInitGrouped(int initGrouped) {
        this.initGrouped = initGrouped;
    }

    public ArrayList<String> getGrouped() {
        return grouped;
    }

    public void setGrouped(ArrayList<String> grouped) {
        this.grouped = grouped;
    }
}
