class NumArray {
int[] num;
int[] sum;

public NumArray(int[] num) {
    if(num==null||num.length==0)
    return;
	this.num = num;
	int len = num.length;
	sum = new int[len];
	sum[0] = num[0];
	for (int i = 1; i < len; i++)
		sum[i] = sum[i - 1] + num[i];
}

public int sumRange(int i, int j) {

	return sum[j] - sum[i] + num[i];
}
}
