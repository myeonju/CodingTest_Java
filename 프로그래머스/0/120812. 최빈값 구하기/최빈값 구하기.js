function solution(array) {
    const frequency = {};
    
    for(let num of array){
        if(frequency[num]){
            frequency[num]++;
        } else{
            frequency[num] = 1;
        }
    }
    
    let maxFrequency = 0; // 최댓값 저장
    let mode = -1; // 최빈값 저장
    let isTie = false; // 최빈값 여러개인지 확인
    
    for(let key in frequency){
        if(frequency[key] > maxFrequency){
            maxFrequency = frequency[key];
            mode = Number(key);
            isTie = false;
        } else if(frequency[key] == maxFrequency){
            isTie = true;
        }
    }
    
    if(isTie){
        return -1;
    }
    
    return mode;
}