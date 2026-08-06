num = int(input("Input\n"))

# Convert to string and compare with its reverse
if str(num) == str(num)[::-1]:
    print("Palindrome")
else:
    print("Not a Palindrome")