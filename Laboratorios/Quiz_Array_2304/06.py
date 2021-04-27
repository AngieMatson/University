add = "yes"
while add == "yes": # The loop has the function of iterating until the user decides.
    word =input("Please enter the word = ") 
    reversed_word = word # Match the new variable with the old one.
    word = list(word)
    reversed_word = list(reversed_word)  #Become a list.
    reversed_word.reverse()
    if word == reversed_word: #The condition is to evalute the last variables to be able to print if it is or not.
        print("It's a Palindrome.")
    else:
        print("It isn't a Palindrome.")
    add = str(input("Do you want to add a new word? yes or not = ")) #This variable is to the loop continue or break.
print("The program has finished.")