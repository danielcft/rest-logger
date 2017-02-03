package dk.digitalidentity;

import org.apache.log4j.Logger;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestLogger {
    private static final Logger logger = Logger.getLogger(RestLogger.class);

    @RequestMapping("/")
    public void Log(@RequestBody String payload) {
        logger.info("Received payload: " + payload);
    }
}
