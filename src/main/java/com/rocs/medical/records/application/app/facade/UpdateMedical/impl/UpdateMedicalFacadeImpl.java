package com.rocs.medical.records.application.app.facade.UpdateMedicalFacade.impl;

import com.rocs.medical.records.application.app.facade.UpdateMedicalFacade.UpdateMedicalFacade;
import com.rocs.medical.records.application.model.impl.UpdateMedical;

public class UpdateMedicalFacadeImpl implements UpdateMedicalFacade {

    private final updateMedicalDao updatemedicalDao = new updateMedicalDaoImpl();

}

@Override
public boolean updateUpdateMedical(UpdateMedical updatemedical) { return this.updatemedicalDao.updateUpdateMedical(updatemedical);

}


