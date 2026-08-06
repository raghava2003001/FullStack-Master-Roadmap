# Program to convert seconds into minutes and seconds
# using floor division and remainder

def convert_seconds(total_seconds):
    # Validate input type and value
    if not isinstance(total_seconds, int) or total_seconds < 0:
        raise ValueError("Please enter a non-negative integer for seconds.")
    
    # divmod returns (quotient, remainder) in one step
    minutes, seconds = divmod(total_seconds, 60)
    return minutes, seconds

if __name__ == "__main__":
    try:
        # Input from user
        total_seconds = int(input("Enter total seconds: "))
        
        minutes, seconds = convert_seconds(total_seconds)
        print(f"{total_seconds} seconds = {minutes} minute(s) and {seconds} second(s)")
    
    except ValueError as e:
        print(f"Error: {e}")
