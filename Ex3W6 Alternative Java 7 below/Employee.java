import pckg_sortable.Sortable;

public class Employee implements Sortable{
	private String name;
	private double salary;
	private int hireday;
	private int hiremonth;
	private int hireyear;
	
	public Employee(String name, double salary, int hireday, int hiremonth, int hireyear) {
		this.name = name;
		this.salary = salary;
		this.hireday = hireday;
		this.hiremonth = hiremonth;
		this.hireyear = hireyear;
	}
	
	public void print(){
		System.out.println(name + " " + salary + " " + hireyear());
	}
	
	public void raiseSalary(double byPercent){
		salary *= 1 + byPercent / 100;
	}
	
	public int hireyear(){
		return hireyear;
	}

	@Override
	public int compare(Sortable b) {
		Employee eb = (Employee) b;
		if(salary < eb.salary) return -1;
		if(salary > eb.salary) return 1;
		return 0;
	}
	
	@Override
	public void shell_sort(Sortable[] a) {
		int n = a.length;

		// Start with a big gap, then reduce the gap
		for (int gap = n / 2; gap > 0; gap /= 2) {
			// Do a gapped insertion sort for this gap size.
			// The first gap elements a[0..gap-1] are already
			// in gapped order keep adding one more element
			// until the entire array is gap sorted
			for (int i = gap; i < n; i += 1) {
				// add a[i] to the elements that have been gap
				// sorted save a[i] in temp and make a hole at
				// position i
				Sortable temp = a[i];

				// shift earlier gap-sorted elements up until
				// the correct location for a[i] is found
				int j;

				for (j = i; j >= gap && a[j - gap].compare(temp) == 1; j -= gap)
					a[j] = a[j - gap];

				// put temp (the original a[i]) in its correct
				// location
				a[j] = temp;
			}
		}
	}
}
