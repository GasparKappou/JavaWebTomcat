
import java.util.ArrayList;
import java.util.List;

public class Buyer {
    private String name;
    private String surname;
    private String email;
    private int dni;
    
    private List<Cart> carts = new ArrayList<>();

    public Buyer(){}

    // Constructor con dos parámetros
    public Buyer(String name, String surname, String email, int dni) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dni = dni;
    }

    // Get y set
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Cart> getCarts() {
        return this.carts;
    }

    public void addCart(Cart newCart){
        List<Cart> cartList = getCarts();
        cartList.add(newCart);
        this.carts = cartList;
    }

    public Cart getCart(int id) {
        return carts.get(id);
    }
}