function solution(n) {
    var arr = [];
    n = n.toString().split('').reverse();
    
    for(var idx in n){
        arr[idx] = Number(n[idx]);
    }
    
    return arr;
    
}