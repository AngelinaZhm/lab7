//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store store = new Store(75);

        Thread client1 = new Thread(new StoreClient(store,"Олег",35));
        Thread client2 = new Thread(new StoreClient(store,"Марія",40));
        Thread client3 = new Thread(new StoreClient(store,"Вадим",10));

        client1.start();
        client2.start();
        client3.start();

    }
}