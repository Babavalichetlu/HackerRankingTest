palindrome Counter programe usign C++
=========================================
#include <iostream>
using namespace std;
bool ispalindrome(string input)
{
    if(input == string(input.rbegin(), input.rend()))
    {
        return true;
    }
    else
    {
        return false;
    }
}
int count(string s)
{
    string temp;
    int length = s.length();
    int cnt;
    for(int i = 0; i < length; i++)
    {
        for(int j = 1; j<= length - i  ; j++)
        {
            temp = s.substr(i,j);
            //int k = i + j - 1;
            if(ispalindrome(temp))