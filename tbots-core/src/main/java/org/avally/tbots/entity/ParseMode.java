package org.avally.tbots.entity;

public enum ParseMode {
    MARKDOWN("Markdown"), HTML("HTML");
    private final String mode;

    ParseMode(String mode) {
        this.mode = mode;
    }


    @Override
    public String toString() {
        return mode;
    }
}
