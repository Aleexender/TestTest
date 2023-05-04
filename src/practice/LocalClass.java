package practice;

public class LocalClass {

    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {

        final int numberLength = 10;


        class PhoneNumber{
            String formattedPhonNumber = null;

            public PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll("", "");
                if (currentNumber.length() == numberLength) {
                    formattedPhonNumber = currentNumber;
                } else {
                    formattedPhonNumber = null;
                }
            }
            public String getNumber() {
                return formattedPhonNumber;
            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

    }
}
