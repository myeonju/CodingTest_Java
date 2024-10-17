function solution(lines) {
    var lineRange = new Array(201).fill(0); 
    var result = 0;


    for (var i = 0; i < lines.length; i++) {
        var start = lines[i][0] + 100; 
        var end = lines[i][1] + 100;
        

        for (var j = start; j < end; j++) {
            lineRange[j]++;
        }
    }

    
    for (var i = 0; i < 201; i++) {
        if (lineRange[i] > 1) {
            result++;
        }
    }

    return result;
}
