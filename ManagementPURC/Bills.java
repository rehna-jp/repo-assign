// Create a class named `Bills`

public class Bills {
    //Three `double` data fields named `gallons`, `minutes`, and `kilowatts` ... 
    //These data fields should be encapsulated (i.e., declared as private)
    private double gallons;
    private double minutes;
    private double kilowatts;

     //A constructor that initializes the `Bills` object with the specified values for 
     //`gallons`, `minutes`, and `kilowatts`.
    public Bills(double gallons, double minutes, double kilowatts) {
        this.gallons = gallons;
        this.minutes = minutes;
        this.kilowatts = kilowatts;
    }

    //A method named `getGallons()` that returns the gallons of water consumed
    public double getGallons() {
        return gallons;
    }

   //A method named `getMinutes()` that returns the minutes of calls made
    public double getMinutes() {
        return minutes;
    }

    //A method named `getKilowatts()` that returns the kilowatts of electricity consumed
    public double getKilowatts() {
        return kilowatts;
    }

   //A method named `waterBill()` that returns the water bill
    public double waterBill() {
        if (getGallons() <= 50) {  //The first 50 gallons of water consumed are free
            return 0;
        } else { //For any additional gallons consumed beyond 50, the rate is GHS 1.05 per gallon
            return (getGallons() - 50) * 1.05;
        }
    }

}