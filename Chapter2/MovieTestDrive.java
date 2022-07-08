public class MovieTestDrive{
    public static void main(String[] args) {
        Movie movieOne = new Movie();
        Movie movieTwo = new Movie();
        Movie movieThree = new Movie();

        movieOne.title = "Gone with the Stock";
        movieOne.genre = "Tragic";
        movieOne.rating = -2;

        movieTwo.title = "Lost in the Cubicle Space";
        movieTwo.genre = "Comedy";
        movieTwo.rating = 5;

        movieThree.title = "Byte Club";
        movieThree.genre = "Tragic but ultimately uplifting";
        movieThree.rating = 127;

        System.out.println(movieOne.title);
        System.out.println(movieTwo.genre);
        System.out.println(movieThree.rating);
    }
}