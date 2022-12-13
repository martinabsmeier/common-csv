/*
 * Test the
 * Copyright (C) 2013 Martin Absmeier, IT Consulting Services
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.am.common.csv;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * JUnit test cases of {@link CsvDocumentFactoryTest} class.
 *
 * @author Martin Absmeier
 */
class CsvDocumentFactoryTest {

    private String filePath;

    @BeforeEach
    void setUp() {
        filePath = System.getProperty("user.dir").concat(File.separator)
            .concat("src").concat(File.separator)
            .concat("test").concat(File.separator)
            .concat("resources").concat(File.separator)
            .concat("postcodes.csv");
    }

    @AfterEach
    void tearDown() {
        this.filePath = null;
    }

    @Test
    void testReadCSVFile() throws IOException {
        CsvDocument actual = CsvDocumentFactory.readDocument(filePath, true);
        assertTrue(true);
    }
}