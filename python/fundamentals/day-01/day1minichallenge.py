name = input("Enter Student name: ") 
age = input("Enter Student age: ")
course = input("Enter Student course: ")

# 1. Convert input strings to integers/floats for math
mark_1 = float(input("Enter mark_1: "))
mark_2 = float(input("Enter mark_2: "))
mark_3 = float(input("Enter mark_3: "))

# 2. Perform calculations before printing
total_marks = mark_1 + mark_2 + mark_3
average = total_marks / 3

# 3. Output results
print("\n --- Student Profile ---")
print("Name:", name)
print("Age:", age)
print("Course:", course)
print("Total Marks:", total_marks)
print("Average:", average)