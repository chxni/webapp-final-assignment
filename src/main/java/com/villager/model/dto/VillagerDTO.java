package com.villager.model.dto;

public class VillagerDTO implements java.io.Serializable {

    private int villagerCode;
    private String villagerName;
    private String gender;
    private String birthDate;
    private String species;
    private String personality;
    private String catchphrase;
    private String belongVillage;

    public VillagerDTO() {

    }

    public VillagerDTO(int villagerCode, String villagerName, String gender, String birthDate, String species, String personality, String catchphrase, String belongVillage) {
        this.villagerCode = villagerCode;
        this.villagerName = villagerName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.species = species;
        this.personality = personality;
        this.catchphrase = catchphrase;
        this.belongVillage = belongVillage;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
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


    @Override
    public String toString() {
        return "VillagerDTO{" +
                "villagerCode=" + villagerCode +
                ", villagerName='" + villagerName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", species='" + species + '\'' +
                ", personality='" + personality + '\'' +
                ", catchphrase='" + catchphrase + '\'' +
                ", belongVillage='" + belongVillage + '\'' +
                '}';
    }
}
