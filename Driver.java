import java.util.*;

/**
 * @author Sarah Wagner
 * @version 1.0
 * This is the driver class. This will call on the classes and methods created within the
 * Note.java class file.
 */
public class Driver {

    public static void main(String[] args) {

        //These are my different tests of differing values and lengths


        Note sample = new Note(); // creates the default version, where value is 9 = A and the length is a quarter note
        double sampleLength =  sample.getLength(); // holds the length
        int sampleValue = sample.getValue(); // holds the value
        String sampleLetter = sample.getLetter(); // holds the letter

        Note newSample = new Note(40, .125); // setting different values and lengths
        double newSampleLength =  newSample.getLength(); // holds the length
        int newSampleValue = newSample.getValue(); // holds the value
        String newSampleLetter = newSample.getLetter(); // holds the letter
        double frequency = newSample.computeFrequency(); // holds the frequency
        String color = newSample.naturalOrSharp(); // is the key sharp or natural



        Note tester = new Note(-30, 1.0);
        double testerLength =  tester.getLength(); // holds the length
        String testerLetter = tester.getLetter(); // holds the letter
        double testfrequency = tester.computeFrequency(); // holds the frequency
        String testcolor = tester.naturalOrSharp(); // is the key sharp or natural
        int octave = tester.getOctave(); // holds the octave the note is in

        //This creates a list of different note objects I would like to sort
        ArrayList<Note> sounds = new ArrayList<Note>();

        sounds.add(sample);
        sounds.add(newSample);
        sounds.add(tester);

        //Collections.sort goes to the compareTo method in Note and sorts them by how the method states
        Collections.sort(sounds);


    } // end of main
}// end of class
