package com.example.composition.inheritance;

public class World {
    String mCountry;
    int mPinCode;

    private World(String mCountry, int mPinCode) {
        this.mCountry = mCountry;
        this.mPinCode = mPinCode;
    }

    public World(Builder builder) {
        this.mCountry = builder.mCountry;
        this.mPinCode = builder.mPinCode;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String mCountry) {
        this.mCountry = mCountry;
    }

    public int getPinCode() {
        return mPinCode;
    }

    public void setPinCode(int mPinCode) {
        this.mPinCode = mPinCode;
    }

    public static class Builder {
        String mCountry;
        int mPinCode;

        public Builder(){}

        public Builder(String mCountry, int mPinCode) {
            this.mCountry = mCountry;
            this.mPinCode = mPinCode;
        }

        public Builder withCountry(String country){
            this.mCountry = country;
            return Builder.this;
        }

        public Builder withPinCode(int pinCode){
            this.mPinCode = pinCode;
            return Builder.this;
        }

        public World build(){
            return new World(this);
        }
    }

}
