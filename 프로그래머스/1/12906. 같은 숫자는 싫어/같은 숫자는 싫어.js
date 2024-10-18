function solution(arr)
{
    var answer = [];
    
    if(answer.length == 0){
        answer.push(arr[0]);       
    }

    for(var i=1; i<arr.length; i++){
        if(arr[i] != answer[answer.length-1]){
            answer.push(arr[i]);
        }
    }
    
    return answer;
}