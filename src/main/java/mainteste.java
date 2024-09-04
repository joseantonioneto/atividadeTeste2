import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
public class mainteste {
    @Test
    public void testArrayListOperations() {
        List<Integer> r = new ArrayList<>();
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);

        assertEquals(4, r.size());
        assertEquals(1,(int) r.get(0));
        assertEquals(2,(int) r.get(1));
        assertEquals(3,(int) r.get(2));
        assertEquals(4,(int) r.get(3));

    }
}