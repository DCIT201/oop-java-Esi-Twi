
public class Motorcycle extends Vehicle {
    private  boolean isHelmetAvailable;

    public Motorcycle(boolean isHelmetAvailable, String vehicleId, String model,
                      double baseRentalRate) {

        super(vehicleId, model, baseRentalRate);
        this.isHelmetAvailable = isHelmetAvailable;
    }

    public boolean isHelmetAvailable() {
        return isHelmetAvailable;
    }

    public void setHelmetAvailable(boolean helmetAvailable) {
        isHelmetAvailable = helmetAvailable;
    }

    public double calculateRentalCost(int days) {
       return getBaseRentalRate() * days * 3.1;
    }

    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
