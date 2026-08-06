def check_number(num):
   
    if num > 0:
        return "Positive"
    elif num < 0:
        return "Negative"
    else:
        return "Zero"

def main():
    try:
        # Read input from user
        user_input = input("Enter a number: ").strip()
        number = float(user_input)  # Accepts integers and decimals

        # Display result
        print(f"The number is {check_number(number)}.")

    except ValueError:
        print("Invalid input. Please enter a valid numeric value.")

if __name__ == "__main__":
    main()
