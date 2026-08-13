# File: python/fundamentals/day-08/problem4.py

numbers = [1, 2, 3, 5]

n = len(numbers) + 1  # Total count should be 5
expected_sum = n * (n + 1) // 2
actual_sum = sum(numbers)

missing = expected_sum - actual_sum
print(f"Missing: {missing}")