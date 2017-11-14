package be.cegeka.selfeval.application;

import be.cegeka.selfeval.domain.Incident.Incident;
import be.cegeka.selfeval.domain.Incident.IncidentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.transaction.Transactional;

@RestController
@RequestMapping(path = "/Incident")
@Transactional
public class IncidentController {

    @Inject
    private IncidentService incidentService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addIncident(@RequestBody Incident incidentDetails){
        incidentService.addIncident(incidentDetails);

    }
}




