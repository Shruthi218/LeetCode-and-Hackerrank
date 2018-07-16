class Solution {
    public boolean RotateString(String A, String B) {
        if(A.length() == B.length() && (A + A).contains(B)) {
            return true;
    }
    return false;
}
}
