function solution(l, r) {
    var answer = [];
    var num = 0;
    
    for(var i=l; i<=r; i++){
        if(isOnly05(i)){
            answer.push(i);
        }
    }
    
    function isOnly05(num){
        var str = num.toString();
        
        for(var j=0; j<str.length; j++){
            if(str[j] !== '0' && str[j] != '5'){
                return false;
            }
        }
        
        return true;
    }
    
    
        
    return answer.length > 0 ? answer : [-1];
    
    
}