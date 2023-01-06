public class Robusta extends Coffee {
    private static String sort = "Robusta";
    private static String robustaRegionOfGrowth = "Africa, Indonesia";
    private static double caffeineInRobusta = 2.7;

    public Robusta(String state, String packing, int weight, int price, int quality) {
        super(state, packing, weight, price, quality);
        setRegionOfGrowth(robustaRegionOfGrowth);
        setCaffeine(caffeineInRobusta);
        setSort(sort);
    }
}
