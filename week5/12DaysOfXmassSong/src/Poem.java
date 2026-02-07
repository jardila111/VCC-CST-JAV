
public class Poem {
    private final String[] Days = {"first", "second", "third", "forth",
     "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

    private final String[] GIFTS = {
            "a partridge in a pear tree",
            "2 turtle doves",
            "3 French hens",
            "4 calling birds",
            "5 golden rings",
            "6 geese a laying",
            "7 Swans a swimming",
            "8 Maids a Milking",
            "9 Ladies Dancing",
            "10 Lords a Leaping",
            "11 Pipers piping",
            "12 Drummers drumming"
    };

    // define th first line of the poem
    String firstLine(int day) {
        return "On the " + Days[day] + " day of Christmas my true love sent to me:\n";
    }

    // recursive function to generate string for a particular day using previous day's gifts
    String allGifts(int day) {
        if( day == 0)
            return "and " + GIFTS[day];
        else
            return GIFTS[day] + "\n" + allGifts(day -1);
    }

    public static void main(String[] args) {
        Poem xp = new Poem();
        StringBuilder poemBuilder = new StringBuilder(xp.firstLine(0) + xp.GIFTS[0] + "\n\n");
        for(int day=1; day < xp.Days.length; day++)
            poemBuilder.append(xp.firstLine(day)).append(xp.allGifts(day)).append("\n\n");

        System.out.println(poemBuilder);
    }
}