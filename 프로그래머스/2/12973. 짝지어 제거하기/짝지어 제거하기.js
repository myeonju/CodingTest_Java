function solution(s)
{
    let stack = [];
    
    for(let i=0; i<s.length; i++){
        if(stack[stack.length-1] == s.charAt(i)){
            stack.pop();
        } else{
            stack.push(s.charAt(i));    
        }
    }

    if(stack.length > 0){
        return 0;
    }else{
        return 1;
    }
}