package liquibase.statement.core;

import liquibase.statement.AbstractSqlStatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteStatement extends AbstractSqlStatement {
    private String catalogName;
    private String schemaName;
    private String tableName;
    private String whereClause;
    private List<Object> whereParameters = new ArrayList<Object>();


    public DeleteStatement(String catalogName, String schemaName, String tableName) {
        this.catalogName  = catalogName;
        this.schemaName = schemaName;
        this.tableName = tableName;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public String getTableName() {
        return tableName;
    }

    public String getWhereClause() {
        return whereClause;
    }

    public DeleteStatement setWhereClause(String whereClause) {
        this.whereClause = whereClause;

        return this;
    }

    public DeleteStatement addWhereParameter(Object value) {
        this.whereParameters.add(value);

        return this;
    }

    public DeleteStatement addWhereParameters(Object... value) {
        this.whereParameters.addAll(Arrays.asList(value));

        return this;
    }

    public List<Object> getWhereParameters() {
        return whereParameters;
    }
}
