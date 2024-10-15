function solution(rsp) {
    var answer = '';
 
    for(var i=0; i<rsp.length; i++){
        var num = rsp.charAt(i);
        
        switch(num){
            case '2':
                answer += '0';
                break;
            case '0':
                answer += '5';
                break;
            case '5':
                answer += '2';
                break;
        }
    }
    return answer;
}