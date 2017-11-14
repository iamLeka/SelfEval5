package be.cegeka.selfeval.application;

        import be.cegeka.selfeval.domain.Incident.Incident;
        import be.cegeka.selfeval.domain.Incident.IncidentService;
        import org.junit.Rule;
        import org.junit.Test;
        import org.mockito.InjectMocks;
        import org.mockito.Mock;
        import org.mockito.junit.MockitoJUnit;
        import org.mockito.junit.MockitoRule;
        import static org.assertj.core.api.Assertions.assertThat;
        import static org.mockito.Mockito.verify;

        import static org.assertj.core.api.Assertions.assertThat;

public class IncidentControllerTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private IncidentController incidentController;

    @Mock
    private IncidentService incidentService;

    @Test
    public void whenGetAllHighwayIsAsked_shouldReturnAllHighways(){
        Incident incident = new Incident("a","b",1);
        incidentController.addIncident(incident);
        verify(incidentService).addIncident(incident);
    }
}