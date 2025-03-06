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
    PreparedStatement stmt = con.prepareStatement ("UPDATE UPDATEMEDICAL SET ID = ?,  STUDENTID = ?, AILMENTID = ?, MEDHISTORYID = ?, NURSEINCHARGEIN = ?, SYMPTOMS = ?,  TEMPERATUREREADINGS = ?, VISITDATE = ?, TREATMENT = ?,");
stmt.setInt(1, updatemedical.getId());
stmt.setInt(3, updatemedical.getStudentId());
stmt.setInt(4, updatemedical.getAilmentId());
stmt.setString(5, updatemedical.getMedHistoryId());
stmt.setInt(6, updatemedical.getNurseInChargeIn());
stmt.setString(7, updatemedical.getSymptoms());
stmt.setInt(8, updatemedical.getTemperatureReadings());
stmt.setInt(9, updatemedical.getVisitDate());
stmt.setString(10, updatemedical.getTreatment());
int affectedRows = stmt.executeUpdate();
return affectedRows > 0;
} catch (SQLException e) {
System.out.println("An SQL Exception occurred." + e.getMessage());
return false;
}
    }


}
