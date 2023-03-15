package com.massmutual.coe.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class OnCallAllowanceDaoImpl implements OnCallAllowanceDao{

    @Autowired
    private NamedParameterJdbcTemplate paramJdbcTemplate;
    @Override
    public List<Map<String, Object>> getAssociate() {
        try{
            MapSqlParameterSource sqlParams = new MapSqlParameterSource();
            String sql = "select * from coe.associate";
            return paramJdbcTemplate.query(sql, sqlParams, new ColumnMapRowMapper());
        }catch(Exception ex){
          System.out.println(ex);
        }
        return null;
    }
}
