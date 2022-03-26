class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    int result = -1;

    public int findLucky(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            // if (map.get(arr[i]) == arr[i]) {
            //     result = Math.max(result, arr[i]);
            // }
        }

        map.forEach((k, v) -> {
            if (k == v) {
                result = Math.max(result, v);
            }
        });
        return result;
    }
}
/*
Note:
    Lucky Integer
        - occurance == the number itself
     return the largest.

    int result = -1;

    if map.containsKey(arr[i])
        map.put(arr[i], map.get(arr[i]) + 1);
    else
        map.put(arr[i], 1);

    if map.containsKey(arr[i]) == arr[i]
        result = Max(result, arr[i])

    return result;
                       i
    arr = [4,4,4,4,2,2,3] // output: 4
    map {
        4: 4,
        2: 2,
        3: 1
    }
    */