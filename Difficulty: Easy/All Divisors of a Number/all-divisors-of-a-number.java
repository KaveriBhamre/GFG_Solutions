class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();

		for (int i = 1; i*i <= n; i++) {
			if (n % i == 0) {
				res.add(i);
				
				if ((n / i) != i) {
					res.add(n/i);
				}

			}
		}

		Collections.sort(res);
		 return res;
    }
}