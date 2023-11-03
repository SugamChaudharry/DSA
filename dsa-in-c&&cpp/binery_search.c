#include <stdio.h>

    //  binary search
    /*
           0 1 2 3 4 5 6 7 8 ----> index's
        a=[1,2,3,4,5,6,7,8,9]
        val = value user want to find
        low Value = 0 index
        high value = n
        mid value = (low-high)/2

        condtion1= mid < val --> mid = (low+(mid-1))/2
        condtion1= mid > val --> mid = ((mid+1)+(high))/2
        condtion1= mid = val --> find
    */
int binearySearch(int n , int Arr[], int low, int high, int val, char order)
{

    printf("Enter value you want to check \n");
    scanf("%d", &val);

    while ((order == 'a' || order == 'A') ? (low <= high) : (low >= high))
    {
        int mid = (low + high) / 2;
        if (val < Arr[mid])
        {
            high = mid - 1;
        }
        else if (val > Arr[mid])
        {
            low = mid + 1;
        }
        else if (val == Arr[mid])
        {
            printf("%d is in %d position of an array", val, mid);
            return mid;
        }

    }
    printf("%d is not in an array", val);
}



int main()
{
    int n, val;
    char want, order;

    do
    {

        printf("Enter length of array : ");
        scanf("%d", &n);

        int Arr[n];
        int forCheck[n];

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
        else{
            printf("enter valide order re enter it \n");
            scanf(" %c", &order);
        }
        //  taking value's in array with order
        if (order=='a'||order=='d')
        {
        
            printf("Enter value for index %d: ", 0);
            scanf("%d", &Arr[0]);
            for (int i = 0; i < n - 1; i++)
            {
                printf("Enter value for index %d: ", i + 1);
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
                        printf("plz enter less no then %d", Arr[i]);
                        scanf("%d", &forCheck[i]);
                    }
                }
                Arr[i + 1] = forCheck[i];
            }

            int low, high;
            (order == 'a' || order == 'A') ? (low = 0, high = n - 1) : (order == 'd' || order == 'D') ? (low = n - 1, high = 0)
                                                                                                      : printf("error in order");

            int result = binearySearch(n, Arr, low, high, val, order);

            printf("Arr[%d]= [", n);
            for (int i = 0; i < n; i++)
            {

                printf(" %d ", Arr[i]);

                if (i < n - 1)
                {
                    printf(",");
                }
                else
                {
                    printf("]");
                }
            }
        }else{
            printf("again invalid try next time");
        }
        printf("\n do you want to repeat (y/n) : ");
        scanf(" %c", &want);
    } while (want == 'y');
}