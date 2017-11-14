package domain.highway;

import domain.Highway;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

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

    @Test
    public void highwayWithOtherName_isNotEqualToOtherHighway()throws Exception{

        assertThat(highway).isNotEqualTo(new Highway("E17",30));
    }



}