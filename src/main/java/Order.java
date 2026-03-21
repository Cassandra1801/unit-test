import java.util.ArrayList;

public class Order {

    private ArrayList<String> items;
    private String membershipType;

    public Order(ArrayList<String> items, String membershipType) {
        this.items = items;
        this.membershipType = membershipType;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public String getMembershipType() {
        return membershipType;
    }
}
