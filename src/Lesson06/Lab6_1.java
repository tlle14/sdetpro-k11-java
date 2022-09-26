package Lesson06;

public class Lab6_1 {
    public static void main(String[] args) {
        String sentence = "2hrs and 5 minutes";

        // Get the hour
        String sHour = sentence.substring(0, sentence.indexOf("and"));
        sHour = sHour.trim();
        int nHour = Integer.parseInt(sHour.replaceAll("[^0-9]", ""));

        // Get the minutes
        String sMinute = sentence.substring(sentence.indexOf("and") + "and".length());
        sMinute = sMinute.trim();
        int nMinute = Integer.parseInt(sMinute.replaceAll("[^0-9]", ""));

        // Print out the result
        int totalMinutes = nHour * 60 + nMinute;
        System.out.println(sentence + " is " + totalMinutes + " minutes");

    }
}
