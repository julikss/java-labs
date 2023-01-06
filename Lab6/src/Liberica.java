public class Liberica extends Coffee {
    private static String sort = "Liberica";
    private static String libericaRegionOfGrowth = "Philippines, Indonesia, Malaysia";
    private static double caffeineInLiberica = 1.23;

    public Liberica(String state, String packing, int weight, int price, int quality) {
        super(state, packing, weight, price, quality);
        setRegionOfGrowth(libericaRegionOfGrowth);
        setCaffeine(caffeineInLiberica);
        setSort(sort);
    }
}
