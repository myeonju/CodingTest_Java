function solution(score) {
    var avg = [];  // 평균
    var rank = []; // 순위
    
    for(var i=0; i<score.length; i++){
        var sum = score[i][0] + score[i][1];
        avg.push(sum / 2);
    }
    
    var sortedAvg = avg.slice(); 
    for(var i=0; i<sortedAvg.length; i++){
        for(var j=i+1; j<sortedAvg.length; j++){
            if(sortedAvg[i] < sortedAvg[j]){
                var temp = sortedAvg[i];
                sortedAvg[i] = sortedAvg[j];
                sortedAvg[j] = temp;
            }
        }
    }
    
    for(var i=0; i<avg.length; i++){
        rank[i] = sortedAvg.indexOf(avg[i]) +1;
    }

    
    return rank;
}