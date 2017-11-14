package domain.highway;

import application.Highway;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class HighwayTest {

    private Highway highway;

    @Before
    public void setUp() throws Exception {
        highway = new Highway("E19", 30);
    }


    @Test
    public void highwayWithSameName_isSameHighway()throws Exception{

        assertThat(highway).isEqualToComparingFieldByField(new Highway("E19",30));
    }
}