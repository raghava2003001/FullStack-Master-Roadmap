marks = [85, 72, 91, 68, 88]

total = 0
highest = marks[0]
lowest = marks[0]
passed = 0
failed = 0

# Properly indented loop body
for mark in marks:
    total += mark

    # Track highest mark
    if mark > highest:
        highest = mark

    # Track lowest mark
    if mark < lowest:
        lowest = mark

    # Pass/Fail evaluation (Passing mark = 35)
    if mark >= 35:
        passed += 1
    else:
        failed += 1

average = total / len(marks)
result = "PASS" if failed == 0 else "FAIL"

# Formatted Output
print("==============================")
print("       MARKS ANALYZER        ")
print("==============================")
print("Marks   :", *marks)
print(f"Total   : {total}")
print(f"Average : {average:.2f}")
print(f"Highest : {highest}")
print(f"Lowest  : {lowest}")
print(f"Passed  : {passed}")
print(f"Failed  : {failed}")
print(f"Result  : {result}")
print("==============================")