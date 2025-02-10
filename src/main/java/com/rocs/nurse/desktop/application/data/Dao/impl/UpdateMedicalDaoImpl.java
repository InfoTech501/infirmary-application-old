package com.rocs.nurse.desktop.application.data.Dao.impl;

import com.rocs.nurse.desktop.application.data.Dao.UpdateMedicalDao;
import com.rocs.nurse.desktop.application.data.dbConnector.ConnectorHelper;
import com.rocs.nurse.desktop.application.model.UpdateMedical.UpdateMedical;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class UpdateMedicalDaoImpl implements UpdateMedicalDao {

    public boolean updateUpdateMedical(UpdateMedical updatemedical) {
try(Connection con = ConnectorHelper.getConnection()) {
    PreparedStatement stmt = con.prepareStatement ("UPDATE UPDATEMEDICAL SET ID = ?, PATIent = ?, STUDENTNUMBER = ?, FIRSTNAME = ?, MIDDLENAME = ?, LASTNAME = ?, SYMPTOMS = ?, ADDEDREMACK = ?, TEMPERATUREREADING = ?, VISITDATE = ?, TIMEIN =?, TIMEOUT =?, MIDICATIONADMINISTERED = ?, NURSEINCHARGE = ?,");
stmt.setString(1, updatemedical.getId());
stmt.setInt(2, updatemedical.getPatient());
stmt.setString(3, updatemedical.getStudentNumber());
stmt.setString(4, updatemedical.getFirstName());
stmt.setString(5, updatemedical.getMiddleName());
stmt.setString(6, updatemedical.getLastName());
stmt.setString(7, updatemedical.getSymptoms());
stmt.setString(8, updatemedical.getAddedRemack());
stmt.setInt(9, updatemedical.getTemperatureReadings());
stmt.setInt(10, updatemedical.getVisitDate());
stmt.setInt(11, updatemedical.getTimeIn());
stmt.setInt(12, updatemedical.getTimeOut());
stmt.setString(13, updatemedical.getMedicationAdministered());
stmt.setString(14, updatemedical.getNurseInCharge());
int affectedRows = stmt.executeUpdate();
return affectedRows > 0;
} catch (SQLException e) {
System.out.println("An SQL Exception occurred." + e.getMessage());
return false;
}
    }


}
