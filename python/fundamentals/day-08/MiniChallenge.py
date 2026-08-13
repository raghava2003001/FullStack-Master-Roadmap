# File: python/fundamentals/day-08/Mini_Challenge.py

def analyze_marks(marks):
    total = sum(marks)
    average = total / len(marks)
    highest = max(marks)
    lowest = min(marks)

    # Passing score threshold set to 35
    pass_mark = 35
    passed = sum(1 for mark in marks if mark >= pass_mark)
    failed = len(marks) - passed
    result = "PASS" if failed == 0 else "FAIL"

    sorted_marks = sorted(marks)

    # Output formatting
    print("==============================")
    print("     STUDENT MARKS ANALYZER")
    print("==============================")
    print(f"Marks       : {' '.join(map(str, marks))}")
    print(f"Total       : {total}")
    print(f"Average     : {average:.2f}")
    print(f"Highest     : {highest}")
    print(f"Lowest      : {lowest}")
    print(f"Passed      : {passed}")
    print(f"Failed      : {failed}")
    print(f"Result      : {result}")
    print(f"Sorted      : {' '.join(map(str, sorted_marks))}")
    print("==============================")


if __name__ == "__main__":
    marks = [85, 72, 91, 68, 88]
    analyze_marks(marks)