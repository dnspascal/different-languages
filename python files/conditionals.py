sum, count = 0, 1

while count <= 100:
    sum += count
    count += 1

# print(sum)
# the for loop uses the range() with no more than the three parameters function
sum = 0
# the first parameter represent the start valeu,the 2nd indicate the last value and the 3rd value represend the steps
# of which the loop will follow
for count in range(0, 101, 1):
    sum += count
    count += 1
# print(count)

string = 'denis pascal mgaya'
for index in range(0, len(string), 3):
    print(string[0: index + 1])
