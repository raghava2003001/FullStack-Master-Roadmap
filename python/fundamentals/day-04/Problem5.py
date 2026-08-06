import math

num = int(input("Input:\n"))

is_prime = True

if num <= 1:
    is_prime = False
else:
    for i in range(2, int(math.isqrt(num)) + 1):
        if num % i == 0:
            is_prime = False
            break

if is_prime:
    print("Prime Number")
else:
    print("Not a Prime Number")