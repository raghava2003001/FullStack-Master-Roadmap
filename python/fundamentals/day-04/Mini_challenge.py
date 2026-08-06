def generate_report():
    # 1. Input Student Name
    name = input("Enter Student Name: ")
    
    # 2. Input 5 Subject Marks using a list and loop
    marks = []
    print("\nEnter 5 Subject Marks:")
    for i in range(1, 6):
        score = float(input(f"Subject {i}: "))
        marks.append(score)
    
    # 3. Calculations
    total = sum(marks)
    average = total / len(marks)
    highest = max(marks)
    lowest = min(marks)
    
    # 4. Result (Pass if all subject marks are >= 35)
    is_pass = all(score >= 35 for score in marks)
    result = "PASS" if is_pass else "FAIL"
    
    # 5. Grade Assignment
    if not is_pass:
        grade = "F"
    elif average >= 90:
        grade = "A+"
    elif average >= 80:
        grade = "A"
    elif average >= 70:
        grade = "B"
    elif average >= 60:
        grade = "C"
    elif average >= 50:
        grade = "D"
    else:
        grade = "E"
        
    # 6. Formatted Report Output
    print("\n" + "="*30)
    print(f"      STUDENT REPORT CARD      ")
    print("="*30)
    print(f"Name    : {name}")
    print(f"Total   : {total:.2f}")
    print(f"Average : {average:.2f}")
    print(f"Highest : {highest:.2f}")
    print(f"Lowest  : {lowest:.2f}")
    print(f"Grade   : {grade}")
    print(f"Result  : {result}")
    print("="*30)

# Run the program
generate_report()