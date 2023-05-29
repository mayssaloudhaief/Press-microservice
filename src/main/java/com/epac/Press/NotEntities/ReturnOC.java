package com.epac.Press.NotEntities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ReturnOC
{
    private ArrayList<GoodReceipt> goodReceipts;
    private ArrayList<ErrorList> errorList;

    public ReturnOC() {
    }

    public ArrayList<GoodReceipt> getGoodReceipts() {
        return goodReceipts;
    }

    public void setGoodReceipts(ArrayList<GoodReceipt> goodReceipts) {
        this.goodReceipts = goodReceipts;
    }

    public ArrayList<ErrorList> getErrorList() {
        return errorList;
    }

    public void setErrorList(ArrayList<ErrorList> errorList) {
        this.errorList = errorList;
    }
}


