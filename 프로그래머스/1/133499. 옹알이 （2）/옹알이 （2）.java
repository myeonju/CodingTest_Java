import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] validSounds = new String[]{"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) {
            String replacedWord = word;
            for (String sound : validSounds) {
                replacedWord = replacedWord.replace(sound, " ");
            }
            replacedWord = replacedWord.replace(" ", "");
            if (replacedWord.length() == 0) {
                boolean isValid = true;
                String lastSound = "";
                for (String sound : validSounds) {
                    if (word.startsWith(sound)) {
                        lastSound = sound;
                        break;
                    }
                }
                for (int i = lastSound.length(); i < word.length(); ) {
                    boolean found = false;
                    for (String sound : validSounds) {
                        if (i + sound.length() <= word.length() && word.substring(i, i + sound.length()).equals(sound)) {
                            if (lastSound.equals(sound)) {
                                isValid = false;
                                break;
                            } else {
                                i += sound.length();
                                lastSound = sound;
                                found = true;
                                break;
                            }
                        }
                    }
                    if (!isValid || !found) break;
                }
                if (isValid) answer++;
            }
        }
        return answer;
    }
} 
