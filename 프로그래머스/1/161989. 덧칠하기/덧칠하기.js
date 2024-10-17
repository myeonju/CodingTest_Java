function solution(n, m, section) {
    let answer = 0;  // 페인트칠 횟수
    let currentPosition = 0;  // 현재 롤러로 덧칠한 마지막 위치

    for (let i = 0; i < section.length; i++) {
        if (currentPosition < section[i]) {
            currentPosition = section[i] + m - 1;  
            answer++;
        }
    }

    return answer;
}
