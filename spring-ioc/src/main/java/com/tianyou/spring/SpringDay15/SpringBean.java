package com.tianyou.spring.SpringDay15;

public class SpringBean {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SpringBean{" +
                "address=" + address +
                '}';
    }
}
