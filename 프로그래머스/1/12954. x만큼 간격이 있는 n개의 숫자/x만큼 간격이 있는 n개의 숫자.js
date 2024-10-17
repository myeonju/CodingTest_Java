function solution(x, n) {
    var answer = [];
    var num = x;
    for(var i=0; i<n; i++){
        answer.push(num);
        num+=x;
    }
    return answer;
}