/**
 * Created by Adam Manley Kelly - R00113196 on 18/11/2016.
 * https://github.com/adammanley-kelly/Assignment3-AOP-2016
 */
public class paraObject
{
    String movie;
    int year;
    public paraObject(){}
    public paraObject(String movie, int year)
    {
        setMovie(movie);
        setYear(year);
    }

    public void setMovie(String M){this.movie = M;}

    public void setYear(int Y){this.year = Y;}

    public String getMovie(){return movie;}

    public int getYear(){return year;}

    public String toString()
    {
        return "Title: " + getMovie() + " " + "Year: " + getYear();
    }
    public String print()
    {
        return toString();
    }
}
