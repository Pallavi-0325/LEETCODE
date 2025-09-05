#include <stdio.h>
#include <stdlib.h>

int* intersection(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
    int* result = (int*)malloc(sizeof(int) * (nums1Size < nums2Size ? nums1Size : nums2Size));
    *returnSize = 0;

    for (int i = 0; i < nums1Size; i++) {
        int found = 0;
        for (int j = 0; j < nums2Size; j++) {
            if (nums1[i] == nums2[j]) {
                found = 1;
                break;
            }
        }
        if (found) {
            int alreadyAdded = 0;
            for (int k = 0; k < *returnSize; k++) {
                if (result[k] == nums1[i]) {
                    alreadyAdded = 1;
                    break;
                }
            }
            if (!alreadyAdded) {
                result[*returnSize] = nums1[i];
                (*returnSize)++;
            }
        }
    }
    return result;
}
