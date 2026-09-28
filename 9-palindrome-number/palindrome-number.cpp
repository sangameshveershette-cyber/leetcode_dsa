class Solution {
public:
    bool isPalindrome(int x) {
        string a = to_string(x);
        string r = a;
        reverse(r.begin(),r.end());
        return a == r;
    }
};