import java.util.Random;

public class RandomPasswordGenerate {
  public static void main(String[] args) {

    // create a string of uppercase and lowercase characters numbers and specialCharacter
    String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
    String specialCharacter = "$%&@!()?#*";

    // combine all strings
    String alphaNumeric = upperAlphabet + lowerAlphabet + numbers + specialCharacter;

    // create random string builder
    StringBuilder sb = new StringBuilder();

    // create an object of Random class
    Random random = new Random();

    // specify length of random string
    int length = 10;

    for(int i = 0; i < length; i++) {

      // generate random index number
      int index = random.nextInt(alphaNumeric.length());

      // get character specified by index
      // from the string
      char randomChar = alphaNumeric.charAt(index);

      // append the character to string builder
      sb.append(randomChar);
    }

    String randomString = sb.toString();
    System.out.println("Random Password is= " + randomString);

  }
}
