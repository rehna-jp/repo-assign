public class Bills {
    
    private double gallons;
    private double minutes;
    private double kilowatts;

    public Bills(double gallons, double minutes, double kilowatts) {
        this.gallons = gallons;
        this.minutes = minutes;
        this.kilowatts = kilowatts;
    }

    public double getGallons() {
        return gallons;
    }

    public double getMinutes() {
        return minutes;
    }

    public double getKilowatts() {
        return kilowatts;
    }

    public double waterBill() {
        if (getGallons() <= 50) {
            return 0;
        } else {
            return (getGallons() - 50) * 1.05;
        }
    }

}