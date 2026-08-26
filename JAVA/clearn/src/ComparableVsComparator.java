import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class ComparableVsComparator {
    public static void main(String[] args) {
//both Comparable and Comparator are used for sorting objects.
        ArrayList<Movie> l = new ArrayList<>();
        l.add(new Movie("ddlj",5.90, 2000));
        l.add(new Movie("pathan",9.8,2024));
        l.add(new Movie("chhava",7.98,1896));
//        Collections.sort(l);

        Comparator<Movie> myC=(m1,m2)->{
            return m1.getY()- m2.getY();
        };
        System.out.println("Movies after sorting by year:");
        Collections.sort(l,myC);
        for (Movie m : l) {
            System.out.println(m.getN() + " " + m.getR() + " " + m.getY());
        }

    }
}
class Movie implements Comparable<Movie>{
    private String n;
    private double r;
    private int y;
    public Movie(String n, double r, int y){
        this.n=n;
        this.r=r;
        this.y=y;
    }

    @Override
    public int compareTo(Movie m) {
        return this.y-m.y;
    }
    public String getN(){
        return n;
    }
    public double getR(){
        return r;
    }

    public int getY(){
        return y;
    }
}