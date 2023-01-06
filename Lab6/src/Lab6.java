import java.util.ArrayList;
import java.util.Arrays;

/*
    0414 mod 13 = 11
    11) Завантажити фургон певного обсягу вантажем на певну суму з різних сортів кави,
    що можуть перебувати у різних фізичних станах (зерно, мелена, розчинна в банках
    і пакетиках). Ураховувати обсяг кави разом з упаковкою. Провести сортування товарів
    на основі співвідношення ціни й ваги. Знайти товар у фургоні, що відповідає заданому
    діапазону якості кави.
 */

public class Lab6 {
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

        vanForDelivery.setSupply(list.toArray(coffeeSupply));
        System.out.println("Uploaded weight of the van = " + weight + "kg \n");

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