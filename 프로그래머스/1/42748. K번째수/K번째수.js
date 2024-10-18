function solution(array, commands) {
    var answer = [];
    
    for(var i=0; i<commands.length; i++){
        var arr = [];
        var array2 =array.slice(commands[i][0] - 1, commands[i][1]);
        
        array2.sort((a,b) => (a-b));
        answer.push(array2[commands[i][2] - 1]);
    }
    
    return answer;
}