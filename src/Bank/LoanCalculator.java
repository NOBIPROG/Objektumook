package Bank;

public class LoanCalculator {
    LoanRequeast request;
    LoanResponse response;


    public void isNormalCoverageNeeded() {
        if ((!request.isVip() && 3000000 > request.getAmount() && request.getAmount() > 500000) || 3000000 < request.getAmount()) {
            response.setNeedsCoverage(true);
        } else {
            response.setNeedsCoverage(false);
        }
    }

    public void isNormalSuccessorNeeded() {
        if (!request.isVip() && 3000000 < request.getAmount()) {
            response.setNeedSuccessor(true);
        }
    }

    public void coverAmount() {
        double coverAmount = 0;
        if (!request.isVip()) {
            coverAmount = (request.getAmount()) * 0.8;
        } else {
            coverAmount = (request.getAmount()) * 0.7;
        }

        response.setCoverAmount(coverAmount);
    }

    public void isVipCoverageNeeded() {
        if (request.isVip() && (20000000 > request.getAmount() && request.getAmount() > 3000000) || 20000000 < request.getAmount()) {
            response.setNeedsCoverage(true);
        } else {
            response.setNeedsCoverage(false);
        }

    }

    public void isVipSuccessorNeeded() {
        if (!request.isVip() && 20000000 < request.getAmount()) {
            response.setNeedSuccessor(true);
        }
    }

    public void monthlyFee() {
        double fee = 0;
        if (!request.isVip() && request.getPeriod() == 12) {
            fee = request.getAmount() * 1.5 / request.getPeriod();
        } else if (request.isVip() && request.getPeriod() == 12) {
            fee = request.getAmount() * 1.4 / request.getPeriod();
        } else if (!request.isVip() && request.getPeriod() > 12) {
            fee = ((request.getPeriod() - 12) * 0.03 + 1.5) * request.getAmount() / request.getPeriod();
        } else if (request.isVip() && request.getPeriod() > 12) {
            fee = ((request.getPeriod() - 12) * 0.02 + 1.4) * request.getAmount() / request.getPeriod();
        }
        response.setMonthlyFee(fee);
    }

}

