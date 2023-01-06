/**
 * Клас для фургону
 *
 * @author Легенька Юлія
 * @version 1.0 6 Jan 2023
 */
public class Van {
    /**
     * Поле - місткість фургону (кг)
     */
    private int vanCapacity;
    /**
     * Поле - загрузка товарами
     */
    private Coffee[] supply;

    /**
     * Конструктор класу
     *
     * @param vanCapacity   можлива вага загрузки фургону
     */
    public Van(int vanCapacity) {
        this.setVanCapacity(vanCapacity);
    }

    /**
     * Геттери і сеттери для полів класу
     */
    public void setVanCapacity(int vanCapacity) {
        this.vanCapacity = vanCapacity;
    }

    public int getVanCapacity() {
        return vanCapacity;
    }

    public Coffee[] getSupply() {
        return supply;
    }

    public void setSupply(Coffee[] supply) {
        this.supply = supply;
    }
}
