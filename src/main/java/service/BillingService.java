package service;

import entity.BillRequest;
import entity.BillResponse;
import entity.BillResponseDetail;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by sallu on 10/31/2016.
 */
public class BillingService {

    public static final BillingService INSTANCE = new BillingService();

    public BillResponse calculate(BillRequest billRequest) {
        long totalAmount = billRequest.getTotalAmount();
        long balance = totalAmount;
        List<BillResponseDetail> responseDetail = billRequest.getDetails().
                stream().
                map(billDetails -> new BillResponseDetail(billDetails.getCustomerId(), totalAmount * billDetails.getShare() / 100)).
                collect(Collectors.toList());
        balance-=responseDetail.stream().map(BillResponseDetail::getShare).reduce(0L,Long::sum);

        return new BillResponse(totalAmount,balance,responseDetail);

    }

}
