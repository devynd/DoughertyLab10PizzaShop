import java.util.ArrayList;
import java.util.Scanner;

public class Customer {


    //Class Level Variables - Protect the data
        private int customerId;
        protected String custName, custPhone;
        int cCount = 0;


        // add new customer method

        public Customer addCustomer() {
            Customer cust = new Customer(cCount++);
            Scanner scnr = new Scanner(System.in);
            System.out.println("Please Enter your Name: ");
            cust.setCustomerName(scnr.nextLine());
            System.out.println("Please Enter your Phone: ");
            cust.setCustomerPhone(scnr.nextLine());
            cust.setCustomerId(cCount);



            return cust;
        }


        public static void printCustomer(ArrayList<Customer> cList){
            for (Customer cust: cList){
                //System.out.println("Customer Id: " + cust.getCustomerId());
                System.out.printf("%-10s | %-12s | %-10s\n", cust.getCustomerId(), cust.getCustomerName(), cust.getCustomerPhone());
                //    System.out.println("Customer Name: " + cust.getCustomerName());
                //    System.out.println("Customer Phone: " + cust.getCustomerPhone());

                // index of each object
                //  System.out.println("Index: " + cList.indexOf(cust));

                // use this to count inventory
                //   System.out.println("Array List Size: " + cList.size());

            }
        }

        //Constructor

        public Customer(int _customerId) {
            this.customerId = _customerId;
        }
        public Customer() {
        }


        public void setCustomer(int _customerId, String name, String phoneNumber) {
            this.customerId = _customerId;
            this.custName  = name;
            this.custPhone = phoneNumber;
        }

        public static void listCust(ArrayList<Customer> cList) {
            for (Customer customer : cList) {
                System.out.println(customer.getCustomerName());
            }
        }


        //Setters and Getters
        public int getCustomerId() { return customerId; }
        public void setCustomerId(int _customerId) {this.customerId = _customerId;}

        public String getCustomerName() { return custName; }
        public String getCustomerName(int _id) { this.customerId = _id; return custName; }
        public void setCustomerName(String _customerName) {this.custName = _customerName;}

        public String getCustomerPhone() { return custPhone; }
        public void setCustomerPhone(String _customerPhone) {this.custPhone = _customerPhone;}

        public int getCust() {
            System.out.println("Enter Customer ID: ");
            Scanner scnr = new Scanner(System.in);
            int input = scnr.nextInt();
            return input;
        }





        public void printCustomers() {
            getCustomerId();
            getCustomerName();
            getCustomerPhone();

        }

    public void setCustomerPhoneNumber(String nextLine) {
    }
}

