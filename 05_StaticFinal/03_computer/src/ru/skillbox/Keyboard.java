package ru.skillbox;

public class Keyboard {

    public KeyboardLight keyboardLight;
    public final String keyboardType;
    public final int keyboardWeight;

    public Keyboard(String keyboardType, int
            keyboardWeight, KeyboardLight keyboardLight) {
        this.keyboardType = keyboardType;
        this.keyboardWeight = keyboardWeight;
        this.keyboardLight = keyboardLight;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public int getKeyboardWeight() {
        return keyboardWeight;
    }

    @Override
    public String toString() {
        return "Keyboard type: " + keyboardType + ", Keyboard light: " + keyboardLight;
    }
}
