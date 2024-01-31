import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    
    @Test
    public void testFilter(){
        List<String> input = new ArrayList<String>();
        input.add("cat");
        input.add("dog");
        input.add("mat");
        input.add("tree");

        StringChecker sc = new ContainsMethods();

        //assertEquals()

    }
}

class ContainsMethods implements StringChecker{

    public ContainsMethods(){
    }

    public boolean checkString(String s){
        return (s.length() == 3);
    }
}


