package entity;

/**
 * Created by sallu on 10/31/2016.
 */
public class BillResponseDetail {

    private String customerId;

    private long share;

    public BillResponseDetail(String customerId, long share) {
        this.customerId = customerId;
        this.share = share;
    }

    public BillResponseDetail() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public long getShare() {
        return share;
    }

    public void setShare(long share) {
        this.share = share;
    }
}
