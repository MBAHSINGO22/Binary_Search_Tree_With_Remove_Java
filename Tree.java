package PERTEMUAN6;

public class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void add(int x) {
        if (root == null) {
            root = new TreeNode(x);
            return;
        }
        TreeNode bantu = root;
        while (true) {
            if (x < bantu.data) {
                if (bantu.leftNode == null) {
                    bantu.leftNode = new TreeNode(x);
                    return;
                }
                bantu = bantu.leftNode;
                continue;
            }
            if (bantu.rightNode == null) {
                bantu.rightNode = new TreeNode(x);
                return;
            }
            bantu = bantu.rightNode;
        }
    }

    public TreeNode getNode(int key) {
        TreeNode bantu = root;
        while (bantu != null) {
            if (key == bantu.data) {
                return bantu;
            }
            if (key < bantu.data) {
                bantu = bantu.leftNode;
                continue;
            }
            bantu = bantu.rightNode;
        }
        return null;
    }

    public TreeNode getParent(int key) {
        TreeNode bantu = root;
        TreeNode parent = null;

        while (bantu != null) {
            if (bantu.data == key) {
                return parent;
            }
            parent = bantu;
            if (bantu.data > key) {
                bantu = bantu.leftNode;
            } else {
                bantu = bantu.rightNode;
            }
        }
        return null;
    }

    public boolean remove(int key) {
        TreeNode bantu = getNode(key);
        if (bantu == null)
            return false;

        if (bantu.data == root.data) {
            if (bantu.isLeaf()) {
                root = null;
            } else if (bantu.rightNode == null) {
                root = bantu.leftNode;
            } else if (bantu.leftNode == null) {
                root = bantu.rightNode;
            } else {
                TreeNode predecessor = getPredecessor(bantu);
                TreeNode parentPredecessor = getParent(predecessor.data);
                bantu.data = predecessor.data;

                if (parentPredecessor != bantu) {
                    if (predecessor.leftNode != null) {
                        parentPredecessor.rightNode = predecessor.leftNode;
                    } else {
                        parentPredecessor.rightNode = null;
                    }
                } else {
                    bantu.leftNode = predecessor.leftNode;
                }
            }
            return true;
        }

        TreeNode parent = getParent(key);
        if (parent == null)
            return false;

        if (key < parent.data) {
            if (bantu.isLeaf()) {
                parent.leftNode = null; 
            } else if (bantu.rightNode == null) {
                parent.leftNode = bantu.leftNode; 
            } else if (bantu.leftNode == null) {
                parent.leftNode = bantu.rightNode; 
            } else {
                TreeNode predecessor = getPredecessor(bantu); 
                TreeNode parentPredecessor = getParent(predecessor.data);
                bantu.data = predecessor.data; 

                if (parentPredecessor != bantu) {
                    if (predecessor.leftNode != null) {
                        parentPredecessor.rightNode = predecessor.leftNode;
                    } else {
                        parentPredecessor.rightNode = null;
                    }
                } else {
                    bantu.leftNode = predecessor.leftNode;
                }
            }
        } else {
            if (bantu.isLeaf()) {
                parent.rightNode = null; 
            } else if (bantu.rightNode == null) {
                parent.rightNode = bantu.leftNode; 
            } else if (bantu.leftNode == null) {
                parent.rightNode = bantu.rightNode; 
            } else {
                TreeNode predecessor = getPredecessor(bantu); 
                TreeNode parentPredecessor = getParent(predecessor.data);
                bantu.data = predecessor.data;

                if (parentPredecessor != bantu) {
                    if (predecessor.leftNode != null) {
                        parentPredecessor.rightNode = predecessor.leftNode;
                    } else {
                        parentPredecessor.rightNode = null;
                    }
                } else {
                    bantu.leftNode = predecessor.leftNode;
                }
            }
        }
        return true;
    }

    public TreeNode getPredecessor(TreeNode node) {
        TreeNode bantu = node.leftNode;
        while (bantu.rightNode != null) {
            bantu = bantu.rightNode; 
        }
        return bantu;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void preorderTraversal() {
        preorderHelper(root);
    }

    public void inorderTraversal() {
        inorderHelper(root);
    }

    public void postorderTraversal() {
        postorderHelper(root);
    }

    public void preorderHelper(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorderHelper(node.getLeftNode());
            preorderHelper(node.getRightNode());
        }
    }

    public void inorderHelper(TreeNode node) {
        if (node != null) {
            inorderHelper(node.getLeftNode());
            System.out.print(node.getData() + " ");
            inorderHelper(node.getRightNode());
        }
    }

    public void postorderHelper(TreeNode node) {
        if (node != null) {
            postorderHelper(node.getLeftNode());
            postorderHelper(node.getRightNode());
            System.out.print(node.getData() + " ");
        }
    }
}
