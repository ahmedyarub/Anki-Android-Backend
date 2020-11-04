/*
 * Copyright (c) 2020 David Allison <davidallisongithub@gmail.com>
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.ankiweb.rsdroid.database;

import net.ankiweb.rsdroid.BackendException;

import org.json.JSONArray;

import java.util.ArrayList;

public interface SQLHandler {
    // TODO: Exceptions
    JSONArray fullQuery(String query, Object... bindArgs) throws BackendException;
    int executeGetRowsAffected(String sql, Object... bindArgs) throws BackendException;
    long insertForId(String sql, Object... bindArgs) throws BackendException;

    void beginTransaction();
    void commitTransaction();
    void rollbackTransaction();

    String[] getColumnNames(String sql);

    // TODO
    // String getPath();
}
