import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ProbabilityTest {

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception() {
        new Probability(3,2);
    }

    @Test
    public void should_be_probable() {
        assertTrue(new Probability(7,10).isProbable());
    }

    @Test
    public void should_not_be_probable(){
        assertFalse(new Probability(1, 5).isProbable());
    }

    @Test
    public void should_be_improbable() {
        assertTrue(new Probability(3, 10).isImprobable());
    }

    @Test
    public void should_not_be_improbable() {
        assertFalse(new Probability(4, 5).isImprobable());
    }

    @Test
    public void five_should_be_neither_probable_nor_improbable(){
        assertFalse(new Probability(1, 2).isProbable());
        assertFalse(new Probability(1, 2).isImprobable());
    }
    
    @Test
    public void should_return_opposite_probability(){
        assertThat(new Probability(1,3).not(), equalTo(new Probability(2,3)));
        assertThat(new Probability(3,4).not(), equalTo(new Probability(2,8)));
    }

    @Test
    public void should_have_the_same_hashcode_with_same_attributes(){
        assertThat(new Probability(5,6).hashCode(), equalTo(new Probability(5,6).hashCode()));
    }

    @Test

    public void should_perform_and_on_probabilities(){
        assertThat((new Probability(1,2)).and(new Probability(3,4)), equalTo(new Probability(3,8)));
    }

    @Test
    public void should_perform_or_on_probabilities(){
        assertThat(new Probability(3,5).or(new Probability(1,4)), equalTo(new Probability(14,20)));
    }
}
