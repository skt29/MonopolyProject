public class Railroad{
    public static final Railroad[] railroads = railroads();

    public Player owner;
    public String name = "";
    public int price = 200;

    public Railroad(String name){
        owner = null;
        this.name = name;
    }

    public void sell(Player owner){
        //boolean here
        this.owner = owner;
        owner.balance -= price;
    }

    private static Railroad[] railroads(){
        Railroad[] railroads = new Railroad[4];
        railroads[0] = new Railroad("Reading Railroad");
        railroads[1] = new Railroad("Pennsylvania Railroad");
        railroads[2] = new Railroad("B&O Railroad");
        railroads[3] = new Railroad("Short Line");
        return railroads;
    }
}
