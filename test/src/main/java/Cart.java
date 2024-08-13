
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int id;
    
    private List<Product> products = new ArrayList<>();
    private boolean state;

    public Cart(){}

    public Cart(int id, boolean state) {
        this.id = id;
        this.state = state;
    }

    //get set
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for(int i = 0; i < this.products.size(); i++){
            totalPrice += this.products.get(i).getPrice();
        }
        return totalPrice;
    }

    public void addProduct(Product newProduct){
        this.products.add(newProduct);
    }

    public Product getProduct(int id) {
        return this.products.get(id);
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public boolean getState() {
        return this.state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}