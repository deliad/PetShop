package hello.controller;

import hello.model.Pet;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Delia on 1/8/2017.
 */

@RestController
@RequestMapping("pet/")
public class PetsController {

    @RequestMapping(method = GET)
    @ResponseBody
    public Pet pet() {
        return new Pet("Luna", LocalDate.now());
    }

    @RequestMapping(path = "{name}",method = GET)
    @ResponseBody
    public Pet pet(@PathVariable String name) {
        return new Pet(name, LocalDate.now());
    }
}
