package theater;

/**
 * Class representing a performance of a play..
 */
public class Performance {

    private String playID;
    private int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    // accessor method for playId
    public String getPlayID() {
        return playID;
    }

    // accessor method for audience
    public int getAudience() {
        return audience;
    }
}
