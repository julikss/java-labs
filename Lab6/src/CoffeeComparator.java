import java.util.Comparator;

/**
 * Клас для порівняння кави за повною ціною
 *
 * @author Легенька Юлія
 * @version 1.0 6 Jan 2023
 */
public class CoffeeComparator implements Comparator<Coffee> {
    /**
     * Функція, що реалізує метод compare в Comparator
     *
     * @param item1 the first object to be compared {@link Coffee}
     * @param item2 the second object to be compared {@link Coffee}
     * @return 1, -1 or 0 для того, щоб далі проводити сортування
     */
    @Override
    public int compare(Coffee item1, Coffee item2) {
        int price1 = item1.getTotalPrice();
        int price2 = item2.getTotalPrice();
        if (price1 == price2) return 0;
        else if (price1 > price2) return 1;
        else return -1;
    }
}
