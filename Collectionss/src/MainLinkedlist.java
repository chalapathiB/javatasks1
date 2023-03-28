public class MainLinkedlist {
    public static void main(String[] args) {
        Linkedlisty ll = new Linkedlisty();
        ll.addfirst();//10
        ll.addfirst();//20
        ll.addfirst();//30
        ll.addfirst();//40
        ll.addfirst();//50
        ll.display();
        ll.removeatIndex(2);
        ll.displayrear();
    }
}