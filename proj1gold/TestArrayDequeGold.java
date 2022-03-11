import static org.junit.Assert.*;
import org.junit.Test;
public class TestArrayDequeGold {

    @Test
    public void testDeque(){

        StudentArrayDeque<Integer> studentDeque = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> solutionDeque = new ArrayDequeSolution<>();
        StringBuilder message = new StringBuilder();

        while(true) {
            double numberBetweenZeroAndOne = StdRandom.uniform();
            int numberInDeque = StdRandom.uniform(1,10);
            if (numberBetweenZeroAndOne <= 0.2) {
                studentDeque.addLast(numberInDeque);
                solutionDeque.addLast(numberInDeque);
                message.append("addLast("+numberInDeque+")\n");
            }
            else if(numberBetweenZeroAndOne <= 0.5) {
                studentDeque.addFirst(numberInDeque);
                solutionDeque.addFirst(numberInDeque);
                message.append("addFirst("+numberInDeque+")\n");
            }
            else if(numberBetweenZeroAndOne <= 0.7 && !studentDeque.isEmpty()) {
                Integer actual = studentDeque.removeFirst();
                Integer expected = solutionDeque.removeFirst();
                message.append("removeLast()\n");
                assertEquals(message.toString(),expected, actual);
            }
            else if(!studentDeque.isEmpty()) {
                Integer actual = studentDeque.removeLast();
                Integer expected = solutionDeque.removeLast();
                message.append("removeFirst()\n");
                assertEquals(message.toString(),expected, actual);
            }

        }

    }
}
