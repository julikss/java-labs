public abstract class Coffee {
    private String sort;
    private String state;
    private String packing;
    private int weight;
    private int price;
    private int quality;
    private double caffeine;
    private String regionOfGrowth;

    public Coffee (String state, String packing, int weight, int price, int quality) {
        setState(state);
        setPacking(packing);
        setWeight(weight);
        setPrice(price);
        setQuality(quality);
    }

    public int getTotalPrice() {
        return this.weight * this.price;
    }

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
