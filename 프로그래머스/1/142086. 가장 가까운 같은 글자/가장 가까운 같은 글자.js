function solution(s) {
    var answer = [];
    var sliceS = '';
    
    for(var i=0; i<s.length; i++){
        var str = s.charAt(i);
        var cnt = 0; 
        
        // 동일한 값이 있는지 확인
        for(var j=0; j<i; j++){
            if(s.charAt(j) == s.charAt(i)){
                cnt++;
            } 
        }
        
        if(cnt == 0){ //동일한 값이 이전에 없다면
            answer.push(-1);
        } else { 
            var idx = 0;
            sliceS = s.slice(0,i);
            idx = sliceS.lastIndexOf(s.charAt(i));
           
            answer.push(i - idx);
        } 
    }
    return answer;
}