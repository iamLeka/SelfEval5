package be.cegeka.selfeval.domain.Incident;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class IncidentService {

    @Inject
    private IncidentRepository incidentRepository;

    public void addIncident(Incident incidentDetails) {
        incidentRepository.addIncident(incidentDetails);
    }
}
