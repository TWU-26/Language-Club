import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ProbabilityTest {
    @Test
    public void should_be_probable(){
        assertEquals(false, new Probability(1, 6).isProbable());
        assertEquals(true, new Probability(3, 4).isProbable());
    }

    @Test
    public void should_be_improbable(){
        assertEquals(true ,new Probability(1, 6).isImprobable());
        assertEquals(false ,new Probability(3, 4).isImprobable());
    }
}
