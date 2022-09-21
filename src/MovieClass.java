class Movie {
    private final String title;
    private final String studio;
    private final String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getTitle(){
        return title;
    }

    public String getStudio(){
        return studio;
    }

    public String getRating(){
        return rating;
    }

    public Movie[] getPG(Movie[] movieList){
        Movie[] PGMovieList=new Movie[movieList.length];
        int index=0;
        for (Movie m: movieList){
            if (m.rating.equals("PG")) {
                PGMovieList[index]=m;
                index++;
            }
        }
        return PGMovieList;
    }
}

public class MovieClass {
    public static void main(String[] args) {
        Movie movie1=new Movie("War", "Sony Productions", "PG-13");
        Movie movie2=new Movie("KGF", "Eros Movies");
        Movie movie3=new Movie("Avengers Infinity War", "Walt Disney");
        Movie[] movieList=new Movie[3];
        movieList[0]=movie1; movieList[1]=movie2; movieList[2]=movie3;

        for (Movie m: (movieList[0].getPG(movieList))){
            if (m!=null)
                System.out.print(m.getTitle()+ " " + m.getStudio() + " " + m.getRating() + "\n");
        }
    }
}
