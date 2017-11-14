package be.cegeka.selfeval.domain.Highway;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;


@Named
public class HighwayService {

    @Inject
    private HighwayRepository highwayRepository;

    public List<Highway> getAllHighways(){
        return highwayRepository.getAllHighways();
    }
}
