function solution(a, b, n) {
    var coke = 0;

 
    while (n >= a) {
        var newCoke = Math.trunc(n / a) * b;  
        coke += newCoke;  
        n = Math.trunc(n / a) * b + n % a;  
    }

    return coke;
}