package cz.czechitas.java2webapps.lekce3.entity;

public class Address {
    private String street;
    private int houseNumber;

    private String town;
    private String zip;

    public Address(String street, int houseNumber, String town, String zip) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.town = town;
        this.zip = zip;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
