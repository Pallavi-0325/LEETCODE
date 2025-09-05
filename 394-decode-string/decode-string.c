#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

char* decodeString(char* s) {
    int len = strlen(s);
    char* stack = (char*)malloc(sizeof(char) * 100000);
    int* countStack = (int*)malloc(sizeof(int) * len);
    int stackTop = 0, countTop = 0;
    char* res = (char*)malloc(sizeof(char) * 100000);
    int resLen = 0;
    int num = 0;

    for (int i = 0; i < len; i++) {
        if (isdigit(s[i])) {
            num = num * 10 + (s[i] - '0');
        } else if (s[i] == '[') {
            countStack[countTop++] = num;
            stack[stackTop++] = '(';
            num = 0;
        } else if (s[i] == ']') {
            char temp[100000];
            int tempLen = 0;
            while (stackTop > 0 && stack[stackTop - 1] != '(') {
                temp[tempLen++] = stack[--stackTop];
            }
            stackTop--;
            int repeat = countStack[--countTop];
            for (int r = 0; r < repeat; r++) {
                for (int j = tempLen - 1; j >= 0; j--) {
                    stack[stackTop++] = temp[j];
                }
            }
        } else {
            stack[stackTop++] = s[i];
        }
    }

    for (int i = 0; i < stackTop; i++) {
        res[resLen++] = stack[i];
    }
    res[resLen] = '\0';
    free(stack);
    free(countStack);
    return res;
}
