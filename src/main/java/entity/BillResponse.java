package entity;

import java.util.List;

/**
 * Created by sallu on 10/31/2016.
 */
public class BillResponse {
    private long totalAmount;

    private long balanceAmount;

    private List<BillResponseDetail> details;

    public BillResponse(long totalAmount, long balanceAmount, List<BillResponseDetail> details) {
        this.details = details;
        this.balanceAmount = balanceAmount;
        this.totalAmount = totalAmount;
    }

    public BillResponse() {
    }

    public List<BillResponseDetail> getDetails() {
        return details;
    }

    public void setDetails(List<BillResponseDetail> details) {
        this.details = details;
    }

    public long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public long getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(long balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
}