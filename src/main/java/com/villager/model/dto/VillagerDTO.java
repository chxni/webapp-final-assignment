package com.villager.model.dto;

import java.sql.Date;

public class VillagerDTO implements java.io.Serializable {

    private int villagerCode;
    private String villagerName;
    private String gender;
    private Date birthDate;
    private String species;
    private String personality;
    private String catchphrase;
    private String belongVillage;
    private int villageCode;
    private String villageName;
    private Date createDate;

    public VillagerDTO() {

    }

    public VillagerDTO(int villagerCode, String villagerName, String gender, Date birthDate, String species, String personality, String catchphrase, String belongVillage, int villageCode, String villageName, Date createDate) {
        this.villagerCode = villagerCode;
        this.villagerName = villagerName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.species = species;
        this.personality = personality;
        this.catchphrase = catchphrase;
        this.belongVillage = belongVillage;
        this.villageCode = villageCode;
        this.villageName = villageName;
        this.createDate = createDate;
    }

    public int getVillagerCode() {
        return villagerCode;
    }

    public void setVillagerCode(int villagerCode) {
        this.villagerCode = villagerCode;
    }

    public String getVillagerName() {
        return villagerName;
    }

    public void setVillagerName(String villagerName) {
        this.villagerName = villagerName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getCatchphrase() {
        return catchphrase;
    }

    public void setCatchphrase(String catchphrase) {
        this.catchphrase = catchphrase;
    }

    public String getBelongVillage() {
        return belongVillage;
    }

    public void setBelongVillage(String belongVillage) {
        this.belongVillage = belongVillage;
    }

    public int getVillageCode() {
        return villageCode;
    }

    public void setVillageCode(int villageCode) {
        this.villageCode = villageCode;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
