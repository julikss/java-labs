import java.util.ArrayList;
import java.util.Arrays;

/**
 * Клас для загрузки фургону кавою та її сортування
 *
 * @author Легенька Юлія
 * @version 1.0 6 Jan 2023
 */

public class Lab6 {
    /**
     * Головний метод програми. Створює масив об'єктів класів {@link Arabica},
     * {@link Robusta}, {@link Liberica}, що унаслідують клас {@link Coffee}.
     * Створює об'єкт класу фургону {@link Van} і завантажує фургон кавою відповідно
     * до його місткості. Створює {@link ArrayList<Coffee>} та додає всю поставку кави
     * до нього, сортує каву за повною ціною, використовуючи об'єкт класу {@link CoffeeComparator}
     * і виводить відсортований список позицій. Сортує каву за заданим діапазоном її якості та виводить
     * в консоль.
     */
    public static void main(String[] args) {
        Coffee[] coffeeSupply = {
                new Arabica("jar", "beans", 100, 200, 7),
                new Robusta("bag", "ground", 2, 50, 4),
                new Liberica("jar", "beans", 50, 350, 8),
                new Liberica("jar", "ground", 70, 400, 9)
        };

        Van vanForDelivery = new Van(600);
        ArrayList<Coffee> list =new ArrayList<Coffee>();

        int weight = 0;
        for (Coffee item : coffeeSupply) {
            if (weight < vanForDelivery.getVanCapacity()) {
                list.add(item);
                weight += item.getWeight();
            } else {
                break;
            }
        }

        // Завантаження фургону
        vanForDelivery.setSupply(list.toArray(coffeeSupply));
        System.out.println("Uploaded weight of the van = " + weight + "kg \n");

        // Сортування кави за повною ціною
        CoffeeComparator coffeeComparator = new CoffeeComparator();
        Arrays.sort(coffeeSupply, coffeeComparator);

        System.out.println("----Sorted by total price---- \n");
        for (Coffee item : coffeeSupply) {
            System.out.println(item.showInfo());
        }

        System.out.println("----Sorted by quality higher than 5---- \n");
        for (Coffee item : coffeeSupply) {
            if (item.getQuality() > 5) {
                System.out.println(item.showInfo());
            }
        }
    }
}