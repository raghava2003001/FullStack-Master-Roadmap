# File: python/fundamentals/day-08/problem5.py

numbers = [10, 20, 10, 30, 10, 20]
target = 10

count = 0
for num in numbers:
    if num == target:
        count += 1

print(f"{target} occurs {count} times")