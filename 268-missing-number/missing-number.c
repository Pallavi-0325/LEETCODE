int missingNumber(int* nums, int numsSize) {
     int* freq = calloc(numsSize + 1, sizeof(int));
    for(int i=0; i<numsSize; i++)
        freq[nums[i]]++;
    for(int i=1; i<numsSize+1; i++)
        if(freq[i] == 0) return i;
    return 0;  
}