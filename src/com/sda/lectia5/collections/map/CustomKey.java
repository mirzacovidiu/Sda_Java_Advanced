package com.sda.lectia5.collections.map;

import java.util.Objects;

public class CustomKey {
    private String keyString;
    private int keyInteger;

    public CustomKey(String keyString, int keyInteger) {
        this.keyString = keyString;
        this.keyInteger = keyInteger;
    }

    public String getKeyString() {
        return this.keyString;
    }

    public int getKeyInteger() {
        return this.keyInteger;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            CustomKey customKey = (CustomKey)o;
            return this.keyInteger == customKey.keyInteger && Objects.equals(this.keyString, customKey.keyString);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.keyString, this.keyInteger});
    }
}
