public class MyBills extends Bills {

    public MyBills() {
        super(0, 0, 0);
    }

    public MyBills(double gallons, double minutes, double kilowatts) {
        super(gallons, minutes, kilowatts);
    }

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