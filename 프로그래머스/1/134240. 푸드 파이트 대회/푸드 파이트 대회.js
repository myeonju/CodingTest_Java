function solution(food) {
    var answer = '';
    
    for(var i=1; i<food.length; i++){
        if(food[i]%2 != 0){
            food[i] -= 1;
        }
        
        if(food[i]>1){
            for(var j=0; j<food[i]/2; j++){
                answer += i.toString();
            }
        }    
    }
    reverseAnswer = answer.split('').reverse().join('');
    answer = answer + '0' + reverseAnswer;
    

    
    return answer;
}