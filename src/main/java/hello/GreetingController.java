package hello;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(value= "/alertNotification", method = RequestMethod.POST)
    public void alertNotification(@RequestBody String body) {
        System.out.println(body);
    }
}
