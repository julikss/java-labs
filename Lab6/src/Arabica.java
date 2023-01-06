/**
 * Клас, що наслідує клас Coffee
 *
 * @author Легенька Юлія
 * @version 1.0 6 Jan 2023
 */
public class Arabica extends Coffee {
    /**
     * Поле - сорт кави
     */
    private static String sort = "Arabica";
    /**
     * Поле - регіон зростання
     */
    private static String arabicaRegionOfGrowth = "Ethiopia";
    /**
     * Поле - вміст кофеїну в 100г (в г)
     */
    private static double caffeineInArabica = 1.5;

    /**
     * Конструктор класу
     *
     * @param state     вид кави (в зернах, мелена, розчинна)
     * @param packing   упаковка (банка, в пакетиках)
     * @param weight    вага (у кг)
     * @param price     ціна (за кг)
     * @param quality   якість (від 1 до 10)
     */
    public Arabica(String state, String packing, int weight, int price, int quality) {
        super(state, packing, weight, price, quality);
        setRegionOfGrowth(arabicaRegionOfGrowth);
        setCaffeine(caffeineInArabica);
        setSort(sort);
    }


}
