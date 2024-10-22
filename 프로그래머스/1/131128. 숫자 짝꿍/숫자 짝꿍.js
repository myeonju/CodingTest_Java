function solution(X, Y) {
    let answer = [];
    let countX = new Array(10).fill(0);
    let countY = new Array(10).fill(0);
    
    for(let char of X){
        countX[char]++;
    }
    
    for(let char of Y){
        countY[char]++;
    }
    
    for(let i=9; i>=0; i--){
        const commonCount = Math.min(countX[i], countY[i]);
        if(commonCount > 0){
            answer.push(String(i).repeat(commonCount));
        }
    }
    
    if(answer.length == 0){
        return "-1";
    }
    
    const result = answer.join('');
    if(result == "0".repeat(result.length)){
        return "0";
    }
    
    return result;
}