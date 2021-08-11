package com.sda.recap.shopapp.app.model.customer;

import java.util.Date;

public class Account {

    private String id;
    private String billingAddress;
    private boolean isClosed;
    private Date creationDate;
    private Date closedDate;


    public Account(String id, String billingAddress, boolean isClosed, Date creationDate, Date closedDate) {
        this.id = id;
        this.billingAddress = billingAddress;
        this.isClosed = isClosed;
        this.creationDate = creationDate;
        this.closedDate = closedDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        this.isClosed = closed;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getClosedDate() {
        return this.closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", isClosed=" + isClosed +
                ", creationDate=" + creationDate +
                ", closedDate=" + closedDate +
                '}';
    }
}
