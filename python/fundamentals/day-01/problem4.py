# Program to calculate the area of a circle using π ≈ 3.14159

def calculate_circle_area(radius):
    """Calculate area of a circle given the radius."""
    PI = 3.14159
    return PI * (radius ** 2)

def main():
    try:
        # Take radius input from user
        radius_input = input("Enter the radius of the circle: ").strip()
        
        # Convert to float
        radius = float(radius_input)
        
        # Validate radius
        if radius < 0:
            print("Error: Radius cannot be negative.")
            return
        
        # Calculate and display area
        area = calculate_circle_area(radius)
        print(f"Area of the circle with radius {radius} is: {area:.4f}")
    
    except ValueError:
        print("Invalid input. Please enter a numeric value for the radius.")

if __name__ == "__main__":
    main()
