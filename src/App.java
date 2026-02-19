import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        String cusName=sc.nextLine();
        System.out.println("Enter Car Name: ");
        String carName=sc.nextLine();
        System.out.println("Enter Car Number: ");
        String carNum=sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phNum=sc.nextLine();
        Customer cus=new Customer(cusName,carName,carNum,phNum);
        Services[] ser ={
                new Services(1,"Wash",200),
                new Services(2,"Braking",400),
                new Services(3,"Oiling",600),
                new Services(4,"Full",1000)
        };
        boolean [] addOrNot=new boolean[ser.length];
        while(true){
            System.out.println("Available Services are: ");
            for (int i=0;i< ser.length;i++) {
                if(!addOrNot[i]){ //IMP------------------------------------------
                    System.out.println(ser[i].getId()+" "+ser[i].getServiceName()+" "+ser[i].getCost());
                }
            }
            System.out.println("Enter ID number of Required Service \n Enter 0 if Bill Generate: ");
            int choice=sc.nextInt();
            if(choice>ser.length|| choice==0)break;
            if (addOrNot[choice - 1]) {    //IMPORTANT-----------------------------------------------
                System.out.println("Service already added");
            } else {
                addOrNot[choice - 1] = true;
                System.out.println("Service Added Successfully");
            }
        }
        Billing bill=new Billing();
        int totalBill=bill.bill(ser,addOrNot);
        System.out.println("Generating Bill");
        System.out.println(cus.getName());
        System.out.println(cus.getPhNumber());
        System.out.println(cus.getCarName());
        System.out.println(cus.getCarNumber());
        for (int i=0;i< ser.length;i++) {
            if(addOrNot[i]){
                System.out.println(ser[i].getServiceName()+" "+ser[i].getCost());
            }
        }
        System.out.println("Total Bill : "+totalBill);
    }
}
