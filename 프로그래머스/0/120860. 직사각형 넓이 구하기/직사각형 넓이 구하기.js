function solution(dots) {
    var minX = dots[0][0], maxX = dots[0][0];
    var minY = dots[0][1], maxY = dots[0][1];

    for (var i = 1; i < dots.length; i++) {
        var x = dots[i][0];
        var y = dots[i][1];
        
        if (x < minX) minX = x;
        if (x > maxX) maxX = x;
        if (y < minY) minY = y;
        if (y > maxY) maxY = y;
    }

    var width = maxX - minX;
    var height = maxY - minY;

    return width * height;
}
