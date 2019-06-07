def bubble_sort(array, n):
    for i in range(0, n-1):
        for j in range(1, n-i):
            if array[j-1] > array[j]: #[j] = 0 [j +1] = 1 
                max = array[j-1]   # 큰값을 max 에 저장
                array[j-1] = array[j]
                array[j] = max

    return array


array = [2,1,5,4,6,3]

b= bubble_sort(array, len(array))
print(b)