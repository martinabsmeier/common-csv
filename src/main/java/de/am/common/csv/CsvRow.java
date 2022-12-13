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
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

/**
 * {@code CsvRow} represents a row of a {@link CsvDocument}.
 *
 * @author Martin Absmeier
 */
@Data
public class CsvRow implements Serializable {
    private static final long serialVersionUID = 9176513247966201544L;

    private List<CsvCell> cells;

    @Builder
    public CsvRow(List<CsvCell> cells) {
        this.cells = isNull(cells) ? new ArrayList<>() : cells;
    }

    public void addCell(CsvCell cell) {
        cells.add(cell);
    }
}