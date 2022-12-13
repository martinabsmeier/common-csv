/*
 * Copyright 2022 Martin Absmeier
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.am.common.csv;

import lombok.Data;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Simplifying the access to csv documents.
 *
 * @author Martin Absmeier
 */
@Data
public class CsvDocumentFactory {

    /**
     * Read a csv file from specified {@code filePath} uses {@link StandardCharsets#UTF_8} encoding and
     * {@code withHeader = false}.
     *
     * @param filePath the path to the cv file
     * @return the read {@link CsvDocument} class
     * @throws IOException if an error occurred
     */
    public static CsvDocument readDocument(String filePath) throws IOException {
        return readDocument(filePath, StandardCharsets.UTF_8, false);
    }

    /**
     * Read a csv file from specified {@code filePath} uses {@link StandardCharsets#UTF_8} encoding.
     *
     * @param filePath   the path to the cv file
     * @param withHeader true if csv file has a header, false otherwise
     * @return the read {@link CsvDocument} class
     * @throws IOException if an error occurred
     */
    public static CsvDocument readDocument(String filePath, boolean withHeader) throws IOException {
        return readDocument(filePath, StandardCharsets.UTF_8, withHeader);
    }

    /**
     * Read a csv file from specified {@code filePath} with {@code encoding} and {@code withHeader} option.
     *
     * @param filePath   the path to the cv file
     * @param encoding   the encoding of the csv file
     * @param withHeader true if csv file has a header, false otherwise
     * @return the read {@link CsvDocument} class
     * @throws IOException if an error occurred
     */
    public static CsvDocument readDocument(String filePath, Charset encoding, boolean withHeader) throws IOException {
        /*
        Path path = Paths.get(filePath);


        CsvRow header = null;
        Scanner scanner = new Scanner(path, encoding);
        if (withHeader) {
            header = readHeader(scanner);
        }

        List<CsvRow> rows = new ArrayList<>();
        while (scanner.hasNextLine()) {
            List<CsvCell> cells = Arrays.stream(scanner.nextLine().split(delimiter.getValue()))
                .map(token -> CsvCell.builder().value(token).build())
                .collect(Collectors.toList());
            rows.add(CsvRow.builder().cells(cells).build());
        }
        scanner.close();

        return CsvDocument.builder()
            .fileName(path.getFileName().toString())
            .header(header)
            .rows(rows)
            .build();

         */
        return null;
    }

    // #################################################################################################################
    /*
    private CsvRow readHeader(Scanner scanner) {
        if (scanner.hasNextLine()) {
            List<CsvCell> cells = Arrays.stream(scanner.nextLine().split(delimiter.getValue()))
                .map(token -> CsvCell.builder().value(token).build())
                .collect(Collectors.toList());

            return CsvRow.builder().cells(cells).build();
        }
        return null;
    }
     */

    private CsvDocumentFactory() {
        // We do not want an instance
    }
}