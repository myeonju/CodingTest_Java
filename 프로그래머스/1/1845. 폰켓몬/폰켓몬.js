function solution(nums) {
    const uniqueSpecies = new Set(nums).size;
    const maxChoose = nums.length/2;
    
    if(maxChoose >= uniqueSpecies){
        return uniqueSpecies;
    } else {
        return maxChoose;
    }
}