package com.example.checkcreditform.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

//@Getter
//@Setter
public class CreditApplicationDTO {

    private String firstNameMain;
    private String secondNameMain;
    private String sexMain;
    private String dateOfBirthMain;
    private String cityOfBirthMain;
    private String passportSerialMain;
    private String passportNumberMain;
    private List<String> placeOfWorkMain;
    private Integer incomePerMonthMain;
    private Integer monthlyExpenseMain;
    private String familyStatusMain;
    private Integer amountOfChildrenMain;
    private List<String> propertyMain;


    private String firstNameGuarantor;
    private String secondNameGuarantor;
    private String sexGuarantor;
    private String dateOfBirthGuarantor;
    private String cityOfBirthGuarantor;
    private String passportSerialGuarantor;
    private String passportNumberGuarantor;
    private List<String> placeOfWorkGuarantor;
    private List<String> propertyGuarantor;

    public String getFirstNameMain() {
        return firstNameMain;
    }

    public void setFirstNameMain(String firstNameMain) {
        this.firstNameMain = firstNameMain;
    }

    public String getSecondNameMain() {
        return secondNameMain;
    }

    public void setSecondNameMain(String secondNameMain) {
        this.secondNameMain = secondNameMain;
    }

    public String getSexMain() {
        return sexMain;
    }

    public void setSexMain(String sexMain) {
        this.sexMain = sexMain;
    }

    public String getDateOfBirthMain() {
        return dateOfBirthMain;
    }

    public void setDateOfBirthMain(String dateOfBirthMain) {
        this.dateOfBirthMain = dateOfBirthMain;
    }

    public String getCityOfBirthMain() {
        return cityOfBirthMain;
    }

    public void setCityOfBirthMain(String cityOfBirthMain) {
        this.cityOfBirthMain = cityOfBirthMain;
    }

    public String getPassportSerialMain() {
        return passportSerialMain;
    }

    public void setPassportSerialMain(String passportSerialMain) {
        this.passportSerialMain = passportSerialMain;
    }

    public String getPassportNumberMain() {
        return passportNumberMain;
    }

    public void setPassportNumberMain(String passportNumberMain) {
        this.passportNumberMain = passportNumberMain;
    }

    public List<String> getPlaceOfWorkMain() {
        return placeOfWorkMain;
    }

    public void setPlaceOfWorkMain(List<String> placeOfWorkMain) {
        this.placeOfWorkMain = placeOfWorkMain;
    }

    public Integer getIncomePerMonthMain() {
        return incomePerMonthMain;
    }

    public void setIncomePerMonthMain(Integer incomePerMonthMain) {
        this.incomePerMonthMain = incomePerMonthMain;
    }

    public Integer getMonthlyExpenseMain() {
        return monthlyExpenseMain;
    }

    public void setMonthlyExpenseMain(Integer monthlyExpenseMain) {
        this.monthlyExpenseMain = monthlyExpenseMain;
    }

    public String getFamilyStatusMain() {
        return familyStatusMain;
    }

    public void setFamilyStatusMain(String familyStatusMain) {
        this.familyStatusMain = familyStatusMain;
    }

    public Integer getAmountOfChildrenMain() {
        return amountOfChildrenMain;
    }

    public void setAmountOfChildrenMain(Integer amountOfChildrenMain) {
        this.amountOfChildrenMain = amountOfChildrenMain;
    }

    public List<String> getPropertyMain() {
        return propertyMain;
    }

    public void setPropertyMain(List<String> propertyMain) {
        this.propertyMain = propertyMain;
    }

    public String getFirstNameGuarantor() {
        return firstNameGuarantor;
    }

    public void setFirstNameGuarantor(String firstNameGuarantor) {
        this.firstNameGuarantor = firstNameGuarantor;
    }

    public String getSecondNameGuarantor() {
        return secondNameGuarantor;
    }

    public void setSecondNameGuarantor(String secondNameGuarantor) {
        this.secondNameGuarantor = secondNameGuarantor;
    }

    public String getSexGuarantor() {
        return sexGuarantor;
    }

    public void setSexGuarantor(String sexGuarantor) {
        this.sexGuarantor = sexGuarantor;
    }

    public String getDateOfBirthGuarantor() {
        return dateOfBirthGuarantor;
    }

    public void setDateOfBirthGuarantor(String dateOfBirthGuarantor) {
        this.dateOfBirthGuarantor = dateOfBirthGuarantor;
    }

    public String getCityOfBirthGuarantor() {
        return cityOfBirthGuarantor;
    }

    public void setCityOfBirthGuarantor(String cityOfBirthGuarantor) {
        this.cityOfBirthGuarantor = cityOfBirthGuarantor;
    }

    public String getPassportSerialGuarantor() {
        return passportSerialGuarantor;
    }

    public void setPassportSerialGuarantor(String passportSerialGuarantor) {
        this.passportSerialGuarantor = passportSerialGuarantor;
    }

    public String getPassportNumberGuarantor() {
        return passportNumberGuarantor;
    }

    public void setPassportNumberGuarantor(String passportNumberGuarantor) {
        this.passportNumberGuarantor = passportNumberGuarantor;
    }

    public List<String> getPlaceOfWorkGuarantor() {
        return placeOfWorkGuarantor;
    }

    public void setPlaceOfWorkGuarantor(List<String> placeOfWorkGuarantor) {
        this.placeOfWorkGuarantor = placeOfWorkGuarantor;
    }

    public List<String> getPropertyGuarantor() {
        return propertyGuarantor;
    }

    public void setPropertyGuarantor(List<String> propertyGuarantor) {
        this.propertyGuarantor = propertyGuarantor;
    }
}
