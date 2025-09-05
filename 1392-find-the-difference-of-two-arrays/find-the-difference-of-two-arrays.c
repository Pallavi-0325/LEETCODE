#include <stdio.h>
#include <stdlib.h>

int contains(int* arr, int size, int val) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == val) return 1;
    }
    return 0;
}

int** findDifference(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize, int** returnColumnSizes) {
    *returnSize = 2;
    int** result = (int**)malloc(sizeof(int*) * 2);
    *returnColumnSizes = (int*)malloc(sizeof(int) * 2);

    int* diff1 = (int*)malloc(sizeof(int) * nums1Size);
    int* diff2 = (int*)malloc(sizeof(int) * nums2Size);
    int size1 = 0, size2 = 0;

    for (int i = 0; i < nums1Size; i++) {
        if (!contains(nums2, nums2Size, nums1[i]) && !contains(diff1, size1, nums1[i])) {
            diff1[size1++] = nums1[i];
        }
    }

    for (int i = 0; i < nums2Size; i++) {
        if (!contains(nums1, nums1Size, nums2[i]) && !contains(diff2, size2, nums2[i])) {
            diff2[size2++] = nums2[i];
        }
    }

    result[0] = diff1;
    result[1] = diff2;
    (*returnColumnSizes)[0] = size1;
    (*returnColumnSizes)[1] = size2;

    return result;
}
