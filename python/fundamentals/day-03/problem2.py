num = int(input("Input\n"))

# Handle negative numbers
sign = -1 if num < 0 else 1
reversed_num = int(str(abs(num))[::-1]) * sign

print(reversed_num)