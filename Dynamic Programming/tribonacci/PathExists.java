import java.util.ArrayList;

public class PathExists {
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList <Integer> dp=new ArrayList<>();
        dp.add(source);
        for(int i=0;i<edges.length;i++)
        {
            if(dp.contains(edges[i][0]))
                dp.add(edges[i][1]);
            if(dp.contains(edges[i][1]))
                dp.add(edges[i][0]);
            if(dp.contains(destination))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{0,1},{0,2},{3,5},{5,4},{4,3}};
        System.out.print(validPath(6, arr, 0, 5));
    }
}
