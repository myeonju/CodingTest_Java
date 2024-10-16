function solution(quiz) {
    var answer = [];
    
    for(var i=0; i<quiz.length; i++){
        var formula = quiz[i].split(' ');
        var num1 = Number(formula[0]);
        var symbol = formula[1];
        var num2 = Number(formula[2]);
        var result = Number(formula[4]);
        var result2 = 0;
        
        switch(symbol){
            case '-':
                result2 = num1-num2;
                break;
            case '+':
                result2 = num1+num2;
                break;
        }
        
        if(result == result2){
            answer.push("O");
        }else{
            answer.push("X");
        }
    }
    
    return answer;
}