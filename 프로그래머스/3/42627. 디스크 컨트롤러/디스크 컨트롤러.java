import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {
        int time = 0; // 현재시간
        int index = 0;
        int answer = 0;
        int jobsCount = jobs.length;
        int completeJobs = 0; // 완료한 작업의 수
        
        // 요청시간을 기준으로 오름차순 정렬
		Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

		// 처리시간을 기준으로 오름차순 정렬되는 스케쥴러 큐 생성
		PriorityQueue<int[]> scheduler = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
        while(completeJobs < jobsCount){
            
            // 작업이 진행되는 동안 요청되는 작업들 스케쥴러에 추가
            while(index < jobsCount && jobs[index][0] <= time) scheduler.add(jobs[index++]);
            
            // 스케쥴러가 비어있으면 현재시간을 다음 작업의 요청시간으로 이동
            if(scheduler.isEmpty()) time = jobs[index][0];
            
            else {
                int[] corrnetJob = scheduler.poll(); // 스케쥴러에서 지금 진행할 작업 꺼내오기
                time += corrnetJob[1]; // 작업 처리
                answer += time - corrnetJob[0]; // 처리에 걸린 시간 계산
                completeJobs++;
            }
        }
        
        return answer / completeJobs;
    }
}