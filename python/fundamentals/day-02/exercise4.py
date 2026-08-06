correct_password = "12345"
entered_password = input("Enter password: ")

if entered_password != correct_password:
    print("Login failed ❌")
else:
    print("Login successful ✅")