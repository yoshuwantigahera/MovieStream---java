public class Main {
    public static void main(String[] args) {


        String movieName = "Love & Basketball";
            System.out.println("My favorite movie is " + movieName);

            int yearReleased = 2015;
            String genreMovie = "Sports, Romance";
            double movieRating = 8.5;
            boolean series = false;
            char directorInitial = 'J';
            String favoriteChar = "Emylie";

        System.out.println("Year released: " + yearReleased);
        System.out.println("Genre: " + genreMovie);
        System.out.println("Movie imdb rating " + movieRating);
        System.out.println("A part of series: " + series);
        System.out.println("Movie Director: " + directorInitial);
        //An array is a list to store multiple values (movieTitle);
        //Same data type so only strings, no numbers;
        String[] movieNames = {"Love & basketball", "Bad Boys", "American Gangster"};

        //Favorite genre

        String[] favoriteGenre = {"Crime", "Sports", "Comedy"};

        System.out.println("First movie: " + movieNames[0]);//First item in my array
        System.out.println("Last movie: " + movieNames[2]);
        System.out.println("Second movie: " + movieNames[1]);

        System.out.println("First Genre: " + favoriteGenre[0]);//First item in my array
        System.out.println("Third Genre: " + favoriteGenre[2]);
        System.out.println("First movie: " + favoriteGenre[1]);





    }
}