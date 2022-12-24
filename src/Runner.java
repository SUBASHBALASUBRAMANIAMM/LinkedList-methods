public class Runner {
    public static void main(String [] args){
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(6);
        list.insertAtStart(25);
        list.insertAt(0,10);
        list.deleteAt(1);
        list.show();
    }
}
