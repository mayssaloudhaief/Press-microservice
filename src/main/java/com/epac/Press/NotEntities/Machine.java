package com.epac.Press.NotEntities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Machine
{
    private String machineId;
    private  String adressIp;

    public Machine() {
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getAdressIp() {
        return adressIp;
    }

    public void setAdressIp(String adressIp) {
        this.adressIp = adressIp;
    }
}
