import java.util.*;
public class pathExists2 {
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
       ArrayList <ArrayList<Integer>> arr=new ArrayList<>();
       for(int i=0;i<edges.length;i++)
       {
        ArrayList <Integer>temp=arr.get(edges[i][1]);
        if(temp!=null)
        {
            temp=
        }
        arr.add(edges[i][0],)
       }
    }
    public static void main(String[] args) {
        int arr[][]={{0,1},{0,2},{3,5},{5,4},{4,3}};
        System.out.print(validPath(6, arr, 0, 5));
    }
}
