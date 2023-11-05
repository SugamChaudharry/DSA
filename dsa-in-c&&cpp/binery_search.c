#include <stdio.h>

int binearySearch(int length, int Arr[], char order)
{
    int first = 0,
        last = length - 1,
        i = 0, val;

    printf("Enter value you want to check \n");
    scanf("%d", &val);

    while (i < length)
    {

        int mid = (first + last) / 2;
        if (val > Arr[mid])
        {
            (order == 'a') ? first = mid + 1 : (order == 'd') ? last = mid - 1
                                                        : printf("error");
        }
        else if (val < Arr[mid])
        {
            (order == 'a') ? last = mid - 1 : (order == 'd') ? first = mid + 1
                                                        : printf("error");
        }
        else if (val == Arr[mid])
        {
            printf("%d is in %d position of an array \n", val, mid + 1);
            return mid;
        }
        i++;
    }
        printf("%d is not in an array \n", val);
}

int main()
{
    int length, val;
    char want, order;

    do
    {

        printf("Enter length of array : ");
        scanf("%d", &length);

        int Arr[length];
        int forCheck[length];

        printf("Enter order ascending/descending (a/d) : ");
        scanf(" %c", &order);

        if (order == 'a')
        {
            printf("Enter values of array in ascending order \n");
        }
        else if (order == 'd')
        {
            printf("Enter values of array in descending order \n");
        }
        else
        {
            printf("enter valide order re enter it \n");
            scanf(" %c", &order);
        }
        //  taking value's in array with order
        if (order == 'a' || order == 'd')
        {

            printf("Enter value  %d: ", 0+1);
            scanf("%d", &Arr[0]);
            for (int i = 0; i < length - 1; i++)
            {
                printf("Enter value %d: ", i + 1+1);
                scanf("%d", &forCheck[i]);

                if (order == 'a')
                {
                    while (!(Arr[i] < forCheck[i]))
                    {
                        printf("plz enter grater no then %d : ", Arr[i]);
                        scanf("%d", &forCheck[i]);
                    }
                }
                else if (order == 'd')
                {
                    while (!(Arr[i] > forCheck[i]))
                    {
                        printf("plz enter less no then %d : ", Arr[i]);
                        scanf("%d", &forCheck[i]);
                    }
                }
                Arr[i + 1] = forCheck[i];
            }


                int result = binearySearch(length, Arr, order);
           

            printf("Array[%d]= [", length);
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
        }
        else
        {
            printf("again invalid try next time");
        }
        printf("\n do you want to repeat (y/n) : ");
        scanf(" %c", &want);
    } while (want == 'y');
}