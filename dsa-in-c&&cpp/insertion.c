#include <stdio.h>

int insertion(int a[], int l, int e, int p)
{
    for (int i = 1; i < l; i++)
    {
        if (p != l - i)
        {
            a[l - i + 1] = a[l - i];
        }
        else
        {
            a[l - i + 1] = a[l - i];
            a[p] = e;
            break;
        }
    }
}

int main()
{
    int length;
    printf("Enter length of array : ");
    scanf("%d", &length);
    int Arr[100];
    printf("Enter values of array \n");
    for (int i = 0; i < length; i++)
    {
        printf("Enter value %d : ", i + 1);
        scanf("%d", &Arr[i]);
    }
    int ele, pos;
    printf("Enter element you want to insert : ");
    scanf("%d", &ele);
    printf("Enter postion : ");
    scanf("%d", &pos);
    int result = insertion(Arr, length, ele, pos-1);

    printf("Arr[%d]= [", length);
    for (int i = 0; i < length+1; i++)
    {

        printf(" %d ", Arr[i]);

        if (i < length )
        {
            printf(",");
        }
        else

            printf("]");
        }

    return 0;
}
