package com.example.composition.inheritance;

public class ChildClass extends ParentClass{

    static String mCountryName;
    static int mPinCode;

    public static void main(String[] args) throws CustomException {
        ChildClass childClass = new ChildClass();
        childClass.getCode();
        childClass.getName();
        System.out.println("Country name from ParentClass :: " + mCountryName);
        System.out.println("PinCode from ParentClass :: " + mPinCode);

        World india =  new World.Builder().withCountry("India").withPinCode(12345).build();
        World canada =  new World.Builder().withCountry("Canada").build();

        System.out.println("Country - "+ india.mCountry +" , PinCode - " + india.mPinCode);
        System.out.println("Country - "+ canada.mCountry);

        try {
            childClass.thisMethodThrowsException();
        }catch (ArithmeticException e){
            System.out.println("Exception -->" +e);

            throw new CustomException("This is my custom exception...");
        }



    }

    public void getName(){
        mCountryName = getCountryName();
    }

    public void getCode(){
       mPinCode = getPinCode();
    }

    public void thisMethodThrowsException() throws ArithmeticException{
        float division = 10/0;
    }

    private static class CustomException extends Exception{
        public CustomException(String message) {
            this.message = message;
        }

        public CustomException(String message, String message1) {
            super(message);
            this.message = message1;
        }

        String message;


    }
}
