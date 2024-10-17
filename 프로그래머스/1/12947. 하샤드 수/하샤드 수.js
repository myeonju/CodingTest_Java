function solution(x) {
    var strX = x.toString();
    var num = 0;
    
    for(var i=0; i<strX.length; i++){
        num += Number(strX.charAt(i));    
    }
    
    if(x%num == 0){
        return true;
    } else {
        return false;
    }
}