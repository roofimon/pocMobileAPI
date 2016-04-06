package th.co.dtac.mobile.rtr.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by amanurat on 4/6/2016 AD.
 */
@Service
public class TopupService {

    private static Logger LOGGER = LoggerFactory.getLogger(TopupService.class);
    public boolean callTopupService() {

        LOGGER.info("2");
        System.out.println("call real service");
        LOGGER.info("3");
        return true;
    }

}
