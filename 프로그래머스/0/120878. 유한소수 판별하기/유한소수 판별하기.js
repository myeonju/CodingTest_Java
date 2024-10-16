function solution(a, b) {
    var answer = 0;
    
    for(var i=2; i<=a; i++){
        if(a%i==0 && b%i==0){
            a = a/i;
            b = b/i;
        }
    }
    
    while(b%2 == 0){
        b/=2;    
    }
    
    while(b%5 == 0){
        b/=5;    
    }
    
    
    return b == 1 ? 1 : 2;
}