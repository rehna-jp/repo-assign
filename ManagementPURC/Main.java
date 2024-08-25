public class Main {

    public static void main(String[] args) {

        MyBills bills = new MyBills(60,10,160);

        System.out.printf("Water Bill: GHC %5.2f\n", bills.waterBill());
        System.out.printf("Electricity Bill: GHC %5.2f\n", bills.electricityBill());
        System.out.printf("Telephone Bill: GHC %5.2f\n", bills.telephoneBill());
        System.out.printf("Total Bill: GHC %5.2f", bills.totalBill());
    }
}