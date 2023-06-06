package com.common.jdbc;

import com.common.config.ConfigLocation;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCTemplate {

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {

        if(sqlSessionFactory == null) {
            String resource = "config/mybatis-config.xml";
            try {
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sqlSessionFactory.openSession(false);
    }

}

