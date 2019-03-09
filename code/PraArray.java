public class PraArray{
	
	public static int arrayMaxElement(int[] data){
         //TODO 
		 int max = data[0];
		 for(int i : data){
			 if(max < i){
				 max = i;
			 }
		 }
        return max;
    }
    
    //2.计算数组中最小值
    public static int arrayMinElement(int[] data){
        //TODO
		int min = data[0];
		for(int i : data){
			if(min > i){
				min = i;
			}
		}
        return min;
    }
    
    
    //3.计算数组值之和
    public static int arrayElementSum(int[] data){
        //TODO
		int sum = 0;
		for(int i : data){
			sum += i;
		}
        return sum;
    }
    
    //4.数组拼接
    public static int[] arrayJoin(int[] a, int[] b){
        //TODO
		if(a.length == 0 && b.length == 0) return null;
		int[] newArray = new int[a.length+b.length];
		int index = 0;
		for(int i : a)
			newArray[index++] = i;
		for(int i : b)
			newArray[index++] = i;
		return newArray;
    }

    //5.数组截取
    //[start, end)
    public static int[] arraySub(int[] data, int start , int end){
        //TODO
		if(end - start > data.length || end - start == 0) return null;
		int[] newArray = new int[end - start];
		int index = 0;
		for(int i = start;i < end;i++){
			newArray[index++] = data[i];
		}
		return newArray;
    }
    
    //6.数组打印  4,3,2,1
    public static void printArray(int[] data){
        //TODO
		for(int i = 0;i<data.length;i++){
			System.out.print(data[i]);
			if(i<data.length - 1) System.out.print(",");
		}
		System.out.println();
    }
    
    //7.数组反转
    // 比如：[1,2,3,4] => [4,3,2,1]
    public static void printReversal(int[] data){
        //TODO
		for(int i = data.length - 1;i>=0;i--){
			System.out.print(data[i]);
			if(i>0) System.out.print(",");
		}
    }
    
    public static void main(String[] args){
        //TODO 测试
		int[] data = {1,2,3,4};
		int[] arr = {5,6,7};
		System.out.println("最大值：");
		System.out.println(arrayMaxElement(data));
		System.out.println("最小值：");
		System.out.println(arrayMinElement(data));
		System.out.println("和：");
		System.out.println(arrayElementSum(data));
		System.out.println("数组截取：");
		printArray(arrayJoin(data,arr));
		System.out.println("数组打印：");
		printArray(arraySub(data,0,3));
		System.out.println("数组反转：");
		printReversal(data);
		
		
		
    } 
}