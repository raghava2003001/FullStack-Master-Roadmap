def get_marks(count=5):
    marks = []
    print(f"Enter {count} subject marks:")
    for i in range(1, count + 1):
        marks.append(float(input(f"Subject {i}: ")))
    return marks

def calculate_total(marks):
    return sum(marks)

def calculate_average(total, count):
    return total / count

def find_highest(marks):
    return max(marks)

def find_lowest(marks):
    return min(marks)

def calculate_grade(average, marks):
    # If any mark is below passing (35), student fails
    if any(m < 35 for m in marks):
        return "F (Failed standard)"
    if average >= 90: return "A+"
    elif average >= 80: return "A"
    elif average >= 70: return "B"
    elif average >= 60: return "C"
    elif average >= 50: return "D"
    else: return "F"

def print_report(name, total, average, highest, lowest, grade):
    print("\n" + "=" * 30)
    print("      STUDENT REPORT CARD      ")
    print("=" * 30)
    print(f"Name    : {name}")
    print(f"Total   : {total:.2f}")
    print(f"Average : {average:.2f}")
    print(f"Highest : {highest:.2f}")
    print(f"Lowest  : {lowest:.2f}")
    print(f"Grade   : {grade}")
    print("=" * 30)

def main():
    name = input("Enter Student Name: ")
    marks = get_marks(5)
    
    total = calculate_total(marks)
    average = calculate_average(total, len(marks))
    highest = find_highest(marks)
    lowest = find_lowest(marks)
    grade = calculate_grade(average, marks)
    
    print_report(name, total, average, highest, lowest, grade)

if __name__ == "__main__":
    main()