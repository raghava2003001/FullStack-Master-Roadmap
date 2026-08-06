import math

# 1. Ask for user input
num_input = int(input("Enter a positive integer: "))
num = abs(num_input)  # Work with positive value

print("\n--- NUMBER ANALYSIS SYSTEM ---")

# 2. Number of Digits
num_digits = len(str(num))
print(f"Number of digits: {num_digits}")

# 3. Sum of Digits
digit_sum = sum(int(digit) for digit in str(num))
print(f"Sum of digits   : {digit_sum}")

# 4. Reverse
reversed_str = str(num)[::-1]
reversed_num = int(reversed_str)
print(f"Reverse         : {reversed_num}")

# 5. Palindrome Check
is_palindrome = "Yes" if str(num) == reversed_str else "No"
print(f"Palindrome      : {is_palindrome}")

# 6. Factorial (Practical limit: <= 20 to keep console clean, though Python supports large numbers)
if num <= 20:
    print(f"Factorial       : {math.factorial(num)}")
else:
    print(f"Factorial       : Skipping (Number too large, max recommended is 20)")

# 7. Multiplication Table (1–10)
print("\nMultiplication Table (1–10):")
print("-" * 25)
for i in range(1, 11):
    print(f"{num} × {i:2d} = {num * i}")