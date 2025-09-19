class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String sortedS1 = new String(arr1);
        return checkRec(s2,sortedS1, s1.length(),0);
    }

    private boolean checkRec(String s2, String sortedS1, int n , int ind){
        if(ind + n > s2.length())return false;
        String sub = s2.substring(ind, ind + n);
        char[] subArr = sub.toCharArray();
        Arrays.sort(subArr);
        String sortedSub = new String(subArr);
        if(sortedSub.equals(sortedS1))return true;

        return checkRec(s2, sortedS1, n ,ind +1);
    }
}