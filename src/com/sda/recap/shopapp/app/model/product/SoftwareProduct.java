package com.sda.recap.shopapp.app.model.product;

public abstract class SoftwareProduct implements Sellable {

    private static final String SOFTWARE_PRODUCT_CATEGORY = "SOFTWARE PRODUCT";
    private boolean receivedOnMail;
    private boolean sentOnDvdDisk;
    private String licenseType;
    private String releasedBy;

    public SoftwareProduct(boolean receivedOnMail, boolean sentOnDvdDisk, String licenseType, String releasedBy) {
        this.receivedOnMail = receivedOnMail;
        this.sentOnDvdDisk = sentOnDvdDisk;
        this.licenseType = licenseType;
        this.releasedBy = releasedBy;
    }


    public static String getSoftwareProductCategory() {
        return SOFTWARE_PRODUCT_CATEGORY;
    }

    public boolean isReceivedOnMail() {
        return receivedOnMail;
    }

    public void setReceivedOnMail(boolean receivedOnMail) {
        this.receivedOnMail = receivedOnMail;
    }

    public boolean isSentOnDvdDisk() {
        return sentOnDvdDisk;
    }

    public void setSentOnDvdDisk(boolean sentOnDvdDisk) {
        this.sentOnDvdDisk = sentOnDvdDisk;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getReleasedBy() {
        return releasedBy;
    }

    public void setReleasedBy(String releasedBy) {
        this.releasedBy = releasedBy;
    }
}
