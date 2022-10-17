import java.util.ArrayList;
public class Player{
    /*
    1) Purple
    2) Light Blue
    3) Pink
    4) Orange
    5) Red
    6) Yellow
    7) Green
    8) Dark Blue
     */
    public String name;
    public int balance;
    public ArrayList<Property> properties = new ArrayList<>();

    public Player(String name, int balance){
        this.name = name;
        this.balance = balance;
    }
}
