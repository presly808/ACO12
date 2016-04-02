package ua.artcode.week3.fin;

/**
 * Created by serhii on 02.04.16.
 */
public class ClientStoreTest {


    public static void main(String[] args) {
        IShop shop = visit();
        IPhone iPhone = shop.buy();

        iPhone.start();

    }



    public static IShop visit(){
        //return new IChinaStore();
        return new IShop();
    }
}
