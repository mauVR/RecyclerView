package com.abc.recyclerview;

public class SourceMau extends Source{
    private final String name;
    /**
     * @param title
     * @param image
     * @param name
     */
    public SourceMau(String title, int image, String name) {
        super(title, image);
        this.name = name;
    }

    @Override
    public String getTitle() {
        return super.getTitle()+"->"+name;
    }
}
