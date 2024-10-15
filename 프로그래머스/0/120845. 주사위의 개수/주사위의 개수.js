function solution(box, n) {
    var answer = 0;
    
    var width = Math.trunc(box[0]/n);
    var length = Math.trunc(box[1]/n);
    var heigth = Math.trunc(box[2]/n);
    
    answer = width * length * heigth;
    return answer;
}