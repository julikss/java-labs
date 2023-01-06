import java.util.Comparator;

public class CoffeeComparator implements Comparator<Coffee> {
    @Override
    public int compare(Coffee item1, Coffee item2) {
        int price1 = item1.getTotalPrice();
        int price2 = item2.getTotalPrice();
        if (price1 == price2) return 0;
        else if (price1 > price2) return 1;
        else return -1;
    }
}
