function solution(s) {
    var answer = '';
    console.log(Math.ceil(s.length/2) - 1 )
    
    if(s.length % 2 != 0){
        answer = s.charAt(Math.ceil(s.length/2) - 1);
    } else{
        answer = s.charAt(s.length/2 - 1) + s.charAt(s.length/2) ;
    }
    
    return answer;
}