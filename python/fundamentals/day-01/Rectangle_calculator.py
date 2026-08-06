# Get length and width from the user (using float so decimals work too)
length = float(input("Enter length: "))
width = float(input("Enter width: "))

# Perform calculations
area = length * width
perimeter = 2 * (length + width)

# Display results
print("\n--- Rectangle Results ---")
print(f"Area: {area}")
print(f"Perimeter: {perimeter}")