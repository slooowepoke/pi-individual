package pi.individual.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pi.individual.container.LonelyContainer;
import pi.individual.service.LonelyService;

@RestController
public class LonelyEndpoint {
    private final LonelyService service;

    public LonelyEndpoint(LonelyService service) {
        this.service = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public LonelyContainer lonelyMethod(
            @RequestParam(value="year") String year
    ) {
        return service.getDevDay(year);
    }
}
