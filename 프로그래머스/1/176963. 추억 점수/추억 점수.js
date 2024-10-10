function solution(name, yearning, photo) {
    var answer = [];
    var arr = [];
    
    for(var j=0; j<photo.length; j++){
        arr = photo[j];
        console.log(arr);
        
        var sum = 0;
        for(var i = 0; i < name.length; i++){
            for(var k = 0; k < arr.length; k++){
                if(name[i] == arr[k]){
                    var idx = name.indexOf(name[i]);
                    sum += yearning[idx];
                }
            }
        }
        
        answer.push(sum);
    }
    
    
    
    return answer;
}