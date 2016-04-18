package th.co.dtac.mobile.rtr.web.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.co.dtac.mobile.rtr.service.TopupService;
import th.co.dtac.mobile.rtr.web.model.TopupParam;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by amanurat on 4/6/2016 AD.
 */
@RestController
@RequestMapping("/refill")
public class RefillController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RefillController.class);


    @Autowired
    private TopupService topupService;

    @RequestMapping(value = "/topup", method = POST)
    public String topup(@RequestBody TopupParam topupParam, HttpServletRequest request) {

        LOGGER.info("Remote Addr : "+request.getRemoteAddr());

        return "success";
    }
    @RequestMapping(value = "/topup/{code}", method = GET)
    public String topup(@PathVariable String code) {

        LOGGER.info("1 ");

        try {
            //call third party
            topupService.callTopupService(code);


            LOGGER.info("4");
        } catch (Exception e) {
            LOGGER.info("5");
            return "failure";
        }

        return "success";
    }



}
