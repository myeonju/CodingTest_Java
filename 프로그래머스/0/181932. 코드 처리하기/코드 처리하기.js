function solution(code) {
    var answer = '';
    var mode = 0;
    
    for(var i=0; i<code.length; i++){
        if(code.charAt(i) == '1'){
            mode = mode == 0 ? 1 : 0;
            continue;
        }
        
        if(mode == 0){
            if(i%2 == 0){
                answer += code.charAt(i);
            } 
        } else{
            if(i%2 != 0){
                answer += code.charAt(i);
            } 
        }
    }
    
    if(answer == ''){
        answer = "EMPTY";
    }
    
    return answer;
}