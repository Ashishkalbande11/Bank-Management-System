import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> list = new ArrayList<>();
        list.add(new Account("Ajay Kumar", "New Delhi", 5000));
        list.add(new Account("Vijay Kumar", "Kolkata", 8000));
        list.add(new Account("Arun Kumar", "Bangalore", 10000));
        String name;
        String city;
        int amt;
        System.out.println("Select Operations");
        System.out.println("1. Open Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Balance Enquiry");
        System.out.println("5. List All");
        System.out.println("6. Exit");
        boolean found = false;
        int choice;

        do {
            System.out.println("Enter the choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Acount Open -------");
                    System.out.println("Enter Name --");
                    name = sc.next();
                    System.out.println("Enter City --");
                    city = sc.next();
                    System.out.println("Enter Amount --");
                    amt = sc.nextInt();
                    Account acc = new Account(name, city, amt);
                    list.add(acc);
                    System.out.println("Account Opened-----Be Happy");

                    break;
                case 2:
                    System.out.println("Acount Deposit -------");
                    found = false;
                    System.out.println("Enter Account No -----");
                    int accno = sc.nextInt();
                    for (Account td : list) {
                        if (accno == td.getAccno()) {
                            found = true;
                            System.out.println("Customer Name " + td.getName());
                            System.out.println("City  " + td.getCity());
                            System.out.println("Account Balance " + td.getBal());
                            System.out.print("\n Enter amount to deposit ");
                            amt = sc.nextInt();
                            td.setBal(td.getBal() + amt);
                            System.out.print("Deposit Successfully.....!!");
                            break;

                        }
                    }
                    if (!found) {
                        System.out.println("Invalid Account....");

                    }
                    break;
                case 3:
                    System.out.println("Acount Withdraw -------");
                    found = false;
                    System.out.println("Enter Account No -----");
                    int accnumber = sc.nextInt();
                    for (Account td : list) {
                        if (accnumber == td.getAccno()) {
                            found = true;
                            System.out.println("Customer Name " + td.getName());
                            System.out.println("City  " + td.getCity());
                            System.out.println("Account Balance " + td.getBal());
                            System.out.print("\n Enter amount to withdraw..... ");
                            amt = sc.nextInt();
                            if (amt > td.getBal()) {
                                System.out.print("\n Insufficient Balance..... ");
                                break;
                            } else {
                                td.setBal(td.getBal() - amt);
                                System.out.print("Amount Withdrawn Successfully.....!!");
                                break;

                            }

                        }
                    }
                    if (!found) {
                        System.out.println("Invalid Account....");

                    }

                    break;
                case 4:
                    System.out.println("Acount Balance enquiry -------");
                    found = false;
                    System.out.println("Enter Account No -----");
                    int accdata = sc.nextInt();
                    for (Account td : list) {
                        if (accdata == td.getAccno()) {
                            found = true;
                            System.out.println("Customer Name " + td.getName());
                            System.out.println("City  " + td.getCity());
                            System.out.println("Account Balance " + td.getBal());
                            break;

                        }
                    }
                    if (!found) {
                        System.out.println("Invalid Account....");

                    }

                    break;
                case 5:
                    System.out.println("List Of All Accounts -------");
                    for (Account ac : list) {
                        System.out.println(ac);
                    }
                    break;
                case 6:
                    System.out.println("Thanks for visiting us -------");
                    break;
                default:
                    System.out.println("-----Invalid Choice--------");

                    break;
            }
        } while (choice != 6);

    }
}