//Create a class named `MyBills` that inherits from the `Bills` class
public class MyBills extends Bills {

   //A default constructor that creates an object with default values (i.e., 0) for `gallons`, `minutes`, and `kilowatts
    public MyBills() {
        super(0, 0, 0);
    }

   //A constructor that initializes the `MyBills` object with the specified values for `gallons`, `minutes`, and `kilowatts`
    public MyBills(double gallons, double minutes, double kilowatts) {
        super(gallons, minutes, kilowatts);
    }

   //Create a method called electricityBill()
    public double electricityBill() {
        if (getKilowatts() <= 50) {
            return 0.0;
        } else if (getKilowatts() <= 100){
            return (getKilowatts() - 50) * 0.05;
        } else {
            return (0.50 + 100) * (getKilowatts() - 150) * 1.20; 
        }
    }

    public double telephoneBill() {
        if (getMinutes() <= 50) {
            return 0;
        } else {
            return (getMinutes() - 50) * 0.60;
        }
    }

    public double totalBill() {
        return waterBill() + electricityBill() + telephoneBill();
    }
}