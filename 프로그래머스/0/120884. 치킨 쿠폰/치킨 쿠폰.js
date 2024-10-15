function solution(chicken) {
    let coupon = chicken;
    let answer = 0; 
    
    while(coupon > 9) {
        answer += Math.trunc(coupon / 10);
        coupon = Math.trunc((coupon / 10) + ( coupon % 10));
    }
    
    return answer;
}