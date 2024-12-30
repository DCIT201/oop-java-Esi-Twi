

public class Customer {
    private String name;
    private String customerId;

    public  Customer(String name, String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public  String toString() {
        return "Customer's name is " + name + " and Id is " + customerId;
    }
}
