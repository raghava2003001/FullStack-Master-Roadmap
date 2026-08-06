sentence = input("Input:\n")

# Split sentence into words, reverse each word, then join with spaces
reversed_sentence = " ".join(word[::-1] for word in sentence.split())

print(reversed_sentence)