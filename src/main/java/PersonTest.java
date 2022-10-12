
import org.junit.jupiter.api.Test;

;import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void addChild() {
        //arrange
        Person parent = new Person("Sanam", "Mirza", "female", 32);
        Person child = new Person("Junior", "Mirza", "male", 8);
        List<Person> children = new ArrayList<>();
        children.add(child);

        //act
        parent.addChild(parent, child);
        List<Person> kids = parent.getChildren();

        //assert
        assertEquals(children, kids);
        assertEquals("Junior", parent.getChildren().get(0).getName());
    }
}