package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    class Solution {
        public int solution(int n, int[][] wires) {
        /*
        중점 == BFS를 사용하면서 하나하나씩 와이어를 끊으면서 두개를 비교한다. (끊은다음에 BFS를 돈다)

        1. wires를 다돌면서 n * n 의 인접행렬을 만든다. **
        2. 하나하나씩 edge를 끊는다. **
        3. 끊으면 2개의 컴포넌트를 BFS로 돌면서 노드갯수를 확인. **
        4. 두개의 컴포넌트의 노드의 갯수 차이 계산해서 리턴

        */
            int[][] graph = new int[n][n];
            List<Integer> result = new ArrayList<>();

            for(int i = 0; i < wires.length; i++){
                int row =wires[i][0];
                int colum = wires[i][1];
                graph[row-1][colum-1] = 1;
                graph[colum-1][row-1] = 1; //
            }

            for(int i = 0; i< graph.length; i++){ // wires 끊기
                for(int k =0; k< graph[0].length; k++){
                    if(graph[i][k] == 1 && graph[k][i] == 1){
                        graph[i][k] = 0;
                        graph[k][i] = 0;//
                        int aComponent = fun(i, graph);
                        int bComponent = fun(k, graph);

                        result.add(Math.abs(aComponent - bComponent));
                        graph[i][k] = 1; //
                        graph[k][i] = 1; //
                    }
                }
            }

//         List<Integer>[] arr = new ArrayList[n];

//         for(int i =0; i< wires.length; i++){
//             int row = wires[i][0];
//             int colum = wires[i][1];
//             arr[row].add(colum);
//             arr[colum].add(row);
//         }

//         for(int i=0; i< arr.length; i++){
//             for(int k =0; k< arr[i].size(); k++){
//                 if(arr[i].get(k) !=0 && arr[k].get(i) != 0){
//                     int left =arr[i].get(k);
//                     int left2 = arr[k].get[i];
//                     arr[i].remove(k);
//                     arr[k].remove(i);
//                     int aCom = fun2(i, arr);
//                     int bCom = fun2(k, arr);

//                     result.add(Math.abs(aCom - bCom));
//                     arr[i].add(left);
//                     arr[k].add(left2);
//                 }
//             }
//         }


            int min =result.stream().min(Integer::compareTo).get();

            return min;
        }
    }
    public int fun(int node, int[][] graph){ // BFS
        boolean[] validate = new boolean[graph.length];
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);

        while(!q.isEmpty()){
            Integer preNode = q.poll();

            if(validate[preNode]){
                continue;
            }
            validate[preNode] = true;
            count++;

            for(int i = 0; i< graph[preNode].length; i++){
                if(!validate[i] && graph[preNode][i] ==1){ // 연결되어있으면
                    q.offer(i);
                }
            }

        }
        return count;

    }

}