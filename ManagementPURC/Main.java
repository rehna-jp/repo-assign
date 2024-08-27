public class Main {

  public static void main(String[] args) {

    // Initialize the MyBills object with specific values for gallons, minutes, and
    // kilowatts
    MyBills bills = new MyBills(60, 10, 160);

    // Call the waterBill() method and print the result to display the water bill
    System.out.printf("Water Bill: GHC %5.2f\n", bills.waterBill());
    // Call the electricityBill() method and print the result to display the
    // electricity bill
    System.out.printf("Electricity Bill: GHC %5.2f\n", bills.electricityBill());
    // Call the telephoneBill() method and print the result to display the telephone
    // bill
    System.out.printf("Telephone Bill: GHC %5.2f\n", bills.telephoneBill());
    // Call the totalBill() method and print the result to display the total utilty
    // bill
    System.out.printf("Total Bill: GHC %5.2f", bills.totalBill());
  }
}