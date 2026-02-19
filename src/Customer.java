public class Customer {
    private String name;
    private String carNumber;
    private String phNumber;
    private String carName;
    Customer(String name,String carName,String carNumber,String phNumber){
        this.name=name;
        this.carName=carName;
        this.carNumber=carNumber;
        this.phNumber=phNumber;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCarNumber(){
        return carNumber;
    }
    public void setCarNumber(String carNumber){
        this.carNumber=carNumber;
    }
    public String getPhNumber(){
        return phNumber;
    }
    public void setPhNumber(String phNumber){
        this.phNumber=phNumber;
    }
    public String getCarName(){
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }

}
