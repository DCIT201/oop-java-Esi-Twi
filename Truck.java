
public class Truck extends Vehicle {
    private boolean isTrunkEmpty;

    public Truck(boolean isTrunkEmpty, String vehicleId, String model,
                 double baseRentalRate) {

        super(vehicleId, model, baseRentalRate);
        this.isTrunkEmpty = isTrunkEmpty;
    }

    public boolean isTrunkEmpty() {
        return isTrunkEmpty;
    }

    public void setIsTrunkEmpty(boolean isTrunkEmpty) {
        this.isTrunkEmpty = isTrunkEmpty;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 6.9;
    }

    @Override
    public boolean isAvailableForRental() {
        return  isAvailable();
    }
}