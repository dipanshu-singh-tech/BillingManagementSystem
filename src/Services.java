public class Services {
    private int id;
    private String serviceName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    private int cost;

    public Services(int id, String serviceName, int cost) {
        this.id = id;
        this.serviceName = serviceName;
        this.cost = cost;
    }
}
