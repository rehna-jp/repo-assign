//Create a class named `MyBills` that inherits from the `Bills` class

public class MyBills extends Bills {

    // A default constructor that creates an object with default values (i.e., 0)
    // for `gallons`, `minutes`, and `kilowatts
    public MyBills() {
        super(0, 0, 0);
    }

    // A constructor that initializes the `MyBills` object with the specified values
    // for `gallons`, `minutes`, and `kilowatts`
    public MyBills(double gallons, double minutes, double kilowatts) {
        super(gallons, minutes, kilowatts);
    }

    // Create a method named electricityBill() that returns the computed electricity
    // bill
    public double electricityBill() {
        if (getKilowatts() <= 50) { // The first 50 kilowatts of electricity consumed is free
            return 0.0;
        } else if (getKilowatts() <= 100) { // For the next 100 kilowatts, the rate is GHS 0.50 per kilowatt
            return (getKilowatts() - 50) * 0.50;
        } else { // For any additional kilowatts consumed beyond 150(50 + 100), the rate is GHC
                 // 1.20 per kilowatt
            return (0.50 * 100) + (getKilowatts() - 150) * 1.20;
        }
    }

    // A method named telephoneBill() that returns the computed telephone bill
    public double telephoneBill() {
        if (getMinutes() <= 50) {// The first 5 minutes of phone calls are free
            return 0.0;
        } else { // For any additional minutes beyond 5, the rate is GHS 0.60 per minute
            return (getMinutes() - 50) * 0.60;
        }
    }

    // A method named totalBill() that returns the total bill
    public double totalBill() {
        // The total bill should be calculated as the sum of water bill, electricity
        // bill, and telephone bill
        return waterBill() + electricityBill() + telephoneBill();
    }
}