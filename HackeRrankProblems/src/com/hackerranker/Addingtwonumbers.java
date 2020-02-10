#include <assert.h>
Adding two number s using c language
====================================
#include <ctype.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* readline();
char* ltrim(char*);
char* rtrim(char*);

float parse_float(char*);


/*
 * Complete the 'addNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. FLOAT a
 *  2. FLOAT b
 */

int addNumbers(float a, float b) {
    float num3;
   num3 = a + b;
   return (num3);

}
int main()