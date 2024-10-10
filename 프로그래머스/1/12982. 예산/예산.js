function solution(d, budget) {
    var sum = 0;
    var cnt = 0;
    
    d.sort((a, b) => a - b);
    
    for (var i = 0; i < d.length; i++) {
        sum += d[i];
        
        if (sum > budget) {
            break;
        }
        
        cnt++;
    }
    
    return cnt;
}
