

public class Car extends Vehicle {
       private int numberOfSeats;
    
        public Car(int numberOfSeats,String vehicleId, String model, double baseRentalRate) {
    
            super(vehicleId, model, baseRentalRate);
           this.numberOfSeats = numberOfSeats;
        }
    
       public int getNumberOfSeats() {
           return numberOfSeats;
       }
    
       public void setNumberOfSeats(int numberOfSeats) {
           this.numberOfSeats = numberOfSeats;
       }
    
        @Override
        public double calculateRentalCost(int days) {
            return getBaseRentalRate() * days * 4.3;
        }
    
        @Override
        public boolean isAvailableForRental() {
            return  isAvailable();
        }
    
    }
    