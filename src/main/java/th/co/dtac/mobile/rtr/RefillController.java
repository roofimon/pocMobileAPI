package th.co.dtac.mobile.rtr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import th.co.dtac.mobile.rtr.service.TopupService;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

/**
 * Created by amanurat on 4/6/2016 AD.
 */
@RestController
@RequestMapping("/refill")
public class RefillController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RefillController.class);


    @Autowired
    TopupService topupService;

    @RequestMapping(value = "/topup", method = RequestMethod.POST)
    public String topup(@RequestBody TopupParam topupParam, HttpServletRequest request) {

        LOGGER.info("Remote Addr : "+request.getRemoteAddr());

        return "success";
    }
    @RequestMapping(value = "/topup", method = RequestMethod.GET)
    public String topup() {

        LOGGER.info("1 ");

        //call third party
        topupService.callTopupService();


        LOGGER.info("4");

        return "success";
    }



}
class TopupParam {
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