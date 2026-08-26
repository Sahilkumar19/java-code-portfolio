import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Double>> maxPoints(int[][] points) {
        ArrayList<ArrayList<Double>> slopes = new ArrayList<>();
        for(int i=0;i<points.length;i++){
            ArrayList<Double> slope=new ArrayList<>();
            for(int j=i+1;j<points.length;j++){
                double s= (double) (points[j][1] - points[i][1]) /(points[j][0]-points[i][0]);
                slope.add(s);
            }
            slopes.add(slope);
        }
        return slopes;
    }

    public static void main(String[] args) {
//        int[][] points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
        int[][] points={{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        ArrayList<ArrayList<Double>> ans =maxPoints(points);
        System.out.println(ans);
    }
}