// class Solution {
//     public String reversePrefix(String word, char ch) {
        // int found = -1;
        // for(int i = 0 ;i < word.length(); i++){
        //     if(word.charAt(i) == ch){
        //         found = i;
        //         break;
        //     }
        // }
//         int s = 0;
//         while(s<found){
//             char temp = word.charAt(s);
//             word.charAt(s) = word.charAt(found);
//             word.charAt(found) = temp;
//             s++;
//             found--;
//         }
//         return word;
//     }
// }
class Solution {
    public String reversePrefix(String word, char ch) {
        // Find first occurrence of ch
        // int found = word.indexOf(ch); 
        int found = -1;
        for(int i = 0 ;i < word.length(); i++){
            if(word.charAt(i) == ch){
                found = i;
                break;
            }
        }
        
        // If not found, return original word
        if (found == -1) return word; 
        
        
        StringBuilder sb = new StringBuilder(word.substring(0, found + 1));
        // Reverse the prefix
        sb.reverse(); 
        
        
        return sb.append(word.substring(found + 1)).toString();
    }
}
