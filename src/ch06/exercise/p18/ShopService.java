package ch06.exercise.p18;

public class ShopService {

    private final static ShopService instance = new ShopService();

    private ShopService() {
    }

    public static ShopService getInstance() {

        return instance;
    }
}
