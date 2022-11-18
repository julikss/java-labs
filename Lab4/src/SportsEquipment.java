public class SportsEquipment {
    private String name; //name of the equipment
    private String sport; //kind of sport
    private String brand; //brand of the equipment
    private int price; // price of one piece of the equipment
    private int quantity; //number of chosen equipment

    public SportsEquipment (String name, String sport, String brand, int price, int quantity) {
        this.name = name;
        this.sport = sport;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return this.price;
    }

    public String getBrand() {
        return this.brand;
    }

    public String showInfo() {
        return String.format("%s, %s, %s, %d, %d", name, sport, brand, price, quantity);
    }

}
