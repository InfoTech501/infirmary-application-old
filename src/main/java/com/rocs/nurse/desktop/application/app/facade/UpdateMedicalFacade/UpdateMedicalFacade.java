package com.rocs.nurse.desktop.application.app.facade.UpdateMedicalFacade;

import com.rocs.nurse.desktop.application.model.UpdateMedical.UpdateMedical;


public interface UpdateMedicalFacade {

UpdateMedical getUpdateMedicalById(String id);

    boolean updateUpdateMedical(UpdateMedical updatemedical);
    }

