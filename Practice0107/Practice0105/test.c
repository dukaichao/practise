#include <stdio.h>
#include <stdlib.h>
//ͳ��һ�����Ķ�������1�ĸ���
//1.�˺������ʺϸ���ͳ��
int countBit(int num){
	
	int count = 0;
	while (num){
		//�˴�У�����һ��bitλ�ǲ���1
		if (num % 2 == 1){
			++count;
		}
		num /= 2;
	}
	return count;
}
//2.�ʺ��κ���
int countBit1(int num){
	int count = 0;
	for (int i = 0; i < 32; i++){
		if (num&(0x1 << i)){
			++count;
		}
	}
	return count;
}

//��ת�ַ���
void reveser(char *ch){
	char* start = ch;
	char* end = ch + strLength(ch) - 1;
	if (*ch== '\0')
		return;
	char tmp =*start;
	*start =*end;
	*end = tmp;
	*end = '\0';
	reveser(ch+1);
	*end = tmp;

}
//�ַ�������
int strLength(char *s){
	if (*s == '\0')
		return 0;
	return 1 + strLength(s + 1);
}
int main(){


	printf("%d\n", countBit1(-127));
	char ch[] = "abcdef";
	reveser(ch);
	printf("%s\n", ch);
	system("pause");
	return 0;
}