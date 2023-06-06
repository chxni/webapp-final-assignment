package com.villager.model.dao;

import com.villager.model.dto.VillagerDTO;
import java.util.List;

public interface VillagerDAO {

    List<VillagerDTO> selectAllVillagerList();

    List<VillagerDTO> selectVillagerBySpecies();

    List<VillagerDTO> selectVillagerByPersonality();

    boolean insertVillager();

    boolean updateVillager();

    boolean deleteVillager();
}
