package be.cegeka.selfeval.domain.Highway;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.mockito.Mockito.verify;

public class HighwayServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private HighwayService highwayService;

    @Mock
    private HighwayRepository highwayRepository;

    @Test
    public void ifHighwayServiceGetAllHighwaysIsCalles_ShouldActivateHighwayRepositoryGetAllHighways(){
        highwayService.getAllHighways();
        verify(highwayRepository).getAllHighways();
    }

}