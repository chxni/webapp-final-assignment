package com.villager.model.service;

import com.common.config.SearchCondition;
import com.villager.model.dao.VillagerDAO;
import com.villager.model.dto.VillagerDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.common.jdbc.JDBCTemplate.*;

public class VillagerService {

    private VillagerDAO villagerDAO;

    public List<VillagerDTO> selectAllVillager() {

        SqlSession sqlSession = getSqlSession();
        villagerDAO = sqlSession.getMapper(VillagerDAO.class);

        List<VillagerDTO> villagerList = villagerDAO.selectAllVillagerList();

        sqlSession.close();

        return villagerList;
    }

    public List<VillagerDTO> selectVillagerByCondition(SearchCondition searchCondition) {

        SqlSession sqlSession = getSqlSession();
        villagerDAO = sqlSession.getMapper(VillagerDAO.class);

        List<VillagerDTO> villagerList = villagerDAO.selectVillagerByCondition(searchCondition);

        sqlSession.close();

        return villagerList;
    }

    public int insertVillager(VillagerDTO villager) {

        SqlSession sqlSession = getSqlSession();
        villagerDAO = sqlSession.getMapper(VillagerDAO.class);

        int result = villagerDAO.insertVillager(villager);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public int updateVillager(VillagerDTO villager) {

        SqlSession sqlSession = getSqlSession();
        villagerDAO = sqlSession.getMapper(VillagerDAO.class);

        int result = villagerDAO.updateVillager(villager);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public int deleteVillager(VillagerDTO villager) {

        SqlSession sqlSession = getSqlSession();
        villagerDAO = sqlSession.getMapper(VillagerDAO.class);

        int result = villagerDAO.deleteVillager(villager);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }
}
