package com.project.informationbook;

public class modelclass {

    String imagename,categoryname;

    public modelclass(String imagename, String categoryname) {
        this.imagename = imagename;
        this.categoryname = categoryname;
    }

    public String getImagename() {
        return imagename;
    }

    public String getCategoryname() {
        return categoryname;
    }
}
