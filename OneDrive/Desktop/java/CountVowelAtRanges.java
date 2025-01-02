public class CountVowelAtRanges {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] check_vowel=new int[words.length];
        int i=0;
        for(String value:words){
            if(vowels(value)){
                check_vowel[i]=1;
            }else{
                check_vowel[i]=0;
            }
            i++;
        }
        int []result=new int[queries.length];
        for(i=0;i<result.length;i++){
            int sum=0;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                sum+=check_vowel[j];
            }
            result[i]=sum;
        }
        return result;
    }
    public boolean vowels(String s){
        String vowel="aeiou";
        
            if(vowel.indexOf(s.charAt(0))!=-1 && vowel.indexOf(s.charAt(s.length()-1))!=-1){
                return true;
            }
        return false;
    }
}
