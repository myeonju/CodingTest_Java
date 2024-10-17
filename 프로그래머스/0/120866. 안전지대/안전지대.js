function solution(board) {
    var n = board.length;
    var safeCount = 0;
    
    for(var i = 0; i < n; i++){
        for(var j = 0; j < n; j++){
            
            if(board[i][j] == 1){
                board[i][j] = -1;
                
                // 인접한 지역 체크
                for(var x = -1; x <= 1; x++){
                    for(var y = -1; y <= 1; y++){
                        if(x == 0 && y == 0) continue;
                        var newX = i + x;
                        var newY = j + y;
                        
                        //배열 범위 내에 있는지
                        if(newX >= 0 && newX < n && newY >= 0 && newY < n){
                            if(board[newX][newY] == 0){
                                board[newX][newY] = -1;
                            }
                        }
                    }
                }
            }
        }
    }
    
    for(var i = 0; i < n; i++){
        for(var j = 0; j < n; j++){
            
            if(board[i][j] == 0){
                safeCount++;
            }
        }
    }
    
    return safeCount;
}