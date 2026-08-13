def check_palindrome(text):
    # Case-insensitive comparison
    if text.lower() == text.lower()[::-1]:
        print("Palindrome")
    else:
        print("Not Palindrome")

check_palindrome("madam")
check_palindrome("hello")