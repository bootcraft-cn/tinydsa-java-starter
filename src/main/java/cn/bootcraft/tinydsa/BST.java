package cn.bootcraft.tinydsa;

/**
 * BST — 二叉搜索树（插入、查找、中序遍历）。
 *
 * <p>key 为 String 类型，value 为 int 类型。
 * BST 性质：左子树所有 key &lt; 当前 key &lt; 右子树所有 key。</p>
 */
public class BST {

    /** BST 节点。 */
    static class BSTNode {
        String key;
        int val;
        BSTNode left;
        BSTNode right;

        BSTNode(String key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private BSTNode root;
    private int size;

    public BST() {
        this.root = null;
        this.size = 0;
    }

    /** 插入或更新键值对。 */
    public void put(String key, int val) {
        throw new UnsupportedOperationException("TODO: S06");
    }

    /** 查找 key 对应的 value。不存在返回 -1。 */
    public int get(String key) {
        throw new UnsupportedOperationException("TODO: S06");
    }

    /** 判断 key 是否存在于树中。 */
    public boolean contains(String key) {
        throw new UnsupportedOperationException("TODO: S06");
    }

    /** 返回树中键值对的个数。 */
    public int size() {
        throw new UnsupportedOperationException("TODO: S06");
    }

    /** 中序遍历，返回按字典序排列的所有 key 数组。 */
    public String[] keys() {
        throw new UnsupportedOperationException("TODO: S06");
    }
}
