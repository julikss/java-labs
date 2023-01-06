/**
 * Батьківський клас для задання полів кави
 *
 * @author Легенька Юлія
 * @version 1.0 6 Jan 2023
 */
public abstract class Coffee {
    /**
     * Поле - сорт кави
     */
    private String sort;
    /**
     * Поле - вид кави
     */
    private String state;
    /**
     * Поле - упаковка
     */
    private String packing;
    /**
     * Поле - вага
     */
    private int weight;
    /**
     * Поле - ціна
     */
    private int price;
    /**
     * Поле - якість
     */
    private int quality;
    /**
     * Поле - вміст кофеїну в 100г (в г)
     */
    private double caffeine;
    /**
     * Поле - регіон зростання
     */
    private String regionOfGrowth;

    /**
     * Конструктор класу
     *
     * @param state     вид кави (в зернах, мелена, розчинна)
     * @param packing   упаковка (банка, в пакетиках)
     * @param weight    вага (у кг)
     * @param price     ціна (за кг)
     * @param quality   якість (від 1 до 10)
     */
    public Coffee (String state, String packing, int weight, int price, int quality) {
        setState(state);
        setPacking(packing);
        setWeight(weight);
        setPrice(price);
        setQuality(quality);
    }

    /**
     * Метод для отримання повної ціни
     */
    public int getTotalPrice() {
        return this.weight * this.price;
    }

    /**
     * Геттери і сеттери для приватних полів класу
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getSort() {
        return sort;
    }
    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getCaffeine() {
        return caffeine;
    }

    public void setCaffeine(double caffeine) {
        this.caffeine = caffeine;
    }

    public String getRegionOfGrowth() {
        return regionOfGrowth;
    }

    public void setRegionOfGrowth(String regionOfGrowth) {
        this.regionOfGrowth = regionOfGrowth;
    }

    /**
     * Метод для відображення в консолі інформації з полями класу
     */
    public String showInfo() {
        return String.format("Sort of coffee: %s \n " +
                        "Region of growth: %s \n " +
                        "Grams of caffeine per 100g: %.2f \n " +
                        "State: %s, Packing: %s, Weight: %d \n " +
                        "Price: %d, Quality(1-10): %d \n",
                this.getSort(), this.getRegionOfGrowth(), this.getCaffeine(),
                this.getState(), this.getPacking(), this.getWeight(),
                this.getPrice(), this.getQuality());
    }
}
