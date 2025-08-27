# Binary Search Tree With Remove Java

Implementasi Binary Search Tree dengan Penghapusan di Java

Proyek Java yang menunjukkan struktur data Binary Search Tree dengan operasi penambahan, penghapusan (termasuk predecessor), dan traversal preorder.

## 📖 Deskripsi Proyek
Binary_Search_Tree_With_Remove_Java adalah proyek Java yang mengimplementasikan Binary Search Tree (BST) dengan fungsi penghapusan node yang lengkap. Proyek ini berfokus pada:
- **TreeNode.java**: Kelas dasar untuk node pohon dengan data integer, left node, dan right node, serta metode `isLeaf`.
- **Tree.java**: Kelas utama untuk mengelola BST dengan metode `add`, `remove` (dengan predecessor untuk node dua child), `getNode`, `getParent`, `getPredecessor`, dan traversal (`preorder`, `inorder`, `postorder`).
- **MainTree.java**: Kelas utama untuk menguji BST dengan menambahkan elemen **(42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12)** dan menghapus node tertentu **(12, 55, 21, 42)**.

Proyek ini terdiri dari tiga file Java (**MainTree.java**, **Tree.java**, **TreeNode.java**) dalam paket **PERTEMUAN6**.🟢

## 🧠 Teknologi
- Java

## 📂 Struktur File
```
Binary_Search_Tree_With_Remove_Java/
├── src/PERTEMUAN6/
├── MainTree.java            # 🛠️ Kelas utama untuk pengujian
├── Tree.java                # 🔍 Kelas untuk BST dan operasi
├── TreeNode.java            # 📊 Kelas node pohon
```

## 🟢 Catatan:
- BST diinisialisasi kosong dan elemen ditambahkan secara berurutan: **42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12**.
- Metode `remove` menangani kasus leaf, satu child, dan dua child dengan predecessor dari subtree kiri.
- Traversal hanya menampilkan preorder dalam contoh ini.

## 📈 Contoh Output
**MainTree.java**
```
Preorder:
42 21 6 2 12 38 27 40 71 55 63 82

Menghapus 12:
42 21 6 2 38 27 40 71 55 63 82

Menghapus 55:
42 21 6 2 38 27 40 71 63 82

Menghapus 21:
42 6 2 38 27 40 71 63 82

Menghapus 42:
38 6 2 27 40 71 63 82
```

## 👨‍💻 Pengembang
MBAHSINGO22  
🔗 [GitHub](https://github.com/MBAHSINGO22)
