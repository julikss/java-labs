import java.util.Arrays;
import java.util.Comparator;

/* 0414
    C11 = 7 -> Визначити клас спортивний інвентар,
    який складається як мінімум з 5-и полів.
    Відсортувати масив об'єктів класу, за одним з полів,
    за зростанням, а за іншим, за спаданням використавши
    при цьому стандартні засоби сортування.
*/

public class Lab4 {
    public static void main(String[] args) {
        SportsEquipment[] equipment = new SportsEquipment[5];

        equipment[0] = new SportsEquipment("helmet", "cycling", "Good Bike", 1700, 3);
        equipment[1] = new SportsEquipment("ball", "basketball", "Jordan", 1400, 1);
        equipment[2] = new SportsEquipment("ball", "tennis", "Wellkin", 279, 3);
        equipment[3] = new SportsEquipment("bat", "baseball", "Avtobita", 349, 25);
        equipment[4] = new SportsEquipment("yoga mat", "yoga", "EasyFit", 699, 1);

        //sort array by comparator and compare data by "price" in descending order
        Arrays.sort(equipment, Comparator.comparing(SportsEquipment::getPrice).reversed());
        System.out.println("Price high to low\n");
        for (int i = 0; i < equipment.length; i++) {
            System.out.println(equipment[i].showInfo());
        }

        //sort array by comparator and compare data by "brand"
        Arrays.sort(equipment, Comparator.comparing(SportsEquipment::getBrand));
        System.out.println("\nBrand by alphabet:\n");
        for (int i = 0; i < equipment.length; i++) {
            System.out.println(equipment[i].showInfo());
        }
    }
}