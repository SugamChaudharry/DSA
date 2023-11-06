#include <stdio.h>

int deletiton(int a[], int l, int e)
{
    for (int i = 0; i <= l; i++)
    {
        if (e == a[i])
        {
            for (int j = i; j < l; j++)
            {
                a[j] = a[j + 1];
            }

        }
        
    }
}

int main()
{
    int length;
    printf("Enter length of array : ");
    scanf("%d", &length);
    int Arr[length];
    printf("Enter values of array \n");
    for (int i = 0; i < length; i++)
    {
        printf("Enter value %d : ", i + 1);
        scanf("%d", &Arr[i]);
    }
    int ele;
    printf("Enter element you want to delete : ");
    scanf("%d", &ele);

    int result = deletiton(Arr, length, ele);

    printf("Arr[%d]= [", length);
    for (int i = 0; i < length-1; i++)
    {

        printf(" %d ", Arr[i]);

        if (i < length-2)
        {
            printf(",");
        }
        else

            printf("]");
    }

    return 0;
}
