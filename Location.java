import java.util.ArrayList;
class Location<T>{
    public T data;

    public Location<?> previous;
    public Location<?> next;

    //public ArrayList<Player> player = new ArrayList<>();

    public boolean tagged = false;

    public Location(T data){
        this.data = data;
        previous = null;
        next = null;
    }

    public void options(Player player){
        if(data instanceof Property){
            Property property = (Property) data;
            if(property.owner)
        }
        else if(data instanceof Railroad){

        }
        else if()
    }
}

