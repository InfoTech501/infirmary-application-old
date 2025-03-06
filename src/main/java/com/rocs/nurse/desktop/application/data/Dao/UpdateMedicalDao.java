package com.rocs.nurse.desktop.application.data.Dao;


import com.rocs.nurse.desktop.application.model.UpdateMedical.UpdateMedical;

public interface UpdateMedicalDao {
UpdateMedical findUpdateMedicalById(Integer id);

    boolean updateUpdateMedical(UpdateMedical updateMedical);
}
