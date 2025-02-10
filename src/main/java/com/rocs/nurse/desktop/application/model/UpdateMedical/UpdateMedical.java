package com.rocs.nurse.desktop.application.model.UpdateMedical;

public class UpdateMedical {

    private String id;
    private int patient;
    private String studentnumber;
    private String firstname;
    private String middlename;
    private String lastname;
    private String symptoms;
    private String addedremack;
    private int temperaturereadings;
    private int visitdate;
    private int timein;
    private int timeout;
    private String medicationadministered;
    private String nurseincharge;

    public UpdateMedical(){

    }

    public UpdateMedical(String id, int patient, String studentnumber, String firstname, String middlename, String lastname, String symptoms, String addedremack, int temperaturereadings, int visitdate, int timein, int timeout, String medicationadministered, String nurseincharge ) {

        this.id = id;
        this.patient = patient;
        this.studentnumber = studentnumber;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.symptoms = symptoms;
        this.addedremack = addedremack;
        this.temperaturereadings = temperaturereadings;
        this.visitdate = visitdate;
        this.timein = timein;
        this.timeout = timeout;
        this.medicationadministered = medicationadministered;
        this.nurseincharge = nurseincharge;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPatient() {
        return patient;
    }

    public void setPatient(int patient) {this.patient = patient;
    }

    public String getStudentNumber() {
        return studentnumber;
    }

    public void setStudentNumber(String studentnumber) {
        this.studentnumber = studentnumber;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
         this.firstname = firstname;
    }

    public String getMiddleName() {
        return middlename;
    }

    public void setMiddleName(String middlename) {this.middlename = middlename;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {this.lastname = lastname;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getAddedRemack() {
        return addedremack;
    }

    public void setAddedRemack(String addedremack) {
        this.addedremack = addedremack;
    }

    public int getTemperatureReadings() {
        return temperaturereadings;
    }

    public void setTemperatureReadings(int temperaturereadings) {
        this.temperaturereadings = temperaturereadings;
    }

    public int getVisitDate() {
        return visitdate;
    }

    public void setVisitDate(int visitdate) {
        this.visitdate = visitdate;
    }

    public int getTimeIn() {
        return timein;
    }

    public void setTimeIn(int timein) {
        this.timein = timein;
    }

    public int getTimeOut() {
        return timeout;
    }

    public void setTimeOut(int timeout) {
        this.timeout = timeout;
    }

    public String getMedicationAdministered() {

        return medicationadministered;
    }

    public void setMedicationAdministered(String medicationadministered) {this.medicationadministered = medicationadministered;
    }

    public String getNurseInCharge() {
        return nurseincharge;
    }

    public void setNurseInCharge(String nurseincharge) {this.nurseincharge = nurseincharge;
    }
}
;