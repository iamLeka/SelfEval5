package be.cegeka.selfeval.domain.Incident;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

public class IncidentServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private IncidentService incidentService;

    @Mock
    private IncidentRepository incidentRepository;

    @Test
    public void ifIncidentServiceGetAllHighwaysIsCalles_ShouldActivateIncidentRepositoryAddIncident(){
        Incident incident = new Incident("kaput","autos deden boem",30);
        incidentService.addIncident(incident);
        verify(incidentRepository).addIncident(incident);
    }

}