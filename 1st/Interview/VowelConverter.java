package Interview;

public class VowelConverter {
    public static String convertToVowels(String input) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiou";
        String[] vowels2 = {"a","e","i", "o","u"};
        
        for (char ch : input.toCharArray()) {
            if (vowels.contains(String.valueOf(ch))) {
                result.append(ch);
            }
//            else {
//            	result.append(vowels2[3]);
//            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        String input = "miscrit";
        String output = convertToVowels(input);
        
        System.out.println("Output: " + output); // Output should be "oiuaoiu"
    }
}
