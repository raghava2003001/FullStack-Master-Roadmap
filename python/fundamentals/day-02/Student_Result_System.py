def get_grade_and_result(marks):
    if marks >= 90:
        return "A", "PASS"
    elif marks >= 80:
        return "B", "PASS"
    elif marks >= 70:
        return "C", "PASS"
    elif marks >= 60:
        return "D", "PASS"
    elif marks >= 50:
        return "E", "PASS"
    else:
        return "F", "FAIL"

def main():
    # Input
    name = input("Enter Name: ")
    marks = float(input("Enter Marks: "))
    
    # Process
    grade, result = get_grade_and_result(marks)
    
    # Display Output
    print("\n-------------")
    print("Student Report\n")
    print(f"Name   : {name}")
    print(f"Marks  : {int(marks) if marks.is_integer() else marks}")
    print(f"Grade  : {grade}")
    print(f"Result : {result}")

if __name__ == "__main__":
    main()