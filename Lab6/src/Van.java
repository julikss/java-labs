public class Van {
    private int vanCapacity;
    private Coffee[] supply;

    public Van(int vanCapacity) {
        this.setVanCapacity(vanCapacity);
    }

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
