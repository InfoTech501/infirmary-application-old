package com.rocs.nurse.desktop.application;

import com.rocs.nurse.desktop.application.app.facade.UpdateMedicalFacade.UpdateMedicalFacade;
import com.rocs.nurse.desktop.application.app.facade.UpdateMedicalFacade.impl.UpdateMedicalFacadeImpl;
import com.rocs.nurse.desktop.application.model.UpdateMedical.UpdateMedical;

import java.util.Scanner;

public class InfirmarySystemApplication {
    public static void main(String[] args) {

        UpdateMedicalFacade updatemedicalFacade = new UpdateMedicalFacadeImpl();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Nurse Desktop System...");
        System.out.println("Please enter your selection: ");
        System.out.println("1. Nurse Desktop UpdateMedical Maintinance");
        System.out.println("2. Patient Maintinance");
        System.out.println("3. Desktop");
        System.out.println("4. Return");
        System.out.println("5. Press other keys to exit.");
        System.out.println("6. Enter your choise: ");
        int input = sc.nextInt();

        switch (input) {

            case 1: {
                System.out.println("Nurse Desktop UpdateMedical Maintinance");
                System.out.println("Update an updatemedical");
                int choice = sc.nextInt();

            }
        }

        sc.nextLine();
        System.out.println("Enter the id of the updatemedical to update: ");
        int id = sc.nextInt();
        UpdateMedical updatemedical = updatemedicalFacade.getUpdateMedicalById(id);
        if (updatemedical == null) {
            System.out.println("UpdateMedical to update not found.");
        } else {
            System.out.println("Updating an updatemedical");
            System.out.println("Enter updatemedical studentid: ");
            int studentid = sc.nextInt();
            System.out.println("Enter updatemedical ailmentid: ");
            int ailmentid = sc.nextInt();
            System.out.println("Enter updatemedical medhistoryid: ");
            String medhistoryid = sc.nextLine();
            System.out.println("Enter updatemedical nurseinchargein:");
            int nurseinchargein = sc.nextInt();
            System.out.println("Enter updatemedical symptoms: ");
            String symptoms = sc.nextLine();
            System.out.println("Enter updatemedical temperaturereadings: ");
            int temperaturereadings = sc.nextInt();
            System.out.println("Enter updatemedical visitdate: ");
            int visitdate = sc.nextInt();
            System.out.println("Enter updatemedical treatment: ");
            String treatment = sc.nextLine();

            UpdateMedical updateUpdateMedical = new UpdateMedical();
            updateUpdateMedical.setId(id);
            updateUpdateMedical.setStudentId(studentid);
            updateUpdateMedical.setAilmentId(ailmentid);
            updateUpdateMedical.setMedHistoryId(medhistoryid);
            updateUpdateMedical.setNurseInChargeIn(nurseinchargein);
            updateUpdateMedical.setSymptoms(symptoms);
            updateUpdateMedical.setTemperatureReadings(temperaturereadings);
            updateUpdateMedical.setVisitDate(visitdate);
            updateUpdateMedical.setTreatment(treatment);

            boolean result = updatemedicalFacade.updateUpdateMedical(updateUpdateMedical);

            if (result) {
                System.out.println("UpdateMedical successfully updated.");

            } else {
                System.out.println("UpdateMedical failed.");

            }

        }


    }

}
