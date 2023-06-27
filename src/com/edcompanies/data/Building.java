/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edcompanies.data;

/**
 *
 * @author Ed
 */
public class Building {
    
    private static int idBuilding;
    private static String buildingName;
    private static String buildingCode;

    public static int getIdBuilding() {
        return idBuilding;
    }

    public static void setIdBuilding(int idBuilding) {
        Building.idBuilding = idBuilding;
    }

    public static String getBuildingName() {
        return buildingName;
    }

    public static void setBuildingName(String buildingName) {
        Building.buildingName = buildingName;
    }

    public static String getBuildingCode() {
        return buildingCode;
    }

    public static void setBuildingCode(String buildingCode) {
        Building.buildingCode = buildingCode;
    }
    
    
    
}
