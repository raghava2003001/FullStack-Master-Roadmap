numbers = [10, 15, 20, 25, 30, 35]

# Standard loop approach
count = 0
for number in numbers:
    if number % 2 == 0:
        count += 1

print(f"Even Numbers: {count}")

# One-line Pythonic alternative:
# count = sum(1 for num in numbers if num % 2 == 0)