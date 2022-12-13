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

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.requireNonNull;

/**
 * {@code CsvDocument} represents a in memory representation of a csv file.
 *
 * @author Martin Absmeier
 */
@Data
@Builder
public class CsvDocument {

    private String fileName;
    private CsvDelimiter delimiter;
    private CsvRow header;
    private List<CsvRow> rows;
    private transient  Charset encoding;

    @Builder
    public CsvDocument(String fileName, CsvDelimiter delimiter, CsvRow header, List<CsvRow> rows, Charset encoding) {
        requireNonNull(fileName, "NULL is not permitted as value for parameter 'fileName'.");
        this.fileName = fileName;
        this.delimiter = isNull(delimiter) ? CsvDelimiter.COMMA : delimiter;
        this.header = header;
        this.rows = isNull(rows) ? new ArrayList<>() : rows;
        this.encoding = isNull(encoding) ? StandardCharsets.UTF_8 : encoding;
    }
}