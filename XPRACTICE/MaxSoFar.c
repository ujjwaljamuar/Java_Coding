#include <stdio.h>
#include <limits.h>
int main()
{
    int n;
    scanf("%d", &n);
    int arr[n];
    int i;
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    int max_so_far = INT_MIN;
    int max_ending_here = 0;
    for (i = 0; i < n; i++)
    {
        max_ending_here = max_ending_here + arr[i]; // step 1
        if (max_ending_here > max_so_far)
        {
            max_so_far = max_ending_here; // step 2
        }
        if (max_ending_here < 0)
        {
            max_ending_here = 0;
        }
    }
    printf("%d ", max_so_far);
}