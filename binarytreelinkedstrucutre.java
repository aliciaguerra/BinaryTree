/*
An implementation of the BinaryTree interface by means of a linked structure.
*/
public class LinkedBinaryTree<E> implements BinaryTree<E> {
protected BTPosition<E> root; //reference to the root
protected int size; //number of nodes
/*Creates an empty binary tree*/
public LinkedBinaryTree(){
  root=null; //start with an empty tree
  size=0;
}
/*Returns the number of nodes in the tree*/
public int size(){
  return size;
  }
/*Returns whether a node is internal*/
public boolean isInternal(Position<E> v) throws InvalidPositionException{
  checkPosition(v); //auxiliary method
  return (v==root());
}

/*Returns whether a node is the root*/
public boolean isRoot(Position<E> v) throws InvalidPositionException  {
checkPosition(v);
return (v==root());
}

/*Returns whether a node has a left child*/
public boolean hasLeft(Position<E> v) throws InvalidPositionException{
  BTPosition<E> vv = checkPosition(v);
  return (vv.getLeft() != null);
}

/*Returns the root of the tree*/
public Position<E> root throws EmptyTreeException(){
  if(root==null)
  throw new
