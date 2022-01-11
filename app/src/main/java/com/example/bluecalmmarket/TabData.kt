package com.example.bluecalmmarket

class TabData {
    private var name = arrayOf(
        "Huawei MatePad T8",
        "Huawei MatePad",
        "Samsung Galaxy Tab S6 L",
        "Apple iPad 10.2 (2019)",
        "Huawei Matepad Pro"
    )

    fun getName(i : Int) : String {
        return name[i]
    }

    private var price = arrayOf(
            "Rp. 1.495.000",
            "Rp. 3.910.000",
            "Rp. 6.499.000",
            "Rp. 5.693.000",
            "Rp. 10.099.000"
    )

    fun getPrice(i : Int) : String {
        return price[i]
    }

    private var detail = arrayOf(
            "Ingin mencari tablet murah dengan harga Rp 1 jutaan untuk digunakan anak sekolah atau pelajar mahasiswa?\n" +
                    "Memang sulit mencari yang bisa diandalkan di rentang harga tersebut, tapi Huawei MatePad T8 dapat menjadi jawaban.\n" +
                    "Spesifikasinya memang tidak begitu tangguh mengingat harganya yang murah, akan tetapi apa yang dibawanya sudah cukup untuk memenuhi kebutuhan kegiatan pembelajaran.\n" +
                    "MatePad T8 membawa ukuran yang cukup ringkas dan layarnya telah mendukung resolusi high definition (HD). Yang menarik, desainnya memberi kesan premium dan elegan berkat material logam di bodinya.\n" +
                    "•\tDimensi: 199,7 x 121,1 x 8,6 mm\n" +
                    "•\tMaterial: Depan kaca, bodi aluminium\n" +
                    "•\tLayar: 8,0 inci, resolusi 800 x 1.280 piksel\n" +
                    "•\tChipset: MediaTek MT8768\n" +
                    "•\tProsesor: Octa-core (4×2.0 GHz Cortex-A53 & 4×1.50 GHz Cortex A53)\n" +
                    "•\tRAM: 2 GB\n" +
                    "•\tMemori Internal: 32 GB\n" +
                    "•\tBaterai: 5.100 mAh\n",
            "Huawei mengambil kesempatan dalam menyediakan perangkat terjangkau untuk kebutuhan belajar maupun bekerja secara daring. Dengan menghadirkan Huawei MatePad yang membawa layar berukuran luas.\n" +
                    "Desain dan materialnya terasa mewah, karena mirip dengan sang kakak, Huawei MatePad Pro. Jeroannya juga cukup powerful untuk ukuran tablet seharga sekitar Rp 4 juta.\n" +
                    "Chipsetnya terbilang canggih untuk mendukung performa stabil, karena membawa prosesor yang dibangun dengan proses fabrikasi 7 nanometer (nm) yang irit daya. Untuk sektor penyimpanan terbilang cukup.\n" +
                    "•\tDimensi: 245,2 x 155 x 7,4 mm\n" +
                    "•\tMaterial: Depan kaca, belakang aluminium, frame aluminium\n" +
                    "•\tLayar: 10,4 inci, 1.200 x 2.000 piksel\n" +
                    "•\tChipset: Huawei HiSilicon Kirin 810 (7 nm)\n" +
                    "•\tProsesor: Octa-core (2×2.27 GHz Cortex-A76 & 6×1.88 GHz Cortex-A55)\n" +
                    "•\tRAM: 4 GB\n" +
                    "•\tMemori Internal: 64 GB\n" +
                    "•\tBaterai: 7.250 mAh (fast charging 18W)\n",
            "Samsung Galaxy Tab S6 Lite jadi salah satu tablet terbaik 2020 keluaran terbaru dengan fitur dan spesifikasi, serta harga yang menarik.\n" +
                    "Meski menjadi versi lite dari Galaxy Tab S6, produk ini memiliki hardware yang terbilang mumpuni, desain premium hingga dukungan stylus khas Samsung.\n" +
                    "Baterainya yang berkapasitas besar dengan dukungan pengisian daya cepat juga jadi aspek penting.\n" +
                    "Soal layar TFT, kualitas yang ditampilkan sungguh tetap memanjakan mata. Jadi, tak masalah meski bukan Super AMOLED.\n" +
                    "Spesifikasi Samsung Galaxy Tab S6 Lite:\n" +
                    "•\tDimensi: 244,5 x 154,3 x 7 mm\n" +
                    "•\tMaterial: Depan kaca, belakang aluminium, bingkai aluminium\n" +
                    "•\tLayar: TFT 10,4 inci, resolusi 1.200 x 2.000 piksel\n" +
                    "•\tChipset: Samsung Exynos 9611 (10 nm)\n" +
                    "•\tProsesor: Octa-core (4×2.3 GHz Cortex-A73 + 4×1.7 GHz Cortex-A53)\n" +
                    "•\tRAM: 4 GB\n" +
                    "•\tMemori Internal: 64 GB atau 128 GB\n" +
                    "•\tBaterai: 7.040 mAh (fast charging 15W)\n",
            "Pilihan tablet terbaik 2020 berikutnya, yaitu iPad generasi ketujuh dari Apple.\n" +
                    "Meski bukan keluaran terbaru, tapi iPad 7th Gen dengan layar 10,2 inci dari Apple ini tetap memikat untuk dimiliki pecinta gadget.\n" +
                    "Selain layar yang lebih luas dan material premium khas produk Apple, soal performa dari chipset Apple A10 Fusion dan ringannya sistem operasi iOS membuat performanya tetap ‘ngebut.’\n" +
                    "Kapasitas baterai besar, resolusi layar tinggi hingga harga yang kini lebih terjangkau tentu membuatnya tambah memikat.\n" +
                    "Spesifikasi Apple iPhone 10.2 (2019):\n" +
                    "•\tDimensi: 250,6 x 174,1 x 7,5 mm\n" +
                    "•\tMaterial: Depan kaca (scratch-resistant glass, oleophobic coating), belakang aluminium, bingkai aluminium\n" +
                    "•\tLayar: IPS 10,2 inci, resolusi 1.620 x 2.160 piksel\n" +
                    "•\tChipset: Apple A10 Fusion (16 nm)\n" +
                    "•\tProsesor: Quad-core 2,34 GHz (2x Hurricane + 2x Zephyr)\n" +
                    "•\tRAM: 3 GB\n" +
                    "•\tMemori Internal: 32 GB atau 128 GB\n" +
                    "•\tBaterai: 8.827 mAh\n",
            "Tablet flagship dari Huawei ini adalah yang paling ideal jika dibandingkan soal spesifikasi, fitur dan harga yang ditawarkan.\n" +
                    "Dengan harga yang lebih terjangkau dari tablet unggulan dari Samsung dan Apple, Matepad Pro sudah dibekali jeroan berteknologi terbaru dari Huawei yang performanya setara dengan ponsel seri P dan Mate buatannya.\n" +
                    "Selain itu, dalam paket penjualan Huawei juga menawarkan stylus (madnetic) dan keyboard case sebagai pelengkap.\n" +
                    "Yang kurang hanya soal dukungan Google Play Services (GMS) saja. Meski hal ini bisa diatasi dengan mengakses aplikasi Google lewat browser.\n" +
                    "Spesifikasi Huawei Matepad Pro:\n" +
                    "•\tDimensi: 246 x 159 x 7,2 mm\n" +
                    "•\tMaterial: Depan kaca, belakang aluminium, bingkai aluminium\n" +
                    "•\tLayar: IPS 10,8 inci, resolusi 2.560 x 1.600 piksel\n" +
                    "•\tChipset: Huawei HiSilicon Kirin 990 (7 nm+)\n" +
                    "•\tProsesor: Octa-core (2×2.86 GHz Cortex-A76 + 2×2.09 GHz Cortex-A76 + 4×1.86 GHz Cortex-A55)\n" +
                    "•\tRAM: 6 GB atau 8 GB\n" +
                    "•\tMemori Internal: 128 GB, 256 GB atau 512 GB\n" +
                    "•\tBaterai: 7.250 mAh (fast battery charging 40W)\n"
    )

    fun getDetail(i : Int) : String {
        return detail[i]
    }

    private var img = arrayOf(
            R.drawable.tb1,
            R.drawable.tb2,
            R.drawable.tb3,
            R.drawable.tb4,
            R.drawable.tb5
    )

    fun getImg(i : Int): Int {
        return img[i]
    }

    fun listdata() : ArrayList<Tablet> {
        var list = arrayListOf<Tablet>()
        for (position in name.indices) {
            val tablet = Tablet()
            tablet.name = name[position]
            tablet.price = price[position]
            tablet.detail = detail[position]
            tablet.img = img[position]
            list.add(tablet)
        }
        return list
    }
}