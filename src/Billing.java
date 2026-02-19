public class Billing {
    public int bill(Services[] service,boolean [] addOrNot){
        int totalBill=0;
        for (int i=0;i< service.length;i++) {
            if(addOrNot[i]){
                totalBill += service[i].getCost();
            }
        }
        return totalBill;
    }
}
