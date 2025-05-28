class RecurssionMethodfactors {
	public static void main(String[] args) {
		factors(18, 1);
	}

	public static void factors(int num, int den) {
		
		if (den > num)
		{
			return;
		}

		if (num % den == 0)
		{
			System.out.println(den);
		}

		
		factors(num, den + 1);
	}
}
