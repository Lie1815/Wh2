package Pizza;

public class Order {

    private int IDorder;
    private String status;


    public Order (int IDorder, String status){
        this.IDorder = IDorder;
        this.status = "в очереди";
    }

    public int getIDorder() {
        return IDorder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String toString() {
        return "Order {" +
                "IDorder=" + IDorder +
                ", status='" + status + '\'' + ' ' +
                '}';
    }
}
