public class CircularlyLinkedList{
    Location<?> current;

    public CircularlyLinkedList(){ current = null; }

    public boolean isEmpty(){ return current == null; }

    public void initialize(){
        
    }

    public void insert(Object data, boolean right){
        Location<?> current = new Location<>(data);
        if(this.current != null){
            Location<?> next = this.current; if(!right){ next = this.current.previous; }
            Location<?> previous = this.current.previous; if(!right){ previous = this.current; }

            next.previous = current;
            previous.next = current;

            current.next = next;
            current.previous = previous;
        }
        else{ //If empty
            current.next = current;
            current.previous = current;
        }
        this.current = current;
    }

    public String toString(boolean right){
        String string = "";
        current.tagged = true;
        Location<?> link = current;

        while(true){
            string += link.data + ", ";
            if(right){ link = link.next; }
            else{ link = link.previous; }
            if(link.tagged){ link.tagged = false; break; }
        }
        return "[" + string + "\b\b]";
    }

    public void examine(){
        String string = "";
        Location<?> link = current;
        for(int i = 0; i < 7; i++){
            string += link.data + ", ";
            link = link.next;
        }
        System.out.println(("[" + string + "\b\b]"));
    }






}