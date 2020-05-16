package com.example.eb.explorebharat.domain;

/**
 * Enumeration of the region of India.
 *
 * Created by Mary Sumit S
 */
public enum Region {
    Himachal_Dharamshala("Himachal Dharamshala"),
    Himachal_Shimla("Himachal_Shimla"), Uttrakhand_Dehradun("Uttakhand Dehradun"),
    Uttrakhand_Landsdown("Uttrakhand Landsdown");
    private String label;
    private Region(String label) {
        this.label = label;
    }
    public static Region findByLabel(String byLabel) {
        for(Region r: Region.values()) {
            if (r.label.equalsIgnoreCase(byLabel))
                return r;
        }
        return null;
    }
}
