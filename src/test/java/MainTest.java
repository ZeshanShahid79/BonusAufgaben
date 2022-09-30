import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class MainTest {

        @Test
        public void isNamePrinted(){
            //given
            String name = "Zeshan";
            //when
            String actual = Main.myNameIs(name);
            //then

            assertEquals("Zeshan",actual);
        }
        @Test
        public void printName5Times(){
            //givem
            String name = "Zeshan";

            //when
            int actual = Main.myName5Times(name);

            //then
            assertEquals(5,actual);


        }

    }

