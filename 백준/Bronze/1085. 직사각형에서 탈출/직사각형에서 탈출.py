point = list(map(int, input().split()))

if (point[0] < 0 or point[0] >= point[2] or point[1] < 0 or point[1] >= point[3] or
        point[2] < 0 or point[2] > 1000 or point[3] < 0 or point[3] > 1000):
    print("error")
else:
    print(min(point[0], point[2] - point[0], point[1], point[3] - point[1]))