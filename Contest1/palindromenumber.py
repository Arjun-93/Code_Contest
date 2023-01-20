def is_palindrome(n):
    str_n = str(n)
    if(str_n == str_n[::-1]):
        print("WINS")
    else:
        print("LOSES")

is_palindrome(666)
is_palindrome(331)