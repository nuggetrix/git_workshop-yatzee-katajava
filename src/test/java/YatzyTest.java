import org.junit.*;
import static org.junit.Assert.*;

public class YatzyTest {

    @Test
    public void chance_scores_sum_of_all_dice() {
        int expected = 15;
        int actual = Yatzy.chance(new Roll(2,3,4,5,1));
        assertEquals(expected, actual);
        assertEquals(16, Yatzy.chance(new Roll(3,3,4,5,1)));
    }

    @Test public void yatzy_scores_50() {
        int expected = 50;
        int actual = Yatzy.yatzy(4,4,4,4,4);
        assertEquals(expected, actual);
        assertEquals(50, Yatzy.yatzy(6,6,6,6,6));
        assertEquals(0, Yatzy.yatzy(6,6,6,6,3));
    }

    @Test public void onesTest() {
        assertTrue(Yatzy.sumOfEyes(1,new Roll(1,2,3,4,5)) == 1);
        assertEquals(2, Yatzy.sumOfEyes(1,new Roll(1,2,1,4,5)));
        assertEquals(0, Yatzy.sumOfEyes(1,new Roll(6,2,2,4,5)));
        assertEquals(4, Yatzy.sumOfEyes(1,new Roll(1,2,1,1,1)));
    }

    @Test
    public void twosTest() {
        assertEquals(4, Yatzy.sumOfEyes(2,new Roll(1,2,3,2,6)));
        assertEquals(10, Yatzy.sumOfEyes(2,new Roll(2,2,2,2,2)));
    }

    @Test
    public void threesTest() {
        assertEquals(6, Yatzy.sumOfEyes(3,new Roll(1,2,3,2,3)));
        assertEquals(12, Yatzy.sumOfEyes(3,new Roll(2,3,3,3,3)));
    }

    @Test
    public void foursTest() 
    {
        assertEquals(12, Yatzy.sumOfEyes(4,new Roll(4,4,4,5,5)));
        assertEquals(8, Yatzy.sumOfEyes(4,new Roll(4,4,5,5,5)));
        assertEquals(4, Yatzy.sumOfEyes(4,new Roll(4,5,5,5,5)));

    }

    @Test
    public void fivesTest() {
        assertEquals(10, Yatzy.sumOfEyes(5,new Roll(4,4,4,5,5)));
        assertEquals(15, Yatzy.sumOfEyes(5,new Roll(4,4,5,5,5)));
        assertEquals(20, Yatzy.sumOfEyes(5,new Roll(4,5,5,5,5)));
    }

    @Test
    public void sixesTest() {
        assertEquals(0, Yatzy.sumOfEyes(6, new Roll(4,4,4,5,5)));
        assertEquals(6, Yatzy.sumOfEyes(6, new Roll(4,4,6,5,5)));
        assertEquals(18, Yatzy.sumOfEyes(6, new Roll(6,5,6,6,5)));
    }

    @Test
    public void one_pair() {
        assertEquals(6, Yatzy.score_pair(3,4,3,5,6));
        assertEquals(10, Yatzy.score_pair(5,3,3,3,5));
        assertEquals(12, Yatzy.score_pair(5,3,6,6,5));
    }

    @Test
    public void two_Pair() {
        assertEquals(16, Yatzy.two_pair(3,3,5,4,5));
        assertEquals(16, Yatzy.two_pair(3,3,5,5,5));
    }

    @Test
    public void three_of_a_kind() 
    {
        assertEquals(9, Yatzy.three_of_a_kind(3,3,3,4,5));
        assertEquals(15, Yatzy.three_of_a_kind(5,3,5,4,5));
        assertEquals(9, Yatzy.three_of_a_kind(3,3,3,3,5));
    }

    @Test
    public void four_of_a_knd() {
        assertEquals(12, Yatzy.four_of_a_kind(3,3,3,3,5));
        assertEquals(20, Yatzy.four_of_a_kind(5,5,5,4,5));
        assertEquals(9, Yatzy.three_of_a_kind(3,3,3,3,3));
    }

    @Test
    public void smallStraight() {
        assertEquals(15, Yatzy.smallStraight(1,2,3,4,5));
        assertEquals(15, Yatzy.smallStraight(2,3,4,5,1));
        assertEquals(0, Yatzy.smallStraight(1,2,2,4,5));
    }

    @Test
    public void largeStraight() {
        assertEquals(20, Yatzy.largeStraight(6,2,3,4,5));
        assertEquals(20, Yatzy.largeStraight(2,3,4,5,6));
        assertEquals(0, Yatzy.largeStraight(1,2,2,4,5));
    }

    @Test
    public void fullHouse() {
        assertEquals(18, Yatzy.fullHouse(6,2,2,2,6));
        assertEquals(0, Yatzy.fullHouse(2,3,4,5,6));
    }
}
