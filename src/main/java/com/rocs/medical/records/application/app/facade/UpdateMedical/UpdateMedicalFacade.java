package com.rocs.medical.records.application.app.facade.UpdateMedicalFacade;

import com.rocs.medical.records.application.model.impl.UpdateMedical;



public interface UpdateMedicalFacade {

    UpdateMedical getUpdateMedicalById(Integer id);

    boolean updateUpdateMedical(UpdateMedical updatemedical);
}
