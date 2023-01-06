/**
 * Клас, що наслідує клас Coffee
 *
 * @author Легенька Юлія
 * @version 1.0 6 Jan 2023
 */
public class Liberica extends Coffee {
    /**
     * Поле - сорт кави
     */
    private static String sort = "Liberica";
    /**
     * Поле - регіон зростання
     */
    private static String libericaRegionOfGrowth = "Philippines, Indonesia, Malaysia";
    /**
     * Поле - вміст кофеїну в 100г (в г)
     */
    private static double caffeineInLiberica = 1.23;

    /**
     * Конструктор класу
     *
     * @param state     вид кави (в зернах, мелена, розчинна)
     * @param packing   упаковка (банка, в пакетиках)
     * @param weight    вага (у кг)
     * @param price     ціна (за кг)
     * @param quality   якість (від 1 до 10)
     */
    public Liberica(String state, String packing, int weight, int price, int quality) {
        super(state, packing, weight, price, quality);
        setRegionOfGrowth(libericaRegionOfGrowth);
        setCaffeine(caffeineInLiberica);
        setSort(sort);
    }
}
