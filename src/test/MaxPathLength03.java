package test;

/**
 * @Author zhouzhou
 * @program: assignment-06
 * @create: 2020-11-09 15:38
 * @description
 */
public class MaxPathLength03 {

    public static int F(int[][] path,boolean[][] visited,int x,int y){

        if(path.length==1 && path[0].length == 1){
            return 1;
        }

        if(path.length == 0)
            return 0;

        visited[x][y] = true;

        //向上
        int up =0;
        if(x-1 >= 0)
            if(path[x-1][y] == 1 && !visited[x-1][y]){
            visited[x-1][y] = true;
            up = F(path,visited,x-1,y)+1;

        }

        //向下
        int down =0;
        if(x+1 < path.length)
            if(path[x+1][y] ==1 && !visited[x+1][y]){
            visited[x+1][y] = true;
            down = F(path,visited,x+1,y)+1;
        }

        //向左
        int left =0;
        if(y-1>=0 )
            if(path[x][y-1] == 1 && !visited[x][y-1]){
            visited[x][y-1] = true;
            left = F(path,visited,x,y-1)+1;
        }

        //向右
        int right = 0;
        if(y+1 <path[0].length)
            if(path[x][y+1] ==1 && !visited[x][y+1]){
            visited[x][y+1] = true;
            right = 1 + F(path,visited,x,y+1);
        }
        
        if(up == 0 && right ==0 && down == 0 && left ==0 ){
            return 0;
        }

        int max = 0;
        if(up > max){
            max = up;
        }
        if(down > max){
            max = down;
        }
        if(left > max){
            max = left;
        }
        if(right > max){
            max = right;
        }

        if(x == 0 && y==0){
            return max +1;
        }else{
            return max;
        }
//        return max;

    }



    public static void main(String[] args) {
        //44
        int[][] path =
                {{1, 0},
                        {0, 0}};

        //10
//        int[][] path =
//                      {{1, 1, 0, 0, 0, 0},
//                        {0, 1, 1, 0, 0, 0},
//                        {0, 0, 1, 1, 1, 0},
//                        {0, 0, 1, 0, 1, 0},
//                        {0, 0, 1, 0, 1, 1}};
        boolean[][] visited = new boolean[path.length][path[0].length];
//        System.out.println(visited[0][0]);
        System.out.println(F(path,visited,0,0));


    }
}
