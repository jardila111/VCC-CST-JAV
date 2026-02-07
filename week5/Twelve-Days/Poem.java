public class Poem {
    static String[] DAYS = {"first", "second", "third", "fourth", "fifth",
            "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

    static String[] GIFTS = {
            "a Partridge in a Pear Tree.", "two Turtle Doves,", "three French Hens,",
            "four Calling Birds,", "five Gold Rings,", "six Geese a Laying,",
            "seven Swans a Swimming,", "eight Maids a Milking,", "nine Ladies Dancing,",
            "ten Lords a Leaping,", "eleven Pipers Piping,", "twelve Drummers Drumming,"
    };

    static String firstLine(int day) {
        return "On the " + DAYS[day] + " day of Christmas my true love sent to me:\n";
    }

    static String allGifts(int day) {
        if (day == 0) {
            return GIFTS[0];
        } else if (day == 1) {
            return GIFTS[day] + "\n" + "and " + GIFTS[0];
        } else {
            return GIFTS[day] + "\n" + allGifts(day - 1);
        }
    }

    static String poem() {
        String poem = firstLine(0) + GIFTS[0] + "\n\n";

        for (int day = 1; day < 12; day++) {
            poem += firstLine(day) + allGifts(day) + "\n\n";
        }
        return poem;
    }


    public static void main(String[] args) {
        System.out.println(poem());
    }
}