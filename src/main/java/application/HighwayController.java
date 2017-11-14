package application;

import domain.Highway;
import domain.HighwayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path = "/Highway")
@Transactional
public class HighwayController {

    @Inject
    private HighwayService highwayService;

    @GetMapping(path = "/all")
    public List<Highway> getAllHighways() {
        return highwayService.getAllHighways();
    }
}
