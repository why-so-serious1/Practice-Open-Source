#include <stdio.h>

void skip(char *msg)
{
    int doses[] = {1, 3, 2, 1000};
    // int *boo = doses[3] == *(doses + 3) == *(3 + doses) == 3 [doses];
    int val = *msg + 3;

    // printf("test %i\n", doses[3] == *(doses + 3) == 3 [doses] == *(3 + doses));
    printf("&doses[3] %i\n", doses[3]);
    printf("&3[doses] %i\n", 3 [doses]);
    printf("(doses + 3) %i\n", *(doses + 3));
    printf("3 + doses] %i\n", *(3 + doses));
}

int main()
{
    printf("Starting main\n");
    char *str = "test4 str";
    skip(str);
    return 0;
}