package Bank;

public class LoanRequeast {
    private boolean isVip;
    private int amount;
    private int period;

    public LoanRequeast(boolean isVip, int amount, int period) {
        this.isVip = isVip;
        this.amount = amount;
        this.period = period;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public boolean isVip() {
        return isVip;
    }

    public int getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }
}
