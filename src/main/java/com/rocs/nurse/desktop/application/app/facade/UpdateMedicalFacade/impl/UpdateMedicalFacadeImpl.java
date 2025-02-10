package com.rocs.nurse.desktop.application.app.facade.UpdateMedicalFacade.impl;

import com.rocs.nurse.desktop.application.app.facade.UpdateMedicalFacade.UpdateMedicalFacade;
import com.rocs.nurse.desktop.application.data.Dao.UpdateMedicalDao;
import com.rocs.nurse.desktop.application.model.UpdateMedical.UpdateMedical;

public class UpdateMedicalFacadeImpl implements UpdateMedicalFacade {

    private UpdateMedicalDao updatemedicalDao = new com.rocs.nurse.desktop.application.app.facade.UpdateMedicalFacade.impl.UpdateMedicalDaoImpl();

    public UpdateMedical getUpdateMedicalById(String id) {
UpdateMedical updatemedical = this.updatemedicalDao.findUpdateMedicalById(id);
return updatemedical;
    }

public boolean updateUpdateMedical(UpdateMedical updatemedical){return this.updatemedicalDao.updateUpdateMedical(updatemedical); }

}

