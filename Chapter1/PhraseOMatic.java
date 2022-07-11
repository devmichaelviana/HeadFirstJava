public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "several sheets",
        "30,000 feet", "B-to-B", "everyone wins", "front-end",
        "based on Web", "widespread", "smart", "six sigma",
        "critical path", "dynamic"};

        String[] wordListTwo = {"able", "sticker",
        "added value", "oriented", "central", "distributed",
        "grouped", "solidified", "machine independent",
        "positioned", "on web", "dedicated", "leveraged",
        "aligned", "addressed", "shared", "cooperative",
        "accelerated"};

        String[] wordListThree = {"process", "maximum point",
        "solution", "architecture", "core qualification",
        "strategy", "mindshare", "portal", "space", "visionn",
        "paradigm", "mission"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("We need to " + phrase);
    }
}