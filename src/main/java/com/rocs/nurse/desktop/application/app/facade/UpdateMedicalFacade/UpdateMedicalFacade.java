package com.rocs.nurse.desktop.application.app.facade.UpdateMedicalFacade;

import com.rocs.nurse.desktop.application.model.UpdateMedical.UpdateMedical;


public interface UpdateMedicalFacade {

UpdateMedical getUpdateMedicalById(Integer id);

    boolean updateUpdateMedical(UpdateMedical updatemedical);
    }

