#include <stdio.h>
#include <stdlib.h>

int main(){

	//指针和数组
	int arr[] = { 1, 2, 3, 4, 5 };
	printf("%d\n", sizeof(arr));    //20
	printf("%d\n", sizeof(arr+0));  //4 指针大小
	printf("%d\n", sizeof(*arr));    //4  第一个元素的大小
	printf("%d\n", *arr);  // 数组名解引用  就是第一个元素  1
	printf("%d\n", sizeof(arr + 1));   //4 指针大小
	printf("%d\n", sizeof(arr[1]));   //4  第二个元素的大小
	printf("%d\n", sizeof(&arr));   //  4  数组名取地址就是指针  所以是4
	printf("%d\n", sizeof(*&arr));    //  20   先对数组取地址  在解引用  就和第一个例子相同
	printf("%d\n", sizeof(&arr + 1));   //4   指针加1还是指针  所以还是4
	printf("%d\n", sizeof(&arr[0]));    //4   对第一个元素取地址就是指针
	printf("%d\n", sizeof(&arr[0] + 1));  //4  对第一个元素取地址就是指针  指针加1还是指针


	//字符数组
	char arr1[] = { 'a', 'b', 'c', 'd' };
	printf("%d\n", sizeof(arr1));    //4
	printf("%d\n", sizeof(arr1 + 0));  //4
	printf("%d\n", sizeof(*arr1));   //1
	printf("%d\n", sizeof(arr1[1]));   //1
	printf("%d\n", sizeof(&arr1));     //4
	printf("%d\n", sizeof(&arr1 + 1));  //4
	printf("%d\n", sizeof(&arr1[0] + 1));  //4

	//下面全部是未定义行为  因为strlen只能对字符串求长度
	/*printf("%d\n", strlen(arr1));
	printf("%d\n", strlen(arr1 + 0));
	printf("%d\n", strlen(*arr1));
	printf("%d\n", strlen(arr1[1]));
	printf("%d\n", strlen(&arr1));
	printf("%d\n", strlen(&arr1 + 1));
	printf("%d\n", strlen(&arr1[0] + 1));*/

	char arr2[] = "abcd";
	printf("%d\n", sizeof(arr2));    //5   字符串长度  包括'\0'
	printf("%d\n", sizeof(arr2 + 0));  //4  指针大小
	printf("%d\n", sizeof(*arr2));   //1  第一个字符大小
	printf("%d\n", sizeof(arr2[1]));   //1  第二个字符大小
	printf("%d\n", sizeof(&arr2));     //4  指针大小
	printf("%d\n", sizeof(&arr2 + 1));  //4  指针大小
	printf("%d\n", sizeof(&arr2[0] + 1));  //4  指针大小

	//下面全部是未定义行为  因为strlen只能对字符串求长度
	printf("%d\n", strlen(arr2));   //4
	printf("%d\n", strlen(arr2 + 0));  //  4   
	printf("%d\n", strlen(*arr2));  //未定义行为
	printf("%d\n", strlen(arr2[1]));  //未定义行为
	printf("%d\n", strlen(&arr2));  //   4   
	printf("%d\n", strlen(&arr2 + 1));  //未定义行为
	printf("%d\n", strlen(&arr2[0] + 1));  //3  让指针指向b  相当于求字符bcd的长度


	char *p = "abcde";
	printf("%d\n", sizeof(p));    //4   指针大小
	printf("%d\n", sizeof(p + 1));  //4  指针大小
	printf("%d\n", sizeof(*p));   //1  第一个字符大小
	printf("%d\n", sizeof(p[1]));   //1  第二个字符大小
	printf("%d\n", sizeof(&p));     //4  指针大小
	printf("%d\n", sizeof(&p + 1));  //4  指针大小
	printf("%d\n", sizeof(&p[0] + 1));  //4  指针大小

	printf("%d\n", strlen(p));   //5
	printf("%d\n", strlen(p + 0));  //  5  
	printf("%d\n", strlen(*p));  //未定义行为
	printf("%d\n", strlen(p[1]));  //未定义行为
	printf("%d\n", strlen(&p));  //   未定义行为   
	printf("%d\n", strlen(&p + 1));  //未定义行为
	printf("%d\n", strlen(&p[0] + 1));  //4  让指针指向b  相当于求字符bcd的长度

	//二维数组
	int arr3[3][4] = { 0 };
	printf("%d\n", sizeof(arr3));   //48
	printf("%d\n", sizeof(arr3[0][0]));  //4
	printf("%d\n", sizeof(arr3[0]));  //16
	printf("%d\n", sizeof(arr3[0]+1));   //4
	printf("%d\n", sizeof(*(arr3[0]+1)));  //4
	printf("%d\n", sizeof(arr3+1));   //4
	printf("%d\n", sizeof(*(arr3+1)));  //16

	system("pause");
	return 0;
}