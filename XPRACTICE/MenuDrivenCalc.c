#include <stdio.h>

int addition(int a, int b)
{
    return a + b;
}

int subtraction(int a, int b)
{
    return a - b;
}

int multiplication(int a, int b)
{
    return a * b;
}

float division(int a, int b)
{
    return (float)a / b;
}
int main()
{
    printf("\n------------Calculator----------\n");

    int op;

    char ans = 'Y';

    while (ans == 'Y' || ans == 'y')
    {
        printf("\nEnter 1 for addition\n");
        printf("Enter 2 for subtraction\n");
        printf("Enter 3 for multiplication\n");
        printf("Enter 4 for Division\n");
        printf("Enter 5 to exit \n");

        int a;
        int b;

        scanf("%d", &op);
        switch (op)
        {
        case 1:
            printf("Enter two numbers for addition: \n");
            scanf("%d%d", &a, &b);
            printf("%d + %d = %d\n", a, b, addition(a, b));
            break;
        case 2:
            printf("Enter two numbers for subtraction: \n");
            scanf("%d%d", &a, &b);
            printf("%d - %d = %d\n", a, b, subtraction(a, b));
            break;
        case 3:
            printf("Enter two numbers for multiplition: \n");
            scanf("%d%d", &a, &b);
            printf("%d * %d = %d\n", a, b, multiplication(a, b));
            break;
        case 4:
            printf("Enter two numbers for division: \n");
            scanf("%d%d", &a, &b);
            printf("%d / %d = %.2f \n", a, b, division(a, b));
            break;
        case 5:
            printf("\n...Exiting...\n");
            return 0;
            break;
        default:
            printf("\n...Invalid Choice...\n");
            break;
        }

        printf("\nYOU WANT TO CONTINUE (Y/N) \n");
        scanf(" %c", &ans);
        if (ans == 'N' || ans == 'n')
        {
            printf("\n...Exiting...\n");
        }
    }

    return 0;
}