package be.cegeka.selfeval.application;

import be.cegeka.selfeval.domain.Highway.HighwayService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import static org.assertj.core.api.Assertions.assertThat;

public class HighwayControllerTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private HighwayController highwayController;

    @Mock
    private HighwayService highwayService;

    @Test
    public void whenGetAllHighwayIsAsked_shouldReturnAllHighways(){
        highwayController.getAllHighways();
        verify(highwayService).getAllHighways();
    }
}