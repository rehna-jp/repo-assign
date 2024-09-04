/*Kindly read the INSTRUCTIONS.md before  making
 * changes to this file.
*/

import java.util.Random;

//This class inherits from the value class

public class RanGenVal extends Values {
    Random gen = new Random();
    boolean generateRandom = true;

    public boolean isGenerateRandom() {
        return generateRandom;
    }

    public void setGenerateRandom(boolean generateRandom) {
        this.generateRandom = generateRandom;
    }

    // Default constructor that set all values to 0.0
    public RanGenVal() {
        super(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    }

    // Constructor that initializes the values from the superclass
    public RanGenVal(double airtime, double sMSunits, double voice, double just4You, double bundle,
            double borrowed) {
        super(airtime, sMSunits, voice, just4You, bundle, borrowed);
    }

    // Method to generate random value for airtime and return as String if Airtime
    // if random generate is on && airtime value is 0
    public String rAirtime() {
        if (isGenerateRandom() && (getAirtime() == 0.00)) {
            double number = gen.nextDouble(1.0, 300);
            String value = String.format("GHC%5.2f", number);
            return value;
        } else {
            String value = String.format("GHC%5.2f", getAirtime());
            return value;
        }
    }

    // Method to generate random value for SMS Units and return as String
    // if random generate is on && unit value is 0
    public String rSMS() {
        if (isGenerateRandom() && (getSMSunits() == 0.0)) {
            int number = gen.nextInt(1, 2000);
            String value = String.format("SMS: %d", number);
            return value;
        } else {
            String value = String.format("SMS: %d", getSMSunits());
            return value;
        }
    }

    //Method to generate random value for voice time
    public String rVoice() {
        if (isGenerateRandom() && (getVoice() == 0.0)) {
            int number = gen.nextInt(1, 200);
            String value = String.format("Voice: %d ", number);
            return value;
        } else {
            String value = String.format("Voice: %d", getVoice());
            return value;
        }
    }

}
