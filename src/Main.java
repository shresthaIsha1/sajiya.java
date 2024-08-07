import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String node=("Quit");
        int n = 10000;
        String username= "admin";
        String password = "admin";
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=n;i++) {
            System.out.println("Enter the code");
            String code = sc.nextLine();
            if (!code.equals(node)) {
                System.out.println("Enter the Userid: ");
                String userid = sc.nextLine();
                System.out.println("Enter the Passcode: ");
                String passcode = sc.nextLine();
                if (username.equals(userid) && password.equals(passcode)) {
                    System.out.println("You are logged in");
                }
                else {
                    System.out.println("Invalid Userid or Password");
                }
            }
            else {
                System.out.println("You have quit.");
            }

            System.out.println("Enter the items:");
            int item = sc.nextInt();

            double[] prices = new double[item];
            for (int j = 0; j < item; j++) {
                System.out.println("Enter the price of item" + (j + 1) + ":");
                prices[j] = sc.nextDouble();
            }

            double sum = 0;
            for (double price : prices) {
                sum += price;
            }

            System.out.println("Enter yes if you want 13% vat:");
            String vat = sc.nextLine();
            double total;
            if (vat.equals("yes")) {
                double vat_amount = (13/100) * sum;
                total = sum + vat_amount;
                System.out.println("Your Total VAT is: " + total);
            } else {
                total = sum;
                System.out.println("Your Total VAT is: " + sum);
            }

            System.out.println("Enter discount percentage:");
            double discount_percentage = sc.nextDouble();
            double discount_amount = (discount_percentage / 100) * total;
            double total_price = (total - discount_amount);
            System.out.println("Your Total price is: " + total_price);

            System.out.println("Enter your Payment amount");
            double payment = sc.nextDouble();
            double change_amount= (payment - total);
            System.out.println("Your Change amount is: " + change_amount);

            int note = sc.nextInt();
            payment = Math.round(discount_amount);
            if(note == discount_amount) {
                int Fifty = 0;
                int Hundred = 0;
                int Five_hundred= 0;
                int Thousand = 0;
                int Ten = 0;

                if (note >= 100) {
                    Thousand = note / 1000;
                    note = note % 1000;

                }
                if (note >= 500) {
                    Five_hundred = note / 500;
                    note = note % 500;

                }
                if (note >= 100) {
                    Hundred = note / 100;
                    note = note % 100;
                }
                if (note >= 50) {
                    Fifty = note / 50;
                    note = note % 50;
                }
                if (note >= 10) {
                    Ten = note / 10;
                    note = note % 10;

                }
                System.out.println("The number of 1000 notes: " + Thousand);
                System.out.println("The number of 500 notes: " + Five_hundred);
                System.out.println("The number of 100 notes: " + Hundred);
                System.out.println("The number of 50 notes: " + Fifty);
                System.out.println("The number of 10 notes: " + Ten);
            }
        }
    }
}

