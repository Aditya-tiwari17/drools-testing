package de.jonashackt.springdrools.internalmodel;

public class AddressDetail {
    private String city;
    private String state;
    private String postalCode;
    private String address;
    private String address1;
    private String address2;
    private Boolean osaPincode;
    private Boolean isOwnedHousePincodeNull;
    private Boolean isOwnedHousePincodePayuFinOsa;

    public AddressDetail() {
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getAddress() {
        return this.address;
    }

    public String getAddress1() {
        return this.address1;
    }

    public String getAddress2() {
        return this.address2;
    }

    public Boolean getOsaPincode() {
        return this.osaPincode;
    }

    public Boolean getIsOwnedHousePincodeNull() {
        return this.isOwnedHousePincodeNull;
    }

    public Boolean getIsOwnedHousePincodePayuFinOsa() {
        return this.isOwnedHousePincodePayuFinOsa;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setOsaPincode(Boolean osaPincode) {
        this.osaPincode = osaPincode;
    }

    public void setIsOwnedHousePincodeNull(Boolean isOwnedHousePincodeNull) {
        this.isOwnedHousePincodeNull = isOwnedHousePincodeNull;
    }

    public void setIsOwnedHousePincodePayuFinOsa(Boolean isOwnedHousePincodePayuFinOsa) {
        this.isOwnedHousePincodePayuFinOsa = isOwnedHousePincodePayuFinOsa;
    }

    public String toString() {
        return "AddressDetail(city=" + this.getCity() + ", state=" + this.getState() + ", postalCode=" + this.getPostalCode() + ", address=" + this.getAddress() + ", address1=" + this.getAddress1() + ", address2=" + this.getAddress2() + ", osaPincode=" + this.getOsaPincode() + ", isOwnedHousePincodeNull=" + this.getIsOwnedHousePincodeNull() + ", isOwnedHousePincodePayuFinOsa=" + this.getIsOwnedHousePincodePayuFinOsa() + ")";
    }
}
