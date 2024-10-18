function solution(numbers) {
    var answer = [];
    
    for(var i=0; i<numbers.length; i++){
        for(var j=i+1; j<numbers.length; j++){
            var sum = numbers[i] + numbers[j];
            if(answer.indexOf(sum) == -1){
                answer.push(sum);
            }
        }
    }
    
    answer = answer.sort((a,b) => a-b);
    
    
    
    return answer;
}