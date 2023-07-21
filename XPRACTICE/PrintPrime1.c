// O(nlogn)

#include <stdio.h>
#include <limits.h>
int main()
{
    int N;
    scanf("%d", &N);
    int M = (N - 1) / 2;
    int arr[M];
    int i, j;
    for (i = 0; i < M; i++) // i=0 ; 0<10
    {
        arr[i] = i + 1; // arr[0]=1
    }
    int z;
    i = 1, j = 1;
    while (1)
    {
        z = i + j + 2 * i * j;
        if (i == j && z > M)
        {
            break;
        }
        else if (z <= M)
        {
            arr[z - 1] = -1;
            j++;
        }
        else
        {
            i++;
            j = i;
        }
    }
    printf("2 ");

    for (i = 0; i < M; i++)
    {
        if (arr[i] != -1)
        {
            printf("%d ", 2 * arr[i] + 1);
        }
    }
}