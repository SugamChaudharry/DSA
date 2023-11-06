#include <stdio.h>

int bubbleSort(int Arr[],int length){
    for (int i = 0; i < length; i++)
    {
        for (int j = 0; j < length - 1; j++)
        {
            int copy;
            if (Arr[j] > Arr[j + 1])
            {
                copy = Arr[j];
                Arr[j] = Arr[j + 1];
                Arr[j + 1] = copy;
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
        printf("Enter value %d : ", i+1 );
        scanf("%d", &Arr[i]);
    }


    int result = bubbleSort(Arr, length);
   

    printf("Arr[%d]= [", length);
    for (int i = 0; i < length; i++)
    {

        printf(" %d ", Arr[i]);

        if (i < length - 1)
        {
            printf(",");
        }
        else
        {
            printf("]");
        }
    }

    return 0;
}

