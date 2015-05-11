/*
An implementation of the BinaryTree interface by means of a linked structure.
*/
public class LinkedBinaryTree<E> implements BinaryTree<E> {
protected BTPosition<E> root; //reference to the root
protected int size; //number of nodes
