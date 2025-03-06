package com.rocs.nurse.desktop.application.app.facade.UpdateMedicalFacade.impl;

import com.rocs.nurse.desktop.application.data.Dao.UpdateMedicalDao;
import com.rocs.nurse.desktop.application.model.UpdateMedical.UpdateMedical;

public record UpdateMedicalDaoImpl() implements UpdateMedicalDao {
    @Override
    public UpdateMedical findUpdateMedicalById(Integer id) {
        return null;
    }

    @Override
    public boolean updateUpdateMedical(UpdateMedical updateMedical) {
        return false;
    }
}
