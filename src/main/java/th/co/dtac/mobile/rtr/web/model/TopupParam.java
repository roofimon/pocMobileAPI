package th.co.dtac.mobile.rtr.web.model;

import java.math.BigDecimal;

/**
 * Created by Assanai Manurat on 4/8/2016 AD.
 */
public class TopupParam {
    private String subscriberNumber;
    private BigDecimal amount;

    public TopupParam() {
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSubscriberNumber() {
        return subscriberNumber;
    }

    public void setSubscriberNumber(String subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
    }
}