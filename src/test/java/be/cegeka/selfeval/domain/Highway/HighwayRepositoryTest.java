package be.cegeka.selfeval.domain.Highway;


import be.cegeka.selfeval.Application;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
@Transactional
public class HighwayRepositoryTest {

    @Inject
    private HighwayRepository highwayRepository;

    @PersistenceContext
    private EntityManager entityManager;

    private Highway e19;

    @Before
    public void setUp() throws Exception{
        e19 = new Highway("e19", 50);
        entityManager.persist(e19);
    }

    @Test
    public void getAllHighways_shouldreturnAllHighways()throws Exception{
        List <Highway> highway = highwayRepository.getAllHighways();
        Assertions.assertThat(highway).contains(e19);
    }

}