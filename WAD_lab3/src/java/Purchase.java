

public class Purchase {
    
    private String userName;
    private String Date;
    private int quantity;

    public Purchase(String userName, String Date, int quantity) {
        this.userName = userName;
        this.Date = Date;
        this.quantity = quantity;
    }

    public String getUserName() {
        return userName;
    }

    public String getDate() {
        return Date;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Purchase{" + "userName=" + userName + ", Date=" + Date + ", quantity=" + quantity + '}';
    }
    
    
    
}
