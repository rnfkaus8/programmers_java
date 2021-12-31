package taehyun.kim.solution;

public class SumOfProcession {

    /**
     * 행렬의 덧샘
     * 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
     * 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
     * @param arr1
     * @param arr2
     * @return
     */
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int columnLength = arr1[0].length;
        int rowLength = arr1.length;
        int[][] answer = new int[rowLength][columnLength];
        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j < columnLength; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
