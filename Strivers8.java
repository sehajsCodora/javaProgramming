class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        boolean hasvowel = false;
        boolean hasconsonants = false;

        for(char ch: word.toCharArray()){
            if(Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);
                if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u'){
                    hasvowel = true;
                }
                else{
                    hasconsonants  = true;
                }
            }
            else if(!Character.isDigit(ch)){
                return false;
            }
        }
        return hasvowel && hasconsonants;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int word = sc.next();
        isvalid(word);
    }
}