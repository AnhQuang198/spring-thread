package com.example.springthread.repository;

import com.example.springthread.request.ColumnConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TableCommonRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createTable(String tableName, List<ColumnConfig> configs) {
        StringBuilder sql = new StringBuilder("CREATE TABLE ")
                .append(tableName).append("(id INT NOT NULL AUTO_INCREMENT, ");
        appendColumn(configs, sql);
        sql.append("PRIMARY KEY (id)");
        sql.append(")");
        jdbcTemplate.execute(String.valueOf(sql));
    }

    private void appendColumn(List<ColumnConfig> configs, StringBuilder sql) {
        for (ColumnConfig cf : configs) {
            sql.append(cf.getColumnCode()).append(" ").append(cf.getDataType()).append(", ");
        }
    }
}
