package model;

public interface IAVL<K,V extends Comparable <V>> extends IBST<K, V> {

	public void insertE(K key, V value);
	public boolean removeE(K key);
	public void rebalance();
	public void leftRotate(Node<K,V> node);
	public void rightRotate(Node<K,V> node);
}