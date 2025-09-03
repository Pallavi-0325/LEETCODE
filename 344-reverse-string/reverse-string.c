void reverseString(char* s, int sSize) {
    int start = 0; //starting of an array
    int end = sSize - 1;//end of an array
    char temp;
    while (start < end) {
        temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        start++;
        end--;
    }
}

