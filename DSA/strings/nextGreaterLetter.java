package DSA.strings;

public class nextGreaterLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }
    public static String nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(letters[mid] == target){
                break;
            }
            else if(letters[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        if(letters[mid] == target){
            if(mid == letters.length - 1){
                return Character.toString(letters[0]);
            }
            else{
                return Character.toString(letters[mid + 1]);
            }
        }
        else{
            if(letters[mid] > target){
                return Character.toString(letters[mid]);
            }
            else{
                return Character.toString(letters[mid + 1]);
            }
        }
    }
}
