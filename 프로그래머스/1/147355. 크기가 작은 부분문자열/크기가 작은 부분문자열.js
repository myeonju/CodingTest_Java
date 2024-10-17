function solution(t, p) {
    var answer = 0;
    
    for(var i=0; i<=t.length-p.length; i++){
        var strNum = ''; 
        
        for(var j=0; j<p.length; j++){
            strNum += t.charAt(i+j);
        }
        
        if(Number(strNum) <= Number(p)){
            answer++;
        }
    }
    return answer;
}