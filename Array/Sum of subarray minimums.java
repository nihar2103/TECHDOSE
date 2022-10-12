class Solution {
    public int sumSubarrayMins(int[] A) {
    long res = 0;
    Deque<Integer> stack = new ArrayDeque<>();
    for(int i = 0; i <= A.length; i++) {
        while(!stack.isEmpty() && (i == A.length || A[stack.peek()] > A[i])) {
            int mid = stack.pop(), L = mid - (stack.isEmpty() ? -1 : stack.peek()), R = i - mid;
            res += (long) A[mid] * L * R;
        }
        stack.push(i);
    }
    return (int) (res % 1_000_000_007);
    }
}
