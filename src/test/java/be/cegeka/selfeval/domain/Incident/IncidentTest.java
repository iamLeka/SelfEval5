package be.cegeka.selfeval.domain.Incident;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IncidentTest {

    private Incident incident;

    @Before
    public void setUp() throws Exception {
        incident = new Incident("bawpow","collision",5);
    }


    @Test
    public void incidentWithSameName_isSameIncident()throws Exception{

        assertThat(incident).isEqualToComparingFieldByField(new Incident("bawpow","collision",5));
    }

    @Test
    public void incidentWithOtherName_isNotEqualToOtherIncident()throws Exception{

        assertThat(incident).isNotEqualTo(new Incident("knalbots","collision",7));
    }



}