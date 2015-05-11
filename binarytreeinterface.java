/**
An interface for a binary tree, where each node can have zero, one, or two children.
**/
public interface BinaryTree<E> extends Tree<E> {
/*Returns the left child of the node*/
public Position<E> left(Position<E> v)
throws InvalidPositionException, BoundaryViolationException;
