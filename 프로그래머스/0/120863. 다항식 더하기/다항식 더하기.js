function solution(polynomial) {
    let x = 0;
    let num = 0;
    
    const terms = polynomial.split(' + ');
    
    for(let term of terms){
        if(term.includes('x')){
            if(term == 'x'){
                x += 1;
            } else{
                x += Number(term.replace('x', ''));
            }
        } else{
            num += Number(term);
        }
    }
    
    console.log("x:" + x + " num:" + num)
    
    let result = '';
    
    if(x>0){
          result += (x === 1) ? 'x' : `${x}x`;
    }
    
    if(num>0){
        if(result){
            result += ' + ';
        }
        result += num;    
    }
    
    return result || '0';
}