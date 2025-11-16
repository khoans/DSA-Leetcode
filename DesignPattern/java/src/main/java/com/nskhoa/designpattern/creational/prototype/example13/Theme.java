package com.nskhoa.designpattern.creational.prototype.example13;

public class Theme {
    private String colorScheme;
    private String fontStyle;

    public Theme(String colorScheme, String fontStyle) {
        this.colorScheme = colorScheme;
        this.fontStyle = fontStyle;
    }

    public Theme clone() {
        try {
            return (Theme) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // Getters and Setters
    public String getColorScheme() {
        return colorScheme;
    }

    public void setColorScheme(String colorScheme) {
        this.colorScheme = colorScheme;
    }

    public String getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }


}
