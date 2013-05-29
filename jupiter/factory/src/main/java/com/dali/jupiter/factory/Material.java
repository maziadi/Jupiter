package com.dali.jupiter.factory;

import java.util.HashMap;
import java.util.Map;
 
public enum Material {
    PASSED(1, "Passed", "The test has passed."),
    FAILED(-1, "Failed", "The test was executed but failed."),
    DID_NOT_RUN(0, "Did not run", "The test did not start.");
 
    private int code;
    private String label;
    private String description;
 
    /**
     * A mapping between the integer code and its corresponding Material to facilitate lookup by code.
     */
    private static Map<Integer, Material> codeToMaterialMapping;
 
    private Material(int code, String label, String description) {
        this.code = code;
        this.label = label;
        this.description = description;
    }
 
    public static Material getMaterial(int i) {
        if (codeToMaterialMapping == null) {
            initMapping();
        }
        return codeToMaterialMapping.get(i);
    }
 
    private static void initMapping() {
        codeToMaterialMapping = new HashMap<Integer, Material>();
        for (Material s : values()) {
            codeToMaterialMapping.put(s.code, s);
        }
    }
 
    public int getCode() {
        return code;
    }
 
    public String getLabel() {
        return label;
    }
 
    public String getDescription() {
        return description;
    }
 
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Material");
        sb.append("{code=").append(code);
        sb.append(", label='").append(label).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
 
    public static void main(String[] args) {
        System.out.println(Material.PASSED);
        System.out.println(Material.getMaterial(-1));
    }
}
