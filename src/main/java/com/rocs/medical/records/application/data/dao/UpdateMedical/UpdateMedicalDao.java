package com.rocs.medical.records.application.data.dao;


import com.rocs.medical.records.application.model.impl.UpdateMedical;

public interface UpdateMedicalDao {
    UpdateMedical findUpdateMedicalById(Integer id);

    boolean updateUpdateMedical(UpdateMedical updateMedical);
}
