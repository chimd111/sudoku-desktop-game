package models;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import sudoku.model.models.SudokuField;

public class SudokuFieldTest {

    @Test
    void testCompareTo() {
        SudokuField field1 = new SudokuField(1);
        SudokuField field2 = new SudokuField(2);
        SudokuField field3 = new SudokuField(3);

        assertDoesNotThrow(() -> {
            assertTrue(field1.compareTo(field2) < 0);
            assertTrue(field2.compareTo(field3) < 0);
            assertTrue(field1.compareTo(field3) < 0);
        });

        assertDoesNotThrow(() -> {
            assertTrue(field2.compareTo(field1) > 0);
            assertTrue(field3.compareTo(field2) > 0);
            assertTrue(field3.compareTo(field1) > 0);
        });
    }

    @Test
    void testSetValueChangesDefaultValue() {
        SudokuField field = new SudokuField();

        assertEquals(0, field.getValue());

        field.setValue(5);

        assertEquals(5, field.getValue());
    }
}
