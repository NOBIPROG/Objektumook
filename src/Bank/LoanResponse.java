package Bank;

public class LoanResponse {

    private boolean isGranted;
    private boolean needSuccessor;
    private boolean needsCoverage;
    private double coverAmount;
    private double monthlyFee;

    public LoanResponse() {
    }

    public boolean isNeedSuccessor() {

        return needSuccessor;
    }

    public void setNeedsCoverage(boolean needsCoverage) {
        this.needsCoverage = needsCoverage;
    }

    public void setNeedSuccessor(boolean needSuccessor) {
        this.needSuccessor = needSuccessor;
    }

    public boolean getNeedsCoverage() {
        return needsCoverage;
    }

    public double getCoverAmount() {
        return coverAmount;
    }

    public void setCoverAmount(double coverAmount) {
        this.coverAmount = coverAmount;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
}