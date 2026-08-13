numbers = [10, 20, 10, 30, 20, 40]
unique_numbers = []

for num in numbers:
    if num not in unique_numbers:
        unique_numbers.append(num)

print(*unique_numbers)