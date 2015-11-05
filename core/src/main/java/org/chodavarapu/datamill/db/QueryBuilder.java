package org.chodavarapu.datamill.db;

/**
 * @author Ravi Chodavarapu (rchodava@gmail.com)
 */
public interface QueryBuilder {
    WhereBuilder deleteFrom(String table);
    InsertBuilder insertInto(String table);
    SelectBuilder selectAll();
    SelectBuilder select(String column);
    SelectBuilder select(String... columns);
    SelectBuilder select(Iterable<String> columns);
    UpdateBuilder update(String table);
}
