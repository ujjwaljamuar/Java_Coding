from collections import Counter

def countWords(stri,n):
    m = Counter(stri)
    count = 0

    for i in m:
        if m[i] == 2:
            count +=1

    return count

if __name__ == "__main__":
    list = []
    n = int(input())
    for i in range(0,n):
        str = input()
        list.append(str)
    print(countWords(list, n))