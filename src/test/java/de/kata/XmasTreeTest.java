package de.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XmasTreeTest {
    @Test
    void heightZeroOnlyDrawsTheLog() {
        Tree xmasTree = new XmasTree();
        assertEquals("I\n", xmasTree.draw(0));
    }
        
    @Test
    void heightTwoDrawsTwoLinesOfLeafs() {
        Tree xmasTree = new XmasTree();
        assertEquals(" X \nXXX\n I \n", xmasTree.draw(2));
    }

    @Test
    void heightOneForOneLineOfLeafs() {
        Tree xmasTree = new XmasTree();
        assertEquals("""
                        X
                        I
                        """,
                xmasTree.draw(1)
        );
    }
}
