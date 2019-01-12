#include <stdio.h>
#include <stdlib.h>

int main(){

	//ָ�������
	int arr[] = { 1, 2, 3, 4, 5 };
	printf("%d\n", sizeof(arr));    //20
	printf("%d\n", sizeof(arr+0));  //4 ָ���С
	printf("%d\n", sizeof(*arr));    //4  ��һ��Ԫ�صĴ�С
	printf("%d\n", *arr);  // ������������  ���ǵ�һ��Ԫ��  1
	printf("%d\n", sizeof(arr + 1));   //4 ָ���С
	printf("%d\n", sizeof(arr[1]));   //4  �ڶ���Ԫ�صĴ�С
	printf("%d\n", sizeof(&arr));   //  4  ������ȡ��ַ����ָ��  ������4
	printf("%d\n", sizeof(*&arr));    //  20   �ȶ�����ȡ��ַ  �ڽ�����  �ͺ͵�һ��������ͬ
	printf("%d\n", sizeof(&arr + 1));   //4   ָ���1����ָ��  ���Ի���4
	printf("%d\n", sizeof(&arr[0]));    //4   �Ե�һ��Ԫ��ȡ��ַ����ָ��
	printf("%d\n", sizeof(&arr[0] + 1));  //4  �Ե�һ��Ԫ��ȡ��ַ����ָ��  ָ���1����ָ��


	//�ַ�����
	char arr1[] = { 'a', 'b', 'c', 'd' };
	printf("%d\n", sizeof(arr1));    //4
	printf("%d\n", sizeof(arr1 + 0));  //4
	printf("%d\n", sizeof(*arr1));   //1
	printf("%d\n", sizeof(arr1[1]));   //1
	printf("%d\n", sizeof(&arr1));     //4
	printf("%d\n", sizeof(&arr1 + 1));  //4
	printf("%d\n", sizeof(&arr1[0] + 1));  //4

	//����ȫ����δ������Ϊ  ��Ϊstrlenֻ�ܶ��ַ����󳤶�
	/*printf("%d\n", strlen(arr1));
	printf("%d\n", strlen(arr1 + 0));
	printf("%d\n", strlen(*arr1));
	printf("%d\n", strlen(arr1[1]));
	printf("%d\n", strlen(&arr1));
	printf("%d\n", strlen(&arr1 + 1));
	printf("%d\n", strlen(&arr1[0] + 1));*/

	char arr2[] = "abcd";
	printf("%d\n", sizeof(arr2));    //5   �ַ�������  ����'\0'
	printf("%d\n", sizeof(arr2 + 0));  //4  ָ���С
	printf("%d\n", sizeof(*arr2));   //1  ��һ���ַ���С
	printf("%d\n", sizeof(arr2[1]));   //1  �ڶ����ַ���С
	printf("%d\n", sizeof(&arr2));     //4  ָ���С
	printf("%d\n", sizeof(&arr2 + 1));  //4  ָ���С
	printf("%d\n", sizeof(&arr2[0] + 1));  //4  ָ���С

	//����ȫ����δ������Ϊ  ��Ϊstrlenֻ�ܶ��ַ����󳤶�
	printf("%d\n", strlen(arr2));   //4
	printf("%d\n", strlen(arr2 + 0));  //  4   
	printf("%d\n", strlen(*arr2));  //δ������Ϊ
	printf("%d\n", strlen(arr2[1]));  //δ������Ϊ
	printf("%d\n", strlen(&arr2));  //   4   
	printf("%d\n", strlen(&arr2 + 1));  //δ������Ϊ
	printf("%d\n", strlen(&arr2[0] + 1));  //3  ��ָ��ָ��b  �൱�����ַ�bcd�ĳ���


	char *p = "abcde";
	printf("%d\n", sizeof(p));    //4   ָ���С
	printf("%d\n", sizeof(p + 1));  //4  ָ���С
	printf("%d\n", sizeof(*p));   //1  ��һ���ַ���С
	printf("%d\n", sizeof(p[1]));   //1  �ڶ����ַ���С
	printf("%d\n", sizeof(&p));     //4  ָ���С
	printf("%d\n", sizeof(&p + 1));  //4  ָ���С
	printf("%d\n", sizeof(&p[0] + 1));  //4  ָ���С

	printf("%d\n", strlen(p));   //5
	printf("%d\n", strlen(p + 0));  //  5  
	printf("%d\n", strlen(*p));  //δ������Ϊ
	printf("%d\n", strlen(p[1]));  //δ������Ϊ
	printf("%d\n", strlen(&p));  //   δ������Ϊ   
	printf("%d\n", strlen(&p + 1));  //δ������Ϊ
	printf("%d\n", strlen(&p[0] + 1));  //4  ��ָ��ָ��b  �൱�����ַ�bcd�ĳ���

	//��ά����
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