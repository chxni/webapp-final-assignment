package com.villager.model.dao;

import com.common.config.ConfigLocation;
import com.villager.model.dto.VillagerDTO;

import javax.security.auth.login.Configuration;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static com.common.jdbc.JDBCTemplate.close;

public class VillagerDAO {

    private final Properties prop;

    public VillagerDAO() {

        prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream(ConfigLocation.MAPPER_LOCATION + "villager-mapper.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<VillagerDTO> selectAllVillagerList(Connection con) {

        Statement stmt = null;
        ResultSet rset = null;

        List<VillagerDTO> villagerList = null;

        String query = prop.getProperty("selectAllVillagerList");

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery(query);

            villagerList = new ArrayList<>();

            while(rset.next()) {
                VillagerDTO villager = new VillagerDTO();

                villager.setVillagerCode(rset.getInt("VILLAGER_CODE"));
                villager.setVillageName(rset.getString("VILLAGER_NAME"));
                villager.setGender(rset.getString("GENDER"));
                villager.setBirthDate(rset.getDate("BIRTH_DATE"));
                villager.setSpecies(rset.getString("SPECIES"));
                villager.setPersonality(rset.getString("PERSONALITY"));
                villager.setCatchphrase(rset.getString("CATCHPHRASE"));
                villager.setBelongVillage(rset.getString("BELONG_VILLAGE"));
                villager.setVillageName(rset.getString("VILLAGE_NAME"));
                villager.setCreateDate(rset.getDate("CREATE_DATE"));

                villagerList.add(villager);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt);
            close(rset);
        }

        return villagerList;
    }

    public List<VillagerDTO> selectVillagerBySpecies(Connection con, String species) {

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        List<VillagerDTO> villagerList = null;

        String query = prop.getProperty("selectVillagerBySpecies");

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, species);

            rset = pstmt.executeQuery();

            villagerList = new ArrayList<>();

            while(rset.next()) {
                VillagerDTO villager = new VillagerDTO();

                villager.setVillagerCode(rset.getInt("VILLAGER_CODE"));
                villager.setVillageName(rset.getString("VILLAGER_NAME"));
                villager.setGender(rset.getString("GENDER"));
                villager.setBirthDate(rset.getDate("BIRTH_DATE"));
                villager.setSpecies(rset.getString("SPECIES"));
                villager.setPersonality(rset.getString("PERSONALITY"));
                villager.setCatchphrase(rset.getString("CATCHPHRASE"));
                villager.setBelongVillage(rset.getString("BELONG_VILLAGE"));
                villager.setVillageName(rset.getString("VILLAGE_NAME"));
                villager.setCreateDate(rset.getDate("CREATE_DATE"));

                villagerList.add(villager);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
        }

        return villagerList;
    }

    public List<VillagerDTO> selectVillagerByPersonality(Connection con, String personality) {

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        List<VillagerDTO> villagerList = null;

        String query = prop.getProperty("selectVillagerByPersonality");

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, personality);

            rset = pstmt.executeQuery();

            villagerList = new ArrayList<>();

            while(rset.next()) {
                VillagerDTO villager = new VillagerDTO();

                villager.setVillagerCode(rset.getInt("VILLAGER_CODE"));
                villager.setVillageName(rset.getString("VILLAGER_NAME"));
                villager.setGender(rset.getString("GENDER"));
                villager.setBirthDate(rset.getDate("BIRTH_DATE"));
                villager.setSpecies(rset.getString("SPECIES"));
                villager.setPersonality(rset.getString("PERSONALITY"));
                villager.setCatchphrase(rset.getString("CATCHPHRASE"));
                villager.setBelongVillage(rset.getString("BELONG_VILLAGE"));
                villager.setVillageName(rset.getString("VILLAGE_NAME"));
                villager.setCreateDate(rset.getDate("CREATE_DATE"));

                villagerList.add(villager);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
        }

        return villagerList;
    }

    public void insertVillager(Connection con, VillagerDTO villager) {

        PreparedStatement pstmt = null;

        String query = prop.getProperty("insertVillager");

        try {
            pstmt = con.prepareStatement(query);

            pstmt.setString(1, villager.getVillagerName());
            pstmt.setString(2, villager.getGender());
            pstmt.setDate(3, villager.getBirthDate());
            pstmt.setString(4, villager.getSpecies());
            pstmt.setString(5, villager.getPersonality());
            pstmt.setString(6, villager.getCatchphrase());

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
    }

    public void updateVillager(Connection con, VillagerDTO villagerDTO) {
        PreparedStatement pstmt = null;

        String query = prop.getProperty("updateVillager");

        try {
            pstmt = con.prepareStatement(query);

            pstmt.setString(1, villagerDTO.getBelongVillage());
            pstmt.setString(2, villagerDTO.getVillagerName());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }

    }

    public void deleteVillager(Connection con, String villagerName) {

        PreparedStatement pstmt = null;

        String query = prop.getProperty("deleteVillager");

        try {
            pstmt = con.prepareStatement(query);

            pstmt.setString(1, villagerName);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
    }

}
