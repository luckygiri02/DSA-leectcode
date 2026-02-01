import java.util.ArrayList;

public class Get_Stairs_Path {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> res = getpath(n);
        System.out.println(res);
        
    }

    public static ArrayList<String> getpath(int n){
        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n <0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> path1 = getpath(n-1);
        ArrayList<String> path2 = getpath(n-2);
        ArrayList<String> path3 = getpath(n-3);
        ArrayList<String> paths = new ArrayList<>();

        for(String str : path1){
            paths.add("1" + str);
        }

        for(String str : path2){
            paths.add("2" + str);
        }
        for(String str : path3){
            paths.add("3" + str);
        }
 return paths;
    }
    
}
