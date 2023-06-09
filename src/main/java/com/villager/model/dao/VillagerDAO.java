package com.villager.model.dao;

import com.common.config.SearchCondition;
import com.villager.model.dto.VillagerDTO;

import java.util.List;

public interface VillagerDAO {

    List<VillagerDTO> selectAllVillagerList();

    List<VillagerDTO> selectVillagerByCondition(SearchCondition searchCondition);

    int insertVillager(VillagerDTO villager);

    int updateVillager(VillagerDTO villager);

    int deleteVillager(VillagerDTO villager);
}
