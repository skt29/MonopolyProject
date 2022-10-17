public class Main{
    public static CircularlyLinkedList board = new CircularlyLinkedList();
    //public static Property
    public static void main(String[] args){

        Player a = new Player("Yo", 9);
        Player b = new Player("Sup", 9);
        Player c = new Player("Yo", 9);
        if(a.equals(c)){ System.out.println("TEST"); }

        /*Property[] purple = Property.properties[0];
        purple[0].owner = a;
        purple[1].owner = a;
        a.balance = 9999;
        purple[1].canBuy(0, 0);*/

        //System.out.println(purple[1].canBuy(0, 0));
        /*list.insertRight(1);
        list.insertRight(2);
        list.insertRight(3);*/

        /*board.insert(1, true);
        board.insert(2, true);
        board.insert(3, true);

        System.out.println(board.toString(false));*/
        //list.examine();
    }
}
