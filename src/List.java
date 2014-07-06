/**
 * Created by br0ce on 06.07.14.
 */
public class List
{
	private Node head;

	public List() { head = null; }

	/**
	 * F ̈ ugt an das Ende der this-Liste die Liste a an. Ver ̈ andert dabei die this-Liste.
	 */
	public void concatList(List a)
	{
		if(head == null)
		{
			head = a.head;
			return;
		}

		Node tmp = head;

		while(tmp.next != null)
			tmp = tmp.next;

		tmp.next = a.head;
	}

	/**
	 * Erzeugt eine neue Liste durch Anf ̈ ugen der Liste a an die this-Liste. Ver ̈ andert dabei die this-Liste nicht.
	 */
	public List appendList(List a)
	{
		if(head == null)
		{
			List tmp = new List();
			tmp.head = a.head;
			return tmp;
		}

		List tmpList = new List();
		tmpList.concatList(this);
		tmpList.concatList(a);
		return tmpList;
	}
}
