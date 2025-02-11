package economy;

public class Marketplace {
    private int level;
    private int merchants;

    public Marketplace() {
        this.level = 1;
        this.merchants = 5;
    }

    public void upgrade() {
        level++;
        merchants += 2;
    }

    public int getMerchants() {
        return merchants;
    }
}
