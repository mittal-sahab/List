
interface List<D>
{
	public void add(D x);
	public void traverse();
	public void remove(D O);
	public int search(D O);
	public int size();
	public D getElementAt(int pos);
	public boolean isEmpty();
}