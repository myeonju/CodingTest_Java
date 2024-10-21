function solution(n) {
    var arr = Array.from({length:n}, () => Array(n).fill(0));
    var row = 0;
    var col = 0;
    var number = 1;
    
    for(var i=n; i>0; i-=2){
        // 오른쪽으로
        for(var j=0; j<i; j++){
            arr[row][col] = number;
            col++;
            number++;
        }
        col--;
        row++;
        
        //아래로
        for(var j=0; j<i-1; j++){
            arr[row][col] = number;
            row++;
            number++;
        }
        col--;
        row--;
        
        //왼쪽으로
        for(var j=0; j<i-1; j++){
            arr[row][col] = number;
            col--;
            number++;
        }
        col++;
        row--;
        
        //위로
        for(var j=0; j<i-2; j++){
            arr[row][col] = number;
            row--;
            number++;
        }
        col++;
        row++;
    }
    
    return arr;
}