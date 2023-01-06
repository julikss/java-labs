public class Arabica extends Coffee {
    private static String sort = "Arabica";
    private static String arabicaRegionOfGrowth = "Ethiopia";
    private static double caffeineInArabica = 1.5;

    public Arabica(String state, String packing, int weight, int price, int quality) {
        super(state, packing, weight, price, quality);
        setRegionOfGrowth(arabicaRegionOfGrowth);
        setCaffeine(caffeineInArabica);
        setSort(sort);
    }


}
