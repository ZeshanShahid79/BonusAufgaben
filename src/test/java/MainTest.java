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
        @Test
        public void checkValueGreater0(){
            //given
            int value = 1;
            //when
            boolean actual = Main.valueGreater0(value);
            //then
            assertTrue(actual);
        }

        @Test
        public void checkValueLower0(){
            //given
            int value = -1;
            //when
            boolean actual = Main.valueGreater0(value);
            //then
            assertFalse(actual);
        }

        @Test
        public void checkSquareNumberFrom20(){
            //given
            int value = -20;
            //when
            int actual = Main.squareNumber(value);
            //then
            assertEquals(400,actual);
        }

        /*Test funktioniert nicht da Tests nur Read Only
        @Test
        public void scannerCheck(){
            //given
            String name = "Dennis";
            //when
            String actual = Main.inputName();
            //then
            assertEquals(name,actual);
        }
        */
    }


