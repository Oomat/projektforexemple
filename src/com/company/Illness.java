package com.company;
import java.util.Scanner;
public class Illness {
    Scanner in = new Scanner(System.in);
    private String typeOfIllness;
    private String medications;

    public String getTypeOfIllness() {
        return typeOfIllness;
    }

    public void setTypeOfIllness(String typeOfIllness) {
        this.typeOfIllness = typeOfIllness;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public void setTypeOfIllness() {
        this.typeOfIllness = typeOfIllness;
    }

    public String med(String typeOfIllness) {
        if (typeOfIllness == "Allergies") {
            return medications = "you need cetrin";
        }else if (typeOfIllness == "Colds and Flu"){
            return medications = "you need Viferon";
        }else if (typeOfIllness == "Headaches"){
            return medications = "you need Analgin";
        }else if (typeOfIllness == "Stomach Aches"){
            return medications = "you need No-shpa";
        }else {
            return "Sorry, we don't have a cure for this disease";
        }
    }
}