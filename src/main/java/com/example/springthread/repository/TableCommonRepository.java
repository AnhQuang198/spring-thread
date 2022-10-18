package com.example.springthread.repository;

import com.example.springthread.request.ColumnConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TableCommonRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void createTable(String tableName, List<ColumnConfig> configs) {
        StringBuilder sql = new StringBuilder("CREATE TABLE ");
        sql.append(tableName);
        sql.append("(id INT NOT NULL AUTO_INCREMENT, ");
        appendColumn(configs, sql);
        sql.append("created_at TIMESTAMP NULL");
        sql.append("updated_at TIMESTAMP NULL");
        sql.append(", PRIMARY KEY (id))");
        jdbcTemplate.execute(String.valueOf(sql));
    }

    public void dropTable(String tableName) {
        StringBuilder sql = new StringBuilder("DROP TABLE ").append(tableName);
        jdbcTemplate.execute(String.valueOf(sql));
    }

    private void appendColumn(List<ColumnConfig> configs, StringBuilder sql) {
        for (ColumnConfig cf : configs) {
            sql.append(cf.getColumnCode()).append(" ").append(cf.getDataType()).append(", ");
        }
    }
}
