package com.heeexy.example.model;

public class WinitRebateMoney {
    private Integer id;

    private String businessdocumentno;

    private String created;

    private String chargename;

    private Integer chargecode;

    private Double sourceamt;

    private String sourcecurrency;

    private Double chargeweight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusinessdocumentno() {
        return businessdocumentno;
    }

    public void setBusinessdocumentno(String businessdocumentno) {
        this.businessdocumentno = businessdocumentno == null ? null : businessdocumentno.trim();
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created == null ? null : created.trim();
    }

    public String getChargename() {
        return chargename;
    }

    public void setChargename(String chargename) {
        this.chargename = chargename == null ? null : chargename.trim();
    }

    public Integer getChargecode() {
        return chargecode;
    }

    public void setChargecode(Integer chargecode) {
        this.chargecode = chargecode;
    }

    public Double getSourceamt() {
        return sourceamt;
    }

    public void setSourceamt(Double sourceamt) {
        this.sourceamt = sourceamt;
    }

    public String getSourcecurrency() {
        return sourcecurrency;
    }

    public void setSourcecurrency(String sourcecurrency) {
        this.sourcecurrency = sourcecurrency == null ? null : sourcecurrency.trim();
    }

    public Double getChargeweight() {
        return chargeweight;
    }

    public void setChargeweight(Double chargeweight) {
        this.chargeweight = chargeweight;
    }
}