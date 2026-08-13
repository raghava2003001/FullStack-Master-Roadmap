numbers = [10, 20, 30, 40, 50]

def search_element(numbers, target):
    for number in numbers:
        if number == target:
            return "Found"
    return "Not Found"


print("Search for 30:", search_element(numbers, 30))
print("Search for 70:", search_element(numbers, 70))