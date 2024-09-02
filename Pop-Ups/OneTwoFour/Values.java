/*Kindly read the INSTRUCTIONS.md before  making
 * changes to this file.
*/


//This class declares variables with getters and setters
//A constructor that initializes these variables 
//And a default constructor that sets them to 0.00

public class Values {
    private double airtime;
    private double SMSunits;
    private double voice;
    private double Just4You;
    private double bundle;
    private double borrowed;

    public Values() {
        this.airtime = 0.00;
        this.SMSunits = 0.00;
        this.voice = 0.00;
        this.Just4You = 0.00;
        this.bundle = 0.00;
        this.borrowed = 0.00;
    }

    public Values(double airtime, double sMSunits, double voice, double just4You, double bundle,
            double borrowed) {
        this.airtime = airtime;
        SMSunits = sMSunits;
        this.voice = voice;
        Just4You = just4You;
        this.bundle = bundle;
        this.borrowed = borrowed;
    }

    public double getAirtime() {
        return airtime;
    }

    public void setAirtime(double airtime) {
        this.airtime = airtime;
    }

    public double getSMSunits() {
        return SMSunits;
    }

    public void setSMSunits(double sMSunits) {
        SMSunits = sMSunits;
    }

    public double getVoice() {
        return voice;
    }

    public void setVoice(double voice) {
        this.voice = voice;
    }

    public double getJust4You() {
        return Just4You;
    }

    public void setJust4You(double just4You) {
        Just4You = just4You;
    }

    public double getBundle() {
        return bundle;
    }

    public void setBundle(double bundle) {
        this.bundle = bundle;
    }

    public double getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(double borrowed) {
        this.borrowed = borrowed;
    }

}