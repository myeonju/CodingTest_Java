function solution(numlist, n) {
    var answer = [];
    
    for(var i=0; i<numlist.length; i++){
        var order = (Math.abs(numlist[i] - n));
        answer.push([order, numlist[i]]);
    }
    
    for(var i=0; i<answer.length; i++){
        for(var j=i+1; j<answer.length; j++){
            var [orderA, numA] = answer[i];
            var [orderB, numB] = answer[j];
            
            if(orderA > orderB || (orderA == orderB && numA < numB)){
                [answer[i], answer[j]]  = [answer[j], answer[i]]; 
            }
        }
    }
    
    var result = [];
    
    for(var i=0; i<answer.length; i++){
        result.push(answer[i][1]);
    }
    
    
    return result;
}