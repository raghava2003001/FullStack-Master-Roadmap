# Simple Interest Calculator

# Input values
principal = float(input("Enter Principal Amount: "))
rate = float(input("Enter Rate of Interest (% per annum): "))
time = float(input("Enter Time (in years): "))

# Calculate Simple Interest
simple_interest = (principal * rate * time) / 100

# Calculate Final Amount
final_amount = principal + simple_interest

# Display results
print(f"\nSimple Interest: {simple_interest:.2f}")
print(f"Final Amount: {final_amount:.2f}")