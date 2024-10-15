function solution(cipher, code) {
    var answer = '';
    var cnt = 1;
    
    for(var i=0; i<cipher.length; i++){  
        var mul = code * cnt; 
        answer += cipher.charAt(mul-1);

        cnt++;
    }
    
    return answer;
}