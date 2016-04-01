
#Following line of code was 'borrowed' from https://github.com/jchristman/adventofcode
#(Don't understand it at all)
inputData = [tuple(map(int, box.strip().split('x'))) for box in open('input', 'r').readlines()]

print(inputData)